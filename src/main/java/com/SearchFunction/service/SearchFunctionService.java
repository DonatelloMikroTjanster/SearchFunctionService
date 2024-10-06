package com.SearchFunction.service;

import com.SearchFunction.models.Album;
import com.SearchFunction.models.Artist;
import com.SearchFunction.models.Media;
import com.SearchFunction.models.User;
import com.SearchFunction.repository.AlbumRepository;
import com.SearchFunction.repository.ArtistRepository;
import com.SearchFunction.repository.MediaRepository;
import com.SearchFunction.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchFunctionService {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private MediaRepository mediaRepository;

    @Autowired
    private UsersRepository usersRepository;


    public Optional<User> searchUserByUsername(String username) {
        return usersRepository.findByUsername(username);
    }

    public List<Artist> searchArtistByName(String artistName) {
        return artistRepository.findByArtistNameContainingIgnoreCase(artistName);
    }
    public List<Artist> searchArtistByGenre(String genre) {
        return artistRepository.findByGenreContainingIgnoreCase(genre);
    }

    public List<Album> searchAlbumByName(String albumName) {
        return albumRepository.findByAlbumNameContainingIgnoreCase(albumName);
    }
    public List<Artist> searchArtistByAlbumDate(int albumDate) {
        return artistRepository.findByAlbumDate(albumDate);
    }

    public List<Media> searchMediaByGenre(String genre) {
        return mediaRepository.findByGenreContainingIgnoreCase(genre);
    }
    public List<Album> searchAlbumByReleaseDate(int year) {
        return albumRepository.findByReleaseDateYear(year);
    }

    public List<Media> searchMediaByType(String mediaType) {
        return mediaRepository.findByMediaTypeContainingIgnoreCase(mediaType);
    }
    public List<Media> searchMediaByArtistName(String artistName) {
        return mediaRepository.findByArtist_ArtistNameContainingIgnoreCase(artistName);
    }

    public List<Album> searchAlbumByArtistName(String artistName) {
        return albumRepository.findByArtist_ArtistName(artistName);
    }
}
