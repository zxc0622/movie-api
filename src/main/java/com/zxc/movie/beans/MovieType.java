package com.zxc.movie.beans;

import com.zxc.movie.common.BaseEntity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by 星驰太帅了 on 2018/06/03.
 * 电影类型，暂时只设计一个分类,不存在多层的情况!
 */
public class MovieType extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 6612995251461723588L;

    //类型,不设计多级类型,就是一个单纯的分类
    private String typeName;
    //类似简介
    private String typeDesc;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public MovieType(String typeName, String typeDesc) {
        this.typeName = typeName;
        this.typeDesc = typeDesc;
    }

    @Override
    public String toString() {
        return "MovieType{" +
                "typeName='" + typeName + '\'' +
                ", typeDesc='" + typeDesc + '\'' +
                '}';
    }

    public MovieType() {
    }

}
