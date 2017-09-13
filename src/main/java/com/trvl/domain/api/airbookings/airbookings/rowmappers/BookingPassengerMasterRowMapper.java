package com.trvl.domain.api.airbookings.airbookings.rowmappers;

import com.trvl.domain.api.airbookings.airbookings.domains.BookingPassengerMaster;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by reji on 14/09/17.
 */
@Component
public class BookingPassengerMasterRowMapper implements RowMapper<BookingPassengerMaster>{
    @Override
    public BookingPassengerMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        BookingPassengerMaster bookingPassengerMaster=new BookingPassengerMaster();
        bookingPassengerMaster.setTrackexTripId(rs.getInt("trackex_trip_id"));
        bookingPassengerMaster.setPnr(rs.getString("pnr"));
        bookingPassengerMaster.setPassengerId(rs.getString("passenger_id"));
        bookingPassengerMaster.setFirstName(rs.getString("firstname"));
        bookingPassengerMaster.setLastName(rs.getString("lastname"));
        bookingPassengerMaster.setPaxType(rs.getString("pax_type"));
        bookingPassengerMaster.setDob(rs.getString("dob"));
        bookingPassengerMaster.setPassportNumber(rs.getString("passport_number"));
        bookingPassengerMaster.setAddressLine1(rs.getString("address_line1"));
        bookingPassengerMaster.setAddressLine2(rs.getString("address_line2"));
        bookingPassengerMaster.setCity(rs.getString("city"));
        bookingPassengerMaster.setCountryCode(rs.getString("country_code"));
        bookingPassengerMaster.setNationality(rs.getString("nationality"));
        bookingPassengerMaster.setPhone(rs.getString("phone"));
        bookingPassengerMaster.setEmail(rs.getString("email"));
        bookingPassengerMaster.setIsLeadPax(rs.getString("is_lead_pax"));
        bookingPassengerMaster.setTicketId(rs.getString("ticket_id"));
        bookingPassengerMaster.setTicketNumber(rs.getString("ticket_number"));
        bookingPassengerMaster.setTicketIssueDate(rs.getString("ticket_issue_date"));
        bookingPassengerMaster.setValidatingAirline(rs.getString("validating_airline"));
        bookingPassengerMaster.setTicketStatus(rs.getString("ticket_status"));
        bookingPassengerMaster.setAssignedSeatCode(rs.getString("assigned_seat_code"));
        bookingPassengerMaster.setTicketPrice(rs.getString("ticket_price"));
        return bookingPassengerMaster;
    }
}
