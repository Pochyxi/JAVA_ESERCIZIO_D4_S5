package com.adienerlopez.reservationmanager.repositories;


import com.adienerlopez.reservationmanager.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
