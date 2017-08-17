package service;

import pojo.Farrmproevaluate;

public interface IFarrmproevaluateService {
	  boolean deleteByPrimaryKey(Integer eid);

	  boolean insert(Farrmproevaluate record);

	  boolean insertSelective(Farrmproevaluate record);

	    Farrmproevaluate selectByPrimaryKey(Integer eid);

	    boolean updateByPrimaryKeySelective(Farrmproevaluate record);

	    boolean updateByPrimaryKey(Farrmproevaluate record);
}
