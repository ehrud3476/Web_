package HongDoGyung.command;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HongDoGyung.DAO.memberDAO;
import HongDoGyung.dto.memberDTO;

public class MUpdateCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		memberDTO dto = new memberDTO();
		
		dto.setId(request.getParameter("id"));
		dto.setPwd(request.getParameter("pwd"));
		dto.setName(request.getParameter("name"));
		dto.setEmail(request.getParameter("email"));
		dto.setJoindate(Date.valueOf(request.getParameter("joindate")));
		
		memberDAO dao = new memberDAO();
		
		dao.update(dto);
		
		
		
	}

}
