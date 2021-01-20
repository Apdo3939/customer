package com.apdo3939.Customer.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apdo3939.Customer.project.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
