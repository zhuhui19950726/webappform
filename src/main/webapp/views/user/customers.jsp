<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8" />
    <title>用户列表</title>
    <!-- basic styles -->
    <link href="<%=basePath %>boss/css/neusoft/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=basePath %>boss/css/neusoft/font-awesome.min.css" rel="stylesheet"  />


    <link rel="stylesheet" href="<%=basePath %>boss/css/neusoft/ace.min.css" />
    <link rel="stylesheet" href="<%=basePath %>boss/css/neusoft/ace-rtl.min.css" />
    <link rel="stylesheet" href="<%=basePath %>boss/css/neusoft/ace-skins.min.css" />

    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/boss/css/neusoft/ace-ie.min.css" />
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- ace settings handler -->

    <script src="<%=basePath %>boss/js/neusoft/ace-extra.min.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="/boss/js/neusoft/html5shiv.js"></script>
    <script src="/boss/js/neusoft/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="main-container" id="main-container">
    <script type="text/javascript">
        try {
            ace.settings.check('main-container', 'fixed')
        } catch (e) {
        }
    </script>

    <div class="main-container-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try {
                    ace.settings.check('breadcrumbs', 'fixed')
                } catch (e) {
                }
            </script>

            <ul class="breadcrumb">
                <li><i class="icon-home home-icon"></i> <a href="#">Home</a>
                </li>

                <li><a href="#">Tables</a>
                </li>
                <li class="active">Simple &amp; Dynamic</li>
            </ul>
            <!-- .breadcrumb -->


        </div>

        <div class="page-content">
            <div class="page-header">
                <h1>
                    Tables <small> <i class="icon-double-angle-right"></i>
                    Static &amp; Dynamic Tables </small> <a href="view/user/useradd.jsp"
                                                            style="float: right; margin-right: 30px;margin-top: -10px"><button
                        class="btn btn-app btn-danger btn-xs">
                    <i class="icon-plus bigger-160"></i> 增加
                </button> </a>
                </h1>

            </div>
            <!-- /.page-header -->

            <div class="row">
                <div class="col-xs-12">
                    <!-- PAGE CONTENT BEGINS -->

                    <div class="row">
                        <div class="col-xs-12">
                            <div class="table-responsive">
                                <table id="sample-table-2"
                                       class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>

                                        <th width="20%">姓名</th>
                                        <th width="20%">电话</th>
                                        <th width="20%">地址</th>
                                        <th class="hidden-480" width="20%">身份</th>
                                        <th width="20%">操作</th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${customerList }" var="item">
                                        <tr>
                                            <td><a href="#">${item.customerName }</a></td>
                                            <td>${item.mobile }</td>
                                            <td>${item.address }</td>
                                            <td class="hidden-480">
													<span class="label label-sm">
													<c:choose>
                                                        <c:when test="${item.customerIdentify=='普通管理员' }">label-danger </c:when>
                                                        <c:when test="${item.customerIdentify=='超级管理员' }">label-warning </c:when>
                                                        <c:when test="${item.customerIdentify=='游客' }">label-success </c:when>
                                                    </c:choose>${item.customerIdentify}
	                                                </span>
                                            </td>
                                            <td>
                                                <div class="visible-md visible-lg hidden-sm hidden-xs action-buttons">
                                                    <a class="blue" href="#"> <i class="icon-zoom-in bigger-130"></i></a>
                                                    <a class="green" href="#"> <i class="icon-pencil bigger-130"></i></a>
                                                    <a class="red" href="#"> <i class="icon-trash bigger-130"></i> </a>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div style="display: none">user/toModify.do?id=${item.id }/user/del.do?id=${item.id }</div>
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.page-content -->
    </div>
    <!-- /.main-content -->

</div>
<!-- /.main-container-inner -->

<!-- basic scripts -->

<!--[if !IE]> -->

<script src="<%=basePath %>boss/js/neusoft/jquery.min.js"></script>

<!-- <![endif]-->

<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

<!--[if !IE]> -->

<script type="text/javascript">
    window.jQuery
    || document
        .write("<script src='boss/js/neusoft/jquery-2.0.3.min.js'>"
            + "<"+"/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='boss/js/neusoft/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<script type="text/javascript">
    if ("ontouchend" in document)
        document
            .write("<script src='boss/js/neusoft/jquery.mobile.custom.min.js'>"
                + "<"+"/script>");
</script>
<script src="<%=basePath %>boss/js/neusoft/bootbox.min.js"></script>
<script src="<%=basePath %>boss/js/neusoft/typeahead-bs2.min.js"></script>

<!-- page specific plugin scripts -->

<script src="<%=basePath %>boss/js/neusoft/jquery.dataTables.min.js"></script>
<script src="<%=basePath %>boss/js/neusoft/jquery.dataTables.bootstrap.js"></script>

<!-- ace scripts -->

<script src="<%=basePath %>boss/js/neusoft/ace-elements.min.js"></script>
<script src="<%=basePath %>boss/js/neusoft/ace.min.js"></script>

<!-- inline scripts related to this page -->

<script type="text/javascript">
    jQuery(function($) {
        var oTable1 = $('#sample-table-2').dataTable({
            "aoColumns" : [ {
                "bSortable" : false
            }, null, null, null, {
                "bSortable" : false
            } ]
        });

        $('table th input:checkbox').on(
            'click',
            function() {
                var that = this;
                $(this).closest('table').find(
                    'tr > td:first-child input:checkbox').each(
                    function() {
                        this.checked = that.checked;
                        $(this).closest('tr').toggleClass(
                            'selected');
                    });

            });

        $('[data-rel="tooltip"]').tooltip({
            placement : tooltip_placement
        });
        function tooltip_placement(context, source) {
            var $source = $(source);
            var $parent = $source.closest('table')
            var off1 = $parent.offset();
            var w1 = $parent.width();

            var off2 = $source.offset();
            var w2 = $source.width();

            if (parseInt(off2.left) < parseInt(off1.left)
                + parseInt(w1 / 2))
                return 'right';
            return 'left';
        }
    })
</script>
</body>
</html>

