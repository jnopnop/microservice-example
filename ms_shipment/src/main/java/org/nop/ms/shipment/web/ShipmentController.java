package org.nop.ms.shipment.web;

import org.nop.ms.shipment.domain.Shipment;
import org.nop.ms.shipment.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShipmentController {

    @Autowired
    private ShipmentRepository shipmentRepository;

    @RequestMapping(value = "/shipment/{id}", method = RequestMethod.GET)
    public Shipment get(@PathVariable String id) {
        return shipmentRepository.findOne(id);
    }

    @RequestMapping(value = "/shipment", method = RequestMethod.GET)
    public List<Shipment> getAll() {
        return shipmentRepository.findAll();
    }

    @RequestMapping(value = "/shipment", method = RequestMethod.POST)
    public Shipment create(@RequestBody Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    @RequestMapping(value = "/shipment/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        shipmentRepository.delete(id);
    }
}
