package view.admin;

import model.MovieDetails;
import view.View;

import java.util.ArrayList;

public class AdminAddMovie extends View{

    private static final String message =
            "Please input all following details correctly!\n";

    private String movieTitle, synopsis, genre, director, cast;
    private int status;

    public AdminAddMovie(){
        super(message);
    }

    @Override
    public void appear() {
        super.appear();

        movieTitle = Message.inputString(1,20, "Movie title");
        Message.printMessage(MovieDetails.MovieStatus());
        Message.printMessage("Status (1-4)");
        status = Message.input(1,4);
        genre = Message.inputString(1, 500, "Genre (max 500 words)");
        synopsis = Message.inputString(1, 500, "Synopsis (max 500 words)");
        director = Message.inputString(1,500, "Director");
        cast = Message.inputString(1,500, "Cast");

        String confirmation = Message.inputStringWithOption(Message.yesOrNoOption(), "Are you sure that the details are correct (Y/n)");
        switch (confirmation){
            case "y":
                ;
            case "Y":
                this.manageResponse();
                break;
            case "n":
                ;
            case "N":
                appear();
            default:
                appear();
        }
    }

    @Override
    protected void manageResponse() {
        service.doAddMovie(movieTitle, status, synopsis, genre, director, cast);
    }

    @Override
    public void handleSuccess() {
        super.handleSuccess();
        service.goExit();
    }
}
