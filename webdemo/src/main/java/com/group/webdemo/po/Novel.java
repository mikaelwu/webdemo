package com.group.webdemo.po;

import java.io.Serializable;

/**
 * 小说
 * 
 * @author wuhaokun
 *
 */
public class Novel implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 主键 */
	private Integer id;

	/** 创建时间，可null */
	private String createTime;

	/** 作者的用户id */
	private Integer authorId;

	/** 冗余字段,创建小说当时的用户名 */
	private String authorName;

	/** 小说名 */
	private String name;

	/** 分类标签 */
	private String tag;

	/** 小说介绍 */
	private String description;

	/** 通知内容,用于在聊天室界面顶部显示 */
	private String tips1;

	/** 被收藏数量,冗余字段,通过定时任务修改此字段 */
	private Integer collectNum = 0;

	/** 该小说的所有聊天室热度 */
	private Integer hot = 0;

	/** 小图标 */
	private String smallIcon;

	/** 中图标 */
	private String middleIcon;

	/** 阅读地址 */
	private String readUrl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTips1() {
		return tips1;
	}

	public void setTips1(String tips1) {
		this.tips1 = tips1;
	}

	public Integer getCollectNum() {
		return collectNum;
	}

	public void setCollectNum(Integer collectNum) {
		this.collectNum = collectNum;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public String getSmallIcon() {
		return smallIcon;
	}

	public void setSmallIcon(String smallIcon) {
		this.smallIcon = smallIcon;
	}

	public String getMiddleIcon() {
		return middleIcon;
	}

	public void setMiddleIcon(String middleIcon) {
		this.middleIcon = middleIcon;
	}

	public String getReadUrl() {
		return readUrl;
	}

	public void setReadUrl(String readUrl) {
		this.readUrl = readUrl;
	}

}
