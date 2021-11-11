package HongDoGyung.command;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HongDoGyung.DAO.memberDAO;
import HongDoGyung.dto.memberDTO;

public class MViewCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		memberDAO dao = new memberDAO();
		String id = request.getParameter("id");
		memberDTO dto = dao.view(id);
		request.setAttribute("dto", dto);
		
	}

}
