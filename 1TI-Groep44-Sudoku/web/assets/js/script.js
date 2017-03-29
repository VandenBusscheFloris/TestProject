var changeBackground = function () {
    $("body").css('background-color', $(this).val());
};

$(document).ready(function () {
    $('input').on('click', changeBackground);
});