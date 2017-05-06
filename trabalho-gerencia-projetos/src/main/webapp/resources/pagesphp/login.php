<?php
	header("Content-Type: text/html; charset=ISO-8859-1",true);//codificação de caracteres 0
?>
<html>
<head>
<title>Login - Process Thinking</title>
<?php include("topreferences.php"); ?>
</head>
<body id="top">
<?php include("topmenu.php"); ?>
<div class="wrapper bgded overlay" style="background-image:url('images/nuvem.jpg');">
  <div id="breadcrumb" class="hoc clear"> 
    <ul>
      <li><a href="index.php">Home</a></li>
      <li><a href="#">Login</a></li>
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
            <label for="name">Usuario</label>
            <input type="text" name="login" id="login" value="" size="22" required>
          </div>
          <div class="one_half">
            <label for="password">Senha</label>
            <input type="password" name="senha" id="login" value="" size="22" required>
          </div>
          <div>
			<div class="btn inverse" onclick="$('#loginBtn').click()" style="cursor:pointer">FAZER LOGIN</div>
			<div class="btn inverse" onclick="$('#esqueciSenhaBtn').click()" style="cursor:pointer">ESQUECI A SENHA</div>
            <input type="submit" name="submit" id="loginBtn" value="Fazer login" style="display:none" />
            <input type="reset" class="btn inverse" name="reset" id="esqueciSenhaBtn" value="Esqueceu a senha" style="display:none" />
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