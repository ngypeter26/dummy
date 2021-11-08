package day01;

import java.util.List;
import java.time.LocalDateTime;

public class Movie {
    private String title;
    private List<LocalDateTime> time;

    public Movie(String title, List<LocalDateTime> time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getTime() {
        return time;
    }
}
