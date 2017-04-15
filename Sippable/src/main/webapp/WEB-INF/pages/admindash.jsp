<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Dashboard</title>
    <!-- Bootstrap core CSS -->
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/adminstyle.css" rel ="stylesheet">
    
  </head>

  <body>

    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Admin Dasboard</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.html">Dashboard</a></li>
           </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome Admin!</a></li>
            <li><a href="login.html">Logout</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <!-- HEADER -->
    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
              <h1><span class = "glyphicon glyphicon-cog" aria-hidden="true"></span>Dashboard<small> Manage your website</small></h1>
          </div>
          <!-- <div class="col-md-2">
            <div class="dropdown options">
              <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                Admin Functions
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li><a href="#">Add a Beer</a></li>
                <li><a href="#">Make Employee</a></li>
                <li><a href="#">Ban User</a></li>
                </ul>
            </div>
            
          </div> -->
        </div>
      </div>

    </header>

    <!-- HEADER END -->

    <section id ="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li class="active"> Dashboard</li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <div class="list-group">
              <a href="#" class="list-group-item active main-color-bg">
                <span class = "glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
              <a type = "button" data-toggle = "modal" data-target ="#addBeer" class="list-group-item"><span class = "glyphicon glyphicon-plus" aria-hidden="true"></span> Add a Beer</a>
              <a href="#" class="list-group-item"><span class = "glyphicon glyphicon-usd" aria-hidden="true"></span> Hire Employee</a>
              <a href="#" class="list-group-item"><span class = "glyphicon glyphicon-erase" aria-hidden="true"></span> Ban User</a>
            </div>
          </div>
          <div class="col-md-9">
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Overview</h3>
              </div>
              <div class="panel-body">
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class = "glyphicon glyphicon-user" aria-hidden="true"></span>123123</h2>
                    <h4>Users</h4>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class = "glyphicon glyphicon-user" aria-hidden="true"></span>123123</h2>
                    <h4>Employees</h4>
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="well dash-box">
                    <h2><span class = "glyphicon glyphicon-tint" aria-hidden="true"></span>123123</h2>
                    <h4>Beers</h4>
                  </div>
                </div>
              </div>
            </div>
            
          </div>
        </div>
      </div>
    </section>

    <!-- Modals -->
    <div class="modal fade" id="addBeer" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form class="form-horizontal">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" id="myModalLabel">Add Beer</h4>
        </div>
        <div class="modal-body">

<!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="beername">Beer Name</label>  
              <div class="col-md-4">
              <input id="beername" name="beername" type="text" placeholder="Beer Name" class="form-control input-md"> 
              </div>
            </div>

            <!-- Select Basic -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="drinktype">Drink Type</label>
              <div class="col-md-4">
                <select id="drinktype" name="drinktype" class="form-control">
                  <option value="1">Ale</option>
                  <option value="2">IPA</option>
                  <option value="3">Lager</option>
                  <option value="4">Wheat</option>
                </select>
              </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="aroma">Aroma</label>  
              <div class="col-md-4">
              <input id="aroma" name="aroma" type="text" placeholder="Aroma" class="form-control input-md">
              </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="appearance">Appearance</label>  
              <div class="col-md-4">
              <input id="appearance" name="appearance" type="text" placeholder="Appearance" class="form-control input-md">  
              </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="color">Color</label>  
              <div class="col-md-4">
              <input id="color" name="color" type="text" placeholder="Color" class="form-control input-md"> 
              </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="brewer">Brewer</label>  
              <div class="col-md-4">
              <input id="brewer" name="brewer" type="text" placeholder="Brewer" class="form-control input-md"> 
              </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="alcoholcontent">Alcohol Content</label>  
              <div class="col-md-4">
              <input id="alcoholcontent" name="alcoholcontent" type="text" placeholder="Alcohol Content" class="form-control input-md"> 
              </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="ibu">IBU</label>  
              <div class="col-md-4">
              <input id="ibu" name="ibu" type="text" placeholder="IBU" class="form-control input-md"> 
              </div>
            </div>

            <!-- Select Basic -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="bevtype">Berverage Type</label>
              <div class="col-md-4">
                <select id="bevtype" name="bevtype" class="form-control">
                  <option value="1">Beer</option>
                </select>
              </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="imgsrc">Image Source</label>  
              <div class="col-md-4">
              <input id="textinput" name="imgsrc" type="imgsrc" placeholder="Image Source" class="form-control input-md">
              </div>
            </div>

            <!-- Textarea -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="description">Description</label>
              <div class="col-md-4">                  
                <textarea class="form-control" id="description" name="description"></textarea>
              </div>
            </div>          
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="submit" class="btn btn-primary main-color-bg">Add</button>
        <form>
      </div>
    </div>
  </div>
</div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
  </body>
</html>
