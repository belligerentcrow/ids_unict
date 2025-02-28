package DesignPatterns.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory letThereBeDarkness = new DarkThemeCreator();
        Icon myDarkestIcon = letThereBeDarkness.getIcon();
        Header myDarkestHeader = letThereBeDarkness.getHeader();
        Text myDarkestText = letThereBeDarkness.getText();

        AbstractFactory letThereBeLight = new LightThemeCreator();
        Icon myLightestIcon = letThereBeLight.getIcon();
        Header myLightestHeader = letThereBeLight.getHeader();
        Text myLightestText = letThereBeLight.getText();

        System.out.println("Trying out the dark theme...");
        tryOutTheme(myDarkestIcon,myDarkestHeader,myDarkestText);
        
        System.out.println("Trying out the light theme...");
        tryOutTheme(myLightestIcon, myLightestHeader, myLightestText);

        
    }

    public static void tryOutTheme(Icon i, Header h, Text t){
        i.onClick();
        h.showcaseMessage();
        t.showText();
    }
}
