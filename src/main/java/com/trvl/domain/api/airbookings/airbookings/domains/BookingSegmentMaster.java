package com.trvl.domain.api.airbookings.airbookings.domains;

import javax.persistence.*;

/**
 * Created by reji on 13/09/17.
 */
@Entity
@Table(name = "booking_segment_master")
public class BookingSegmentMaster {

    @Id
    @Column(name = "trackex_trip_id")
    int trackexTripId;

    @ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "trackex_trip_id")
    BookingMaster bookingMaster;

    @Column(name = "pnr")
    String pnr;

    @Column(name = "trip_sequence_indicator")
    String tripSequenceIndicator;

    @Column(name = "segment_sequence_indicator")
    String segmentSequenceIndicator;

    @Column(name = "airline_code")
    String airlineCode;

    @Column(name = "origin_airport_code")
    String originAirportCode;

    @Column(name = "origin_terminal")
    String originTerminal;

    @Column(name = "origin_departure_time")
    String originDepartureTime;

    @Column(name = "destination_airport_code")
    String destinationAirportCode;

    @Column(name = "destination_terminal")
    String destinationTerminal;

    @Column(name = "destination_arrival_time")
    String destinationArrivalTime;

    @Column(name = "aircraft_type")
    String aircraftType;

    @Column(name = "airline_name")
    String airlineName;

    @Column(name = "flight_number")
    String flightNumber;

    public int getTrackexTripId() {
        return trackexTripId;
    }

    public void setTrackexTripId(int trackexTripId) {
        this.trackexTripId = trackexTripId;
    }

    public BookingMaster getBookingMaster() {
        return bookingMaster;
    }

    public void setBookingMaster(BookingMaster bookingMaster) {
        this.bookingMaster = bookingMaster;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getTripSequenceIndicator() {
        return tripSequenceIndicator;
    }

    public void setTripSequenceIndicator(String tripSequenceIndicator) {
        this.tripSequenceIndicator = tripSequenceIndicator;
    }

    public String getSegmentSequenceIndicator() {
        return segmentSequenceIndicator;
    }

    public void setSegmentSequenceIndicator(String segmentSequenceIndicator) {
        this.segmentSequenceIndicator = segmentSequenceIndicator;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getOriginAirportCode() {
        return originAirportCode;
    }

    public void setOriginAirportCode(String originAirportCode) {
        this.originAirportCode = originAirportCode;
    }

    public String getOriginTerminal() {
        return originTerminal;
    }

    public void setOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
    }

    public String getOriginDepartureTime() {
        return originDepartureTime;
    }

    public void setOriginDepartureTime(String originDepartureTime) {
        this.originDepartureTime = originDepartureTime;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    public void setDestinationTerminal(String destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    public String getDestinationArrivalTime() {
        return destinationArrivalTime;
    }

    public void setDestinationArrivalTime(String destinationArrivalTime) {
        this.destinationArrivalTime = destinationArrivalTime;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
