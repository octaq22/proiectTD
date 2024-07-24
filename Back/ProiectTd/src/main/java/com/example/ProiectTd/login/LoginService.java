package com.example.ProiectTd.login;

import com.example.ProiectTd.appuser.AppUser;
import com.example.ProiectTd.appuser.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public String login(LoginRequest request) {
        AppUser user = userRepository.findByUsername(request.getUsername());

        if (user != null && user.getPassword().equals(request.getPassword())) {
            return "Login reușit";
        } else {
            return "Login eșuat";
        }
    }
}
