package HongDoGyung.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HongDoGyung.command.MCommand;
import HongDoGyung.command.MInsertPostCommand;
import HongDoGyung.command.MListCommand;
import HongDoGyung.command.MPostCommand;
import HongDoGyung.command.MPostDeleteCommand;
import HongDoGyung.command.MPostUpdateCommand;
import HongDoGyung.command.MPostViewCommand;
import HongDoGyung.command.MUpdateCommand;
import HongDoGyung.command.MViewCommand;
import HongDoGyung.command.MdeleteCommand;
import HongDoGyung.command.mInsertCommand;

@WebServlet("*.do")
public class MemberController extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws SQLException,ClassNotFoundException,ServletException, IOException {
      request.setCharacterEncoding("utf-8");
      String viewPage = null;
      MCommand command = null;
      
      String uri = request.getRequestURI();
      String com = uri.substring(uri.lastIndexOf("/") + 1, uri.lastIndexOf(".do"));
      
      if(com != null && com.trim().equals("list")) {
         command = new MListCommand();
         command.execute(request, response);
         viewPage = "WEB-INF/view/mList.jsp";
         
      }else if(com != null && com.trim().equals("insertForm")) {
    	 viewPage = "WEB-INF/view/mInsertForm.jsp";
    	 
      }else if(com != null && com.trim().equals("insert")) {
    	  command = new mInsertCommand();
    	  command.execute(request,response);
    	  viewPage = "list.do";
      }else if(com != null && com.trim().equals("view")) {
    	  command = new MViewCommand();
    	  command.execute(request, response);
    	  viewPage = "WEB-INF/view/mView.jsp";    	  
      }else if(com != null && com.trim().equals("delete")) {
    	  command = new MdeleteCommand();
    	  command.execute(request, response);
    	  viewPage = "list.do";    	  
      }else if(com != null && com.trim().equals("update")) {
    	  command = new MUpdateCommand();
    	  command.execute(request, response);
    	  viewPage = "list.do";    
      }else if (com != null && com.trim().equals("post")) {    	  
    	  viewPage = "WEB-INF/view/mInsertPost.jsp";
      }else if(com != null && com.trim().equals("Plist")) {
    	  command = new MPostCommand();
          command.execute(request, response);
          viewPage = "WEB-INF/view/mPostList.jsp";   	  
      }else if(com != null && com.trim().equals("insertPost")) {
    	  command = new MInsertPostCommand();
          command.execute(request, response);
          viewPage = "Plist.do";   	  
      }else if(com != null && com.trim().equals("postview")) {
    	  command = new MPostViewCommand();
    	  command.execute(request, response);
    	  viewPage = "WEB-INF/view/mPostView.jsp";
      }else if(com != null && com.trim().equals("Pupdate")) {
    	  command = new MPostUpdateCommand();
    	  command.execute(request, response);
    	  viewPage = "Plist.do";
      }else if(com != null && com.trim().equals("Pdelete")) {
    	  command = new MPostDeleteCommand();
    	  command.execute(request, response);
    	  viewPage = "Plist.do";
    	  }
      
      RequestDispatcher rd = request.getRequestDispatcher(viewPage);
      rd.forward(request, response);
      
   }

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	try {
		doHandle(request,response);
	} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	try {
		doHandle(request,response);
	} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
   
}
