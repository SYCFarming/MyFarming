package service;

import pojo.Farrmstore;

public interface IFarrmstoreService {
	boolean deleteByPrimaryKey(Integer storeid);

	boolean insert(Farrmstore record);

	boolean insertSelective(Farrmstore record);

	Farrmstore selectByPrimaryKey(Integer storeid);

	boolean updateByPrimaryKeySelective(Farrmstore record);

	boolean updateByPrimaryKey(Farrmstore record);
}
