package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Movie;
import com.bw.dao.MovieMapper;

@Service
public class MovieServiceimpl implements MovieService{

	@Autowired
	private MovieMapper m;

	@Override
	public List<Movie> list(Movie movie) {
		// TODO Auto-generated method stub
		return m.list(movie);
	}
}
