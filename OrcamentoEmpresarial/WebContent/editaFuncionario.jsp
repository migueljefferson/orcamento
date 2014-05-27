<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css"
	href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
<title>Adiciona um novo usuário</title>
</head>
<body>
	<form method="POST" action='FuncionarioControle' name="frmAddUser">
		Func ID  : <input type="text" readonly="readonly" name="id"               value="<c:out value="${funcionario.id}"                  	/>" /> <br /> 
		Nome     : <input type="text"                     name="nome"             value="<c:out value="${funcionario.nome}"                	/>" /> <br /> 
		Endereço : <input type="text"                     name="endereco"         value="<c:out value="${funcionario.endereco}"            	/>" /> <br /> 
		Email    : <input type="text"                     name="email"            value="<c:out value="${funcionario.email}"               	/>" /> <br /> 
		Depto ID : <input type="text"                     name="departamentos_id" value="<c:out value="${funcionario.departamentos_id}"    	/>" /> <br />
		Senha    : <input type="text"                     name="senha" 			  value="<c:out value="${funcionario.senha}"    			/>" /> <br />
		<input type="submit" value="Submeter" />
	</form>
</body>
</html>