package dao;

import pojo.Farrmimages;

public interface FarrmimagesMapper {
    int deleteByPrimaryKey(Integer imageid);

    int insert(Farrmimages record);

    int insertSelective(Farrmimages record);

    Farrmimages selectByPrimaryKey(Integer imageid);

    int updateByPrimaryKeySelective(Farrmimages record);

    int updateByPrimaryKey(Farrmimages record);
}