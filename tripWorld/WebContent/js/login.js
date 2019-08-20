$(document).ready(function(){
	function setuser(){
		if(m.num==0){
			$("#username").val(u.username);
		}else if(m.num==1){
			$("#username").val(u.username);
			$("#password").val(u.password);
		}
		alert(m.msg);
	}
	loginsub = function(){
		var n = $("#username").val();
		var pwd = $("#password").val();
		if(n==""||pwd==""){
			alert("有信息未输入");
			return false;
		}else if(pwd.length<6){
			alert("密码小于六位");
			return false;
		}
		return true;
	}
	if(ms!=""){
		setuser();
	}
});