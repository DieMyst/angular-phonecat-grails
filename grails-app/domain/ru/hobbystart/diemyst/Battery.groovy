package ru.hobbystart.diemyst

class Battery {

    String standByTime
    String talkTime
    String type

    static belongsTo = [PhoneDetail]

    static constraints = {
        standByTime  nullable : true
        talkTime  nullable : true
    }
}
