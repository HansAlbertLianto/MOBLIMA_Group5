package Service;

public interface ActionService {

    public void doLogin(String username, String password);

    public void doSearchMovie();     

    public void doPrintListMovie();

    public void doPrintMovieDetails();

    public void doCheckSeat();

    public void doBook();

    public void doPurchase();

    public void doFindHistory();

    public void doChangeMovieDetails();

    public void doAddMovieToCinema();

    public void doChangeTicketPrices();

    public void doChangePublicHoliday();
}
