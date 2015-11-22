package com.dk.board.service;

import java.util.ArrayList;

import com.dk.board.domain.BoardVo;

public interface BoardService {
	public ArrayList<BoardVo> getBoardList();
	public BoardVo getBoard(int boardId);
	public BoardVo writeBoard(BoardVo boardVo);
	public BoardVo updateBoard(BoardVo boardVo);
	public boolean deleteBoard(int boardId);
}
