package com.yedam.board.service;

import java.util.List;

import com.yedam.board.service.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	public int insert(BoardVO vo);
	public BoardVO findById(int bno);
	public int delete(int bno);
	public int update(BoardVO vo);
}
