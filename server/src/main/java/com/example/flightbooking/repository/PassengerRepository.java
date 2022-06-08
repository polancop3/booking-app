package com.example.flightbooking.repository;

import com.example.flightbooking.model.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
}
