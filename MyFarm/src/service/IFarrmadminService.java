package service;

import pojo.Farrmadmin;
/**
 * ������
 * @author Administrator
 *
 */
public interface IFarrmadminService {
	boolean deleteByPrimaryKey(Integer adminid);

	boolean insert(Farrmadmin record);

	boolean insertSelective(Farrmadmin record);

    Farrmadmin selectByPrimaryKey(Integer adminid);

    boolean updateByPrimaryKeySelective(Farrmadmin record);

    boolean updateByPrimaryKey(Farrmadmin record);
}
