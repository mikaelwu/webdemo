package test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.group.webdemo.po.Novel;
import com.group.webdemo.service.INovelService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);

	@Resource
	INovelService novelService;

	@Test
	public void test1() {
		Novel novel = novelService.getNovelById(1024);
		System.out.println(novel.getName() + " from " + novel.getAuthorName());
		logger.info(JSON.toJSONString(novel));
	}

}
