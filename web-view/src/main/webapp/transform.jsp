<%--
  Created by IntelliJ IDEA.
  User: BF
  Date: 2017/7/13
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="gb2312" />
    <title>css 3 transform rotate</title>
    <style>
        a img{ border:none}
    </style>
    <script type="text/javascript" src="js/jquery-3.1.1.js"></script>
</head>

<body>
<div id="rotate" style=" cursor:pointer; position:absolute; left:100px; top:100px">

    <img src="images/sb.jpg" <%--id="rotate"--%>/>

    <%--<img src="http://www.assoc-amazon.cn/e/ir?t=buyed-23&l=as2&o=28&a=B006GYJ5LY"--%>
         <%--width="1" height="1" border="0" alt="" style="border:none !important; margin:0px !important;" />--%>

</div>
<%--<script>
    (function(){
        /* 整个div一起旋转 */
        var element = document.getElementById("rotate");
        var r = 0;
        var i = 1;
        function rotate(){
            r += i;
            if( Math.abs(r) >= 360 )
            {
                r=0;
            }
            element.style.MozTransform = "rotate(" + r + "deg)";    /* Firefox */
            element.style.webkitTransform ="rotate(" + r + "deg)";  /* Safari and Chrome */
            element.style.msTransform = "rotate(" + r + "deg)";     /* IE 9 */
            element.style.OTransform = "rotate(" + r + "deg)";      /* Opera */
            element.style.transform = "rotate(" + r + "deg)";
        }

        var timer = setInterval(rotate,50);

        /* 鼠标放置图片上触发此函数 */
        element.onmouseover = function(){
            clearInterval(timer);
            timer = null;
        };
        /* 鼠标移开图片触发此函数 */
        element.onmouseout = function(){
            if (timer)
                return;
            timer = setInterval(rotate,30);
        };
    }());
</script>--%>
</body>
<script type="text/javascript">
    $(document).ready(function () {
        /* 整个div一起旋转 */
        var element = document.getElementById("rotate");
        var r = 0;
        var i = 1;
        function rotate(){
            r += i;
            if( Math.abs(r) >= 360 )
            {
                r=0;
            }
            element.style.MozTransform = "rotate(" + r + "deg)";    /* Firefox */
            element.style.webkitTransform ="rotate(" + r + "deg)";  /* Safari and Chrome */
            element.style.msTransform = "rotate(" + r + "deg)";     /* IE 9 */
            element.style.OTransform = "rotate(" + r + "deg)";      /* Opera */
            element.style.transform = "rotate(" + r + "deg)";
        }

        var timer = setInterval(rotate,50);

        /* 鼠标放置图片上触发此函数 */
        element.onmouseover = function(){
            clearInterval(timer);
            timer = null;
        };
        /* 鼠标移开图片触发此函数 */
        element.onmouseout = function(){
            if (timer)
                return;
            timer = setInterval(rotate,30);
        };
    })
</script>
</html>

