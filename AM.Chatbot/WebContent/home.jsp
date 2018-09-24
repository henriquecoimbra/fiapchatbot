<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="pt-br" dir="ltr">
<head>
<%@ include file="header.jsp"%>
  <title>Drawer Studius - Human Resources</title>
</head>

<body>

  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <h1 class="navbar-brand">DRAWER STUDIUS</h1>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
      <ul class="navbar-nav mr-auto mt-0 mt-lg-0">
        <li class="nav-item active">
          <a class="nav-link" href="index-rh.html">funcoes<span class="sr-only">(current)</span></a>
        </li>
      </ul>
      <div id="login">
        <form action="/LogoutServlet" method="post">
    		<input type="submit" value="Logout" />
		</form>
      </div>
    </div>
  </nav>

  <div class="quad"></div>
  <div class="quad2"></div>

  <div class="container-fluid capa-prods"></div>
  <div class="tit-div mt-1 mb-5">
    <h2 class="title">Funcionário RH</h2>
  </div>

  <div class="container-fluid w-100 mt-3 mb-5">
    <div class="container">
      <a href="html/cadastro-funcionario.html">
        <div class="row mt-4">
					<div class="card bg-dark text-white zoom">
						<img class="card-img" src="images/cadFuncionario.png"
							alt="Card image">
						<div class="card-img-overlay">
							<h5 class="nav-link bg-dark">cadastro de Funcionario</h5>
							<p class="bg-light w-75 nav-link esconde">Cadastrar Novos
								Funcionarios no sistema de nossa maravilhosa empresa.</p>
						</div>
					</div>
				</div>
			</a>
      <a href="html/cadastro-sala.html">
        <div class="row mt-4">
          <div class="card bg-dark text-white zoom">
            <img class="card-img"  src="images/cadSala.png" alt="Card image">
            <div class="card-img-overlay">
              <h5 class="nav-link bg-dark">Cadastrar sala para reunião</h5>
              <p class="bg-light w-75 nav-link esconde">cadastrar uma nova sala de reunião.</p>
            </div>
          </div>
        </div>
      </a>
      <a href="html/cadastro-cartao.html">
        <div class="row mt-4">
          <div class="card bg-dark text-white zoom">
            <img class="card-img"  src="images/cadCartao.png" alt="Card image">
            <div class="card-img-overlay">
              <h5 class="nav-link bg-dark">Cadastrar Cartão</h5>
              <p class="bg-light w-75 nav-link esconde">Cadastro de Cartões (Saúde, Vale-Refeição, Vale-Transporte).</p>
            </div>
          </div>
        </div>
      </a>
      <a href="arquivos/cadastroArquivo.html" target="_blank">
        <div class="row mt-4">
          <div class="card bg-dark text-white zoom">
            <img class="card-img"  src="images/cadArquivo.png" alt="Card image">
            <div class="card-img-overlay">
              <h5 class="nav-link bg-dark">Cadastrar Arquivo</h5>
              <p class="bg-light w-75 nav-link esconde">Local reservado para o compartilhamento de arquivos internos.</p>
            </div>
          </div>
        </div>
      </a>
  </div>
</div>

<!-- CHATBOT -->
<%@ include file="chatbot.jsp" %>
<%@ include file="footer.jsp" %>
</body>
</html>
	