package com.trvl.domain.api.airbookings.airbookings.services;

import com.trvl.domain.api.airbookings.airbookings.domains.BookingMaster;
import com.trvl.domain.api.airbookings.airbookings.domains.BookingPassengerMaster;
import com.trvl.domain.api.airbookings.airbookings.repositories.BookingMasterRepository;
import com.trvl.domain.api.airbookings.airbookings.rowmappers.BookingMasterRowMapper;
import com.trvl.domain.api.airbookings.airbookings.rowmappers.BookingPassengerMasterRowMapper;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

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
        return bookingMasterRepository.findAll();
    }

    public BookingMaster retrieveBooking(String trackexTripId, String leadPaxEmail)
    {
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(basicDataSource);
        String selectQuery =  "SELECT * FROM TrackEx.booking_master WHERE trackex_trip_id="+1010101+" AND lead_pax_email='"+leadPaxEmail+"'";
        BookingMaster bookingMaster = jdbcTemplate.queryForObject(selectQuery, new BookingMasterRowMapper());

        selectQuery =  "SELECT * FROM TrackEx.booking_passenger_master WHERE trackex_trip_id="+1010101;
        List<BookingPassengerMaster> bookingPassengerMasters = jdbcTemplate.query(selectQuery,new BookingPassengerMasterRowMapper());

        bookingMaster.setPassengers(bookingPassengerMasters);

        return bookingMaster;
    }

}
