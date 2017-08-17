package service;

import pojo.Farrmimages;

public interface IFarrmimagesService {
	boolean deleteByPrimaryKey(Integer imageid);

	    boolean insert(Farrmimages record);

	    boolean insertSelective(Farrmimages record);

	    Farrmimages selectByPrimaryKey(Integer imageid);

	    boolean updateByPrimaryKeySelective(Farrmimages record);

	    boolean updateByPrimaryKey(Farrmimages record);
}
