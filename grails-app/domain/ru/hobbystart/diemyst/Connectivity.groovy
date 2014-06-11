package ru.hobbystart.diemyst

class Connectivity {
    String bluetooth
    String cell
    String gps
    String infrared
    String wifi

    static belongsTo = [PhoneDetail]

    static constraints = {
        cell  nullable : true
    }
}
