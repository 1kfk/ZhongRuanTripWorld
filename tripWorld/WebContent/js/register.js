$(document).ready(function(){
	function returnmsg(){
		$("#username").val(u.username);
		$("#password").val(u.password);
		$("#password2").val(u.password);
		$("#email").val(u.email);
		alert(m.msg);
	}
	registerSub = function(){
		var username = $("#username").val();
		var pwd1=$("#password").val();
		var pwd2=$("#password2").val();
		var email=$("#email").val();
		var mailReg = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/;
		if(username==""||email==null){
			alert("有内容输入为空");
			return false ;
		}else if(pwd1.indexOf(" ")!=-1||username.indexOf(" ")!=-1||email.indexOf(" ")!=-1){
			alert("输入非法空格");
			return false ;
		}
		else if(pwd1.length<6||pwd2.length<6){
			console.log(username);
			alert("密码长度小于六位");
			return false;
		}else if(pwd1!=pwd2){
			alert("两次输入密码不相等");
			return false
		}else if(!mailReg.test(email)){
			alert("邮箱格式错误")
			return false;
		}
		console.log("rrrrrrr");
		return true;
	}
	if(ms!="")
	returnmsg();
});