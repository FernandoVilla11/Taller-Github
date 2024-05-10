package culturemedia.model;

public class Video {

    private String code;
    public String title;
    private String description;
    public Double duration;

    public Video(String code, String title, String description, Double duration) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }


}



