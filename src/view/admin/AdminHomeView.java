package view.admin;

import view.View;

public class AdminHomeView extends View {

    private static final String message =
            "Welcome, Admin !\n" +
                    "What do you want to do:\n" +
                    "1. Add movie Listing\n" +
                    "2. Edit or Remove Movie Listing\n" +
                    "3. List all Cineplex\n" +
                    "4. List all valid Cinema movie and showtimes\n" +
                    "5. Configure system settings (holiday, ticket price)\n" +
                    "6. List Top 5 Movie\n" +
                    "7. Logout\n";

    public AdminHomeView() {
        super(message, 1, 7);
    }

    @Override
    protected void manageResponse() {
        switch (response) {
            case 1:
                service.goAdminAddMovie();
                break;
            case 2:
                service.goSearchListMovie();
                break;
            case 3:
                service.goCineplex();
                break;
            case 4:
                service.goAdminCinemaMovie();
                break;
            case 5:
                service.goAdminSetting();
                break;
            case 6:
                service.goMovieTop5();
                break;
            case 7:
                service.goExit();
                break;
            default:
                break;
        }

    }

}
