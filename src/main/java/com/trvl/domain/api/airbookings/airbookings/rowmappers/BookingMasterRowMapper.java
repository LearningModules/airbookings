package com.trvl.domain.api.airbookings.airbookings.rowmappers;

import com.trvl.domain.api.airbookings.airbookings.domains.BookingMaster;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by reji on 14/09/17.
 */
public class BookingMasterRowMapper implements RowMapper<BookingMaster>{
    @Override
    public BookingMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
        BookingMaster bookingMaster=new BookingMaster();
        bookingMaster.setTrackexTripId(rs.getInt("trackex_trip_id"));
        bookingMaster.setServicerBookingId(rs.getString("servicer_booking_id"));
        bookingMaster.setServicerCode(rs.getString("servicercode"));
        bookingMaster.setPnr(rs.getString("pnr"));
        bookingMaster.setStatus(rs.getString("status"));
        bookingMaster.setInvoiceNumber(rs.getString("invoice_number"));
        bookingMaster.setInvoiceCreationDate(rs.getString("invoice_creation_date"));
        bookingMaster.setLeadPaxEmail(rs.getString("lead_pax_email"));
        bookingMaster.setLeadPaxPhone(rs.getString("lead_pax_phone"));
        bookingMaster.setTotalItinerearyCost(rs.getString("total_itinerary_cost"));
        return bookingMaster;
    }
}
