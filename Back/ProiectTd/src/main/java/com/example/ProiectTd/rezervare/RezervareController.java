package com.example.ProiectTd.rezervare;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/rezervare")
@AllArgsConstructor
public class RezervareController {

    private final RezervareService rezervareService;

    @PostMapping
    public String registerRezervare(@RequestBody RezervareRequest request) {
        return rezervareService.registerRezervare(request);
    }

    @GetMapping("/user/{username}")
    public List<Rezervare> getRezervariByUsername(@PathVariable String username) {
        return rezervareService.getRezervariByUsername(username);
    }
}
