<%-- 
    Document   : login
    Created on : Nov 5, 2018, 1:37:08 PM
    Author     : Carel Tambagistra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In</title>
        <link href="lib/css/bootstrap.css" rel ="stylesheet"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div style="margin-top: 100px" class="col-4 offset-4">
                    <div class="card">
                        <div class="card-header text-white bg-dark ">
                            Menu
                        </div>
                        <div class="card-body">
                            <span style="font-size: 10pt">Silakan masukkan username dan password untuk  login</span>
                            <form method="post" action="prosesLogin.jsp">
                                <div class ="form-group">
                                    <input class="form-control" type="text" name="username" placeholder="Username"  required/>
                                </div>
                                <div class ="form-group">
                                    <input class="form-control" type="password" name="password" placeholder="Password"  required/>
                                </div>
                                <div class ="form-group">
                                    <input class="form-control btn badge-primary" type="submit" value="Login"/>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
