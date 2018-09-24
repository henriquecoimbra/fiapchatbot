<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div id="conteudoChat">
  <h2 class="chat-tit">Human Resources<span id="fecha-bot" class="float-right light border border-light rounded p-1 pr-2 pl-2">x</span></h2>
  <div class="corpo-chat" id="corpo-chat">
    <ul class="chat">
      <img width="50px" height="50px" class="rounded-circle float-left massacote" src="images/massacote.png" alt="Mascote">
      <li class="chat-cor chat-txt">Olá, sou o HR seu amigo!<br>quer saber de algo?<br>basta perguntar ali abaixo.</li>
      <c:forEach items="${conversa }" var="dialogo">
		    ${dialogo }
		</c:forEach>
    </ul>
  </div>  
  <form class="w-100" id="from_chatbot" method="post">
    <input type="text" autocomplete="off" id="minhapergunta" name="minhapergunta" class="usu-txt" placeholder=" Digite uma mensagem..."/>
    <input class="float-right w-100" type="submit" id="adiciona" value="enviar"/>
  </form>
</div>

<div class="bot zoom">
  <figure>
    <img src="images/massacote.png" alt="Mascote">
  </figure>
</div>
