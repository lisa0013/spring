package com.yedam.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyVO;

public interface ReplyMapper {
	
	public int insert(ReplyVO vo); // 등록
	
	public ReplyVO read(Long bno); // 단건조회
	
	public int delete(Long bno); // 삭제
	
	public int update(ReplyVO reply); // 수정
	
	public List<ReplyVO> getList(@Param("cri") Criteria cri, @Param("bno") Long bno); // 전체조회
	
	public int getCountByBno(Long bno); // 페이지
	
}
