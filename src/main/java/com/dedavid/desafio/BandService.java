package com.dedavid.desafio;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BandService {

    BandClient client;

    public BandService(BandClient client) {
        this.client = client;
    }

    public List<BandResponse> findBandByName(String name) {
        List<BandResponse> bandsByName = client.getBands().stream()
                .filter(b -> b.getName().contains(name))
                .collect(Collectors.toList());

        if (bandsByName.isEmpty()) {
            throw new BandNotFoundException("Banda não econtrada!");
        }
        return bandsByName;
    }

    public List<BandResponse> findByMostPopular() {

            return client.getBands().stream()
                    .sorted(Comparator.comparingInt(BandResponse::getNumPlays).reversed())
                    .collect(Collectors.toList());

    }

    public List<BandResponse> findByOrder() {

        return client.getBands().stream()
                .sorted(Comparator.comparing(BandResponse::getName))
                .collect(Collectors.toList());

    }
}
