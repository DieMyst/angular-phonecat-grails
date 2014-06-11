package ru.hobbystart.diemyst

class Display {
    String screenResolution
    String screenSize
    String touchScreen

    static belongsTo = [PhoneDetail]

    static constraints = {
    }
}
