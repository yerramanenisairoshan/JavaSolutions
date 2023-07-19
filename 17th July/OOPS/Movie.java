package OOPS;
import java.util.*;
public class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void addReview(String review) {
        reviews.add(review);
    }
}

 class MovieExample {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("Tom Hanks");
        actors.add("Meg Ryan");

        Movie movie = new Movie("Sleepless in Seattle", "Nora Ephron", actors);

        System.out.println("Movie details:");
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: " + movie.getActors());
        System.out.println("Reviews: " + movie.getReviews());

        // Add reviews
        movie.addReview("Great romantic movie!");
        movie.addReview("The chemistry between the actors was amazing.");

        System.out.println("\nAfter adding reviews:");
        System.out.println("Reviews: " + movie.getReviews());
    }
}
