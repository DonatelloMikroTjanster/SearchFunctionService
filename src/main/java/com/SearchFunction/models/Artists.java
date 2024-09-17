package com.SearchFunction.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Artists {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "artist_name", nullable = false)
    private String artistName;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "album_date")
    private Integer albumDate;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Album> albums;

    public Artists() {
    }

    public Artists(int id, String artistName, String genre, Integer albumDate, List<Album> albums) {
        this.id = id;
        this.artistName = artistName;
        this.genre = genre;
        this.albumDate = albumDate;
        this.albums = albums;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getAlbumDate() {
        return albumDate;
    }

    public void setAlbumDate(Integer albumDate) {
        this.albumDate = albumDate;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
