package view.movie_goer;

import model.CinemaMovie;
import model.Movie;
import view.View;

import java.util.ArrayList;

public class UserMovieDetailsView extends View {
    private static final String message =
            "\nHere is the details of the movies" + "\n" +
                    currentMovie().getDetails().toString()+"\n"+
                    "\n1. Check cinema showing this movie\n" +
                    "2. Go back\n";

    public UserMovieDetailsView() {
        super(message, 1, 2);
    }

    private static Movie currentMovie() {
        return service.doGetCurrentMovie();
    }

    @Override
    protected void manageResponse() {
        switch (response) {
            case 1:
                searchRelatedCinemaMovie();
                break;
            default:
                service.goExit();
                break;
        }

    }

    private void searchRelatedCinemaMovie() {
        int count = 0;
        ArrayList<CinemaMovie> cinemaMovies = service.searchCinemaMovie(currentMovie());
        if (cinemaMovies.size() == 0) {
            Message.printMessage("No related cinema movie");
            this.appear();
        }
        Message.printMessage("Here is the related cinema movie:\n");
        for (CinemaMovie cinemaMovie : cinemaMovies) {
            count++;
            Message.printMessage(cinemaMovie.getCinema().getName());
            Message.printMessage(Integer.toString(count) + cinemaMovie.toString());
        }
        Message.printMessage("Enter \"0\" to go back");
        int selection = Message.input(0, count);
        service.setCurrentCinemaMovie(cinemaMovies.get(selection - 1));
        service.goUserCinemaMovie();
    }
}
