package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.service.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getList();
	public int insert(BoardVO vo); // returnType int or void
	public BoardVO findById(int bno);
	public int delete(int bno);
	public int update(BoardVO board); // 값이 여러개면 VO 
}
