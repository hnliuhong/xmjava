<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <!-- 必须添加 *.mvc 才能被DispatcherServlet识别 -->
    <form action="/xmjava/product/save.mvc" method="post">
    	商品名称:<input type="text" name="name" /><br />
    	商品价格:<input type="text" name="price" /><br />
    	商品备注:<input type="text" name="remark" /><br />
    	<button type="submit">提交</button>
    </form>   
  </body>
</html>
