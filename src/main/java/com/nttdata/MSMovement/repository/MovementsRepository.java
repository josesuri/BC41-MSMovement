package com.nttdata.MSMovement.repository;

import com.nttdata.MSMovement.model.Movements;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MovementsRepository extends ReactiveMongoRepository<Movements, String> {
    public Flux<Movements> findByIdProduct(String idProduct);
    public Flux<Movements> findAllByIdProductAndType(String idProduct, String type);
}
