package com.zxc.movie.beans;

import com.zxc.movie.common.BaseEntity;
import com.zxc.movie.common.MovieStatus;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created by 星驰太帅了 on 2018/05/26.
 * 不要使用基本类型
 * 所有实体类都需要实现可序列化接口,因为是基于dubbo传输的
 * movie对象实体类
 */
public class Movie extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 2728628073791555195L;
    //电影名称
    private String movieName;
    //电影简介
    private String movieDesc;
    //上映日期
    private LocalDate showDate;
    //电影状态
    private MovieStatus movieStatus;
    //电影所属类型,可以属于多种类型
    private List<MovieType> movieTypes;
    //电影连接
    private String movieUrl;
    //电影图片,暂时先设置一张,到时如果要多张,到时要多张,可以直接根据电影id去文件系统里面选择即可
    private String photo;
    //收藏次数,最大值为2147483647,够了!!
    private Integer keepCount;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }

    public List<MovieType> getMovieTypes() {
        return movieTypes;
    }

    public void setMovieTypes(List<MovieType> movieTypes) {
        this.movieTypes = movieTypes;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getKeepCount() {
        return keepCount;
    }

    public void setKeepCunt(Integer keepCount) {
        this.keepCount = keepCount;
    }

    public Movie() {}

    public Movie(String movieName, String movieDesc, LocalDate showDate, MovieStatus movieStatus, List<MovieType> movieTypes, String movieUrl, String photo, Integer keepCount) {
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.showDate = showDate;
        this.movieStatus = movieStatus;
        this.movieTypes = movieTypes;
        this.movieUrl = movieUrl;
        this.photo = photo;
        this.keepCount = keepCount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieDesc='" + movieDesc + '\'' +
                ", showDate=" + showDate +
                ", movieStatus=" + movieStatus +
                ", movieTypes=" + movieTypes +
                ", movieUrl='" + movieUrl + '\'' +
                ", photo='" + photo + '\'' +
                ", keepCount=" + keepCount +
                '}';
    }
}
