package view;

import model.*;
import view.View;

public class CinemaView extends View {

    public CinemaView() {
        super();
    }

    public String getHeaderCinema() {
        return "\nHere are the available cinema of " + service.doGetCurrentCineplex().getName() + " :";
    }

    public int printAllCinemaAndGetNum() {
        int count = 0;
        for (Cinema cinema : service.doGetAllCinema()) {
            count++;
            Message.printMessage(Integer.toString(count) + ". " + cinema.getName());
        }
        Message.printMessage("Enter \"0\" to go back");
        return count;
    }

    @Override
    public void appear() {
        super.appear();
        Message.printMessage(getHeaderCinema());
        int temp = printAllCinemaAndGetNum();
        if (temp == 0) {
            Message.printMessage("No available cinema");
            service.goExit();
        }
        response = Message.input(0, temp);
        this.manageResponse();
    }

    @Override
    protected void manageResponse() {
        switch (response) {
            case 0:
                service.goExit();
                break;
            default:
                service.setCurrentCinema(service.doGetAllCinema().get(response - 1));
                if (service.doGetCurrentUser())
                    service.goUserCinemaMovie();
                else
                    service.goAdminCinemaMovie();
                break;
        }
    }

}
