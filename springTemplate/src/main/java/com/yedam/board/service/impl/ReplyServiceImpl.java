package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyPageDTO;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService{

	private ReplyMapper replyMapper;
	
	@Override
	public int register(ReplyVO vo) { // 등록
		return replyMapper.insert(vo);
	}

	@Override
	public ReplyVO get(Long rno) { // 단건조회
		return replyMapper.read(rno);
	}

	@Override
	public int modify(ReplyVO vo) { // 수정
		return replyMapper.update(vo);
	}

	@Override
	public int remove(Long rno) { // 삭제
		return replyMapper.delete(rno);
	}

	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) { // 전체 조회
		return replyMapper.getList(cri, bno);
	}

	@Override
	public ReplyPageDTO getListPage(Criteria cri, Long bno) { //페이지
		return null;
	}

}
