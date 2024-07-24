package com.example.ProiectTd.registration;

import com.example.ProiectTd.appuser.AppUser;
import com.example.ProiectTd.appuser.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService
{
    @Autowired
    private UserRepository userRepository;
    public String register(RegistrationRequest request) {

        AppUser user = new AppUser();
        user.setName(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        userRepository.save(user);
        return "User Adaugat";
    }
}
