package day31_inheritance.browserTask;

public class Opera extends  Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Opera browser");
    }
}
