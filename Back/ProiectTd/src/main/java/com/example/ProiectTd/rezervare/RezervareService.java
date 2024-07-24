package com.example.ProiectTd.rezervare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervareService {

    @Autowired
    private RezervareRepository rezervareRepository;

    public String registerRezervare(RezervareRequest request) {
        Rezervare rezervare = new Rezervare();
        rezervare.setDataIntrare(request.getDataIntrare());
        rezervare.setDataIesire(request.getDataIesire());
        rezervare.setUsername(request.getUsername());

        rezervareRepository.save(rezervare);

        return "Rezervare înregistrată cu succes";
    }

    public List<Rezervare> getRezervariByUsername(String username) {
        return rezervareRepository.findByUsername(username);
    }
}
