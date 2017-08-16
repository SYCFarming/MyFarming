package dao;

import pojo.Farrmadmin;

public interface FarrmadminMapper {
    int deleteByPrimaryKey(Integer adminid);

    int insert(Farrmadmin record);

    int insertSelective(Farrmadmin record);

    Farrmadmin selectByPrimaryKey(Integer adminid);

    int updateByPrimaryKeySelective(Farrmadmin record);

    int updateByPrimaryKey(Farrmadmin record);
}