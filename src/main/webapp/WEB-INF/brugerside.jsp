<%@ page import="Model.Customer" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<%

    ArrayList<Customer> customer = (ArrayList<Customer>) session.getAttribute("login");


%>


<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Pricing - Brand</title>
    <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
    <link rel="stylesheet" href="../assets/fonts/simple-line-icons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
    <link rel="stylesheet" href="../assets/css/smoothproducts.css">
</head>

<body>
    <nav class="navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar">
        <div class="container"><img src="../assets/img/fog_logo.png" style="padding-left: 0;padding-right: 15px;"><a class="navbar-brand logo" href="#">Fog Carport</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link" href="../index.jsp">Startside</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link active" href="brugerside.jsp">login portal</a></li>
                </ul><button class="btn btn-primary" type="button">Byg Carport</button></div>
        </div>
    </nav>
    <main class="page pricing-table-page">
        <h1 style="margin-bottom: 50px;margin-top: 120px;">Velkommen %bruger%</h1>
    </main>
    <div>
        <div class="container" style="margin-bottom: 50px;">
            <div class="row">
                <div class="col-md-12" style="margin-bottom: 30px;">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="card-title">Konto</h4>
                            <h6 class="text-muted card-subtitle mb-2">Her kan du se dine kontooplysninger</h6>
                            <div class="row">
                                <div class="col"><label class="col-form-label">Kundenummer: <%out.println(customer.get(0).getCustomer_id());%></label></div>
                            </div>
                            <div class="row">
                                <div class="col"><label class="col-form-label">Navn: <%out.println(customer.get(0).getName());%></label></div>
                            </div>
                            <div class="row">
                                <div class="col"><label class="col-form-label">Email: <%out.println(customer.get(0).getEmail());%></label></div>
                            </div>
                            <div class="row">
                                <div class="col"><label class="col-form-label">Telefon: <%out.println(customer.get(0).getPhone());%></label></div>
                            </div>
                            <div class="row">
                                <div class="col"><label class="col-form-label">Adresse: <%out.println(customer.get(0).getAdress()); %> - <%out.println(customer.get(0).getZipcode());%> - <%out.println(customer.get(0).getCity());%></label></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="card-title">Din Carport</h4>
                            <h6 class="text-muted card-subtitle mb-2">Her kan du se dit nuværende Carport projekt</h6><button class="btn btn-primary" type="button" style="margin-top: 10px;">Klik her</button></div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="card-title">Dine ordrer</h4>
                            <h6 class="text-muted card-subtitle mb-2">Her kan du se dine ordrer.</h6><button class="btn btn-primary" type="button" style="margin-top: 10px;">Klik her</button></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="page-footer dark">
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <h5>Navigation</h5>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Medarbejder Login</a></li>
                        <li><a href="#">Kundeportal</a></li>
                    </ul>
                </div>
                <div class="col-sm-3">
                    <h5>Fog Carport&nbsp;</h5>
                    <p style="color: rgb(255,255,255);">Udviklet af 2. Semester holdet Rush B.</p>
                </div>
                <div class="col-sm-3"></div>
                <div class="col-sm-3"><img src="../../../../FOG%20HTML/assets/img/fog_logo.png" style="margin-top: 15px;margin-right: 20px;margin-left: 50px;"></div>
            </div>
        </div>
        <div class="footer-copyright">
            <p>© 2019 Copyright. Alle rettigheder forbeholdes Rush B.</p>
        </div>
    </footer>
    <script src="../../../../FOG%20HTML/assets/js/jquery.min.js"></script>
    <script src="../../../../FOG%20HTML/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
    <script src="../../../../FOG%20HTML/assets/js/smoothproducts.min.js"></script>
    <script src="../../../../FOG%20HTML/assets/js/theme.js"></script>
</body>

</html>