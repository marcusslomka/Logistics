package de.supercode.logistic.services;

import de.supercode.logistic.entities.Truck;
import de.supercode.logistic.repositories.Truckrepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TruckService {
    Truckrepository truckrepository;

    public TruckService(Truckrepository truckrepository) {
        this.truckrepository = truckrepository;
    }

    public Truck createNewTruck(Truck truck){
        return truckrepository.save(truck);
    }
    public Truck getTruckByID(long id){
        return truckrepository.findById(id).orElse(null);
    }

    public List<Truck> getAllTrucks(){
        List<Truck> trucks = new ArrayList<>();
        truckrepository.findAll().forEach(trucks::add);
        return trucks;
    }

    public Truck updateTruck(long id, Truck truck){
        Truck toUpgradeTruck = truckrepository.findById(id).orElseThrow();
        toUpgradeTruck.setDistance(truck.getDistance());
        toUpgradeTruck.setModel(truck.getModel());
        toUpgradeTruck.setTonnage(truck.getTonnage());
        return truckrepository.save(toUpgradeTruck);
    }
    public void deleteTruck (long id){
        truckrepository.deleteById(id);
    }
}
