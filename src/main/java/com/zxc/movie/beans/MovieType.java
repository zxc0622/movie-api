package com.zxc.movie.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by 星驰太帅了 on 2018/06/03.
 * 电影类型，暂时只设计一个分类,不存在多层的情况!
 */
public class MovieType implements Serializable {

    private static final long serialVersionUID = 6612995251461723588L;
    //自增id
    private Integer id;
    //类型,不设计多级类型,就是一个单纯的分类
    private String type;
    //创建时间
    private LocalDateTime createTime;
    //删除时间，每次操作肯定都是更新这个啦
    private LocalDateTime updateTime = LocalDateTime.now();
    //关联的电影集合
    private List<Movie> movies;
    //状态
    private boolean on;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public MovieType(Integer id, String type, LocalDateTime createTime, LocalDateTime updateTime, List<Movie> movies, boolean on) {
        this.id = id;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.movies = movies;
        this.on = on;
    }

    public MovieType() {
    }

    @Override
    public String toString() {
        return "MovieType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", movies=" + movies +
                ", on=" + on +
                '}';
    }
}
