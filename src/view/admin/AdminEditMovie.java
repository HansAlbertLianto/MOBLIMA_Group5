package view.admin;

import model.Movie;
import view.View;

public class AdminEditMovie extends View {
    private static final String message =
            "Here are the details of this movie ";

    private static final String selectionMessage =
            "1. Edit details \n" +
                    "2. Remove this movie\n";
    private static Movie movie = service.doGetCurrentMovie();

    public AdminEditMovie() {
        super(message + movie.getMovieTitle() + ":\n");
    }

    @Override
    public void appear() {
        super.appear();
        Message.printMessage(movie.getDetails().toString());
        Message.printMessage(selectionMessage);
        response = Message.input(1, 2);
        this.manageResponse();
    }

    @Override
    protected void manageResponse() {
        switch (response) {
            case 1:
                editMovie();
                break;
            case 2:
                removeMovie();
                break;
            default:
                break;
        }
    }

    private void editMovie() {

    }

    private void removeMovie() {

    }
}
