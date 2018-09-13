
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head><!-- Latest compiled and minified CSS -->
        <%@include file="WEB-INF/jspf/cabecalho.jspf" %>

    </head>

    <body style="background-color: whitesmoke">



        <!-- NavBar-->
        <%@include file="WEB-INF/jspf/menu.jspf" %>

        <!--Corpo-->
        <div class="jumbotron" style="background-color: #4169E1">
            <div class="container" style="margin-left: 10%; color: white">
                <h1>Calculadora Finaceira</h1>
                <p>Uma aplicação que possui a finalidade de ajudar você no cálculo de qualquer amortização de forma rápida e eficiente</p> 
            </div>
        </div>


        <div class="container-fluid" >
            <div class="row slideanim" style="margin-left: 2%">
                <div class="col-sm-4 col-xs-12">
                    <div class="panel panel-default text-center">
                        <div class="panel-heading">
                            <h1>Constante</h1>
                        </div>

                        <div class="panel-body">

                            <p>O valor da amortização é calculada dividindo-se o valor do principal pelo número de períodos de pagamento, ou seja, de parcelas.</p>

                        </div>
                        <div class="panel-footer">

                            <a href="" class="btn btn-lg" role="button">Calcular</a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-sm-4 col-xs-12" style="margin-top: -21.1%;margin-left: 34% ">
                <div class="panel panel-default text-center">
                    <div class="panel-heading">
                        <h1>Americana</h1>
                    </div>
                    <div class="panel-body">

                        <p>Esse sistema de amortização tem a vantagem em relação ao sistema de pagamento único, pois nele não há incidência de juros sobre juros.</p>


                    </div>
                    <div class="panel-footer">

                        <a href="Amortizacao-Americana.jsp" class="btn btn-lg" role="button">Calcular</a>
                    </div>
                </div>      
            </div>       

            <div class="col-sm-4 col-xs-12"Style="margin-top: -21.1%; margin-left: 66%">
                <div class="panel panel-default text-center">
                    <div class="panel-heading">
                        <h1>Tabela Price</h1>
                    </div>
                    <div class="panel-body">
                        <p> É um método usado em amortização de empréstimo cuja principal característica é apresentar prestações (ou parcelas) iguais. </p>


                    </div>
                    <div class="panel-footer">

                        <a href="" class="btn btn-lg" role="button">Calcular</a>
                    </div>
                </div>      
            </div>

        </div>

        <!--Apresentação dos alunos-->
        <div  class="container-fluid"style="background-color: whitesmoke;">
            <div class="row" style="margin-left: 17%">
                <div class="jumbotron" style="text-indent:30%; background-color: whitesmoke"><h2>Equipe</h2></div>

                <div class="col-md-4">
                    <h3>Daniel Beserra Gomes</h3>
                </div>
                <div class="col-md-4">
                    <h3>Peterson da Silva</h3>
                </div>
                <div class="col-md-4" style="margin-left: ">
                    <h3>Vinicius Lopes Lima</h3>
                </div>



            </div>


        </div>
        <br/><br/>
        <br/><br/>
   

        <!--Rodapé-->
        <%@include file="WEB-INF/jspf/rodape.jspf" %>

    </body>
</html> 


</html>
