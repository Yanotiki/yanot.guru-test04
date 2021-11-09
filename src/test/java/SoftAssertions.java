package yanot.guru;

import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertions {

    @Test
    void shouldFindSelenideOnGitHub() {
        // открыть страничку гитхаб
        open("https://github.com");

        // ввести в поле поиска selenide
        // нажать enter
        $("[name=q]")
                .setValue("selenide")
                .pressEnter();

        // перейти в раздел wiki
        // нажать enter
        $$(".menu-item")
                .get(8)
                .pressEnter();

        //проверить что в заголовке встречается wiki results
        $(By.partialLinkText("wiki results"));

        //убедится, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki_search_results")
                .shouldHave(text("SoftAssertions"));

        //открыть страницу SoftAssertions
        $(byText("SoftAssertions"))
                .pressEnter();

        //проверить что внутри есть пример кода для JUnit5
        $("#wiki-wrapper")
                .shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }
}
