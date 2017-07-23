/**
 * Created by BF on 2017/7/17.
 */
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
function aa2() {
    alert("aaaa");
}