import ru.yandex.qatools.allure.annotations.Features
import spock.lang.Specification
import spock.lang.Unroll

class MethodNamesSpec extends Specification {

    def ''() {
        expect: true
    }

    def 'very very long name for method 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 12345 end.'() {
        expect: true
    }

    def '''multiline
method
name
with
line
breaks
'''() {
        expect: true
    }

    def '''
           multiline method name
                 with indents
                    '''() {
        expect: true
    }

    @Unroll
    @Features('Multiline unroll')
    def '''
        multiline with @Unroll
        number #number
    '''() {
        expect:
        number == expectedNumber
        where:
        number << [1, 2, 3, 4]
        expectedNumber << [1, 2, 3, 4]
    }

}
