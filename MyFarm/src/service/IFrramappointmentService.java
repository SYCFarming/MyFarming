package service;

import pojo.Farrmappointment;


public interface IFrramappointmentService {
    int deleteByPrimaryKey(Integer aid);

    int insert(Farrmappointment record);

    int insertSelective(Farrmappointment record);

    Farrmappointment selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Farrmappointment record);

    int updateByPrimaryKey(Farrmappointment record);
}
