package com.zxc.movie.common;

/**
 * Created by 星驰太帅了 on 2018/06/03.
 * 电影状态,数据库用tinyint存的
 */
public enum MovieStatus {

    //电影已上映,但是商家未配置观看地址
    ON_LINE(1, "已上映"),
    //电影已上映,并且商家配置了观看地址
    ON_LINE_AND_LINK(2, "已上映并且有观看地址"),
    //电影未上映
    NOT_ON_LINE(3, "未上映"),
    //电影已失效
    INVALID(4, "电影已失效");

    private Integer status;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public Integer getStatus() {
        return status;
    }

    MovieStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
