package com.yedam.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;
import com.yedam.board.service.Criteria;
import com.yedam.board.service.PageDTO;

import lombok.RequiredArgsConstructor;
/**
 * 게시글 관리
 * 작성일자      작성자    수정내용
 * 20250525    홍길동    최초작성
 * 20250535    홍길동    페이징
 */
@Controller
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {

	final BoardService boardService;

	/**
	 * 게시글 조회
	 * @param model 
	 * @return 목록페이지명
	 */
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		model.addAttribute("list", boardService.getList(cri));
		
		//paing 처리
				long total = boardService.getTotalCount(cri);
				model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	// 등록페이지로 이동
	@GetMapping("/register")
	public String post() {
		return "board/register";
	}
	
	// 등록 처리하고 목록으로 이동
	@PostMapping("/register") 
	public String register(BoardVO vo, RedirectAttributes rttr) {
		boardService.insert(vo);
		rttr.addFlashAttribute("result", vo.getBno());
		return "redirect:list";
	}
	
	// 단건 조회
	@GetMapping("/get") 
	public void get(@RequestParam("bno") Long bno, Model model) {
		model.addAttribute("board", boardService.findById(bno));
	}
	
	// 수정페이지로 이동
	@GetMapping("/modify") 
	public void modify(@RequestParam("bno") Long bno, Model model) {
		model.addAttribute("board", boardService.findById(bno));
	}
	
	// 수정처리
	@PostMapping("/modify") 
	public String modify(BoardVO board, RedirectAttributes rttr) {
		boardService.update(board);
		// return "redirect:list";
		rttr.addAttribute("bno", board.getBno());
		return "redirect:get";
	}
	
	// 삭제처리
	@PostMapping("/remove") 
	public String remove(@RequestParam("bno") Long bno) {
		boardService.delete(bno);
		return "redirect:list"; // 상대경로
	}

}
