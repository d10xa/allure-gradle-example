import ru.yandex.qatools.allure.Allure
import ru.yandex.qatools.allure.annotations.Attachment
import ru.yandex.qatools.allure.annotations.Features
import ru.yandex.qatools.allure.events.MakeAttachmentEvent
import spock.lang.Specification

@Features("Attachments")
class AttachmentSpec extends Specification {

    private final static Allure ALLURE = Allure.LIFECYCLE;

    def 'execute method in spec with attachment NOT WORK'(){
        specAttachment()
        expect: true
    }

    def 'static method attachment NOT WORK'(){
        Attachments.staticAttachment()
        expect:true
    }

    def 'instance method attachment NOT WORK'(){
        new Attachments().attachment()
        expect:true
    }

    def 'WORKING EXAMPLE. manually fire attachment pointcut'(){
        ALLURE.fire(new MakeAttachmentEvent("ytrewq".getBytes("UTF-8"), "attachment title", "text"));
        expect:true
    }

    @Attachment
    String specAttachment(){
        return "hello"
    }

}
