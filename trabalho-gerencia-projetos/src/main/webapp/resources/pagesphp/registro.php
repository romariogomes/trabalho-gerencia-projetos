<?php
	header("Content-Type: text/html; charset=ISO-8859-1",true);//codificação de caracteres 0
?>
<html>
<head>
<title>Registro - Process Thinking</title>
<?php include("topreferences.php"); ?>
</head>
<body id="top">
<?php include("topmenu.php"); ?>
<div class="wrapper bgded overlay" style="background-image:url('images/nuvem.jpg');">
  <div id="breadcrumb" class="hoc clear"> 
    <ul>
      <li><a href="index.php">Home</a></li>
      <li><a href="#">Registrar-se</a></li>
    </ul>
  </div>
</div>
<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <div class="content"> 
      <div id="comments">
        <form action="#" method="post">
          <div class="one_half first">
            <label for="name">Nome</label>
            <input type="text" name="nome" id="nome" value="" size="22" required>
          </div>
          <div class="one_half">
            <label for="sobrenome">Sobrenome</label>
            <input type="text" name="sobrenome" id="sobrenome" value="" size="22" required>
          </div>
		  <div class="one_half first">
            <label for="cpf">CPF</label>
			<input type="text" name="cpf" id="cpf" data-mask="000.000.000-00" data-mask-selectonfocus="true" size="22" required maxlength="11" />
          </div>
          <div class="one_half">
            <label for="email">email</label>
            <input type="email" name="email" id="email" value="" size="22" required>
          </div>
		  <div class="one_half first">
            <label for="user">Usuario</label>
            <input type="text" name="login" id="login" value="" size="22" required>
          </div>
          <div class="one_half">
            <label for="password">Senha</label>
            <input type="password" name="senha" id="senha" value="" size="22" required>
          </div>
          <div>
            <input type="submit"  name="submit" id="cadastrarButton" value="Cadastrar" style="display:none"/>
			<div onclick="$('#cadastrarButton').click()" class="btn inverse">CADASTRAR</div>
			<div class="btn btn-primary"><i class="fa fa-facebook-official"></i> Cadastrar com Facebook</div>
          </div>
        </form>
      </div>
    </div>
    <div class="clear"></div>
  </main>
</div>
<?php include("footer.php"); ?>
<?php include("references.php"); ?>
</body>
</html>