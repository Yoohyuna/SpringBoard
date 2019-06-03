package lee;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

//��Ʈ�ѷ� Ŭ����=>����ڷκ��� ��û�� �޾Ƽ� ó�����ִ� Ŭ����(=�׼�Ŭ����)
//   1) �������� ��Ʈ�ѷ�(Controller)   
//   2) ����ڷκ��� ���� �Է�ó�����ִ� ��Ʈ�ѷ�(�۾���,�ۼ���,�α���,->AbstractCommandController                  
public class WriteActionController extends AbstractCommandController {

	BoardDAO dao;//BoardDAO dao=new BoardDAO();
	//commandClass  ->setCommandClass(BoardCommand command) ��ӹ��� ��������� �޼���
	//<property name="commandClass"  value="lee.BoardCommand" />
	
	public void setDao(BoardDAO dao) { //<property name="dao"><ref bean="id��" /></properety>
		this.dao = dao;
		System.out.println("setDao() ȣ���!(dao)=>"+dao);
	}

	//1.request(��û��ü) 2.response(���䰴ü) 3.�Է¹������� ������ ��ü(Object(�� �Է�O))
	//4.BindException->����ڷκ��� ���� �Է½� �����߻�->������ ó�����ִ� ��ü
	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response,
			                                  Object command,BindException error) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WriteActionController �����!");
		request.setCharacterEncoding("utf-8");
		BoardCommand data=(BoardCommand)command;
		String author=data.getAuthor();
		String content=data.getContent();
		String title=data.getTitle();
		/*
		 * String author=request.getParamter("author");
		    String content=request.getParamter("content");
		    String title=request.getParamter("title");
		    ,,,
		 * 
		 */
		dao.write(author, title, content);//dao.write(data);
		//response.sendRedirect("list.jsp");=>����) redirect:/��û��ɾ�
		//write.do->/list.do->ListActionController->/list.jsp
		/*
		ModelAndView mav=new ModelAndView("redirect:/list.do");
		return mav;
		*/
		return new ModelAndView("redirect:/list.do");
	}
}




