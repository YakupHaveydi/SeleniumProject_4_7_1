package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");


        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = "+driver.manage().window().getSize());



        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();



        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin.
        Thread.sleep(3000);
        driver.manage().window().maximize();



        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin.
        System.out.println("Sayfanın Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = "+driver.manage().window().getSize());



        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();



        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanın Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = "+driver.manage().window().getSize());



        //Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();



        //1. Amazon soyfasina gidelim. https://www.amazon.com/
        //2. Sayfanin konumunu ve boyutlarini yazdirin
        //3. Sayfayi simge durumuna getirin
        //4. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        //5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        //6. Sayfayi fullscreen yapin
        //7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        //8. Sayfayi kapatin

    }
}