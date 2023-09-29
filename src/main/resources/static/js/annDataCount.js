$(document).ready(function() {
    // 연차 신청 폼이 제출될 때
    $('form').on('submit', function(event) {
        event.preventDefault(); // 폼 제출을 막습니다.

        // emp_id에 해당하는 anndata_date 값을 가져옵니다. 여기서는 1로 하드 코딩되어 있습니다.
        var emp_id = 1; // 원하는 emp_id로 변경하세요.

        $.ajax({
            type: 'GET',
            url: '/getAnndataDate?emp_id=' + emp_id, // 실제 URL로 변경하세요.
            success: function(data) {
                var countdate = parseInt(data); // 가져온 데이터를 정수로 변환합니다.

                // anndata_date가 0이면 폼을 제출합니다.
                if (countdate != 0) {
                    $('form').off('submit'); // 폼 제출을 다시 활성화합니다.
                    $('form').submit(); // 폼을 제출합니다.
                } else {
                    alert('신청할 수 있는 연차가 없습니다.');
                }
            },
            error: function(xhr, status, error) {
                console.error('Error:', error);
            }
        });
    });
});