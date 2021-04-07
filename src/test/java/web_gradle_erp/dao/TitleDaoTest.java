package web_gradle_erp.dao;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import web_gradle_erp.JdbcUtil;
import web_gradle_erp.dao.impl.TitleDaoImpl;
import web_gradle_erp.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
	public void test04SelectTitleByAll() {
		System.out.printf("%s()%n", "test01SelectTitleByAll");
		List<Title> list = dao.selectTitleByAll();
		Assert.assertNotNull(list);

		list.stream().forEach(System.out::println);

	}

	@Test
	public void test02SelectTitleByNo() {
		System.out.println("test02SelectTitleByNo");
		Title title = new Title(1);
		Title searchTitle = dao.selectTitleByNo(title);
		Assert.assertNotNull(searchTitle);
		System.out.println(searchTitle);
		
	}

	@Test
	public void test01InsertTitle() {
		System.out.println("test01InsertTitle");
		Title newTitle = new Title(8,"인턴");
		int res = dao.insertTitle(newTitle);
		Assert.assertEquals(1,res);
		System.out.println(dao.selectTitleByNo(newTitle));
		
	}

	@Test
	public void test03UpdateTitle() {
		System.out.printf("%s()%n", "test03UpdateTitle");
		Title upTitle = new Title(8, "계약");
		System.out.println(upTitle);
		int res = dao.updateTitle(upTitle);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectTitleByNo(upTitle));
	}

	@Test
	public void test05DeleteTitle() {
		System.out.printf("%s()%n", "test04DeleteTitle");
		int res = dao.deleteTitle(new Title(8));
		Assert.assertEquals(1, res);
		dao.selectTitleByAll().stream().forEach(System.out::println);
	}

}
