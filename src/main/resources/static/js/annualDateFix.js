var today = new Date();

// 현재 날짜를 "YYYY-MM-DD" 형식의 문자열로 변환
var formattedDate = today.toISOString().split('T')[0];

// annual_startdate 요소에 min 속성을 설정
document.getElementById('annual_startdate').min = formattedDate;
document.getElementById('annual_startdate').addEventListener('change', function () {
    // 선택한 연도, 월, 일을 가져옴
    var selectedDate = new Date(this.value);

    // 선택한 날짜를 "YYYY-MM-DD" 형식의 문자열로 변환
    var selectedFormattedDate = selectedDate.toISOString().split('T')[0];

    // annual_enddate의 min 속성을 설정
    document.getElementById('annual_enddate').min = selectedFormattedDate;
});

