
 window.onload=function(){
	 var chart = echarts.init(document.getElementById('map'));
	 chart.setOption({
	     series: [{
	         type: 'map',
	         map: 'china'
	     }]
	 });
	 
	//var myChart = echarts.init(chart);//;echarts.init(document.getElementById('map'),1,1);
	 chart.showLoading();
	console.log('画图');
	$.jsonp({
		  "url": 'http://echarts.baidu.com/gallery/data/asset/data/weibo.json?id=1&callbackparam=jsonpCallback',
		  
		  "success": function(data) {
		    alert(data);
		  },
		  "error": function(d,msg) {
			  console.log(d);
		    //alert(d+msg);
		  }
		});
	
	
	
	
	
	
	
	
	
	
	
	
	
   /*$.get('http://echarts.baidu.com/gallery/data/asset/data/weibo.json', 
	     'JSON', */
	     $.ajax({ 
	         url:"http://echarts.baidu.com/gallery/data/asset/data/weibo.json", 
	         type:'GET', 
	         //contentType:'application/json',
	         data:{},
	         dataType:'JSONP',  // 处理Ajax跨域问题
	         jsonp: "callbackparam",
	         jsonpCallback:"callBack",
		 success:function (weiboData){
			 alert(weiboData);
	 chart.hideLoading();

    weiboData = weiboData.map(function (serieData, idx) {
    	alert("add");
        var px = serieData[0] / 1000;
        var py = serieData[1] / 1000;
        var res = [[px, py]];

        for (var i = 2; i < serieData.length; i += 2) {
            var dx = serieData[i] / 1000;
            var dy = serieData[i + 1] / 1000;
            var x = px + dx;
            var y = py + dy;
            res.push([x.toFixed(2), y.toFixed(2), 1]);
            px = x;
            py = y;
        }
        return res;
    });
    console.log(weiboData);
    chart.setOption(option = {
        backgroundColor: '#404a59',
        title : {
            text: '微博签到数据点亮中国',
            subtext: 'From ThinkGIS',
            sublink: 'http://www.thinkgis.cn/public/sina',
            left: 'center',
            top: 'top',
            textStyle: {
                color: '#fff'
            }
        },
        tooltip: {},
        legend: {
            left: 'left',
            data: ['强', '中', '弱'],
            textStyle: {
                color: '#ccc'
            }
        },
        geo: {
            name: '强',
            type: 'scatter',
            map: 'china',
            label: {
                emphasis: {
                    show: false
                }
            },
            itemStyle: {
                normal: {
                    areaColor: '#323c48',
                    borderColor: '#111'
                },
                emphasis: {
                    areaColor: '#2a333d'
                }
            }
        },
        series: [{
            name: '弱',
            type: 'scatter',
            coordinateSystem: 'geo',
            symbolSize: 1,
            large: true,
            itemStyle: {
                normal: {
                    shadowBlur: 2,
                    shadowColor: 'rgba(37, 140, 249, 0.8)',
                    color: 'rgba(37, 140, 249, 0.8)'
                }
            },
            data: weiboData[0]
        }, {
            name: '中',
            type: 'scatter',
            coordinateSystem: 'geo',
            symbolSize: 1,
            large: true,
            itemStyle: {
                normal: {
                    shadowBlur: 2,
                    shadowColor: 'rgba(14, 241, 242, 0.8)',
                    color: 'rgba(14, 241, 242, 0.8)'
                }
            },
            data: weiboData[1]
        }, {
            name: '强',
            type: 'scatter',
            coordinateSystem: 'geo',
            symbolSize: 1,
            large: true,
            itemStyle: {
                normal: {
                    shadowBlur: 2,
                    shadowColor: 'rgba(255, 255, 255, 0.8)',
                    color: 'rgba(255, 255, 255, 0.8)'
                }
            },
            data: weiboData[2]
        }]
    });
},error:function(XMLHttpRequest, textStatus, errorThrown){console.log(XMLHttpRequest);console.log(textStatus);console.log(errorThrown);}}
	     
);
};



function callBack(data){
	alert(data);
}