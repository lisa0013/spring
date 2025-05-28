package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	final BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public int insert(BoardVO vo) {
		return boardMapper.insert(vo); 
	}

	@Override
	public BoardVO findById(int bno) {
		return boardMapper.findById(bno);
	}

	@Override
	public int delete(int bno) {
		return boardMapper.delete(bno);
	}

	@Override
	public int update(BoardVO board) {
		return boardMapper.update(board);
	}

}
