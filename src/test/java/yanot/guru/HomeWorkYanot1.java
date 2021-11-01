package yanot.guru;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkYanot1 {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {
        // Заполнение формы
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Yana");
        $("[id=lastName]").setValue("Fedorenko");
        $("#userEmail").setValue("yanot@mail.ru");
        $(byText("Female")).click();
        $("#userNumber").setValue("9034394455");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1986");
        $(".react-datepicker__month-select").selectOptionByValue("3");
        $$(".react-datepicker__day").find(text("16")).click();
        $("#subjectsInput").click();
        $("#subjectsInput").setValue("b");
        $(byText("Biology")).click();
        $("#subjectsInput").setValue("h");
        $(byText("Hindi")).click();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("scale_1200.jpg");
        $("#currentAddress").setValue("address");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").pressEnter();

        // Валидация
        $(".table-responsive")
                .shouldHave(text("Yana Fedorenko"),
                        text("yanot@mail.ru"),
                        text("Female"),
                        text("9034394455"),
                        text("16 April,1986"),
                        text("Biology, Hindi"),
                        text("Music"),
                        text("scale_1200.jpg"),
                        text("address"),
                        text("NCR Delhi"));
        //$("#closeLargeModal").click();
    }
}
