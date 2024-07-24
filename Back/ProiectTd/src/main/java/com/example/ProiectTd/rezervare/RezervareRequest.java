package com.example.ProiectTd.rezervare;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class RezervareRequest {
    private final LocalDate dataIntrare;
    private final LocalDate dataIesire;
    private final String username;
}
