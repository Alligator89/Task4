<%@page contentType="text/html" pageEncoding="UTF-8" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Uploading File</title>
</head>
<body>
<h1> Choose File to Upload in Server </h1>
<form action="/load-book" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="upload"/>
</form>
<h2> Choose File to Download </h2>
<form action="/book" method="get" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="download"/>
</form>

</body>
</html>
