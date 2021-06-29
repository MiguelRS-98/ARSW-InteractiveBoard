//@author Miguel Angel Rodriguez Siachoque
//@author Luis Daniel Benavides Navarro
let points = { pointsarr: [] };
let timerGet = setInterval(() => getPointsArr(), 1000);
//This function checks the points to be drawn.
function checkPoints ()
{
    fetch("/points", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(points)
    })
}
//This function gets the list of points.
function getPointsArr ()
{
    fetch("/points", {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        },
    })
        .then((res) => res.json())
        .then((result) => {points = { pointsarr: result.pointsarr };})
        .then(newDrawPoints());
}
//This function is responsible for generating the dashboard.
function setup () 
{
  createCanvas(700, 500);
}
let r = Math.floor(Math.random() * 255);
let g = Math.floor(Math.random() * 255);
let b = Math.floor(Math.random() * 255);
//This method is responsible for drawing the points.
function draw () 
{
    if (mouseIsPressed === true) {
        noStroke();
        fill(255, 255, 255);
        ellipse(mouseX, mouseY, 20, 20);
        points.pointsarr.push([r, g, b, mouseX, mouseY]);
    }
    if (mouseIsPressed === false) {
        fill(0, 0, 0);
    }
    checkPoints();
}
//This function draws the points of other users.
function newDrawPoints() 
{
    for (let i = 0; i < points.pointsarr.length; i++) {
        noStroke();
        fill(points.pointsarr[i][0], points.pointsarr[i][1],points.pointsarr[i][2]);
        ellipse(points.pointsarr[i][3], points.pointsarr[i][4], 20, 20);
    }
}