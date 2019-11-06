
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="list" method="post">
		影片名：<input type="text" name="mname">
		导演：<input type="text" name="mname">
		电影年代：<input type="text" name="mname">
		上映时间：<input type="text" name="mname">-<input type="text" name="mname">
		<input type="submit" value="查询">
		<table>
			<tr>
				<td>
					<input type="button" value="全选" onclick="qx()"> 
					<input type="button" value="全不选" onclick="qbx()"> 
					<input type="button" value="反选" onclick="fx()"> 
				</td>
				<td>电影编号</td>
				<td>影片名</td>
				<td>导演</td>
				<td>票价</td>
				<td>上映时间</td>
				<td>时长</td>
				<td>类型</td>
				<td>年代</td>
				<td>区域</td>
				<td>状态</td>
			</tr>
			<c:forEach items="${pg.list }" var="u">
				<tr>
					<td>
						<input type="checkbox" value="${u.id }" class="ck">
					</td>
					<td>${u.id }</td>
					<td>${u.mname }</td>
					<td>${u.dy }</td>
					<td>${u.pj }</td>
					<td>${u.time }</td>
					<td>${u.sc }</td>
					<td>${u.lx }</td>
					<td>${u.nd }</td>
					<td>${u.qy }</td>
					<td>${u.zt }</td>
				</tr>
			</c:forEach>
		</table>
		<button name="pageNum" value="1">首页</button>
		<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
		<button name="pageNum" value="${pg.nextPage==0?pg.lastPage:pg.nextPage }">下一页</button>
		<button name="pageNum" value="${pg.lastPage }">尾页</button>
		总条数：${pg.total } 当前页/总页数${pg.pageNum }/${pg.lastPage }
	</form>
	</center>
</body>
<script type="text/javascript">
	function qx(){
		$(".ck").each(function (){
			this.checked=true;
		})
	}
	
	function qbx(){
		$(".ck").each(function (){
			this.checked=false;
		})
	}
	
	function fx(){
		$(".ck").each(function (){
			this.checked=!this.checked;
		})
	}
</script>
</html>