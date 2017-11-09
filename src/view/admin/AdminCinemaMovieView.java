package view.admin;

import model.Cinema;
import model.CinemaMovie;
import model.CinemaMovieDate;
import model.Movie;
import view.View;

public class AdminCinemaMovieView extends View {

    public AdminCinemaMovieView() {
        super(getHeaderMessage(), 0, 3);
    }

    private static Cinema currentCinema() {
        return service.doGetCurrentCinema();
    }

    private static Movie currentMovie() {
        return service.doGetCurrentMovie();
    }

    private static String getHeaderMessage() {
        return "Welcome to " + currentCinema().getName() + "\n" +
                "1. List all today's movies in this cinema\n" +
                "2. Add new showtime and movie\n" +
                "3. Edit/Remove existing showtime and movie\n" +
                "Enter 0 to go back\n";
    }

    @Override
    public void appear() {
        if (service.isTryAddingMovie())
            takingCinemaMovieDetails();
        else
            super.appear();
    }

    @Override
    protected void manageResponse() {
        switch (response) {
            case 1:
                service.goCinemaMovieList();
                this.appear();
                break;
            case 2:
                service.tryAddingMovieToCinema();
                service.goSearchListMovie();
                this.appear();
                break;
            case 3:
                service.goCinemaMovieList();
                this.editing();
                this.appear();
                break;
            default:
                service.goExit();
                break;
        }
    }

    private void takingCinemaMovieDetails() {
        Message.printMessage("Coming back. . . Please input all the details (start time , end time) correctly");
        int starthour = Message.input(0, 24);
        int startmin = Message.input(0, 60);
        int endhour = Message.input(0, 24);
        int endmin = Message.input(0, 60);
        CinemaMovie cinemaMovie = new CinemaMovie(currentCinema(), currentMovie());
        CinemaMovieDate cinemaMovieDate = new CinemaMovieDate(starthour, startmin, endhour, endmin);
        cinemaMovie.setDate(cinemaMovieDate);
        service.doAddMovieToCinema();
    }

    private void editing(){
        Message.printMessage("\nEditing this cinema movie with details");
        Message.printMessage(service.doGetCurrentCinemaMovie().toString());
    }
}
