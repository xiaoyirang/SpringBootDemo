package com.community.dao;

import java.util.List;

import com.community.entity.Notice;

public interface NoticeDao {
	/**
	 * 查询所有文章
	 */
	public List<Notice> getNoticeByPage(int offset,int pageSize);
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	public Notice getNoticeById(int id);
	/**
	 * 添加
	 * @param notice
	 * @return
	 */
	public int addNotice(Notice notice);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public int deleteNotice(int id);
	/**
	 * 修改
	 * @param notice
	 * @return
	 */
	public int updateNotice(Notice notice);
}
