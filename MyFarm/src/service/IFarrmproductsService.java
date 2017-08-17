package service;

import pojo.Farrmproducts;

public interface IFarrmproductsService {
		boolean deleteByPrimaryKey(Integer proid);

		boolean insert(Farrmproducts record);

		boolean insertSelective(Farrmproducts record);

	    Farrmproducts selectByPrimaryKey(Integer proid);

	    boolean updateByPrimaryKeySelective(Farrmproducts record);

	    boolean updateByPrimaryKey(Farrmproducts record);
}
