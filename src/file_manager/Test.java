package file_manager;

import model.*;

import model_manager.CineplexManager;
import model_manager.MovieManager;

import java.util.ArrayList;

public class Test {

    private static MovieManager movieManager = MovieManager.getInstance();
    private static CineplexManager cineplexManager = CineplexManager.getInstance();

    public static void main(String[] args) {
//        populateMovie();
//        populateCineplexCinema();
//        printAllMovie();
//        printAllCineplex();
//        printAllCinema(cineplexManager.getAllCineplex().get(0));
        CinemaMovieDate date = new CinemaMovieDate(1200,1300);

    }

    public static void populateMovie() {
//        ArrayList<String> dumpTitleMovies = new ArrayList<String>();
//        dumpTitleMovies.add("Avatar");
//        dumpTitleMovies.add("Titanic");
//        dumpTitleMovies.add("Frozen");
//        dumpTitleMovies.add("Minions");
//        dumpTitleMovies.add("SkyFall");
//        dumpTitleMovies.add("Zootopia");
//        dumpTitleMovies.add("Cinderella");
//        dumpTitleMovies.add("Spectre");
//        dumpTitleMovies.add("It");
//        dumpTitleMovies.add("Logan");
//        dumpTitleMovies.add("Deadpool");
//        dumpTitleMovies.add("Jaws");
//        dumpTitleMovies.add("Rings");
//        dumpTitleMovies.add("Gifted");
//        dumpTitleMovies.add("Baywatch");
//        dumpTitleMovies.add("Focus");
//        dumpTitleMovies.add("Moana");
//        dumpTitleMovies.add("Sing");
//        dumpTitleMovies.add("Nerve");
//        dumpTitleMovies.add("Inferno");
//        for(String title : dumpTitleMovies){
//            movieManager.addMovie(title);
//        }
        Movie movie1 = new Movie(0,"Moana");
        MovieDetails md1 = new MovieDetails();
        md1.setCast("Auli'i Cravalho, Dwayne Johnson, Rachel House");
        md1.setDirector("Ron Clements, John Musker");
        md1.setMovieType("Animation, Adventure, Comedy");
        md1.setSynopsis("In Ancient Polynesia, when a terrible curse incurred by the Demigod Maui reaches Moana's island, she answers the Ocean's call to seek out the Demigod to set things right.");
        movie1.setDetails(md1);
        movieManager.addMovie(movie1.getMovieTitle(),md1);

        Movie movie2 = new Movie(1,"The Conjuring");
        MovieDetails md2 = new MovieDetails();
        md2.setCast("Patrick Wilson, Vera Farmiga, Ron Livingston");
        md2.setDirector("James Wan");
        md2.setMovieType("Horror, Mystery, Thriller");
        md2.setSynopsis("Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by a dark presence in their farmhouse.");
        movie2.setDetails(md2);
        movieManager.addMovie(movie2.getMovieTitle(),md2);

        Movie movie3 = new Movie(2,"It");
        MovieDetails md3 = new MovieDetails();
        md3.setCast(" Bill Skarsgård, Jaeden Lieberher, Finn Wolfhard");
        md3.setDirector("Andy Muschietti");
        md3.setMovieType("Drama, Horror, Thriller");
        md3.setSynopsis("A group of bullied kids band together when a shapeshifting demon, taking the appearance of a clown, begins hunting children.");
        movie3.setDetails(md3);
        movieManager.addMovie(movie3.getMovieTitle(),md3);

        Movie movie4 = new Movie(3,"Dunkirk");
        MovieDetails md4 = new MovieDetails();
        md4.setCast("Flonn Whitehead, Barry Keoghan, Mark Rylance");
        md4.setDirector("Christopher Nolan");
        md4.setMovieType("Action, Drama, History");
        md4.setSynopsis("Allied soldiers from Belgium, the British Empire and France are surrounded by the German Army, and evacuated during a fierce battle in World War II.");
        movie4.setDetails(md4);
        movieManager.addMovie(movie4.getMovieTitle(),md4);

        Movie movie5 = new Movie(4,"Cars 3");
        MovieDetails md5 = new MovieDetails();
        md5.setCast("Owen Wilson, Cristela Alonzo, Chris Cooper");
        md5.setDirector("Brian Fee");
        md5.setMovieType("Animation, Adventure, Comedy");
        md5.setSynopsis("Lightning McQueen sets out to prove to a new generation of racers that he's still the best race car in the world.");
        movie5.setDetails(md5);
        movieManager.addMovie(movie5.getMovieTitle(),md5);

        Movie movie6 = new Movie(5,"Suicide Squad");
        MovieDetails md6 = new MovieDetails();
        md6.setCast("Will Smith, Jared Leto, Margot Robbie");
        md6.setDirector("David Ayer");
        md6.setMovieType("Action, Adventure, Fantasy");
        md6.setSynopsis("A secret government agency recruits some of the most dangerous incarcerated super-villains to form a defensive task force. Their first mission: save the world from the apocalypse.");
        movie6.setDetails(md6);
        movieManager.addMovie(movie6.getMovieTitle(),md6);

        Movie movie7 = new Movie(6,"Saw");
        MovieDetails md7 = new MovieDetails();
        md7.setCast("Cary Elwes, Leigh Whannel, Danny Glover");
        md7.setDirector("James Wan");
        md7.setMovieType("Horror, Mystery, Thriller");
        md7.setSynopsis("Two strangers, who awaken in a room with no recollection of how they got there, soon discover they're pawns in a deadly game perpetrated by a notorious serial killer.");
        movie7.setDetails(md7);
        movieManager.addMovie(movie7.getMovieTitle(),md7);

        Movie movie8 = new Movie(7,"Lady Bird");
        MovieDetails md8 = new MovieDetails();
        md8.setCast("Saoirse Ronan, Odeya Rush, Kathryn Newton");
        md8.setDirector("Greta Gerwig");
        md8.setMovieType("Comedy");
        md8.setSynopsis("The adventures of a young woman living in Northern California for a year.");
        movie8.setDetails(md8);
        movieManager.addMovie(movie8.getMovieTitle(),md8);

        Movie movie9 = new Movie(8,"The Foreigner");
        MovieDetails md9 = new MovieDetails();
        md9.setCast("Katie Leung, Jackie Chan, Rufus Jones");
        md9.setDirector("Martin Campbell");
        md9.setMovieType("Action, Drama, Thriller");
        md9.setSynopsis("A humble businessman with a buried past seeks justice when his daughter is killed in an act of terrorism. A cat-and-mouse conflict ensues with a government official, whose past may hold clues to the killers' identities.");
        movie9.setDetails(md9);
        movieManager.addMovie(movie9.getMovieTitle(),md9);

        Movie movie10 = new Movie(9, "Baywatch");
        MovieDetails md10 = new MovieDetails();
        md10.setCast("Dwayne Johnson, Zac Efron, Alexandra Daddario");
        md10.setDirector("Seth Gordon");
        md10.setMovieType("Action, Comedy, Crime");
        md10.setSynopsis("Devoted lifeguard Mitch Buchannon butts heads with a brash new recruit, as they uncover a criminal plot that threatens the future of the bay.");
        movie10.setDetails(md10);
        movieManager.addMovie(movie10.getMovieTitle(),md10);

        Movie movie11 = new Movie(10,"Titanic");
        MovieDetails md11 = new MovieDetails();
        md11.setCast("Leonardo DiCaprio, Kate Winslet, Billy Zane");
        md11.setDirector("James Cameron");
        md11.setMovieType("Drama, Romance");
        md11.setSynopsis("A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.");
        movie11.setDetails(md11);
        movieManager.addMovie(movie11.getMovieTitle(),md11);

        Movie movie12 = new Movie(11, "Avatar");
        MovieDetails md12 = new MovieDetails();
        md12.setCast("Sam Worthington, Zoe Saldana, Sigourney Weaver");
        md12.setDirector("James Cameron");
        md12.setMovieType("Action, Adventure, Fantasy");
        md12.setSynopsis("A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.");
        movie12.setDetails(md12);
        movieManager.addMovie(movie12.getMovieTitle(),md12);

        Movie movie13 = new Movie(12, "Cinderella");
        MovieDetails md13 = new MovieDetails();
        md13.setCast("Lily James, Cate Blanchett, Richard Madden");
        md13.setDirector("Kenneth Branagh");
        md13.setMovieType("Drama, Family, Fantasy");
        md13.setSynopsis("When her father unexpectedly passes away, young Ella finds herself at the mercy of her cruel stepmother and her scheming step-sisters. Never one to give up hope, Ella's fortunes begin to change after meeting a dashing stranger.");
        movie13.setDetails(md13);
        movieManager.addMovie(movie13.getMovieTitle(),md13);

        Movie movie14 = new Movie(13, "La La Land");
        MovieDetails md14 = new MovieDetails();
        md14.setCast("Ryan Gosling, Emma Stone, Rosemarie DeWitt");
        md14.setDirector("Damien Chazelle");
        md14.setMovieType("Comedy, Drama, Music");
        md14.setSynopsis("While navigating their careers in Los Angeles, a pianist and an actress fall in love while attempting to reconcile their aspirations for the future.");
        movie14.setDetails(md14);
        movieManager.addMovie(movie14.getMovieTitle(),md14);

        Movie movie15 = new Movie(14, "Inception");
        MovieDetails md15 = new MovieDetails();
        md15.setCast("Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page");
        md15.setDirector("Christopher Nolan");
        md15.setMovieType("Action, Adventure, Sci-fi");
        md15.setSynopsis("A thief, who steals corporate secrets through use of dream-sharing technology, is given the inverse task of planting an idea into the mind of a CEO.");
        movie15.setDetails(md15);
        movieManager.addMovie(movie15.getMovieTitle(),md15);

        Movie movie16 = new Movie(15, "Gladiator");
        MovieDetails md16 = new MovieDetails();
        md16.setCast("Russell Crowe, Joaquin Phoenix, Connie Nielsen");
        md16.setDirector("Ridley Scott");
        md16.setMovieType("Action, Adventure, Drama");
        md16.setSynopsis("When a Roman General is betrayed, and his family murdered by an emperor's corrupt son, he comes to Rome as a gladiator to seek revenge.");
        movie16.setDetails(md16);
        movieManager.addMovie(movie16.getMovieTitle(),md16);

        Movie movie17 = new Movie(16,"up");
        MovieDetails md17 = new MovieDetails();
        md17.setCast("Edward Asner, Jordan Nagai, John Ratzenberger");
        md17.setDirector("Pete Docter, Bob Peterson");
        md17.setMovieType("Animation, Adventure, Comedy");
        md17.setSynopsis("Seventy-eight year old Carl Fredricksen travels to Paradise Falls in his home equipped with balloons, inadvertently taking a young stowaway.");
        movie17.setDetails(md17);
        movieManager.addMovie(movie17.getMovieTitle(),md17);

        Movie movie18 = new Movie(17, "Logan");
        MovieDetails md18 = new MovieDetails();
        md18.setCast("Hugh Jackman, Patrick Stewart, Dafne Keen");
        md18.setDirector("James Mangold");
        md18.setMovieType("Action, Drama, Sci-fi");
        md18.setSynopsis("In the near future, a weary Logan cares for an ailing Professor X, somewhere on the Mexican border. However, Logan's attempts to hide from the world, and his legacy, are upended when a young mutant arrives, pursued by dark forces.");
        movie18.setDetails(md18);
        movieManager.addMovie(movie18.getMovieTitle(),md18);

        Movie movie19 = new Movie(18,"Interstellar");
        MovieDetails md19 = new MovieDetails();
        md19.setCast("Matthew McConaughey, Anne Hathaway, Jessica Chastain");
        md19.setDirector("Christopher Nolan");
        md19.setMovieType("Adventure, Drama, Sci-fi");
        md19.setSynopsis("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.");
        movie19.setDetails(md19);
        movieManager.addMovie(movie19.getMovieTitle(),md19);

        Movie movie20 = new Movie(19, "The Revenant");
        MovieDetails md20 = new MovieDetails();
        md20.setCast("Leonardo DiCaprio, Tom Hardy,Will Poulter");
        md20.setDirector("Alejandro González Iñárritu");
        md20.setMovieType("Adventure, Drama, History");
        md20.setSynopsis("A frontiersman on a fur trading expedition in the 1820s fights for survival after being mauled by a bear and left for dead by members of his own hunting team.");
        movie20.setDetails(md20);
        movieManager.addMovie(movie20.getMovieTitle(),md20);

        Movie movie21 = new Movie(20,"Les Misérables");
        MovieDetails md21 = new MovieDetails();
        md21.setCast("Hugh Jackman, Russell Crowe, Anne Hathaway");
        md21.setDirector("Tom Hooper");
        md21.setMovieType("Drama, History, Musical");
        md21.setSynopsis("In 19th-century France, Jean Valjean, who for decades has been hunted by the ruthless policeman Javert after breaking parole, agrees to care for a factory worker's daughter. The decision changes their lives forever.");
        movie21.setDetails(md21);
        movieManager.addMovie(movie21.getMovieTitle(),md21);

        Movie movie22 = new Movie(21, "Passengers");
        MovieDetails md22 = new MovieDetails();
        md22.setCast("Anne Hathaway, Patrick Wilson, David Morse");
        md22.setDirector("Rodrigo Garcia");
        md22.setMovieType("Drama, Mystery, Romance");
        md22.setSynopsis("A grief counselor working with a group of plane-crash survivors finds herself at the root of a mystery when her clients begin to disappear.");
        movie22.setDetails(md22);
        movieManager.addMovie(movie22.getMovieTitle(),md22);

        Movie movie23 = new Movie(22, "Twilight");
        MovieDetails md23 = new MovieDetails();
        md23.setCast("Kristen Stewart, Robert Pattinson, Billy Burke");
        md23.setDirector("Catherine Hardwicke");
        md23.setMovieType("Drama, Fantasy, Romance");
        md23.setSynopsis("A teenage girl risks everything when she falls in love with a vampire.");
        movie23.setDetails(md23);
        movieManager.addMovie(movie23.getMovieTitle(),md23);

        Movie movie24 = new Movie(23,"Real Steel");
        MovieDetails md24 = new MovieDetails();
        md24.setCast("Hugh Jackman, Evangeline Lilly, Dakota Goyo");
        md24.setDirector("Shawn Levy");
        md24.setMovieType("Action, Drama, Family");
        md24.setSynopsis("In the near future, robot boxing is a top sport. A struggling promoter feels he's found a champion in a discarded robot.");
        movie24.setDetails(md24);
        movieManager.addMovie(movie24.getMovieTitle(),md24);

        Movie movie25 = new Movie(24, "X-Men");
        MovieDetails md25 = new MovieDetails();
        md25.setCast("Patrick Stewart, Hugh Jackman, Ian McKellen");
        md25.setDirector("Bryan Singer");
        md25.setMovieType("Action, Adventure, Sci-fi");
        md25.setSynopsis("Two mutants come to a private academy for their kind whose resident superhero team must oppose a terrorist organization with similar powers.");
        movie25.setDetails(md25);
        movieManager.addMovie(movie25.getMovieTitle(),md25);

        Movie movie26 = new Movie(25,"Into the Wild");
        MovieDetails md26 = new MovieDetails();
        md26.setCast("Emile Hirsch, Vince Vaughn, Catherine Keener");
        md26.setDirector("Sean Penn");
        md26.setMovieType("Adventure, Biography, Drama");
        md26.setSynopsis("After graduating from Emory University, top student and athlete Christopher McCandless abandons his possessions, gives his entire $24,000 savings account to charity and hitchhikes to Alaska to live in the wilderness. Along the way, Christopher encounters a series of characters that shape his life.");
        movie26.setDetails(md26);
        movieManager.addMovie(movie26.getMovieTitle(),md26);

        Movie movie27 = new Movie(26,"Zootopia");
        MovieDetails md27 = new MovieDetails();
        md27.setCast("Ginnifer Goodwin, Jason Bateman, Idris Elba");
        md27.setDirector("Byron Howard, Rich Moore");
        md27.setMovieType("Animation, Adventure, Comedy");
        md27.setSynopsis("In a city of anthropomorphic animals, a rookie bunny cop and a cynical con artist fox must work together to uncover a conspiracy.");
        movie27.setDetails(md27);
        movieManager.addMovie(movie27.getMovieTitle(),md27);

        Movie movie28 = new Movie(27,"Jurassic Park");
        MovieDetails md28 = new MovieDetails();
        md28.setCast("Sam Neill, Laura Dern, Jeff Goldblum");
        md28.setDirector("Steven Spielberg");
        md28.setMovieType("Adventure, Sci-fi, Thriller");
        md28.setSynopsis("During a preview tour, a theme park suffers a major power breakdown that allows its cloned dinosaur exhibits to run amok.");
        movie28.setDetails(md28);
        movieManager.addMovie(movie28.getMovieTitle(),md28);

        Movie movie29 = new Movie(28, "Jaws");
        MovieDetails md29 = new MovieDetails();
        md29.setCast("Roy Scheider, Robert Shaw, Richard Dreyfuss");
        md29.setDirector("Steven Spielberg");
        md29.setMovieType("Adventure, Drama, Thriller");
        md29.setSynopsis("A giant great white shark arrives on the shores of a New England beach resort and wreaks havoc with bloody attacks on swimmers, until a local sheriff teams up with a marine biologist and an old seafarer to hunt the monster down.");
        movie29.setDetails(md29);
        movieManager.addMovie(movie29.getMovieTitle(),md29);

        Movie movie30 = new Movie(29, "Trolls");
        MovieDetails md30 = new MovieDetails();
        md30.setCast("Anna Kendrick, Justin Timberlake, Zooey Deschanel");
        md30.setDirector("Mike Mitchell, Walth Dohrn");
        md30.setMovieType("Animation, Adventure, Comedy");
        md30.setSynopsis("After the Bergens invade Troll Village, Poppy, the happiest Troll ever born, and the curmudgeonly Branch set off on a journey to rescue her friends.");
        movie30.setDetails(md30);
        movieManager.addMovie(movie30.getMovieTitle(),md30);
    }
        public static void populateCineplexCinema() {
        Cineplex cineplex1 = new Cineplex(0, "GV Jurong Point");
        Cinema cinema1 = new Cinema("Cinema 01");
        Cinema cinema2 = new Cinema("Cinema 02");
        Cinema cinema3 = new Cinema("Cinema 03");
        cineplex1.addCinema(cinema1);
        cineplex1.addCinema(cinema2);
        cineplex1.addCinema(cinema3);
        cineplexManager.addCineplex(cineplex1);

        Cineplex cineplex2 = new Cineplex(1, "Cathay JEM");
        Cinema cinema4 = new Cinema("Cinema 04");
        Cinema cinema5 = new Cinema("Cinema 05");
        Cinema cinema6 = new Cinema("Cinema 06");
        cineplex2.addCinema(cinema4);
        cineplex2.addCinema(cinema5);
        cineplex2.addCinema(cinema6);
        cineplexManager.addCineplex(cineplex2);

        Cineplex cineplex3 = new Cineplex(2, "GV Vivo City");
        Cinema cinema7 = new Cinema("Cinema 07");
        Cinema cinema8 = new Cinema("Cinema 08");
        Cinema cinema9 = new Cinema("Cinema 09");
        cineplex3.addCinema(cinema7);
        cineplex3.addCinema(cinema8);
        cineplex3.addCinema(cinema9);
        cineplexManager.addCineplex(cineplex3);
    }

    public static void printAllMovie() {
        ArrayList<Movie> movies = movieManager.getAllMovie();
        for (Movie movie : movies) {
            System.out.println(movie.getMovieTitle());
        }
    }

    public static void printAllCineplex() {
        ArrayList<Cineplex> cineplexes = cineplexManager.getAllCineplex();
        for (Cineplex cineplex : cineplexes) {
            System.out.println(cineplex.getName());
        }
    }

    public static void printAllCinema(Cineplex cineplex) {
        for (Cinema cinema : cineplex.getCinemas())
            System.out.println(cinema.getName());
    }

}
