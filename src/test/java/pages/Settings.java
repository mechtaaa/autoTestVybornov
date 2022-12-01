package pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.open;

public class Settings {
    @BeforeTest
    public static void settings() {
        timeout = 10000;
        browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://ya.ru/");
    }
}