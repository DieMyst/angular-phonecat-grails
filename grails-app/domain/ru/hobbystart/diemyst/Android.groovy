package ru.hobbystart.diemyst

class Android {

    String os
    String ui

    static belongsTo = [PhoneDetail]

    static constraints = {
        ui  nullable : true
    }
}
