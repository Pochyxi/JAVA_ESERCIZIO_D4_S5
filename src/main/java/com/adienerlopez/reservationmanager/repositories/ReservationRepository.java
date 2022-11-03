package com.adienerlopez.reservationmanager.repositories;

import com.adienerlopez.reservationmanager.entities.Reservation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends PagingAndSortingRepository<Reservation, Integer>{

}
