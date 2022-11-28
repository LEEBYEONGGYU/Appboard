package com.example.board.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.board.dto.Board;
import com.example.board.mapper.AndroidMapper;


@Service
@Transactional
public class AndroidService {

	@Autowired
	private AndroidMapper androidMapper;

	public List<Board> boardList() {
		// TODO Auto-generated method stub
		return androidMapper.boardList();
	}

	public List<Board> boardSelect(String writer_id) {
		// TODO Auto-generated method stub
		return androidMapper.boardSelect(writer_id);
	}

	public List<Board> boardInsert(Board board) {
		// TODO Auto-generated method stub
		return androidMapper.androidInsert(board);
	}

	public void boardEdit(Board board) {
		// TODO Auto-generated method stub
		androidMapper.boardEdit(board);
	}
	
}