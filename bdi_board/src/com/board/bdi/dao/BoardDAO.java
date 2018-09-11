package com.board.bdi.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.board.bdi.vo.BoardInfoVo;

public interface BoardDAO {
	public void setCon(Connection con);
	public int insertBoard(BoardInfoVo bi) throws SQLException;
	public BoardInfoVo selectBoard(BoardInfoVo bi)throws SQLException;
	public List<BoardInfoVo> selectBoardList(BoardInfoVo bi)throws SQLException;
}
