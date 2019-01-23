<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//포워드를 담당
	RequestDispatcher rd = request.getRequestDispatcher("b.jsp");

	//포워드
	rd.forward(request,response);
	
	/*
		포워드는 내부에서 응답이 변경되는 방식
		요청 한번 / 응답 한번
		요청은 a.jsp로 했어도 응답은 내부의 b.jsp가 응답한다.
		request객체가 넘어감
		
		리다이렉트는 클라이언트에서 재요청하는 방식
		요청 2번 / 응답 2번
		a.jsp 요청 -> a.jsp 응답 -> b.jsp로 재요청 -> b.jsp 응답
		request객체도 2번 만들어짐
		
	*/
	
	
	//리다이렉트 방식
	//response.sendRedirect("b.jsp");
	
%>