package dao;

import pojo.Farrmproducts;

public interface FarrmproductsMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Farrmproducts record);

    int insertSelective(Farrmproducts record);

    Farrmproducts selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Farrmproducts record);

    int updateByPrimaryKey(Farrmproducts record);
}