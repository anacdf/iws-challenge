package com.dedavid.desafio;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BandResponse {
    private String id;
    private String name;
    private String image;
    private String genre;
    private String biography;
    private int numPlays;
    private List<String> albums;
}
