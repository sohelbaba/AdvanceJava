<?php require 'header.php'; 
$conn = mysqli_connect('localhost','root','','e-commerce');
if(isset($_REQUEST['submit']))
{

    $pnm=$_REQUEST['pname'];
    $pcat=$_REQUEST['pcate'];
    $pdesc=$_REQUEST['pdesc'];
    $pprice=$_REQUEST['pprice'];
   
    $file=$_FILES['pimg'];
    $name1=$file['name'];
    $type=$file['type'];
    $size=$file['size'];
    $temppath=$file['tmp_name'];
    move_uploaded_file($temppath,'upload/'.$name1);
    print $sd="insert into tbl_productmaster(pname,pdesc,price,category,image)
    values('$pnm','$pdesc','$pprice','$pcat','$name1')";
    $sd1=mysqli_query($conn,$sd);
    if($sd1){
        echo "<script>alert('Add Product Successfully');</script>";
    }
    else{
        echo "<script>alert('Error :: 101 Add Product');</script>";
    }
}
?>
<div class="container" style="margin-top: 40px">
    <div class="card" style="padding:40px">
      <h1>ADD PRODUCT</h1> <hr>
      <form action="#" method="POST" enctype="multipart/form-data">
          <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <span>PRODUCT NAME</span>
                    <input type="text" name="pname" class="form-control">
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <span>PRODUCT PRICE</span>
                    <input type="text" name="pprice" class="form-control ">
                </div>
            </div>
          </div>
          <div class="row">
              <div class="col-md-4">
                  <div class="form-group">
                      <span>PRODUCT DESC</span>
                      <input type="text" name="pdesc" class="form-control ">
                  </div>
              </div>
              <div class="col-md-4">
                  <div class="form-group">
                      <span>PRODUCT CATEGORY</span>
                      <input type="text" name="pcate" class="form-control ">
                  </div>
              </div>
            </div>
            <div class="row">
              <div class="col-md-4">
                  <div class="form-group">
                      <span>PRODUCT UPLOAD DATE</span>
                      <input type="text" name="date" class="form-control" value="<?php echo date("jS F Y ");?>" disabled>
                  </div>
              </div>
              <div class="col-md-4">
                  <div class="form-group">
                      <span>PRODUCT IMAGE</span>
                      <input type="file" name="pimg" class="form-control ">
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