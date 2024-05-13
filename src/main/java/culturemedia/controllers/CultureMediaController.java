package culturemedia.controllers;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.service.implement.CultureMediaServiceImplement;

public class CultureMediaController {

    private final CultureMediaServiceImplement cultureMediaService;


    public CultureMediaController(CultureMediaServiceImplement cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }


    public List<Video> find_allVideos() throws VideoNotFoundException {
        List<Video> videos = null;
        videos = cultureMediaService.findAll();
        return videos;
    }


}
