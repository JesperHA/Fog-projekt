<%@include file="include/header.jsp"%>
    <main class="page login-page">
        <section class="clean-block clean-form dark">
            <div class="container" style="margin-top: 50px;">
                <div class="block-heading">
                    <h2 class="text-info">Opret kunde</h2>
                    <p>Velkommen til kundeportalen</p>
                </div>
                <form action="FrontController" method="post">
                    <input type="hidden" name="source" value="Registrér dig"/>
                    <div class="form-group"><label for="navn">Navn</label><input class="form-control item" type="text" name="navn" id="navn"></div>
                    <div class="form-group"><label for="email">Email</label><input class="form-control item" type="email" name="email" id="email"></div>
                    <div class="form-group"><label for="password">Adgangskode</label><input class="form-control" type="password" name="password" id="password"></div>
                    <div class="form-group"><label for="adress">Adresse</label><input class="form-control item" type="text" name="adress" id="adress"></div>
                    <div class="form-group"><label for="zipcode">Post Nr</label><input class="form-control item" type="text" name="zipcode" id="zipcode"></div>
                    <div class="form-group"><label for="by">By</label><input class="form-control item" type="text" name="by" id="by"></div>
                    <button class="btn btn-primary btn-block" type="submit">Registrér</button></form>
            </div>
        </section>
    </main>


<%@include file="include/footer.jsp"%>
