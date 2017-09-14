package com.trvl.domain.api.airbookings.airbookings.domains;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by reji on 13/09/17.
 */
@Entity
@Table(name = "booking_passenger_master")
public class BookingPassengerMaster implements Serializable{

    @Id
    @Column(name = "trackex_trip_id")
    int trackexTripId;

    /*@ManyToOne
    @JoinColumn(name="trackex_trip_id", insertable = false, updatable = false)
    BookingMaster bookingMaster;*/

    @Column(name = "pnr")
    String pnr;

    @Column(name = "passenger_id")
    String passengerId;

    @Column(name = "firstname")
    String firstName;

    @Column(name = "lastname")
    String lastName;

    @Column(name = "pax_type")
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

    public int getTrackexTripId() {
        return trackexTripId;
    }

    public void setTrackexTripId(int trackexTripId) {
        this.trackexTripId = trackexTripId;
    }

    /*public BookingMaster getBookingMaster() {
        return bookingMaster;
    }

    public void setBookingMaster(BookingMaster bookingMaster) {
        this.bookingMaster = bookingMaster;
    }*/

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPaxType() {
        return paxType;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIsLeadPax() {
        return isLeadPax;
    }

    public void setIsLeadPax(String isLeadPax) {
        this.isLeadPax = isLeadPax;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketIssueDate() {
        return ticketIssueDate;
    }

    public void setTicketIssueDate(String ticketIssueDate) {
        this.ticketIssueDate = ticketIssueDate;
    }

    public String getValidatingAirline() {
        return validatingAirline;
    }

    public void setValidatingAirline(String validatingAirline) {
        this.validatingAirline = validatingAirline;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getAssignedSeatCode() {
        return assignedSeatCode;
    }

    public void setAssignedSeatCode(String assignedSeatCode) {
        this.assignedSeatCode = assignedSeatCode;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
