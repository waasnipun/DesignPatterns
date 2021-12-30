package Structural.Adapter;

interface WebDriver{
    public void getElement();
    public void selectElement();
}

class ChromeDriver implements WebDriver{


    @Override
    public void getElement() {
        System.out.println("Get element from chrome driver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from chrome driver");
    }
}

class IEDriver{
    public void findElement(){
        System.out.println("Find element from IEDriver");
    }
    public void clickElement(){
        System.out.println("Click element from IEDriver");
    }
}

class WebDriverAdapter implements WebDriver{

    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver ieDriver){
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }
}

public class Main {
    public static void main(String[] args) {

        WebDriver a = new ChromeDriver();
        a.getElement();
        a.selectElement();

        IEDriver e = new IEDriver();

        WebDriver wID = new WebDriverAdapter(e);
        wID.getElement();
        wID.selectElement();
    }
}
