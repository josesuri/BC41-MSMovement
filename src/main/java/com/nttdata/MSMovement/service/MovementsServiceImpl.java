package com.nttdata.MSMovement.service;

import com.nttdata.MSMovement.model.Movements;
import com.nttdata.MSMovement.repository.MovementsRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class MovementsServiceImpl implements MovementsService{

    private final MovementsRepository movementsRepository;

    @Override
    public Flux<Movements> findAll() {
        return movementsRepository.findAll();
    }

    @Override
    public Mono<Movements> findById(String id) {
        return movementsRepository.findById(id);
    }

    @Override
    public Mono<Movements> save(Movements movement) {
        return movementsRepository.save(movement);
    }

    @Override
    public void delete(String id) {
        movementsRepository.deleteById(id).subscribe();
    }

    @Override
    public Flux<Movements> findByIdProduct(String idProduct) {
        return movementsRepository.findByIdProduct(idProduct);
    }

    @Override
    public Flux<Movements> findAllByIdProductAndType(String idProduct, String type) {
        return movementsRepository.findAllByIdProductAndType(idProduct, type);
    }
}
