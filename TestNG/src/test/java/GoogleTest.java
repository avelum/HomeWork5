import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GoogleTest extends ChromeRunner {
    @Test
    public void FirstAutoTest(){
        $(byName("q")).setValue("hodor").pressEnter();
    }
}
