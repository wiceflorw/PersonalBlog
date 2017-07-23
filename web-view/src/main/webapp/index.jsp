<%--
  Created by IntelliJ IDEA.
  User: BF
  Date: 2017/7/11
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PerisonalBlog</title>
    <link href="css/index.css" rel="stylesheet">
    <script type="text/javascript" src="js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
</head>
<body>
<div class="all">
    <%-- 上 --%>
    <div class="top">
        <div>
            <p style="color: white;margin-left: 95%;margin-bottom: 0">关于本站</p>
            <hr width="6%" style="float: right;border: 0;border-bottom: 1px solid #fff;">
        </div>
    </div>
    <%-- 中 --%>
    <div class="center">
        <div class="left" style="margin-top: 9%;margin-left: 28%">
            <div>
                <div class="svg-wrapper" style="margin-left: 50%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>Java</a>
                        </div>
                    </svg>
                </div>
            </div>
            <%-- 这里可以换成利用margin-top控制 --%>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: 35%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>C++</a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: 20%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>PHP</a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: 20%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>Python</a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: 35%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span> C </a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: 50%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>JavaScript</a>
                        </div>
                    </svg>
                </div>
            </div>
        </div>

        <%-- 旋转的图片--%>
        <div class="tim left">
            <img src="images/sb.jpg" id="rotate"/>
        </div>

        <div class="left" style="margin-top: 9%;margin-left: 9%">
            <div>
                <div class="svg-wrapper" style="margin-left: -50%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>随笔</a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: -35%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>照片</a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: -20%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>日记</a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: -20%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>空的</a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: -35%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>空的</a>
                        </div>
                    </svg>
                </div>
            </div>
            <br><br>
            <div>
                <div class="svg-wrapper" style="margin-left: -50%">
                    <svg height="40" width="150">
                        <rect id="shape" height="40" width="150"/>
                        <div class="text">
                            <a href="#"><span class="spot"></span>留言</a>
                        </div>
                    </svg>
                </div>
            </div>
        </div>
    </div>
    <%-- 下 --%>
    <div class="bottom" style="clear: both">
        <div style="">
            <%--<hr width="50%">--%>
        </div>
    </div>
</div>
</body>
</html>
