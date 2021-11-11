package HongDoGyung.command;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HongDoGyung.DAO.postDAO;
import HongDoGyung.dto.postDTO;

public class MPostCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		postDAO dao = new postDAO();
		
		ArrayList<postDTO> dtos = dao.postlist();
		
		request.setAttribute("dtos", dtos);
	}

}
