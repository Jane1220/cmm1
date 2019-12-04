/**
 * 
 */
package com.wangxinyu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangxinyu.domain.Goods;
import com.wangxinyu.domain.Typec;
import com.wangxinyu.mapper.GoodsMapper;
import com.wangxinyu.service.GoodsService;

/**
 * @作者： 王新宇
 * @时间：2019年12月3日
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper mapper;

	/* (non-Javadoc)
	 * @see com.wangxinyu.service.GoodsService#getGoodsList(java.lang.String, int)
	 */
	@Override
	public PageInfo getGoodsList(String name, int pageNum) {
		PageHelper.startPage(pageNum, 3);
		
		List list = mapper.getGoodsList(name);
		
		PageInfo info = new PageInfo(list);
		
		return info;
	}

	/* (non-Javadoc)
	 * @see com.wangxinyu.service.GoodsService#delete(java.lang.String)
	 */
	@Override
	public boolean delete(String gid) {
		// TODO Auto-generated method stub
		return mapper.delete(gid);
	}


	/* (non-Javadoc)
	 * @see com.wangxinyu.service.GoodsService#getTypecList()
	 */
	@Override
	public List<Typec> getTypecList() {
		// TODO Auto-generated method stub
		return mapper.getTypecList();
	}

	/* (non-Javadoc)
	 * @see com.wangxinyu.service.GoodsService#add(com.wangxinyu.domain.Goods)
	 */
	@Override
	public void add(Goods g) {
		
		mapper.add(g);
	}

	/* (non-Javadoc)
	 * @see com.wangxinyu.service.GoodsService#update(java.lang.String)
	 */
/*	@Override
	public void update(String gid) {
		mapper.update(gid);
	}*/


	
	
	
	
}
