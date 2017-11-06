package view;

import model.Cineplex;
import view.View;

public class CineplexView extends View {
    private static final String message = "Here are the available cineplexes: \n";

    public CineplexView() {
        super(message);
    }

    public int printAllCineplexAndGetNum() {
        int count = 0;
        for (Cineplex cineplex : service.doGetAllCineplex()) {
            count++;
            Message.printMessage(cineplex.getName());
        }
        return count;
    }

    @Override
    public void appear() {
        super.appear();
        response = Message.input(0, printAllCineplexAndGetNum());
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
