package de.supercode.logistic.controller;

import de.supercode.logistic.entities.Truck;
import de.supercode.logistic.services.TruckService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trucks")
public class TruckController {
    TruckService truckService;

    public TruckController (TruckService truckService){
        this.truckService = truckService;
    }

    @PostMapping
    public Truck createTruck(@RequestBody Truck truck){
        return truckService.createNewTruck(truck);
    }

    @GetMapping("{id}")
    public Truck getTruckByID (@PathVariable long id){
        return truckService.getTruckByID(id);
    }

    @GetMapping
    public List<Truck> getAllTrucks(){
        return truckService.getAllTrucks();
    }
}
