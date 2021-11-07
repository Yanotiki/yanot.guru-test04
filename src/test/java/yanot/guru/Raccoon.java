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

public class Raccoon {
    public static void main(String[] args) {
        PetAnimal racoon = new PetAnimal();
        PetAnimal hamster = new PetAnimal();
        PetAnimal squirrel = new PetAnimal();


        racoon.name = "Софья Изюмовна";
        racoon.nut = 1000;
        racoon.hungry = true;
        racoon.toy = "плюшевый медведь";

        hamster.name = "Апачи";
        hamster.nut = 57;
        hamster.hungry = false;
        hamster.toy = "мячик";

        squirrel.name = "Мария";
        squirrel.nut = 3;
        squirrel.hungry = true;
        squirrel.toy = "шарик";

        racoon.getHungry();
        racoon.getFriendliness();
        racoon.getPlay();

        hamster.getHungry();
        hamster.getFriendliness();
        hamster.getPlay();

        squirrel.getHungry();
        squirrel.getFriendliness();
        squirrel.getPlay();
    }
}
