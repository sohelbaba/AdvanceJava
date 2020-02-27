<jsp:useBean id="userinfo" class="com.newfolder.product"/>
<jsp:setProperty property="*" name="userinfo"/>
You have enterted below details:<br> 
<jsp:getProperty property="pname" name="userinfo"/><br> 
<jsp:getProperty property="pprice" name="userinfo"/><br> 
<jsp:getProperty property="qun" name="userinfo" /><br>
<jsp:getProperty property="desc" name="userinfo" /><br>