package com.trvl.domain.api.airbookings.airbookings.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by reji on 13/09/17.
 */
@Entity
@Table(name = "booking_passenger_master")
public class BookingPassengerMaster {

    @Id
    @Column(name = "trackex_trip_id")
    int trackexTripId;

   /* @OneToMany
    @JoinColumn(name = "categoryid")
    List<BookCategory>  bookCategory;*/

    @Column(name = "pnr")
    String pnr;

    @Column(name = "passenger_id")
    String passengerId;

    @Column(name = "firstname")
    String firstName;

    @Column(name = "lastname")
    String lastName;

    @Column(name = "paxType")
    String paxType;

    @Column(name = "dob")
    String dob;

    @Column(name = "passport_number")
    String passportNumber;

    @Column(name = "address_line1")
    String addressLine1;

    @Column(name = "address_line2")
    String addressLine2;

    @Column(name = "city")
    String city;

    @Column(name = "country_code")
    String countryCode;

    @Column(name = "nationality")
    String nationality;

    @Column(name = "phone")
    String phone;

    @Column(name = "email")
    String email;

    @Column(name = "is_lead_pax")
    String isLeadPax;

    @Column(name = "ticket_id")
    String ticketId;

    @Column(name = "ticket_number")
    String ticketNumber;

    @Column(name = "ticket_issue_date")
    String ticketIssueDate;

    @Column(name = "validating_airline")
    String validatingAirline;

    @Column(name = "ticket_status")
    String ticketStatus;

    @Column(name = "assigned_seat_code")
    String assignedSeatCode;

    @Column(name = "ticket_price")
    String ticketPrice;


}
