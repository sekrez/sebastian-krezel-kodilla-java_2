package com.kodilla.good.patterns.challenges;

import java.util.stream.*;

class MovieStoreLister {

    public String agregateMovies() {
        MovieStore movieStore = new MovieStore();

        String movieTitles = movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining("!"));

        return movieTitles;
    }

}
