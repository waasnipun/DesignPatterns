package Facade;

import java.sql.Driver;

class Firefox{
    public static Driver getFirefoxDrive(){
        return null;
    }

    public static void generateHTMLReport(String test, Driver driver){
        System.out.println("Generating HTML Report for Firefox Driver");
    }

    public static void generateJUnitReport(String test, Driver driver){
        System.out.println("Generating JUNIT Report for Firefox Driver");
    }
}

class Chrome{
    public static Driver getChromeDrive(){
        return null;
    }

    public static void generateHTMLReport(String test, Driver driver){
        System.out.println("Generating HTML Report for Chrome Driver");
    }

    public static void generateJUnitReport(String test, Driver driver){
        System.out.println("Generating JUNIT Report for Chrome Driver");
    }
}

class WebExplorerHelperFacade{
    public static void generateReports(String explorer, String report, String test){
        Driver driver = null;
        switch (explorer) {
            case "firefox" -> {
                driver = Firefox.getFirefoxDrive();
                switch (report) {
                    case "html" -> Firefox.generateHTMLReport(test, driver);
                    case "junit" -> Firefox.generateJUnitReport(test, driver);
                }
            }
            case "chrome" -> {
                driver = Chrome.getChromeDrive();
                switch (report) {
                    case "html" -> Chrome.generateHTMLReport(test, driver);
                    case "junit" -> Chrome.generateJUnitReport(test, driver);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String test = "CheckElemetPresent";

        WebExplorerHelperFacade.generateReports("firefox","html",test);
        WebExplorerHelperFacade.generateReports("firefox","junit",test);
        WebExplorerHelperFacade.generateReports("chrome","html",test);
        WebExplorerHelperFacade.generateReports("chrome","junit",test);

    }
}
