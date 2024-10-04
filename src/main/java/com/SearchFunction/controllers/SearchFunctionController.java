package com.SearchFunction.controllers;

import com.SearchFunction.models.Album;
import com.SearchFunction.models.Artist;
import com.SearchFunction.models.Media;
import com.SearchFunction.models.User;
import com.SearchFunction.service.SearchFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/search")
public class SearchFunctionController {

    @Autowired
    private SearchFunctionService searchFunctionService;

    @GetMapping("/users")
    public ResponseEntity<Optional<User>> searchUserByUsername(@RequestParam String username) {
        Optional<User> user = searchFunctionService.searchUserByUsername(username);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/artists")
    public ResponseEntity<List<Artist>> searchArtistByName(@RequestParam String artistName) {
        List<Artist> artists = searchFunctionService.searchArtistByName(artistName);
        return ResponseEntity.ok(artists);
    }

    @GetMapping("/albums")
    public ResponseEntity<List<Album>> searchAlbumByName(@RequestParam String albumName) {
        List<Album> albums = searchFunctionService.searchAlbumByName(albumName);
        return ResponseEntity.ok(albums);
    }

    @GetMapping("/media")
    public ResponseEntity<List<Media>> searchMediaByGenre(@RequestParam String genre) {
        List<Media> media = searchFunctionService.searchMediaByGenre(genre);
        return ResponseEntity.ok(media);
    }

    @GetMapping("/albums/release-year")
    public ResponseEntity<List<Album>> searchAlbumByReleaseDate(@RequestParam int year) {
        List<Album> albums = searchFunctionService.searchAlbumByReleaseDate(year);
        return ResponseEntity.ok(albums);
    }

    @GetMapping("/albums/artist")
    public ResponseEntity<List<Album>> searchAlbumByArtistName(@RequestParam String artistName) {
        List<Album> albums = searchFunctionService.searchAlbumByArtistName(artistName);
        return ResponseEntity.ok(albums);
    }

    @GetMapping("/media/type")
    public ResponseEntity<List<Media>> searchMediaByType(@RequestParam String mediaType) {
        List<Media> media = searchFunctionService.searchMediaByType(mediaType);
        return ResponseEntity.ok(media);
    }

    @GetMapping("/media/artist")
    public ResponseEntity<List<Media>> searchMediaByArtistName(@RequestParam String artistName) {
        List<Media> media = searchFunctionService.searchMediaByArtistName(artistName);
        return ResponseEntity.ok(media);
    }

    @GetMapping("/artists/album-date")
    public ResponseEntity<List<Artist>> searchArtistByAlbumDate(@RequestParam int albumDate) {
        List<Artist> artists = searchFunctionService.searchArtistByAlbumDate(albumDate);
        return ResponseEntity.ok(artists);
    }

    @GetMapping("/artists/genre")
    public ResponseEntity<List<Artist>> searchArtistByGenre(@RequestParam String genre) {
        List<Artist> artists = searchFunctionService.searchArtistByGenre(genre);
        return ResponseEntity.ok(artists);
    }
}
