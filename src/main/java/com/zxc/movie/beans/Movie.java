package com.zxc.movie.beans;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Created by 星驰太帅了 on 2018/05/26.
 * movie对象实体类
 */
public class Movie implements Serializable {

    //自增id
    private int id;
    //电影名称
    private String movieName;
    //电影连接
    private String movieUrl;
    //电影状态
    private int status;
    //电影图片,暂时先设置一张,到时如果要多张,到时要多张,可以直接根据电影id去文件系统里面选择即可
    private List<String> photos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public Movie(){}

    public Movie(int id, String movieName, String movieUrl, int status, List<String> photos) {
        this.id = id;
        this.movieName = movieName;
        this.movieUrl = movieUrl;
        this.status = status;
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieUrl='" + movieUrl + '\'' +
                ", status=" + status +
                ", photos=" + photos +
                '}';
    }
}
