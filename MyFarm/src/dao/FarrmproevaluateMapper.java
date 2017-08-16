package dao;

import pojo.Farrmproevaluate;

public interface FarrmproevaluateMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Farrmproevaluate record);

    int insertSelective(Farrmproevaluate record);

    Farrmproevaluate selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Farrmproevaluate record);

    int updateByPrimaryKey(Farrmproevaluate record);
}