package view.admin;

import model.Cinema;
import model.CinemaMovie;
import model.Movie;
import view.View;

public class AdminCinemaMovieView extends View {

    public AdminCinemaMovieView() {
        super(getHeaderMessage(), 0, 3);
    }

    private static Cinema currentCinema() {
        return service.doGetCurrentCinema();
    }

    private static String getHeaderMessage() {
        return "Welcome to " + currentCinema().getName() + "\n" +
                "1. List all today movies in this cinema\n" +
                "2. Add new showtime and movie\n" +
                "3. Edit/Remove existing showtime and movie\n" +
                "Enter 0 to go back\n";
    }

    @Override
    public void appear() {
        if(service.isTryAddingMovie())
            takingCinemaMovieDetails();
        else
            super.appear();
    }

    @Override
    protected void manageResponse() {
        switch (response) {
            case 1:
                if(listAllAvailableCinemaMovie() == 0) {
                    Message.printMessage("No available showtime for now... Going back to prev screen");
                    service.goExit();
                }
                break;
            case 2:
                service.tryAddingMovieToCinema();
                service.goSearchListMovie();
                break;
            case 3:
                int input = Message.input(0, listAllAvailableCinemaMovie());
                if(input == 0) {
                    Message.printMessage("No available showtime for now... Going back to prev screen");
                    service.goExit();
                }
                break;
            default:
                service.goExit();
                break;
        }
    }

    private void takingCinemaMovieDetails(){
        Message.printMessage("Coming back. . .");
        //TO-DO
        // input start time, end time
        //create cinema movie
        //service do add movie to cinema (cinema movie)
//        CinemaMovie cinemaMovie = new CinemaMovie(currentCinema(), service.doGetCurrentMovie(), 1200, 1300);
//        service.doAddMovieToCinema(cinemaMovie);
        service.goExit();
    }

    private int listAllAvailableCinemaMovie() {
        int count = 0;
        Message.printMessage("Checking list all");
        if(service.doGetAllCinemaMovie(currentCinema()).equals(null))
            return count;
        Message.printMessage("Checking list not null");
        for (CinemaMovie cinemaMovie : service.doGetAllCinemaMovie(currentCinema())) {
            count++;
            Message.printMessage(cinemaMovie.toString());
        }
        return count;
    }

    private void addNewCinemaMovie() {

    }
}
