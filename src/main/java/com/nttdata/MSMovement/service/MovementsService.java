package com.nttdata.MSMovement.service;

import com.nttdata.MSMovement.model.Movements;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovementsService {
    public Flux<Movements> findAll();
    public Mono<Movements> findById(String id);
    public Mono<Movements> save(Movements movement);
    public void delete(String id);
    public Flux<Movements> findByIdProduct(String idProduct);
    public Flux<Movements> findAllByIdProductAndType(String idProduct, String type);
}