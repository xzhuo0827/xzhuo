<!DOCTYPE html>
<html>
<head lang="en">
<title>Spring Boot Demo - FreeMarker</title>
<link href="/css/index.css" rel="stylesheet">
<script type="text/javascript" src="/jars/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/js/index.js"></script>
</head>
<body>
	<h2>首页</h2>
	<table>
		<tr>
			<td>user.id</td>
			<td>user.username</td>
			<td>user.address</td>
			<td>user.sex</td>
			<td>user.birthday</td>
		</tr>
		<#list userList as user>
		<tr>
			<td>${user.id!}</td>
			<td>${user.username!}</td>
			<td>${user.address!}</td>
			<td>${user.sex!}</td>
			<td>${(user.birthday?string('yyyy-MM-dd HH:mm:ss'))!}</td>
		</tr>
		</#list>
	</table>
	<button class="a">click me</button>
</body>
</html>