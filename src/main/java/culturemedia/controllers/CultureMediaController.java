package culturemedia.controllers;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.repository.implementations.ViewsRepositoryImpl;
import culturemedia.service.implement.CultureMediaServiceImplement;
import culturemedia.repository.implementations.VideoRepositoryImpl;

import culturemedia.service.CultureMediaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@RestController
public class CultureMediaController {

    private final CultureMediaServiceImplement cultureMediaService;


    public CultureMediaController() {
        this.cultureMediaService = new CultureMediaServiceImplement(new VideoRepositoryImpl(), new ViewsRepositoryImpl());
    }


    @GetMapping("/videos")
    public ResponseEntity<List<Video>> findAll() {

        try {
            return ResponseEntity.ok().body(cultureMediaService.findAll());
        } catch (VideoNotFoundException e) {

            return ResponseEntity.ok().header("Error-Message", e.getMessage()).build();
        }
    }

    @PostMapping("/videos")
    public Video save(@RequestBody @Valid Video video) {
        return cultureMediaService.save(video);
    }
}
