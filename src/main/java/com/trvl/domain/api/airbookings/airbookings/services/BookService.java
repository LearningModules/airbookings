package com.trvl.domain.api.airbookings.airbookings.services;

import com.trvl.domain.api.airbookings.airbookings.domains.BookingMaster;
import com.trvl.domain.api.airbookings.airbookings.domains.BookingPassengerMaster;
import com.trvl.domain.api.airbookings.airbookings.domains.BookingSegmentMaster;
import com.trvl.domain.api.airbookings.airbookings.repositories.BookingMasterRepository;
import com.trvl.domain.api.airbookings.airbookings.rowmappers.BookingMasterRowMapper;
import com.trvl.domain.api.airbookings.airbookings.rowmappers.BookingPassengerMasterRowMapper;
import com.trvl.domain.api.airbookings.airbookings.rowmappers.BookingSegmentMasterRowMapper;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reji on 13/09/17.
 */
@Component
public class BookService {

    @Autowired
    BookingMasterRepository bookingMasterRepository;
    @Autowired
    BasicDataSource basicDataSource;

    JdbcTemplate jdbcTemplate;

    public BookingMaster retrieveBookingMaster(String trackexTripId, String leadPaxEmail)
    {
        BookingMaster bookingMaster=bookingMasterRepository.findByTrackexTripIdAndLeadPaxEmail(trackexTripId,leadPaxEmail);
        return bookingMaster;
    }

    public List<BookingMaster> getAllBookings()
    {
        //return bookingMasterRepository.findAll(); // This is to get via Spring JPA ORM
        int trackexTripId=0;
        List<BookingMaster> bookingMasters  = new ArrayList<BookingMaster>();
        List<BookingMaster> bookingMastersFinal  = new ArrayList<BookingMaster>();
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(basicDataSource);
        String bookingMasterSelectAllQuery =  "SELECT * FROM booking_master";
        try {
            bookingMasters = jdbcTemplate.query(bookingMasterSelectAllQuery, new BookingMasterRowMapper());
        }catch (org.springframework.dao.EmptyResultDataAccessException e)
        {
            return bookingMasters;
        }
        String bookingPassengerMasterSelectQuery =  null;
        String bookingSegmentMasterSelectQuery = null;

        for (BookingMaster booking : bookingMasters){
            trackexTripId = booking.getTrackexTripId();
            bookingPassengerMasterSelectQuery =  "SELECT * FROM booking_passenger_master WHERE trackex_trip_id="+trackexTripId;
            bookingSegmentMasterSelectQuery =  "SELECT * FROM booking_segment_master WHERE trackex_trip_id="+trackexTripId;

            List<BookingPassengerMaster> bookingPassengerMasters = jdbcTemplate.query(bookingPassengerMasterSelectQuery,new BookingPassengerMasterRowMapper());
            List<BookingSegmentMaster> bookingSegmentMasters = jdbcTemplate.query(bookingSegmentMasterSelectQuery,new BookingSegmentMasterRowMapper());

            booking.setPassengers(bookingPassengerMasters);
            booking.setSegments(bookingSegmentMasters);

            bookingMastersFinal.add(booking);
        }
        return  bookingMastersFinal;
    }

    public BookingMaster retrieveBooking(String trackexTripId, String leadPaxEmail)
    {
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(basicDataSource);
        String bookingMasterSelectQuery =  "SELECT * FROM booking_master WHERE trackex_trip_id="+trackexTripId+" AND lead_pax_email='"+leadPaxEmail+"'";
        BookingMaster bookingMaster=null;
        try {
            bookingMaster = jdbcTemplate.queryForObject(bookingMasterSelectQuery, new BookingMasterRowMapper());
        }catch (org.springframework.dao.EmptyResultDataAccessException e)
        {
            return bookingMaster;
        }
        String bookingPassengerMasterSelectQuery =  "SELECT * FROM booking_passenger_master WHERE trackex_trip_id="+trackexTripId;
        List<BookingPassengerMaster> bookingPassengerMasters = jdbcTemplate.query(bookingPassengerMasterSelectQuery,new BookingPassengerMasterRowMapper());


        String bookingSegmentMasterSelectQuery =  "SELECT * FROM booking_segment_master WHERE trackex_trip_id="+trackexTripId;
        List<BookingSegmentMaster> bookingSegmentMasters = jdbcTemplate.query(bookingSegmentMasterSelectQuery,new BookingSegmentMasterRowMapper());

        bookingMaster.setPassengers(bookingPassengerMasters);
        bookingMaster.setSegments(bookingSegmentMasters);

        return bookingMaster;
    }

}
