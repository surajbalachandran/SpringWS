package com.blogspot.javaclickonline.springws.moviesbrowser.service;

import java.util.ArrayList;
import java.util.List;

import com.blogspot.javaclickonline.springws.moviesbrowser.Movie;

public class MoviesBrowserServiceImpl implements MoviesBrowserService {

	@Override
	public List<Movie> getMoviesByGenre(String genre) {

		List<Movie> movies = new ArrayList<Movie>();
		if("Action".equals(genre)) {
			Movie movie1 = new Movie();
			movie1.setId(1000);
			movie1.setName("Green Lantern");
			
			movies.add(movie1);
		} else if("Cartoon".equals(genre)) {
			
			Movie movie1 = new Movie();
			movie1.setId(1001);
			movie1.setName("Despicable Me");
			
			movies.add(movie1);
		} else {
			
			Movie movie1 = new Movie();
			movie1.setId(1002);
			movie1.setName("The Elf");
			
			movies.add(movie1);
		}
		return movies;
	}
}
