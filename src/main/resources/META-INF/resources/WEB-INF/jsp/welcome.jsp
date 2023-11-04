<html>
	<head>
		<title>Welcome Page</title>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
			
	</head>
	<body>
	
	<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">

	<div class="collapse navbar-collapse">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/my-todos">Todos</a></li>
		</ul>
	</div>
	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
	</ul>	
</nav>
		<div class="container">
			<h1>Welcome ${name}</h1>
			<a href="my-todos">Manage</a> your todos
		</div>
	</body>
</html>