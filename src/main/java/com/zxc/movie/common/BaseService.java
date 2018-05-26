package com.zxc.movie.common;

import java.util.List;

/**
 * Created by 星驰太帅了 on 2018/05/26.
 * 基础类,肯定有crud相关的操作,其他类继承这个基类后,就不需要重复定义无谓的方法了,同时可以让所有service类都是属于同一个类型的
 * 感觉service层没必要有这些实现,先不用
 */
public interface BaseService<T> {

    //插入一个对象
    public int insert(T t);

    //修改一个对象
    public int update(T t);

    //删除一个对象
    public int delete(T t);

    //根据id选择一个对象
    public T getById(int i);

    //获取所有数据,以后估计会有分页获取,现在先弄个获取全部的
    public List<T> getAll();
}
