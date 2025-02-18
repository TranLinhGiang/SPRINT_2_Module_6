package com.example.spotifybackend.service;

import com.example.spotifybackend.model.Artist;

import java.util.List;

public interface IArtistService {

    List<Artist> getAllArtist();

    void save(Artist artist);

    Artist findByName(String nameArtist);
}
