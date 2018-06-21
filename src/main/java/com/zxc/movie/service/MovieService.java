package com.zxc.movie.service;

import com.zxc.movie.beans.Movie;
import com.zxc.movie.common.BaseService;

/**
 * Created by 星驰太帅了 on 2018/05/26.
 * movie操作相关的接口
 */
public interface MovieService{

    //获取一个电影的具体内容
    public Movie getById(Long id);

    //插入一个电影实例
    public int add(Movie movie);
}
