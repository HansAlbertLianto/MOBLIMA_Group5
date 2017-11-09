package view.admin;

import model.Movie;
import view.View;

public class AdminEditMovie extends View {

    private static final String selectionMessage =
            "1. Edit details \n" +
                    "2. Remove this movie\n" +
                    "3. Go back";

    public AdminEditMovie() {
        super();
    }

    private static String getHeaderMessage(String movieTitle) {
        return "\n------------------------------------" +
                "\n------------------------------------\n" +
                "Here are the details of " + movieTitle +
                "\n------------------------------------" +
                "\n------------------------------------";
    }

    @Override
    public void appear() {
        super.appear();
        Message.printMessage(getHeaderMessage(service.doGetCurrentMovie().getMovieTitle()));
        Message.printMessage(service.doGetCurrentMovie().getDetails().toString());
        Message.printMessage(selectionMessage);
        response = Message.input(1, 3);
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
                service.goExit();
                break;
        }
    }

    private void editMovie() {
        service.goAdminMovieDetails();
    }

    private void removeMovie() {
        service.doRemoveMovie(service.doGetCurrentMovie());
        service.goExit();
    }
}
