package service;

import java.util.List;

import pojo.Farmcount;

public interface IFramcountService {
	boolean deleteByPrimaryKey(Integer countid);

	    boolean insert(Farmcount record);

	    boolean insertSelective(Farmcount record);

	    Farmcount selectByPrimaryKey(Integer countid);
	    
	    boolean updateByPrimaryKeySelective(Farmcount record);

	    boolean updateByPrimaryKey(Farmcount record);
	    
	    List<Farmcount> getFarmcountByNP();
}
