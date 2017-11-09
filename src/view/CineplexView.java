package view;

import model.Cineplex;
import view.View;

public class CineplexView extends View {
    private static final String message = "\nHere are the available cineplexes: \n";

    public CineplexView() {
        super(message);
    }

    public int printAllCineplexAndGetNum() {
        int count = 0;
        for (Cineplex cineplex : service.doGetAllCineplex()) {
            count++;
            Message.printMessage(Integer.toString(count) + ". " +cineplex.getName());
        }
        Message.printMessage("Enter \"0\" to go back");
        return count;
    }

    @Override
    public void appear() {
        super.appear();
        int temp = printAllCineplexAndGetNum();
        if(temp == 0) {
            Message.printMessage("No available cineplex");
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
                service.setCurrentCineplex(service.doGetAllCineplex().get(response-1));
                service.goCinema();
                break;
        }
    }
}
