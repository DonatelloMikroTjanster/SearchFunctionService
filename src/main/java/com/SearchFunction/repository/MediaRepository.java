package com.SearchFunction.repository;

import com.SearchFunction.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {

    List<Media> findByGenreContainingIgnoreCase(String genre);

    List<Media> findByMediaTypeContainingIgnoreCase(String mediaType);

    List<Media> findByArtist_ArtistNameContainingIgnoreCase(String artistName);

}
