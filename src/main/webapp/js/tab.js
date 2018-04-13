/**
 * Created by HX on 4/9/2018.
 */







$(function () {


    $.ajax({
        type: "POST",
        url: "/api/verticalNav/colloge",
        data: JSON.stringify(),
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            console.log(data)


            $.each(data.data, function (i, item) {
                $("#nav-search-input").append(
                    ["                                     <td>item.id</td>",
                        "                                        <td>item.collegeName</td>",
                        "                                        <td >item.collegeStatus</td>",
                        "                                        <td class=\"hidden-480\">item.collegeSort</td>",
                        "                                        <td class=\"hidden-480\">item.creatTime</td>"].join("")
                )
                $.each(data.data.data, function (j, item) {
                    $(".content").append(
                        /* " <li  class=\"childs\"><a href=\"index2.js?majorName='+item.majorName++"&majorId="+item.majorId'>+item.majorName+</a></li>"*/
                    )
                });

            });


        }


    })
})