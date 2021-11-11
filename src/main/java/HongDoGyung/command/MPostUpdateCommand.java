package HongDoGyung.command;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HongDoGyung.DAO.postDAO;
import HongDoGyung.dto.postDTO;

public class MPostUpdateCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		postDTO dto = new postDTO();
		
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		dto.setJoindate(Date.valueOf(request.getParameter("joindate")));
		
		postDAO dao = new postDAO();
		dao.update(dto);
		
	}

}
