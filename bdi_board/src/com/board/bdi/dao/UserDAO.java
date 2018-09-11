package com.board.bdi.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.board.bdi.vo.UserInfoVo;

public interface UserDAO {
	public void setCon(Connection con);
	public int insertUser(UserInfoVo ui) throws SQLException;
	public UserInfoVo selectUser(UserInfoVo ui)throws SQLException;
}
