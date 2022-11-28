package com.example.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.board.dto.Board;
import com.example.board.service.AndroidService;

@Controller
@RequestMapping(value = "/")
public class AndroidController {

	@Autowired
	AndroidService androidService;
	
	//게시판 메인리스트
	public @ResponseBody List<Board> boardList (){
		List<Board> list = null;
		try {
			list = androidService.boardList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//게시판 읽기
	public @ResponseBody List<Board> boardSelect (@RequestBody Board board){
		List<Board> list = null;
		try {
			String writer_id = board.getWriter();
			list = androidService.boardSelect(writer_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//게시판 쓰기
	public @ResponseBody String boardInsert (@RequestBody Board board) throws Exception {
		try {
			androidService.boardInsert(board);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	//게시판 수정
		public @ResponseBody String boardEdit (@RequestBody Board board){
			try {
				androidService.boardEdit(board);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return "success";
		}
}
