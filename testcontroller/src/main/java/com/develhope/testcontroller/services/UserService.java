package com.develhope.testcontroller.services;


import com.develhope.testcontroller.dtos.UserRequestDTO;
import com.develhope.testcontroller.dtos.UserResponseDTO;
import com.develhope.testcontroller.entities.User;
import com.develhope.testcontroller.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {


    UserRepository userRepository;
    ModelMapper modelMapper;

    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll().stream().map(
                user -> {
                    UserResponseDTO found = modelMapper.map(user, UserResponseDTO.class);
                    return found;
                }).collect(Collectors.toList());
    }

    public Optional<UserResponseDTO> getUserById(Long userID) {
        return userRepository.findById(userID)
                .map(user -> modelMapper.map(user, UserResponseDTO.class));
    }

    public UserResponseDTO saveUser(UserRequestDTO request) {
        User toSave = modelMapper.map(request, User.class);
        User saved = userRepository.saveAndFlush(toSave);
        UserResponseDTO response = modelMapper.map(saved, UserResponseDTO.class);

        return response;
    }

    public Optional<UserResponseDTO> updateUser(UserRequestDTO request, Long userID) {
        return userRepository.findById(userID)
                .map(existingUser -> {
                    modelMapper.map(request, existingUser);
                    User updatedUser = userRepository.saveAndFlush(existingUser);

                    return modelMapper.map(updatedUser, UserResponseDTO.class);
                });
    }

    public boolean deleteUserByID(Long userID) {
        return userRepository.findById(userID).map(user -> {
            userRepository.deleteById(userID);
            return true;
        }).orElse(false);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}

