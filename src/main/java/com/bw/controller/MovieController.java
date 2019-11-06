package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.Movie;
import com.bw.service.MovieService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {

	@Autowired
	private MovieService ser;
	
	//列表
	@RequestMapping("/list")
	public String list(Movie movie,@RequestParam(defaultValue = "1")int pageNum,Model m) {
		//初始页
		PageHelper.startPage(pageNum, 3);
		//list集合
		List<Movie> list = ser.list(movie);
		
		System.out.println(list+"-----------------------------------------");
		//存入到pageinfo
		PageInfo<Movie> pageinfo = new PageInfo<Movie>(list);
		m.addAttribute("pg", pageinfo);
		//返回list
		return "list";
	}
}
