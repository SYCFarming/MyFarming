package dao;

import pojo.Farmcount;

public interface FarmcountMapper {
    int deleteByPrimaryKey(Integer countid);

    int insert(Farmcount record);

    int insertSelective(Farmcount record);

    Farmcount selectByPrimaryKey(Integer countid);

    int updateByPrimaryKeySelective(Farmcount record);

    int updateByPrimaryKey(Farmcount record);
}