package com.dedavid.desafio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BandController {

    BandClient client;
    BandService service;

    public BandController(BandClient client) {
        this.client = client;
    }

    @GetMapping("/bands")
    List<BandResponse> getBands(){
        return client.getBands();
    }

    @GetMapping("/bands/{id}")
    BandResponse findBandbyId(@PathVariable String id){
        return client.findBandbyId(id);
    }

    @GetMapping("/albums")
    List<Album> getAlbums(){
        return client.getAlbums();
    }

    @GetMapping("/bands/{name}")
    List<BandResponse> findBandByName(@PathVariable String name) {
        return service.findBandByName(name);
    }

    @GetMapping("bands/populars")
    List<BandResponse> findByMostPopular() {
        return service.findByMostPopular();
    }

    @GetMapping("bands/ordered")
    List<BandResponse> findByNamesOrder() {
        return service.findByOrder();
    }
}
