package ru.hobbystart.diemyst

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured
import ru.hobbystart.diemyst.Phone
import ru.hobbystart.diemyst.PhoneDetail

@Secured('permitAll')
class PhonesController {

    def index() {
        def json = Phone.list() as JSON
        render json
    }

    def showPhone() {
        def json = PhoneDetail.findByPhoneId(params.phoneId) as JSON
        render json
    }
}
