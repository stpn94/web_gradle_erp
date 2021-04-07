package web_gradle_erp.dao;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

import web_gradle_erp.JdbcUtil;
import web_gradle_erp.dao.impl.TitleDaoImpl;
import web_gradle_erp.dto.Title;
@FixMethodOrder
public class TitleDaoTest {
	private static TitleDaoImpl dao = TitleDaoImpl.getInstance();
	private static Connection con;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		con= JdbcUtil.getConnection();
		dao.setCon(con);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}
	
	@Test
	public void test01SelectTitleByAll() {
		System.out.printf("%s()%n", "testSelectTitleByAll");
		List<Title> list = dao.selectTitleByAll();
		Assert.assertNotNull(list);

		list.stream().forEach(System.out::println);

	}

	@Test
	public void test02SelectTitleByNo() {
	}

	@Test
	public void test03InsertTitle() {
	}

	@Test
	public void test04UpdateTitle() {
	}

	@Test
	public void test05DeleteTitle() {
	}

}
