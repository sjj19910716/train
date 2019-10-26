$(document).ready(function () {
    $("#tijiao").click(function () {

        var subjectId = $("#subjectId").html();
        var scorePto = {};

        var answer1 = $("input[name='answer1']:checked").val();
        var answer2 = $("input[name='answer2']:checked").val();
        var answer3 = $("input[name='answer3']:checked").val();
        var answer4 = $("input[name='answer4']:checked").val();
        var answer5 = $("input[name='answer5']:checked").val();
        var answer6 = $("input[name='answer6']:checked").val();
        var answer7 = $("input[name='answer7']:checked").val();
        var answer8 = $("input[name='answer8']:checked").val();
        var answer9 = $("input[name='answer9']:checked").val();
        var answer10 = $("input[name='answer10']:checked").val();

        var answers = [answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10];

        function checkVal() {
            var t = 0;
            for (var i = 0; i < answers.length; i++) {
                if (answers[i] != null) {
                    t++;
                }
            }
            return t === 10 ? true : false;
        }

        if (!checkVal()) {
            alert("不允许漏题");
        } else {
            scorePto.subjectId = subjectId;
            scorePto.answers = answers;

            $.ajax({
                type: "post",
                url: "../user/submit.do",
                data: JSON.stringify(scorePto),
                dataType: "json",
                contentType: "application/json",
                success: function (data) {
                    if (data.state == 0) {
                        alert(data.message);
                    } else if (data.state == 1) {
                        location = "../user/thanks.html";
                    }
                }


            });

        }

    });
})





