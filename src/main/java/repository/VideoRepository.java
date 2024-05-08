package repository;

import java.util.List;
import model.Video;
public interface VideoRepository {
    List <Video> findAll();
    Video save (Video video);
    List <Video> find(String tittle);
    List <Video> find(Double fromDuration, Double toDuration);
}
