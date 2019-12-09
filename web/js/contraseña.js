/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {

    $("#pass1").keyup(function () {
        var mayus = new RegExp("^(?=.*[A-Z])");
        var special = new RegExp("^(?=.*[!@#$&])");
        var numbers = new RegExp("^(?=.*[0-9])");
        var lower = new RegExp("^(?=.*[a-z])");
        var pass = $(".material-login-control").val();

        if (mayus.test(pass) && special.test(pass) && numbers.test(pass) && lower.test(pass)) {
            $("#seguridad").text("Segura").css("color", "green");
        } else {
            $("#seguridad").text("Insegura").css("color", "red");
        }
    });
});

$(document).ready(function () {

    $("#pass2").keyup(function () {


        var pass1 = $("#pass1").val();
        var pass2 = $("#pass2").val();

        if (pass1 == pass2) {
            $("#Error").text("Coinciden").css("color", "green")
        } else {
            $("#Error").text("NO coinciden").css("color", "red")
        }
    });

});