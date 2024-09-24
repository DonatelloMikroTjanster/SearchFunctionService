package com.SearchFunction.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;

    @Column(name = "album_name", nullable = false, length = 50)
    private String albumName;

    @Column(name = "release_date", length = 50)
    private LocalDate releaseDate;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Media> mediaList;

    @ManyToOne
    @JoinColumn(name = "artist_id", nullable = false)
    @JsonIgnore
    private Artists artist;

    public Album() {
    }

    public Album(int id, String albumName, LocalDate releaseDate, List<Media> mediaList, Artists artist) {
        this.id = id;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.mediaList = mediaList;
        this.artist = artist;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public Artists getArtist() {
        return artist;
    }

    public void setArtist(Artists artist) {
        this.artist = artist;
    }
}
