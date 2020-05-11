package challenges;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String movieResult = movieStore.getMovies().entrySet().stream()
                .map(m -> m.getValue())
                .flatMap(List::stream)
                .collect(Collectors.joining(" ! "));

        System.out.printf(movieResult);
    }
}
