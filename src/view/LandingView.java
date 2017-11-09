package view;

public class LandingView extends View {
    private static final String message =
            "Welcome to MOBLIMA !!! \n" +
                    "1. Admin Login \n" +
                    "2. Login as Movie goers\n" +
                    "3. Exit\n";

    public LandingView() {
        super(message, 1, 3);
    }

    protected void manageResponse() {
        switch (this.response) {
            case 1:
                service.goAdminLogin();
                break;
            case 2:
                service.goUserLogin();
                break;
            default:
                break;
        }
    }
}
