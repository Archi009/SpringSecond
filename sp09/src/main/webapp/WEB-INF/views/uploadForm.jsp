<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

												<!-- context-tpye -->
<form action="uploadFormAction" method="post" enctype="multipart/form-data">
<input type="text" name="desc">
<input type='file' name='uploadFile' multiple>

<button>Submit</button>

</form>

</body>
</html>