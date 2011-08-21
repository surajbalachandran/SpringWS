package com.blogspot.javaclickonline.springws.moviesbrowser.service;

import java.util.List;

import com.blogspot.javaclickonline.springws.moviesbrowser.Movie;

public interface MoviesBrowserService {

	List<Movie> getMoviesByGenre(String genre);
}
