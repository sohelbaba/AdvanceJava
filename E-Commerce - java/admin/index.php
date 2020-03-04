<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>[HUB - MART | ADMIN]</title>

  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <!-- jQuery library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!-- Popper JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script> 
  <!-- Latest compiled JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" >
  <!-- Internal css & javascript -->
  <link rel="stylesheet" type="text/css" href="css/default.css">
  <script src="js/default.js"></script>

</head>

<body>
    
  <?php
   session_start();
   require '../classes/Admin.php'; 
   $res = 1;
   if(isset($_POST['submit'])){

        $unm = $_POST['unm'];
        $ps = $_POST['ps'];
        $admin = new Admin();
        $res = $admin->checkAuth($unm,$ps);
        if($res){
            $_SESSION['unm'] = $unm;
        }
    }
  ?>

  <div class="container" style="margin-top: 100px">
    <div class="card" style="padding:40px">
      <h1>ADMIN LOGIN</h1> <hr>
      <form action="#" method="POST">
          <div class="row">
            <div class="col-md-4">

                <div class="form-group">
                    <span>USERNAME</span>
                    <input type="text" name="unm" class="form-control ">
                </div>
            </div>
          </div>
          <div class="row">
              <div class="col-md-4">
                  <div class="form-group">
                      <span>PASSWORD</span>
                      <input type="password" name="ps" class="form-control ">
                  </div>
              </div>
            </div>
          <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <input type="submit"class="btn btn-primary  btn-block" name="submit">
                </div>
            </div>
          </div>
      </form>
    </div>
  </div>
    

</body>

</html>
