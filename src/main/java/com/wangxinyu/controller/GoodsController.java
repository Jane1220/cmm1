/**
 * 
 */
package com.wangxinyu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.wangxinyu.domain.Goods;
import com.wangxinyu.domain.Typec;
import com.wangxinyu.service.GoodsService;

/**
 * @作者： 王新宇
 * @时间：2019年12月3日
 */
@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService service;
	/**
	 * 列表页面
	 * @param model
	 * @param name
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("list")
	public String getGoodsList(Model model,String name,@RequestParam(defaultValue="1")int pageNum) {
		
		PageInfo info = service.getGoodsList(name,pageNum);
		model.addAttribute("info", info);
		model.addAttribute("name", name);
		
		return "list";
	}
	/**
	 *  删除功能
	 * @param gid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("delete")
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
	
	@RequestMapping("toAdd")
	public String toAdd(Model model) {
		
		List<Typec> typec = service.getTypecList();
		model.addAttribute("typec", typec);
		
		return "add";
	}
	
	/**
	 *  添加功能
	 * @param g
	 * @return
	 */
	@RequestMapping("add")
	public String add(Goods g) {
		
		service.add(g);
		
		return "redirect:list";
	}
	
/*	@RequestMapping("update")
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
