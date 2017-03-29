var makebackgroundgreen = function () {
    document.body.style.background = "";
    document.body.style.background = "green";
};
var makebackgroundred = function () {
    document.body.style.background = "";
    document.body.style.background = "red";
};
var makebackgroundorange = function () {
    document.body.style.background = "";
    document.body.style.background = "orange";

};
var makebackgroundyellow = function () {
    document.body.style.background = "";
    document.body.style.background = "yellow";
};
$(document).ready(function () {
    //Deel 1
    //ok
    $('input[value="green"]').on('click', makebackgroundgreen);
    $('input[value="red"]').on('click', makebackgroundred);
    $('input[value="orange"]').on('click', makebackgroundorange);
    $('input[value="yellow"]').on('click', makebackgroundyellow);
});