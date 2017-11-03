<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>首页</title>
    <link href="/resources/form.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="/resources/jqueryui/1.8/themes/base/jquery.ui.all.css"/>
</head>
<body>
    <div id="simple">
        <h2>Simple</h2>
        <p>
            See the <code>org.springframework.samples.mvc.simple</code> package for the @Controller code
        </p>
        <ul>
            <li>
                <a id="simpleLink" class="textLink" href="/simple">GET /simple</a>
            </li>
            <li>
                <a id="simpleRevisited" class="textLink" href="/simple/revisited">GET /simple/revisited</a>
            </li>
        </ul>
    </div>
</body>
<script type="text/javascript" src="/resources/jquery/1.6/jquery.js"></script>
<script type="text/javascript" src="/resources/jqueryform/2.8/jquery.form.js"></script>
<script type="text/javascript" src="/resources/jqueryui/1.8/jquery.ui.core.js"></script>
<script type="text/javascript" src="/resources/json2.js"></script>
<script>
    MvcUtil={};
    MvcUtil.showSuccess=function (text,element){
        MvcUtil.showResponse("success",text,element);
    };
    MvcUtil.showError=function (text,element) {
        MvcUtil.showResponse("error",text,element);
    };
    MvcUtil.showResponse=function (type, text, element) {
        var responseElementId=element.attr("id")+"Response";
        var responseElement=$("#"+responseElementId);
        if(responseElement.length==0) {
            responseElement=$('<span id="'+responseElementId+'" class="'+type+'" style="display:none">'+text+'</span>').insertAfter(element);
        }else {
            responseElement.replaceWith('<span id="'+responseElementId+'" class="'+type+'" style="display:none">'+text+'</span>');
            responseElement=$("#"+responseElementId);
        }
        responseElement.fadeIn("slow");
    };
    $(function () {

    })
    $(document).ready(function() {
        $("a.textLink").click(function () {
            var link = $(this);
            $.ajax({
                url: link.attr("href"),
                dataType: "text",
                success: function (text) {
                    MvcUtil.showSuccess(text, link);
                },
                error: function (xhr) {
                    MvcUtil.showError(xhr.responseText, link);
                }
            });
            return false;
        })
    })
</script>
</html>
