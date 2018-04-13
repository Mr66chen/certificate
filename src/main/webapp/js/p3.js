/**
 * Created by HX on 4/11/2018.
 */
/**
 * Created by HX on 4/11/2018.
 */
$(function () {


    $.ajax({
        type: "POST",
        url: "/api/couselPhoto/certificatePhoto",
        data: JSON.stringify(),
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            console.log(data)


            $.each(data.data, function (i, item) {
                $("#nav-search-input").append(
                    ["   <td></td>",
                        "                                <td>iitem.id</td>",
                        "                                <td>item.photoCategoryId</td>",
                        "                                <td>item.photoHeight</td>",
                        "                                <td>item.photoWidth</td>",
                        "                                <td>item.photoTitle</td>",
                        "                                <td class=\"hidden-480\">item.photoHref</td> ",
                        "                                <td class=\"hidden-480\">item.photoAddr</td>",
                        "                                <td>item.photoSort</td>",
                        "                                <td class=\"hidden-480\">item.photoStatus</td>",

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