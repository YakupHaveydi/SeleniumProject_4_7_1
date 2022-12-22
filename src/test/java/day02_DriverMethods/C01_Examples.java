package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {

    public static void main(String[] args) {

        /*
        1)Ilk once browser'i maximize yapalim sonra tum sayfa icin max bekleme suresi olarak 15 sn belirtelim.
        2)Amazon, facebook, ve youtube sayfalarina gidelim.
        3)Amazon sayfasina tekrar donelim.
        4)Amazon sayfasinin Url'sinin https://www.amazon.com/adresine esit oldugunu test edelim.
        5)Sayfanin konumunu ve pozisyonunu yazdiralim.
        6)sayfanin konumunu ve size sini istedigimiz sekilde ayarlayalim ve istedigimiz sekilde oldugunu test edelim.
        7)ve sayfayi kapatalim.
         */

        System.setProperty("webdriver.chrome.diver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1)Ilk once browser'i maximize yapalim sonra tum sayfa icin max bekleme suresi olarak 15 sn belirtelim.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2)Amazon, facebook, ve youtube sayfalarina gidelim.
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");

        //3)Amazon sayfasina tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();

        //4)Amazon sayfasinin Url'sinin https://www.amazon.com/adresine esit oldugunu test edelim.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");


        //5)Sayfanin konumunu ve pozisyonunu yazdiralim.
        System.out.println("Sayfanin size'i: " +driver.manage().window().getSize());
        System.out.println("Sayfanin konumu : " +driver.manage().window().getPosition());

        //6)sayfanin konumunu ve size sini istedigimiz sekilde ayarlayalim
        driver.manage().window().setSize(new Dimension(600, 600));
        driver.manage().window().setPosition(new Point(50,50));


        //bununla cok karsilasmayiz
        //istedigimiz sekilde oldugunu test edelim.
        Dimension actualYenisize = driver.manage().window().getSize();
        if (actualYenisize.getWidth()==600 && actualYenisize.getHeight()==600){
            System.out.println("Size Testi PASSED");
        }else System.out.println("Size Testi FAILED");


        Point actualYeniKonumu = driver.manage().window().getPosition();
        if (actualYeniKonumu.getX()==50  && actualYeniKonumu.getY()==60){
            System.out.println("Konum Testi PASSED");
        }else System.out.println("Konum Testi FAILED");


        //7)ve sayfayi kapatalim.
        driver.close();



    }

}
