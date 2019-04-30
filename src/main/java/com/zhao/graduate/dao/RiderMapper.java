package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.Order;
import com.zhao.graduate.POJO.Rider;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
//@Repository
public interface RiderMapper {

    public List<Rider> selectRiderById(Integer id);

}
