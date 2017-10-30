package view;

public class AdminHomeView extends View {

    private static final String message =
            "Welcome, Admin !\n" +
                    "What do you want to do:\n" +
                    "1. Create/Update/Delete movie Listing\n" +
                    "2. Create/Update/Delete cinema showtime\n" +
                    "3. Create/Update/Delete movies at cinema\n" +
                    "4. Configure system settings (holiday, ticket price)\n" +
                    "5. Edit Top 5 Movie Listing Sorting Type\n" +
                    "6. Logout\n";

    public AdminHomeView() {
        super(message, 1, 6);
    }

    @Override
    protected void manageResponse() {
        switch (response) {
            case 1:
                service.goMovie();
                break;
            case 2:
                service.goCinema();
                break;
            case 3:
                service.goCinemaMovie();
                break;
            case 4:
                service.goSettings();
                break;
            case 5:
                service.goTop5Edit();
                break;
            case 6:
                service.goExit();
                break;
            default:
                break;
        }

    }

}
