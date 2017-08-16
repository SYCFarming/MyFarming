package dao;

import pojo.Farrmstore;

public interface FarrmstoreMapper {
    int deleteByPrimaryKey(Integer storeid);

    int insert(Farrmstore record);

    int insertSelective(Farrmstore record);

    Farrmstore selectByPrimaryKey(Integer storeid);

    int updateByPrimaryKeySelective(Farrmstore record);

    int updateByPrimaryKey(Farrmstore record);
}