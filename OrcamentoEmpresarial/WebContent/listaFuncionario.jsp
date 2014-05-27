<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<title>Show All Users</title>
</head>
<body>
	<table border=1>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Endereço</th>
				<th>Email</th>
				<th>Depto</th>
				<th>Senha</th>
				<th colspan=2>Ação</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${funcionarios}" var="funcionario">
				<tr>
					<td><c:out value="${funcionario.id}" /></td>
					<td><c:out value="${funcionario.nome}" /></td>
					<td><c:out value="${funcionario.endereco}" /></td>
					<td><c:out value="${funcionario.email}" /></td>
					<td><c:out value="${funcionario.departamentos_id}" /></td>
					<td><c:out value="${funcionario.senha}" /></td>
					<td><a
						href="FuncionarioControle?action=edita&Id=<c:out value="${funcionario.id}"/>">Edita</a></td>
					<td><a
						href="FuncionarioControle?action=remove&Id=<c:out value="${funcionario.id}"/>">Remove</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>
		<a href="FuncionarioControle?action=adiciona">Adicionar
			Funcionário</a>
	</p>
	<form action="logout" method="POST">
		<input type="submit" value="Deslogar">
	</form>
</body>
</html>