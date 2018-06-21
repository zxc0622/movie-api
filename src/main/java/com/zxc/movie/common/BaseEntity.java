package com.zxc.movie.common;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by 星驰太帅了 on 2018/06/21.
 * 一个公有的基类,放置了一些一定要有的数据属性,其他子类继承这个即可
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 7889443900758432849L;

    //数据状态
    public static final Integer DATA_USE = 1;   //可用
    public static final Integer DATA_DELETE = 2;  //已过期
    //自增加id
    private Long id;
    //数据创建时间
    private LocalDateTime createDate;
    //数据修改时间
    private LocalDateTime updateDate = LocalDateTime.now();
    //数据是否有效的方法
    private int dataStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public int getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(int dataStatus) {
        this.dataStatus = dataStatus;
    }

    /**
     * 当前数据是否可用
     * @return
     */
    public boolean dataIsUse() {
        return getDataStatus() == DATA_USE;
    }
}
