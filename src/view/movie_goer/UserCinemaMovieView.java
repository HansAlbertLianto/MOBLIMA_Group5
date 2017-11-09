package view.movie_goer;

import model.Cinema;
import model.CinemaMovie;
import model.Movie;
import view.View;

public class UserCinemaMovieView extends View{
    public UserCinemaMovieView(){
        super(getHeaderMessage(), 0,3);
    }

    private static Cinema currentCinema() {
        return service.doGetCurrentCinema();
    }

    private static Movie currentMovie() {
        return service.doGetCurrentMovie();
    }

    private static String getHeaderMessage() {
        return "\nWelcome to " + currentCinema().getName() + "\n" +
                "1. List all today's movies in this cinema\n" +
                "2. Book a cinema showtimes and movie\n" +
                "3. Go back\n";
    }

    @Override
    public void appear() {
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
                if(!this.keepPreviousCinemaMovie())
                    service.goCinemaMovieList();
                this.bookingCinemaMovie();
                this.appear();
                break;
            default:
                service.goExit();
                break;
        }
    }

    private boolean keepPreviousCinemaMovie(){
        Message.printMessage("\nUsing this cinema movie with details");
        Message.printMessage(service.doGetCurrentCinemaMovie().toString());
        String option = Message.inputStringWithOption(Message.yesOrNoOption(), "Do you want to use this cinema movie (Y/n)?");
        return Message.resultOfYesOrNoOption(option);
    }

    private void bookingCinemaMovie(){
        Message.printMessage("\nBooking this cinema movie with details");
        Message.printMessage(service.doGetCurrentCinemaMovie().toString());
        //Book it
        //Go to booking view
    }
}
