

$(document).ready(function () {
    $('#anninfo_code').change(function () {
        var selectedValue = $(this).val();
        $.ajax({
            type: "GET",
            url: "/getAnnualTime",
            data: { anninfo_code: selectedValue },
            success: function (data) {
                // 서버에서 받은 데이터로 연차 수량 input의 값을 업데이트합니다.
                $('#annual_time').val(data.annualTime);
            },
            error: function (xhr, status, error) {
                console.error("Error: " + error);
            }
        });
    });
})