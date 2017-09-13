package com.trvl.domain.api.airbookings.airbookings.domains;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by reji on 13/09/17.
 */
@Entity
@Table(name = "booking_master")
public class BookingMaster {
    @Id
    @Column (name = "trackex_trip_id")
    int trackexTripId;

    @JoinColumn(name = "trackex_trip_id")
    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<BookingPassengerMaster> passengers;

    @JoinColumn(name = "trackex_trip_id")
    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<BookingSegmentMaster> segments;

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

    public int getTrackexTripId() {
        return trackexTripId;
    }

    public void setTrackexTripId(int trackexTripId) {
        this.trackexTripId = trackexTripId;
    }

    public List<BookingPassengerMaster> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<BookingPassengerMaster> passengers) {
        this.passengers = passengers;
    }

    public List<BookingSegmentMaster> getSegments() {
        return segments;
    }

    public void setSegments(List<BookingSegmentMaster> segments) {
        this.segments = segments;
    }

    public String getServicerBookingId() {
        return servicerBookingId;
    }

    public void setServicerBookingId(String servicerBookingId) {
        this.servicerBookingId = servicerBookingId;
    }

    public String getServicerCode() {
        return servicerCode;
    }

    public void setServicerCode(String servicerCode) {
        this.servicerCode = servicerCode;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceCreationDate() {
        return invoiceCreationDate;
    }

    public void setInvoiceCreationDate(String invoiceCreationDate) {
        this.invoiceCreationDate = invoiceCreationDate;
    }

    public String getLeadPaxEmail() {
        return leadPaxEmail;
    }

    public void setLeadPaxEmail(String leadPaxEmail) {
        this.leadPaxEmail = leadPaxEmail;
    }

    public String getLeadPaxPhone() {
        return leadPaxPhone;
    }

    public void setLeadPaxPhone(String leadPaxPhone) {
        this.leadPaxPhone = leadPaxPhone;
    }

    public String getTotalItinerearyCost() {
        return totalItinerearyCost;
    }

    public void setTotalItinerearyCost(String totalItinerearyCost) {
        this.totalItinerearyCost = totalItinerearyCost;
    }
}
