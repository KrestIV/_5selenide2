package tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FifthTaskTest {

    @Test
    void goToSelenideAITest(){
        open("https://github.com");
        $$("button").findBy(text("Solutions")).hover();
        $("a[href=\"https://github.com/enterprise\"]").click();
        $("div.Primer_Brand__Stack-module__Stack___tASKe").shouldHave(text("The AI-powered " +
        "developer platform"));
    }

    @Test
    void dragNDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("div#column-a").dragAndDrop(to($("div#column-b")));
        $("div#column-a").$(byText("B")).should(exist);
        $("div#column-b").$(byText("A")).should(exist);
    }
}
