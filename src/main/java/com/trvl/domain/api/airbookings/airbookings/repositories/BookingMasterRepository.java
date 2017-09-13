package com.trvl.domain.api.airbookings.airbookings.repositories;

import com.trvl.domain.api.airbookings.airbookings.domains.BookingMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by reji on 13/09/17.
 */

@Repository
public interface BookingMasterRepository extends JpaRepository<BookingMaster,Integer>{

    List<BookingMaster> findAll();

    BookingMaster findByTrackexTripIdAndLeadPaxEmail(String trackexTripId,String leadPaxEmail); //LastnameAndFirstname
}
