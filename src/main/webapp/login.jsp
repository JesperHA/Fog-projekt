<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Login - Brand</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
    <link rel="stylesheet" href="assets/fonts/simple-line-icons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
    <link rel="stylesheet" href="assets/css/smoothproducts.css">
</head>

<body>
    <nav class="navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar">
        <div class="container"><img src="assets/img/fog_logo.png" style="padding-left: 0;padding-right: 15px;"><a class="navbar-brand logo" href="#">Fog Carport</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link" href="index.jsp">Startside</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="login.jsp">login portal</a></li>
                </ul><button class="btn btn-primary" type="button">Byg Carport</button></div>
        </div>
    </nav>
    <main class="page login-page">
        <section class="clean-block clean-form dark">
            <div class="container" style="margin-top: 50px;">
                <div class="block-heading">
                    <h2 class="text-info">Log ind</h2>
                    <p>Velkommen til kundeportalen</p>
                </div>
                <form action="FrontController" method="post">
                    <input type="hidden" name="source" value="login"/>
                    <div class="form-group"><label for="email">Email</label><input class="form-control item" type="email" name="email" id="email"></div>
                    <div class="form-group"><label for="password">Adgangskode</label><input class="form-control" type="password" name="password" id="password"></div><button class="btn btn-primary btn-block" type="submit">Log ind</button></form>
            </div>
        </section>
    </main>
    <footer class="page-footer dark">
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <h5>Navigation</h5>
                    <ul>
                        <li><a href="index.jsp">Startside</a></li>
                        <li><a href="login.jsp">Login portal</a></li>
                        <li><a href="#">Byg Carport</a></li>
                    </ul>
                </div>
                <div class="col-sm-3">
                    <h5>Fog Carport&nbsp;</h5>
                    <p style="color: rgb(255,255,255);">Udviklet af 2. Semester holdet Rush B.</p>
                </div>
                <div class="col-sm-3"></div>
                <div class="col-sm-3"><img src="assets/img/fog_logo.png" style="margin-top: 15px;margin-right: 20px;margin-left: 50px;"></div>
            </div>
        </div>
        <div class="footer-copyright">
            <p>© 2019 Copyright. Alle rettigheder forbeholdes Rush B.</p>
        </div>
    </footer>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
    <script src="assets/js/smoothproducts.min.js"></script>
    <script src="assets/js/theme.js"></script>
</body>

</html>