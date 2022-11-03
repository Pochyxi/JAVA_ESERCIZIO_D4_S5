package com.adienerlopez.reservationmanager.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adienerlopez.reservationmanager.entities.Building;

@Repository
public interface BuildingRepository extends PagingAndSortingRepository<Building, Integer>{

	@Query(
		value = " select b from Building b where upper(b.city) like upper(concat('%', :c, '%') ) "
	)
	public List<Building> findBuildingByCity(@Param("c") String c);
}
