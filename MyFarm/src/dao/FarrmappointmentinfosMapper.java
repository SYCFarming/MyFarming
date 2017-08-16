package dao;

import pojo.Farrmappointmentinfos;

public interface FarrmappointmentinfosMapper {
    int deleteByPrimaryKey(Integer asid);

    int insert(Farrmappointmentinfos record);

    int insertSelective(Farrmappointmentinfos record);

    Farrmappointmentinfos selectByPrimaryKey(Integer asid);

    int updateByPrimaryKeySelective(Farrmappointmentinfos record);

    int updateByPrimaryKey(Farrmappointmentinfos record);
}