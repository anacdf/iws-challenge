package com.dedavid.desafio;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Track {
    private String id;
    private String name;
    private int duration;
}
