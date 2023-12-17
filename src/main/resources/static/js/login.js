// 테스트용 이벤트
document.addEventListener('DOMContentLoaded', function() {
    var titleElement = document.getElementById('title');
    var btnElement = document.getElementById('btn');

    btnElement.addEventListener('click', function() {
        titleElement.textContent = 'Hi, Ahn. Welcome to Hell.';
    });
});