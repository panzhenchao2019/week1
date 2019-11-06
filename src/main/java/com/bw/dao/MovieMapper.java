package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.bean.Movie;

public interface MovieMapper {

	List<Movie> list(Movie movie);

}
