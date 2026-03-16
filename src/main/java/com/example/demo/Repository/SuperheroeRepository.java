package com.example.demo.Repository;

import com.example.demo.model.Superheroe;

import java.util.List;
import java.util.Optional;

public interface SuperheroeRepository {

Superheroe save(Superheroe superheroe);

List<Superheroe> findAll();

Superheroe delete(Superheroe superheroe);

Optional<Superheroe> findNombre(String nombre);

}
