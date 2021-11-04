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
        PetRaccoon sonya = new PetRaccoon();
        boolean hungry = true;
        sonya.name = "Софья Изюмовна";
        sonya.friendliness = 0;
        sonya.nut = 1000;
        int reserve = 0;

        if (hungry) {
            for (int i = 1; i < 100; i++) {
                sonya.nutBalance = i;
                reserve = sonya.nut - i;
                sonya.friendliness = sonya.friendliness + 1;
            }
            {
                System.out.println(sonya.name + " выдано " + sonya.nutBalance);
                System.out.println("ВНИМАНИЕ!!!! " + "У " + sonya.name + " " + "остался запас орешков" + " = " + reserve);
                sonya.sayFullness();
            }
        } else {
            System.out.println(sonya.name + " " + "не голодна");
        }
        if (sonya.friendliness >= 1000) {
            System.out.println(sonya.name + " хочет играть!");
        }
        else {
            System.out.println(sonya.name + " хочет есть!");
        }
    }
}
