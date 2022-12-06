import java.util.ArrayList;

public class Movie {
	
	private static String title;
	private static String category;
	
	public Movie() {
		
	}
	
	public Movie(String title, String category) {
		
		this.title = title;
		this.category = category;
		
	}
	
	
	
	

	@Override
	public String toString() {
		
		return  super.toString() ;
	}
	

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		Movie.title = title;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Movie.category = category;
	}

	

	
	
	
	
	

}
