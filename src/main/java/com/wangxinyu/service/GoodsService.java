/**
 * 
 */
package com.wangxinyu.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wangxinyu.domain.Goods;
import com.wangxinyu.domain.Typec;

/**
 * @作者： 王新宇
 * @时间：2019年12月3日
 */
public interface GoodsService {

	/**
	 * @param name
	 * @param pageNum
	 * @return
	 */
	PageInfo getGoodsList(String name, int pageNum);

	/**
	 * @param gid
	 * @return
	 */
	boolean delete(String gid);

	/**
	 * @return
	 */
	List<Typec> getTypecList();

	/**
	 * @param g
	 */
	void add(Goods g);

/*	*//**
	 * @param gid
	 *//*
	void update(String gid);
*/
}
