package com.kodilla.good.patterns.challenges;

public class MovieListerExecutor {
    public static void main (String args[]) {
        MovieStoreLister movieStoreLister = new MovieStoreLister();
        movieStoreLister.agregateMovies();
        System.out.println("We have this movies in our collection:\n"  + movieStoreLister.agregateMovies());
    movieStoreLister.agregateMovies();
    }

}
