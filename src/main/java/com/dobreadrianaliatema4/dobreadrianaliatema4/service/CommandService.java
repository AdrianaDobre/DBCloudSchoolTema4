package com.dobreadrianaliatema4.dobreadrianaliatema4.service;

import com.dobreadrianaliatema4.dobreadrianaliatema4.model.Command;
import com.dobreadrianaliatema4.dobreadrianaliatema4.repository.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandService {
    @Autowired
    private CommandRepository commandRepository;

    public List<Command> getAllCommands() {
        List<Command> aux = new ArrayList<>();
        commandRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Command getById(Integer id) {
        return commandRepository.findById(id).get();
    }

    public Command save(Command command) {
        return commandRepository.save(command);
    }

    public Command updateCommand(Integer id, Command command) {
        try {
            Command newCommand = commandRepository.findById(id).get();
            newCommand.setComments(command.getComments());
            newCommand.setStatus(command.getStatus());
            return commandRepository.save(newCommand);

        } catch (Exception e) {
            System.out.println("The order with this id does not exist");
            return null;
        }
    }

    public void deleteById(Integer id) {
        commandRepository.deleteById(id);
    }
}
