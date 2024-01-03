// 페이지 열릴 때 수행될 함수
window.onload = function() {

}

function movePage(url) {
	location.href = url;
}

document.addEventListener('DOMContentLoaded', function() {
	var signIn = document.getElementById('signIn');

	signIn.addEventListener('click', function() {
		var userId = document.getElementById('userId').value;
		var password = document.getElementById('password').value;
		var xhr = new XMLHttpRequest();
		var url = 'http://localhost:8080/select';

		xhr.open('POST', url, true);
		xhr.setRequestHeader('Content-Type', 'application/json');

		xhr.onreadystatechange = function() {
			if (xhr.readyState === 4) {
				if (xhr.status === 200) {
					// 성공적으로 응답을 받았을 때의 처리 (Success)
					// var responseData = JSON.parse(xhr.responseText);
					if (xhr.responseText != "") {
						movePage("/main");
					} else {
						alert("로그인에 실패하였습니다. 다시 시도해 주십시오.");
					}

					// 여기에 응답 데이터를 이용한 후속 처리를 작성하세요.
				} else {
					// 응답이 실패한 경우에 대한 처리
					console.error('조회 실패. 상태 코드:', xhr.status);
				}
			}
		};

		// Ajax 요청 전송
		var data = JSON.stringify({
			userId: userId,
			password: password
		});
		xhr.send(data);
	});
});

