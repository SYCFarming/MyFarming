package service;

import pojo.Farrmappointmentinfos;
/**
 * π§æﬂ¿‡
 * @author Administrator
 *
 */
public interface IFarrmappointmentinfosService {
    boolean deleteByPrimaryKey(Integer asid);

    boolean insert(Farrmappointmentinfos record);

    boolean insertSelective(Farrmappointmentinfos record);

    Farrmappointmentinfos selectByPrimaryKey(Integer asid);

    boolean updateByPrimaryKeySelective(Farrmappointmentinfos record);

    boolean updateByPrimaryKey(Farrmappointmentinfos record);
}
