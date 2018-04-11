<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <meta charset="utf-8" />
    <title>登录页面</title>
    <!-- basic styles -->

    <link href="boss/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="boss/css/font-awesome.min.css" />

    <!--[if IE 7]>
    <link rel="stylesheet" href="boss/css/font-awesome-ie7.min.css" />
    <![endif]-->
    <link rel="stylesheet" href="boss/css/ace.min.css" />
    <link rel="stylesheet" href="boss/css/ace-rtl.min.css" />
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="boss/css/ace-ie.min.css" />
    <![endif]-->
    <!--[if lt IE 9]>
    <script src="boss/js/html5shiv.js"></script>
    <script src="boss/js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="login-layout">
<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="center">
                        <h1>
                            <i class="icon-leaf green"></i> <span class="red">Neusoft</span>
                            <span class="white">Shopping</span>
                        </h1>
                        <h4 class="blue">&copy; java1班</h4>
                    </div>

                    <div class="space-6"></div>

                    <div class="position-relative">
                        <div id="login-box"
                             class="login-box visible widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header blue lighter bigger">
                                        <i class="icon-coffee green"></i> 请输入您的信息
                                    </h4>

                                    <div class="space-6"></div>

                                    <form action="/customer/login" method="post" id="loginForm">
                                        <fieldset>
                                            <label class="block clearfix"> <span class="block input-icon input-icon-right">
                                                <input  type="text" class="form-control" name="customerName"
                                                    placeholder="请输入用户名" /> <i class="icon-user"></i> </span> </label> <label
                                                class="block clearfix"> <span
                                                class="block input-icon input-icon-right"> <input
                                                type="password" class="form-control" name="customerPwd"
                                                placeholder="请输入密码" /> <i class="icon-lock"></i> </span> </label>

                                            <div class="space"></div>

                                            <div class="clearfix">
                                                <label class="inline"> <input type="checkbox"
                                                                              class="ace" /> <span class="lbl"> 记住我</span> </label>

                                                <button type="submit"
                                                        class="width-35 pull-right btn btn-sm btn-primary">
                                                    <i class="icon-key"></i> 登录
                                                </button>
                                            </div>

                                            <div class="space-4"></div>
                                        </fieldset>
                                    </form>

                                    <div class="social-or-login center">
                                        <span class="bigger-110">其他方式登录</span>
                                    </div>

                                    <div class="social-login center">
                                        <a class="btn btn-primary"> <i class="icon-facebook"></i>
                                        </a> <a class="btn btn-info"> <i class="icon-twitter"></i> </a> <a
                                            class="btn btn-danger"> <i class="icon-google-plus"></i>
                                    </a>
                                    </div>
                                </div>
                                <!-- /widget-main -->

                                <div class="toolbar clearfix">
                                    <div>
                                        <a href="#" onclick="show_box('forgot-box'); return false;"
                                           class="forgot-password-link"> <i class="icon-arrow-left"></i>
                                            忘记密码 </a>
                                    </div>

                                    <div>
                                        <a href="#" onclick="show_box('signup-box'); return false;"
                                           class="user-signup-link"> 我要注册 <i
                                                class="icon-arrow-right"></i> </a>
                                    </div>
                                </div>
                            </div>
                            <!-- /widget-body -->
                        </div>
                        <!-- /login-box -->

                        <div id="forgot-box" class="forgot-box widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header red lighter bigger">
                                        <i class="icon-key"></i> Retrieve Password
                                    </h4>

                                    <div class="space-6"></div>
                                    <p>Enter your email and to receive instructions</p>

                                    <form>
                                        <fieldset>
                                            <label class="block clearfix"> <span
                                                    class="block input-icon input-icon-right"> <input
                                                    type="email" class="form-control" placeholder="Email" />
														<i class="icon-envelope"></i> </span> </label>

                                            <div class="clearfix">
                                                <button type="button"
                                                        class="width-35 pull-right btn btn-sm btn-danger">
                                                    <i class="icon-lightbulb"></i> Send Me!
                                                </button>
                                            </div>
                                        </fieldset>
                                    </form>
                                </div>
                                <!-- /widget-main -->

                                <div class="toolbar center">
                                    <a href="#" onclick="show_box('login-box'); return false;"
                                       class="back-to-login-link"> Back to login <i
                                            class="icon-arrow-right"></i> </a>
                                </div>
                            </div>
                            <!-- /widget-body -->
                        </div>
                        <!-- /forgot-box -->

                        <div id="signup-box" class="signup-box widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header green lighter bigger">
                                        <i class="icon-group blue"></i> 新用户注册
                                    </h4>

                                    <div class="space-6"></div>
                                    <p>请输入你的详细信息:</p>

                                    <form id="registerForm" action="user/add1.do">
                                        <fieldset>
                                            <label class="block clearfix"> <span
                                                    class="block input-icon input-icon-right"> <input
                                                    type="text" class="form-control" name="username"
                                                    placeholder="请输入用户名" /> <i class="icon-user"></i> </span> </label> <label
                                                class="block clearfix"> <span
                                                class="block input-icon input-icon-right"> <input
                                                type="password" class="form-control passwd"
                                                placeholder="请输入密码" name="password" /> <i class="icon-lock"></i>
												</span> </label> <label class="block clearfix"> <span
                                                class="block input-icon input-icon-right"> <input
                                                type="password" class="form-control" placeholder="请确认密码"
                                                name="confirm_password" /> <i class="icon-retweet"></i> </span>
                                        </label> <label class="block clearfix"> <span
                                                class="block input-icon input-icon-right"> <input
                                                type="text" class="form-control" name="tel"
                                                placeholder="请输入手机号码" /> <i class="icon-user"></i> </span> </label> <label
                                                class="block"> <input type="checkbox" class="ace" />
                                            <span class="lbl"> 我同意 <a href="#">用户协议</a> </span> </label>

                                            <div class="space-24"></div>

                                            <div class="clearfix">
                                                <button type="reset" class="width-30 pull-left btn btn-sm">
                                                    <i class="icon-refresh"></i> 重置
                                                </button>

                                                <button type="submit"
                                                        class="width-65 pull-right btn btn-sm btn-success">
                                                    注册 <i class="icon-arrow-right icon-on-right"></i>
                                                </button>
                                            </div>
                                        </fieldset>
                                    </form>
                                </div>

                                <div class="toolbar center">
                                    <a href="#" onclick="show_box('login-box'); return false;"
                                       class="back-to-login-link"> <i class="icon-arrow-left"></i>
                                        Back to login </a>
                                </div>
                            </div>
                            <!-- /widget-body -->
                        </div>
                        <!-- /signup-box -->
                    </div>
                    <!-- /position-relative -->
                </div>
            </div>
            <!-- /.col -->
        </div>
        <!-- /.row -->
    </div>
</div>
<!-- /.main-container -->

<!-- basic scripts -->

<!--[if !IE]> -->

<script src="boss/js/jquery.min.js"></script>
<script type="text/javascript" src="boss/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="boss/vaild-js/common.js"></script>
<!-- <![endif]-->

<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

<!--[if !IE]> -->

<script type="text/javascript">
    window.jQuery
    || document
        .write("<script src='boss/js/jquery-2.0.3.min.js'>"
            + "<"+"/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='boss/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<script type="text/javascript">
    if ("ontouchend" in document)
        document
            .write("<script src='boss/js/jquery.mobile.custom.min.js'>"
                + "<"+"/script>");
</script>

<!-- inline scripts related to this page -->

<script type="text/javascript">
    function show_box(id) {
        jQuery('.widget-box.visible').removeClass('visible');
        jQuery('#' + id).addClass('visible');
    }
</script>
</body>
</html>

