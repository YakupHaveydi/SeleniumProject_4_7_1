package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementVeLocators {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");

        //search bolumunu locate edelim.
        WebElement aramakutusu = driver.findElement(By.name("field-keywords"));
        //WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //Search bolumunde iphone aratalim.
        aramakutusu.sendKeys("Iphone", Keys.ENTER);


        /*
        eger bir webelementi (web sayfasindaki her bir buton yada text /yazi) locate (konumunu belirleme) etmek istersek
        -once manuel olarak web sayfasini acip sayfa uzerinde sag clik yapip incele'ye tiklariz.
        karsimiza cikan HTML kodlarindan locater'lardan  (konum belirleyiciler) essiz olani seceriz. Genellikle id
        Attribute 'u kullanilir ve sectigimiz attribute degerini findelement () methodu icine
        findelement.(By.id("atribute degeri")) seklinde yazariz.
         */

        //Amazon sayfasindaki <input> ve <a> taglarinin sayisini yazdiriniz.

        List<WebElement> inputTags = driver.findElements(By.tagName("Input"));
        System.out.println("Input Tag Sayisi = "+ inputTags.size());

        List<WebElement> linklerlist = driver.findElements(By.tagName("a"));
        System.out.println("Link sayisi = "+ linklerlist.size());









    }
}
