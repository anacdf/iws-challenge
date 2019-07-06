package com.dedavid.desafio;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class Album {
    private String id;
    private String name;
    private String image;
    private String band;
    private Date releaseDate;
    private List<Track> tracks;
}
