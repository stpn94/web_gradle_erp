package web_gradle_erp.dao;
/*
 * Data Access Object
 * C(insert)
 * R(select, select where)
 * U(update)
 * D(delete)
 */

import java.util.List;

import web_gradle_erp.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByAll();

	Title selectTitleByNo(Title title);

	int insertTitle(Title title); // 객체

	int updateTitle(Title title);

	int deleteTitle(Title title); // 기본타입

}
