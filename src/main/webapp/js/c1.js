/**
 * Created by HX on 4/11/2018.
 */
/**
 * Created by HX on 4/11/2018.
 */
$(function () {


    $.ajax({
        type: "POST",
        url: "/api/certificatePush/certificateDetail",
        data: JSON.stringify(),
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            console.log(data)


            $.each(data.data, function (i, item) {
                $("#nav-search-input").append(
                    ["                                <td>item.certificateId</td>",
                        "                                <td>item.certificateTitle</td>",
                        "                                <td>item.certificateCoefficientId</td>",
                        "                                <td >ietm.certificateHotId</td>",
                        "                                <td class=\"hidden-480\">item.certificatePhoto</td>",
                        "                                <td class=\"hidden-480\">item.certificateCollogeId</td>",
                        "                                <td class=\"hidden-480\">item.certificateMajorId</td>",
                        "                                <td class=\"hidden-480\">item.certificateSearch</td>",
                        "                                <td >ietm.certificateStatue</td>",
                        "                                <td class=\"hidden-480\">item.createdTime</td>"].join("")
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