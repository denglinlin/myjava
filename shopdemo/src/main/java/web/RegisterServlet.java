package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import domain.User;
import service.UserService;

public class RegisterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Map<String,String[]> parameterMap = request.getParameterMap();
		User user=new User();
		try {
			/*ConvertUtils.register(new Converter() {
				
				@Override
				public Object convert(Class type, Object value) {
					// TODO Auto-generated method stub
					SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
					Date parse=null;
					try {
						parse = format.parse(value.toString());
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return parse;
				}
			},Date.class);*/
			BeanUtils.populate(user,parameterMap);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		user.setId(UUID.randomUUID().toString());
		UserService service=new UserService();
		boolean ifRegisterSucces=service.register(user);
		if(ifRegisterSucces) {
			response.sendRedirect(request.getContextPath()+"/registerSuccess.jsp");
			
		}else {
			response.sendRedirect(request.getContextPath()+"/registerFail.jsp");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
