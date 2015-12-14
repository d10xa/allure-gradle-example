import groovy.transform.Memoized
import ru.yandex.qatools.allure.annotations.Description
import ru.yandex.qatools.allure.annotations.Features
import ru.yandex.qatools.allure.annotations.Stories
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
@Description("class description")
class LibraryTest extends Specification {

    @Features("simple method")
    @Description("simple method description")
    @Stories(["story1","story2"])
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }

    @Unroll
    @Features("unroll method")
    def "fib #n = #expectedFib"() {
        when:
        int x = fib(n)

        then:
        expectedFib == x

        where:
        n || expectedFib
        0 || 0
        1 || 1
        2 || 1
        3 || 2
        4 || 3
        5 || 5
        6 || 8
        7 || 13
    }

    @Memoized
    int fib(int n) { n <= 1 ? n : fib(n - 1) + fib(n - 2) }

}
