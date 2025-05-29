package com.yedam.board.service;

import java.util.List;

public interface BoardService {
	public List<BoardVO> getList(Criteria cri);
	public long getTotalCount(Criteria cri); 
	public int insert(BoardVO vo);
	public BoardVO findById(long bno);
	public int delete(long bno);
	public int update(BoardVO vo);
	
}
