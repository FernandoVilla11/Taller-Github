package exception;

import java.text.MessageFormat;

public class DurationNotValidException extends CulturemediaException{

    public DurationNotValidException(String title, Double duration) {
        super(MessageFormat.format("Invalid duration for the video {0}: {1}.", title, duration));
    }

}
