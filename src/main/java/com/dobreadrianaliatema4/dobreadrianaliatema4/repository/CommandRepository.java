package com.dobreadrianaliatema4.dobreadrianaliatema4.repository;

import com.dobreadrianaliatema4.dobreadrianaliatema4.model.Command;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommandRepository extends CrudRepository<Command, Integer> {
    List<Command> findAll();
}
