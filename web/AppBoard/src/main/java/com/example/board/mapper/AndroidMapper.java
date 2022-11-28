package com.example.board.mapper;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.board.dto.Board;



@Repository("com.example.board.mapper.AndroidMapper")
public interface AndroidMapper {

	List<Board> boardList();

	List<Board> boardSelect(String writer_id);

	List<Board> androidInsert(Board board);

	void boardEdit(Board board);

	
}