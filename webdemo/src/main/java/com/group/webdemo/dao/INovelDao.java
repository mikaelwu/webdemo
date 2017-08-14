package com.group.webdemo.dao;

import com.group.webdemo.po.Novel;

public interface INovelDao {

	/**
	 * 根据id查找
	 * @param id
	 * @return
	 */
	public Novel selectByPrimaryKey(Integer id);
}
