package HongDoGyung.command;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HongDoGyung.DAO.postDAO;

public class MPostDeleteCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		postDAO dao = new postDAO();
		dao.delete(title);
	}

}
