package com.SearchFunction.repository;

import com.SearchFunction.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Long> {


    List<Artist> findByArtistNameContainingIgnoreCase(String artistName);

    List<Artist> findByGenreContainingIgnoreCase(String genre);

    List<Artist> findByAlbumDate(int albumDate);
}
