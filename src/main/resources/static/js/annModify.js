$(document).ready(function () {
    $('#annModify').submit(function (event) {
        // 이벤트 기본 동작을 막습니다.
        event.preventDefault();

        // 폼을 서버로 제출합니다.
        $.ajax({
            type: "POST",
            url: $(this).attr('action'),
            data: $(this).serialize(),
            success: function (data) {
                // 수정이 완료되었음을 알리는 알럿을 띄웁니다.
                alert("수정되었습니다.");

                // 리스트 폼 페이지로 이동합니다.
                window.location.href = "/anndata/1";
            },
            error: function (xhr, status, error) {
                alert("재시도해주세요.");
                console.error("Error: " + error);
            }
        });
    });
});
