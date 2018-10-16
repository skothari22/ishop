<%-- 
    Document   : productsGrid
    Created on : Oct 16, 2018, 10:37:44 AM
    Author     : shitalk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row" style="margin: 20px">
    <div class="col-12 col-sm-3">
        <div class="card bg-light mb-3">
            <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>
            <ul class="list-group category_block">
                <li class="list-group-item"><a href="#">Furniture</a></li>
                <li class="list-group-item"><a href="#">Computers/ Laptops</a></li>
                <li class="list-group-item"><a href="#">Mobile</a></li>
                <li class="list-group-item"><a href="#">Accessories</a></li>
                <li class="list-group-item"><a href="#">Electronics</a></li>
            </ul>
        </div>
        <div class="card bg-light mb-3">
            <div class="card-header bg-success text-white text-uppercase">Last product</div>

            <div class="card-body">
                <img class="card-img-top" src="https://dummyimage.com/600x400/55595c/fff" />
                <h5 class="card-title"><a href="../updateProduct.jsp" title="View Product">Product title</a></h5>
                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                <p class="bloc_left_price">99.00 $</p>
            </div>
        </div>
    </div>
    <div class="col">
        <div class="row">
            <!--for each recommended product-->
            <% for (int i = 0; i < 10; i++) { %>
            <div class="col-12 col-md-6 col-lg-4">
                <div class="card">
                    <img class="card-img-top" src="https://dummyimage.com/600x400/55595c/fff" alt="Card image cap">
                    <div class="card-body">
                        <h4 class="card-title"><a href="../updateProduct.jsp" title="View Product">Product title</a></h4>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                    <p class="btn btn-danger btn-block">99.00 $</p>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                    <a href="../updateProduct.jsp" class="btn btn-success btn-block">Edit Product</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <%}%>

        </div>
    </div>
    <div class="col-12">
        <nav aria-label="...">
            <ul class="pagination">
                <li class="page-item disabled">
                    <a class="page-link" href="#" tabindex="-1">Previous</a>
                </li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item active">
                    <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
                </li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item">
                    <a class="page-link" href="#">Next</a>
                </li>
            </ul>
        </nav>
    </div>
</div>
</div>
</div