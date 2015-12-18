import groovy.transform.CompileStatic
import ru.yandex.qatools.allure.annotations.Attachment

@CompileStatic
class Attachments {

    @Attachment
    String attachment(){
        "instance method attachment"
    }

    @Attachment
    static String staticAttachment(){
        "static method attachment"
    }
}
