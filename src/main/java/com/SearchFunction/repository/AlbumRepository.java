package com.SearchFunction.repository;

import com.SearchFunction.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {


    List<Album> findByAlbumNameContainingIgnoreCase(String albumName);

    @Query("SELECT a FROM Album a WHERE YEAR(a.releaseDate) = :year")
    List<Album> findByReleaseDateYear(@Param("year") int year);

    List <Album> findByArtist_ArtistName(String artistName);



}
