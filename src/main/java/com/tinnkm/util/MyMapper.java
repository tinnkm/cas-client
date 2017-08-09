package com.tinnkm.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by tinnkm on 2017/8/9.
 * 此接口不可被扫描
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
