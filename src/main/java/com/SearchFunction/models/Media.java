package com.SearchFunction.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "media_type", nullable = false)
    private String mediaType;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "url", nullable = false)
    private String url;

    @ManyToOne
    @JoinColumn(name = "album_id", nullable = false)
    private Album album;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Media() {
    }

    public Media(int id, String mediaType, String genre, LocalDate releaseDate, String url, Album album) {
        this.id = id;
        this.mediaType = mediaType;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.url = url;
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
