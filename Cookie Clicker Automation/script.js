
document.addEventListener('DOMContentLoaded', function() {

    const cookie = document.getElementById('cookie');
    const gameScore = document.getElementById('gameScore');


    let score = 0;

    // Add a click event listener to the cookie image
    cookie.addEventListener('click', function() {
        cookie.style.transform = 'scale(0.9)';
        setTimeout(() => {
            cookie.style.transform = 'scale(1)';
        }, 100); // Adjust the timeout duration (in milliseconds) for the scale animation

        score++;
        gameScore.textContent = `Score: ${score}`;
    });

});
