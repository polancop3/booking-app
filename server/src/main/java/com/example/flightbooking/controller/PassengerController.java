package com.example.flightbooking.controller;

import com.example.flightbooking.model.Passenger;
import com.example.flightbooking.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class PassengerController {
    @Autowired
    private PassengerRepository passengerRepository;

    @PostMapping(path = "/add")
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Passenger> getPassenger() {
        return passengerRepository.findAll();
    }

    @DeleteMapping(path = "/{id}")
    public HttpStatus deletePassenger(@PathVariable("id") int id) {
        passengerRepository.deleteById(id);
        return HttpStatus.OK;
    }

    @PatchMapping(path = "/update")
    public Passenger updatePassenger(@RequestBody Passenger passenger) {
        return passengerRepository.save(passenger);
    }

}
