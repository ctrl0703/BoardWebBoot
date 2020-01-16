package com.cahlee.service;

import org.springframework.data.domain.Page;

import com.cahlee.domain.Board;
import com.cahlee.domain.Search;

public interface BoardService {

	void insertBoard(Board board);

	void updateBoard(Board board);

	void deleteBoard(Board board);

	Board getBoard(Board board);

	Page<Board> getBoardList(Board board);

	Page<Board> getBoardList(Search search);
}