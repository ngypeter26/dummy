package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time){
        List<String>  titleList = new ArrayList<>();
            for(Movie i : movieList){
//                System.out.println(i.getTitle());
//                System.out.println(i.getTime());
//                System.out.println(time);
//                System.out.println(i.getTime().indexOf(time));
                if (i.getTime().indexOf(time) > -1){
                    titleList.add(i.getTitle());
                }
            }
        return titleList;
    }


}
