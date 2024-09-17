package com.SearchFunction.repository;

import com.SearchFunction.models.Artists;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artists, Integer> {


    List<Artists> findByArtistNameContainingIgnoreCase(String artistName);

    List<Artists> findByGenreContainingIgnoreCase(String genre);

    List<Artists> findByAlbumDate(int albumDate);
}
