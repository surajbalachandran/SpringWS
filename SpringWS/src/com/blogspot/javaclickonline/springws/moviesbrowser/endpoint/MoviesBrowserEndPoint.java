package com.blogspot.javaclickonline.springws.moviesbrowser.endpoint;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.blogspot.javaclickonline.springws.moviesbrowser.Movie;
import com.blogspot.javaclickonline.springws.moviesbrowser.MoviesRequest;
import com.blogspot.javaclickonline.springws.moviesbrowser.MoviesResponse;
import com.blogspot.javaclickonline.springws.moviesbrowser.ObjectFactory;
import com.blogspot.javaclickonline.springws.moviesbrowser.service.MoviesBrowserService;

@Endpoint
public class MoviesBrowserEndPoint {

	@Resource
	private MoviesBrowserService moviesBrowserService;
	
	@PayloadRoot(namespace="http://springws.javaclickonline.blogspot.com/MoviesBrowser/schemas", localPart="MoviesRequest")
	@ResponsePayload
	public MoviesResponse getMovies(@RequestPayload MoviesRequest request) {
	
		String genre = request.getGenre();
		List<Movie> allMovies = moviesBrowserService.getMoviesByGenre(genre);
		ObjectFactory factory = new ObjectFactory();
		MoviesResponse response = factory.createMoviesResponse();
		List<Movie> movies = response.getMovie();
		movies.addAll(allMovies);
		return response;
	}

	/**
	 * @return the moviesBrowserService
	 */
	public MoviesBrowserService getMoviesBrowserService() {
		return moviesBrowserService;
	}

	/**
	 * @param moviesBrowserService the moviesBrowserService to set
	 */
	public void setMoviesBrowserService(MoviesBrowserService moviesBrowserService) {
		this.moviesBrowserService = moviesBrowserService;
	}
}
