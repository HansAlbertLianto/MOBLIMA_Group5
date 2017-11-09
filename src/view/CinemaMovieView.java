package view;

import model.Cinema;
import model.CinemaMovie;
import model.CinemaMovieDate;
import model.Movie;
import view.View;

public class CinemaMovieView extends View {

    public CinemaMovieView() {
        super();
    }

    private static Cinema currentCinema() {
        return service.doGetCurrentCinema();
    }

    private static Movie currentMovie() {
        return service.doGetCurrentMovie();
    }

    @Override
    public void appear() {
        super.appear();
        int temp = listAllAvailableCinemaMovie(false);
        if (temp == 0) {
            Message.printMessage("\nNo available showtime for now... Going back to prev screen\n");
            service.goExit();
        } else {
            response = Message.input(0, temp);
            this.manageResponse();
        }
    }

    @Override
    protected void manageResponse() {
        switch (response) {
            case 0:
                service.goExit();
                break;
            default:
                service.setCurrentCinemaMovie(service.doGetAllCinemaMovie(currentCinema()).get(response - 1));
                service.goExit();
                break;
        }
    }

    private int listAllAvailableCinemaMovie(boolean today) {
        int count = 0;
        if (service.doGetAllCinemaMovie(currentCinema()).equals(null))
            return count;
        Message.printMessage("\nHere is all the available cinema movie: ");
        for (CinemaMovie cinemaMovie : service.doGetAllCinemaMovie(currentCinema())) {
            if (today) {
                if (cinemaMovie.getDate().isDateToday()) continue;
            }
            count++;
            Message.printMessage(Integer.toString(count) + cinemaMovie.toString());
        }
        Message.printMessage("Enter \"0\" to go back");
        return count;
    }

}
