package angular.phonecat.grails

import grails.converters.JSON
import ru.hobbystart.diemyst.Phone
import ru.hobbystart.diemyst.PhoneDetail

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
