package org.example.service;

import org.example.entity.User;
import org.example.exception.AlreadyExisteException;
import org.example.exception.NotFoundException;
import org.example.exception.WrongPasswordException;
import org.example.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String register(User user) {
        List<User> usersFound =  userRepository.findByName(user.getName());
        if (usersFound.isEmpty()) {
            userRepository.add(user);
            return "Vous êtes enregistré " + user;
        }
        throw new AlreadyExisteException("Utilisateur déjà existant !");
    }

    public String connection (User user) {
            List<User> usersFound = userRepository.findByName(user.getName());
        if(!usersFound.isEmpty() && !usersFound.contains(user)) {
            if(usersFound.get(0).getPassword().equals(user.getPassword())){
                return "Vous êtes connecté"+user;
            }
            throw new WrongPasswordException("Mot de passe incorrect !");
        }
        throw new NotFoundException("Utilisateur non trouvé !");
    }
}



