package culturemedia.exception;

import java.text.MessageFormat;

public class DurationNotValidException extends CulturemediaException{

    public DurationNotValidException(String title, Double duration) {
        super(MessageFormat.format("Duration {0} not valid for title {1} ", title, duration));
    }

}
