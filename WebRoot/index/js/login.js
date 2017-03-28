//处理登录信息

$('#userId').blur(function(){
	var username = $('#userId').val();	
	if(username==''){
		$('#showMsg').html('用户名不能为空！');
	}else{
		var data = {'userId':username};
		var url = '/testTwo/verify.do';
		$.post(url,data,function(result){
			$('#showMsg').val('密码错误');
		});
	}
});