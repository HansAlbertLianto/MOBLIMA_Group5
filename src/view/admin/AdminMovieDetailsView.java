package view.admin;

import model.Movie;
import view.View;

public class AdminMovieDetailsView extends View {
    private static final String message = "What details do you want to edit?\n" +
            "1. Movie Title\n" +
            "2. Director\n" +
            "3. Cast\n" +
            "4. Genre\n" +
            "5. Synopsis\n" +
            "Enter 0 to go back\n";

    private Movie movie = service.doGetCurrentMovie();

    public AdminMovieDetailsView() {
        super(message, 0, 5);
    }

    @Override
    protected void manageResponse() {
        if (response == 0) service.goExit();
        String edited = Message.inputString(1, 30, getCaption());
        switch (response) {
            case 1:
                movie.setMovieTitle(edited);
                break;
            case 2:
                movie.getDetails().setDirector(edited);
                break;
            case 3:
                movie.getDetails().setCast(edited);
                break;
            case 4:
                movie.getDetails().setMovieType(edited);
                break;
            case 5:
                movie.getDetails().setSynopsis(edited);
                break;
            default:
                break;
        }
        service.doEditMovie(movie);
        this.appear();
    }

    private String getCaption() {
        switch (response) {
            case 1:
                return "New Movie Title";
            case 2:
                return "New Director";
            case 3:
                return "New Cast";
            case 4:
                return "New Genre";
            case 5:
                return "New Synopsis";
            default:
                return "";
        }
    }
}
