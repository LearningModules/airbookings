package com.trvl.domain.api.airbookings.airbookings.controllers;

import com.trvl.domain.api.airbookings.airbookings.domains.BookingMaster;
import com.trvl.domain.api.airbookings.airbookings.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reji on 13/09/17.
 */
@RestController
@Component
@RequestMapping(value = "/bookings/air")
public class BookingMasterController {
    @Autowired
    BookService bookService;

    @RequestMapping(value = "/getBookingDetails", method = RequestMethod.GET)
    ResponseEntity<BookingMaster> retrieveBooking(@RequestParam(value="trackExTripId", required=true) String trackExTripId,
                                                  @RequestParam(value="email", required=true) String leadPaxEmail)
    {
        BookingMaster bookingMaster = bookService.retrieveBookingMaster(trackExTripId,leadPaxEmail);
        return new ResponseEntity<BookingMaster>(bookingMaster, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ResponseEntity<BookingMaster> retrieveAllBookings()
    {
        List<BookingMaster> bookings = bookService.getAllBookings();
        return new ResponseEntity(bookings, HttpStatus.OK);
    }

}
