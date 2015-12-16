import ru.yandex.qatools.allure.annotations.Description
import ru.yandex.qatools.allure.annotations.Features
import spock.lang.Specification

@Description("console output test")
@Features("Console output")
class OutputSpec extends Specification {

    def 'println'(){
        println "println not visible in report"

        expect: true
    }

    def 'system err println'(){
        System.err.println "System.err.println not visible in report"

        expect: true
    }

}
