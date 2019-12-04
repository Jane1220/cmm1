/**
 * 
 */
package com.wangxinyu.junit;

import org.junit.Test;

import com.wangxinyu.domain.Goods;
import com.wangxinyu.service.GoodsService;

/**
 * @作者： 王新宇
 * @时间：2019年12月3日
 */
public class Tests {
	
	GoodsService service;
	
	@Test
	public String add(Goods g) {
		
		service.add(g);
		
		return "redirect:list";
	}
	
	@Test
	public boolean delete(String gid) {
		
		try {
			service.delete(gid);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			}
		}
/*	@Test
	public boolean update(String gid) {
		
		try {
			service.update(gid);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
*/
}
