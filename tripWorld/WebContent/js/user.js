$(document).ready(function(){
var user = $("#mymation");
var ul = $("#mymation2");
var li = $("#myli");
if(bigu==null||bigu==""){
	user.html("登录");
	user.attr("href","login");
	ul.css("display","none");
	li.removeClass("has-dropdown");
	ul.removeClass("dropdown");
	console.log("111111111111");
}else{
	user.html("我");
	user.attr("href","javascript:void(0)");
	console.log("22222222222");
	ul.css("display","");
	li.addClass("has-dropdown");
	ul.addClass("dropdown");
}
});