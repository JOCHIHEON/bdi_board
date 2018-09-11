package com.board.bdi.service;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public interface UserService {
	/*로그인,로그아웃,유저리스트,회원가입*/
	public void joinUser(HttpServletRequest req)throws SQLException, ServletException;
	public void loginUser(HttpServletRequest req)throws SQLException, ServletException;
	public void logoutUser(HttpServletRequest req)throws SQLException, ServletException;
	public void deleteUser(HttpServletRequest req)throws SQLException, ServletException;
	public void userList(HttpServletRequest req)throws SQLException, ServletException;

}
