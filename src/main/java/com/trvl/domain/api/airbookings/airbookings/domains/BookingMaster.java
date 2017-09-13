package com.trvl.domain.api.airbookings.airbookings.domains;

import javax.persistence.*;

/**
 * Created by reji on 13/09/17.
 */
@Entity
@Table(name = "booking_master")
public class BookingMaster {
    @Id
    @Column (name = "trackex_trip_id")
    int trackexTripId;

   /* @OneToMany
    @JoinColumn(name = "categoryid")
    List<BookCategory>  bookCategory;*/

    @Column(name = "servicer_booking_id")
    String servicerBookingId;

    @Column(name = "servicercode")
    String servicerCode;

    @Column(name = "pnr")
    String pnr;

    @Column(name = "status")
    String status;

    @Column(name = "invoice_number")
    String invoiceNumber;

    @Column(name = "invoice_creation_date")
    String invoiceCreationDate;

    @Column(name = "lead_pax_email")
    String leadPaxEmail;

    @Column(name = "lead_pax_phone")
    String leadPaxPhone;

    @Column(name = "total_itinerary_cost")
    String totalItinerearyCost;

}
