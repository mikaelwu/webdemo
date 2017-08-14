package com.group.webdemo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.group.webdemo.dao.INovelDao;
import com.group.webdemo.po.Novel;
import com.group.webdemo.service.INovelService;

@Service("novelServei")
public class NovelServiceImpl implements INovelService {

	@Resource
	private INovelDao novelDao;

	@Override
	public Novel getNovelById(int id) {
		return novelDao.selectByPrimaryKey(id);
	}
}
