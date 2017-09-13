package com.trvl.domain.api.airbookings.airbookings.rowmappers;

import com.trvl.domain.api.airbookings.airbookings.domains.BookingSegmentMaster;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by reji on 14/09/17.
 */
public class BookingSegmentMasterRowMapper implements RowMapper<BookingSegmentMaster>{
    @Override
    public BookingSegmentMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        BookingSegmentMaster bookingSegmentMaster=new BookingSegmentMaster();
        bookingSegmentMaster.setTrackexTripId(rs.getInt("trackex_trip_id"));
        bookingSegmentMaster.setPnr(rs.getString("pnr"));
        bookingSegmentMaster.setTripSequenceIndicator(rs.getString("trip_sequence_indicator"));
        bookingSegmentMaster.setSegmentSequenceIndicator(rs.getString("segment_sequence_indicator"));
        bookingSegmentMaster.setAirlineCode(rs.getString("airline_code"));
        bookingSegmentMaster.setOriginAirportCode(rs.getString("origin_airport_code"));
        bookingSegmentMaster.setOriginTerminal(rs.getString("origin_terminal"));
        bookingSegmentMaster.setOriginDepartureTime(rs.getString("origin_departure_time"));
        bookingSegmentMaster.setDestinationAirportCode(rs.getString("destination_airport_code"));
        bookingSegmentMaster.setDestinationTerminal(rs.getString("destination_terminal"));
        bookingSegmentMaster.setDestinationArrivalTime(rs.getString("destination_arrival_time"));
        bookingSegmentMaster.setAircraftType(rs.getString("aircraft_type"));
        bookingSegmentMaster.setAirlineName(rs.getString("airline_name"));
        bookingSegmentMaster.setFlightNumber(rs.getString("flight_number"));
        return bookingSegmentMaster;
    }
}
