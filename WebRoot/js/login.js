//处理登录页面

$('#userId').blur(function(){
	var username = $('#userId').val();	
	if(username==''){
		$('#showMsg').html('用户名不能为空！');
		
	}else{
		var data = {'userId':username};
		var url = '/testTwo/verify.do';
		$.post(url,data,function(result){
			alert(11);
			$('#showMsg').val('111');
		});
	}
});