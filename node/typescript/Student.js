"use strict";
exports.__esModule = true;
var Student = /** @class */ (function () {
    function Student(firstname, lastname, cgpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cgpa = cgpa;
    }
    Object.defineProperty(Student.prototype, "details", {
        get: function () {
            return "name is " + this.firstname + "\n        surname is " + this.lastname + "\n        pointer is " + this.cgpa;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
