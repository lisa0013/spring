package com.yedam.board.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;


// Test for Controller
@Log4j2
@TestInstance(Lifecycle.PER_CLASS)
@WebAppConfiguration
@ExtendWith(SpringExtension.class) 
@ContextConfiguration({"file:src/main/resources/spring/*-context.xml",
                       "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class BoardControllerTest {

	@Setter(onMethod_ = { @Autowired })
	private WebApplicationContext ctx;

	private MockMvc mockMvc;

	@BeforeAll
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Test
	public void testList() throws Exception {

		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn()
				.getModelAndView().getModelMap());
	}

	@Test
	public void testRegister() throws Exception {

		String resultPage = mockMvc
				.perform(MockMvcRequestBuilders.post("/board/register")
				.param("title", "테스트 새글 제목")
				.param("content", "테스트 새글 내용")
				.param("writer", "user00"))
				.andReturn()
				.getModelAndView().getViewName();

		log.info(resultPage);

	}

	@Test
	public void tetGet() throws Exception {

		log.info(mockMvc
				.perform(MockMvcRequestBuilders.get("/board/get").param("bno", "2"))
				.andReturn()
				.getModelAndView().getModelMap());
	}

	@Test
	public void testModify() throws Exception {

		String resultPage = mockMvc
				.perform(MockMvcRequestBuilders.post("/board/modify")
				.param("bno", "1")
				.param("title", "수정된 테스트 새글 제목")
				.param("content", "수정된 테스트 새글 내용")
				.param("writer", "user00"))
				.andReturn().getModelAndView().getViewName();

		log.info(resultPage);

	}

	@Test
	public void testRemove() throws Exception {
		// 삭제전 데이터베이스에 게시물 번호 확인할 것
		String resultPage = mockMvc
				.perform(MockMvcRequestBuilders.post("/board/remove").param("bno", "25"))
				.andReturn().getModelAndView().getViewName();

		log.info(resultPage);
	}

	@Test
	public void testListPaging() throws Exception {

		log.info(mockMvc.perform(
				MockMvcRequestBuilders.get("/board/list")
				.param("pageNum", "2")
				.param("amount", "50"))
				.andReturn()
				.getModelAndView().getModelMap());
	}
}