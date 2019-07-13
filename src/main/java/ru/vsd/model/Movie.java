package ru.vsd.model;

import lombok.Data;

@Data
public class Movie {
    private int id;
    private String title;
    private int year;
    private String genre;
    private boolean watched;
}
