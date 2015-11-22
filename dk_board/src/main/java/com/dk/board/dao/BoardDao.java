package com.dk.board.dao;

import java.util.ArrayList;

import com.dk.board.domain.BoardVo;

public interface BoardDao {
	public ArrayList<BoardVo> getBoardList();
	public BoardVo getBoard();
	public BoardVo saveBoard();
	public BoardVo updateBoard();
	public boolean deleteBoard();
}
