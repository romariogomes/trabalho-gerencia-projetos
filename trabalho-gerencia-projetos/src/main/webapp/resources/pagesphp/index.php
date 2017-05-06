<?php
	header("Content-Type: text/html; charset=ISO-8859-1",true);//codificação de caracteres 0
?>
<html>
<head>
<title>Process Thinking</title>
<?php include("topreferences.php"); ?>
</head>
<body id="top">
<?php include("topmenu.php"); ?>
<div class="wrapper row0 bgded" id="sliderHome" style="background-image:url('images/process1.jpg'); background-repeat: no-repeat; background-size: 100% 100%; height:480px; width: 1263px">
  <div id="pageintro" class="hoc clear" style="height:480px; width: 1263px"> 
    <div class="flexslider basicslider">
      <ul class="slides" style="color: black">
        <li>
          <article >
            <p>Consultoria</p>
            <h3 class="heading">Sabemos como melhorar seus processos.</h3>
            <footer>
              <ul class="nospace inline pushright">
                <li><a class="btn inverse" href="#">Saber Mais</a></li>
              </ul>
            </footer>
          </article>
        </li>
        <li>
          <article>
            <p>Cards Kit</p>
            <h3 class="heading">Cards que auxiliam o repensar do processo.</h3>
            <footer>
              <ul class="nospace inline pushright">
                <li><a class="btn inverse" href="#">Saber Mais</a></li>
              </ul>
            </footer>
          </article>
        </li>
        <li>
          <article>
            <p>Workshop</p>
            <h3 class="heading">Dinâmica de discussão dos principais processos.</h3>
            <footer>
              <ul class="nospace inline pushright">
                <li><a class="btn inverse" href="#">Saber Mais</a></li>
              </ul>
            </footer>
          </article>
        </li>
      </ul>
    </div>
  </div>
</div>
<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
	<div class="center btmspace-50">
      <h3 class="font-x2 nospace">Áreas</h3>
    </div>
    <ul class="nospace group center">
      <li class="one_third first btmspace-30">
        <article class="block inspace-30 borderedbox" onclick="#" style="cursor:pointer">
			<a href="#"><i class="btmspace-15 fa fa-4x fa-bar-chart"></i></a>
			<h6 class="font-x1">Processos de Gestão</h6>
			<p class="nospace">Tem como objetivo a organização, gerenciamento e manutenção da gestão empresarial.</p>
        </article>
      </li>
      <li class="one_third btmspace-30">
        <article class="block inspace-30 borderedbox" onclick="#" style="cursor:pointer">
			<a href="#"><i class="btmspace-15 fa fa-4x fa-server"></i></a>
			<h6 class="font-x1">Processos de Negócio</h6>
			<p class="nospace">Tem como principal objetivo definir os processos que regem uma companhia.</p>
        </article>
      </li>
      <li class="one_third btmspace-30">
        <article class="block inspace-30 borderedbox" onclick="#" style="cursor:pointer">
			<a href="#"><i class="btmspace-15 fa fa-4x fa-life-ring"></i></a>
			<h6 class="font-x1">Processos de Apoio</h6>
			<p class="nospace">Tem como objetivo definir os processos de áreas de apoio ao negócio da empresa.</p>
        </article>
      </li>
    </ul>
    <div class="clear"></div>
  </main>
</div>
<div class="wrapper coloured">
  <div class="hoc container clear"> 
	<div class="center btmspace-50">
      <h3>Processos mais comprados</h3>
    </div>
    <ul class="nospace group center">
      <li class="one_third first">
        <article><a href="#"><i class="btmspace-15 fa fa-4x fa-bar-chart"></i></a>
          <h5>Estratégia</h5>
          <p class="nospace"></p>
        </article>
      </li>
      <li class="one_third">
        <article><a href="#"><i class="btmspace-15 fa fa-4x fa-bar-chart"></i></a>
          <h5>Gestão da Inovação</h6>
          <p class="nospace"></p>
        </article>
      </li>
      <li class="one_third">
        <article><a href="#"><i class="btmspace-15 fa fa-4x fa-life-ring"></i></a>
          <h5>Marketing</h5>
          <p class="nospace"></p>
        </article>
      </li>
    </ul>
  </div>
</div>
<div class="wrapper row3">
  <section class="hoc container clear"> 
    <div class="center btmspace-50">
      <h3>Comentários</h3>
    </div>
    <div class="group">
      <article class="col-xs-4">
		<time datetime="2045-04-06"><i class="fa fa-calendar"></i> 6 de Abril 2045</time>
		<div class="panel panel-default">
		  <div class="panel-heading">
			<h3 class="panel-title">Ricardo Lannister</h3>
		  </div>
		  <div class="panel-body">
			Recomendo o uso do processo de Marketing do Processo de Apoio, me ajudou bastante...
		  </div>
		</div>
      </article>
      <article class="col-xs-4">
		<time datetime="2045-04-06"><i class="fa fa-calendar"></i> 6 de Abril 2045</time>
		<div class="panel panel-default">
		  <div class="panel-heading">
			<h3 class="panel-title">Ricardo Lannister</h3>
		  </div>
		  <div class="panel-body">
			Recomendo o uso do processo de Marketing do Processo de Apoio, me ajudou bastante...
		  </div>
		</div>
      </article>
      <article class="col-xs-4">
		<time datetime="2045-04-06"><i class="fa fa-calendar"></i> 6 de Abril 2045</time>
		<div class="panel panel-default">
		  <div class="panel-heading">
			<h3 class="panel-title">Ricardo Lannister</h3>
		  </div>
		  <div class="panel-body">
			Recomendo o uso do processo de Marketing do Processo de Apoio, me ajudou bastante...
		  </div>
		</div>
      </article>
    </div>
  </section>
</div>
<?php include("footer.php"); ?>
<?php include("references.php"); ?>
</body>
</html>
