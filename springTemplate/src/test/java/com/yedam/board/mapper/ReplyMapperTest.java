package com.yedam.board.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class ReplyMapperTest {
	 	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper replyMapper;
	
	@Test
	public void testInsert() {
		ReplyVO vo = new ReplyVO();
		
		vo.setBno(1L);
		vo.setReply("엄마찾아");
		vo.setReplyer("둘리");
		
		replyMapper.insert(vo);
	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		cri.setAmount(10);
		cri.setPageNum(1);
		
		List<ReplyVO> replies = replyMapper.getList(cri, 1L);
		replies.forEach(reply -> log.info(reply));
	}
	
	
}
