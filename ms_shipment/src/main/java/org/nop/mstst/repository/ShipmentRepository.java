package org.nop.mstst.repository;


import org.nop.mstst.domain.Shipment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShipmentRepository extends MongoRepository<Shipment, String> {
}
