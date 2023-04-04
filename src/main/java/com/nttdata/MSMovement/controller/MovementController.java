package com.nttdata.MSMovement.controller;

import com.nttdata.MSMovement.model.Movements;
import com.nttdata.MSMovement.service.MovementsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movements")
public class MovementController {
    private final MovementsService movementsService;

    @GetMapping
    public Flux<Movements> getAllMovements() {
        return movementsService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Movements> getMovements(@PathVariable("id") String id) {
        return movementsService.findById(id);
    }

    @GetMapping("/byProduct/{id}")
    public Flux<Movements> getMovementsByIdProduct(@PathVariable("id") String idProduct) {
        return movementsService.findByIdProduct(idProduct);
    }

    @GetMapping("/byProductAndType/{idProduct}/{type}")
    public Flux<Movements> getByIdProductAndType(@PathVariable("idProduct") String idProduct,
                                                 @PathVariable("type") String type) {
        return movementsService.findAllByIdProductAndType(idProduct, type);
    }

    @PostMapping
    public Mono<Movements> saveMovements(@RequestBody Movements movement){
        return movementsService.save(movement);
    }

    @PutMapping
    public Mono<Movements> updateMovements(@RequestBody Movements movement){
        return movementsService.save(movement);
    }

    @DeleteMapping("/{id}")
    public void deleteMovements(@PathVariable("id") String id) {
        movementsService.delete(id);
    }
}