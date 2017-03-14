package org.nop.ms.shipment.repository;


import org.nop.ms.shipment.domain.Shipment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShipmentRepository extends MongoRepository<Shipment, String> {
}
