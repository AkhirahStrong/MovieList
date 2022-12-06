import java.util.*;

public class MovieListApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Movie movie = new Movie();
		
		//System.out.println(movie.toString());
		
		String moviePick;
		String continuePick = "y";
		
		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("Fight Club", "Thriller"));
		movieList.add(new Movie("Hang Over", "Dark Comedy"));
		movieList.add(new Movie("The Grey Man", "Action"));
		movieList.add(new Movie("Howel's Moving Castel", "Steam Punk"));
		movieList.add(new Movie("Nope", "Thriller"));
		movieList.add(new Movie("Top Gun", "Action"));
		movieList.add(new Movie("Nine", "Steam Punk"));
		movieList.add(new Movie("Ocean's 11", "Dark Comedy"));
		movieList.add(new Movie("Ted", "Comedy"));
		movieList.add(new Movie("Almost Christmas", "Comedy"));
		
		System.out.println("Welcome to the Movie List Application!\n\nThere are 10 movies in this list.\n");

		while (continuePick.equalsIgnoreCase("y")) {
			System.out.print("What category are you interested in?(Comedy, Action, Dark Comedy, or Thriller) ");
			String userInput = scan.next();

			if (userInput.equalsIgnoreCase("comedy") || userInput.equalsIgnoreCase("thriller")
					|| userInput.equalsIgnoreCase("Action") || userInput.equalsIgnoreCase("Dark Comedy")) {
				for (int i = 0; i < movieList.size(); i++) {
					if (movieList.get(i).getCategory().equalsIgnoreCase(userInput)) {
						System.out.println(movieList.get(i).getTitle());
					}
				}
			} else {
				System.out.println("This category is not valid");
			}
			
			continuePick = "";
			while (!continuePick.equalsIgnoreCase("y") && !continuePick.equalsIgnoreCase("n")) {
				System.out.println("Continue? (y/n): ");
				continuePick = scan.next();
			}

		}
		
		
	}
	
	
	

}
