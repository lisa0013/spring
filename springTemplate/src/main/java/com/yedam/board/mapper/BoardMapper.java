package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.service.BoardVO;
import com.yedam.board.service.Criteria;

public interface BoardMapper {
	public List<BoardVO> getList(Criteria cri);
	public long getTotalCount(Criteria cri); 
	public int insert(BoardVO vo); // returnType int or void
	public BoardVO findById(long bno);
	public int delete(long bno);
	public int update(BoardVO board); // 값이 여러개면 VO 
	
}
