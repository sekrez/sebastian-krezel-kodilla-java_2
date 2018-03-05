package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.stream.*;

class MovieStoreLister {

    public String agregateMovies() {
        MovieStore movieStore = new MovieStore();

        String movieTitles = movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));
        return movieTitles;
    }

}