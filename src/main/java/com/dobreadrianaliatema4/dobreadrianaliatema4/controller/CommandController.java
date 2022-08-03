package com.dobreadrianaliatema4.dobreadrianaliatema4.controller;

import com.dobreadrianaliatema4.dobreadrianaliatema4.model.Command;
import com.dobreadrianaliatema4.dobreadrianaliatema4.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("command")
public class CommandController {
    @Autowired
    private CommandService commandService;

    @GetMapping("/all")
    public List<Command> getAllCommands() {
        return commandService.getAllCommands();
    }

    @GetMapping("{id}")
    public Command getById(@PathVariable Integer id) {
        return commandService.getById(id);
    }

    @PostMapping
    public Command save(@RequestBody Command command){
        return commandService.save(command);
    }

    @PutMapping("{id}")
    public Command updateCommand(@PathVariable Integer id, @RequestBody Command command) {
        return commandService.updateCommand(id,command);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        commandService.deleteById(id);
    }
}
