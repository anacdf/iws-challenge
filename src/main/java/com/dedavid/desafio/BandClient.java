package com.dedavid.desafio;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "bandClient", url = "https://iws-recruiting-bands.herokuapp.com/api")
public interface BandClient {

    @GetMapping("/bands")
    List<BandResponse> getBands();

    @GetMapping("/bands/{id}")
    BandResponse findBandbyId(@PathVariable("id") String id);

    @GetMapping("/albums")
    List<Album> getAlbums();
}
