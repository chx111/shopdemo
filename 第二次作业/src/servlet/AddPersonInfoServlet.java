package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;


@WebServlet("/AddPersonInfoServlet")
public class AddPersonInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddPersonInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String []skills = request.getParameterValues("skill");
		String skill ="";
		for(String str:skills){
			skill = skill+str+" ";
		}
		User user = (User) request.getSession().getAttribute("user");
		System.out.println("�û���: "+ user.getUserName());
		System.out.println("ѧУ����: "+ user.getSchoolName());
		System.out.println("רҵ����: "+user.getMajor());
		System.out.println("���ռ���: "+skill);

	}

}
