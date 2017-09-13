package com.trvl.domain.api.airbookings.airbookings.services;

import com.trvl.domain.api.airbookings.airbookings.domains.BookingMaster;
import com.trvl.domain.api.airbookings.airbookings.repositories.BookingMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by reji on 13/09/17.
 */
@Component
public class BookService {

    @Autowired
    BookingMasterRepository bookingMasterRepository;

    public BookingMaster retrieveBookingMaster(String trackexTripId, String leadPaxEmail)
    {
        BookingMaster bookingMaster=bookingMasterRepository.findByTrackexTripIdAndLeadPaxEmail(trackexTripId,leadPaxEmail);
        return bookingMaster;
    }

    public List<BookingMaster> getAllBookings()
    {
        return bookingMasterRepository.findAll();
    }

}
