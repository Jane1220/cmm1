/**
 * 
 */
package com.wangxinyu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangxinyu.domain.Goods;
import com.wangxinyu.domain.Typec;

/**
 * @作者： 王新宇
 * @时间：2019年12月3日
 */
public interface GoodsMapper {

	/**
	 * @param name
	 * @return
	 */
	List getGoodsList(@Param("name")String name);

	/**
	 * @param gid
	 * @return 
	 */
	boolean delete(@Param("gid")String gid);

	/**
	 * @return
	 */
	List<Typec> getTypecList();

	/**
	 * @param g
	 */
	void add(Goods g);

	/**
	 * @param gid
	 */
	void update(@Param("gid")String gid);

}
