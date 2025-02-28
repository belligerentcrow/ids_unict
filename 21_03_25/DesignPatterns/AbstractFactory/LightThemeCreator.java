package DesignPatterns.AbstractFactory;

public class LightThemeCreator implements AbstractFactory {
    
    public Icon getIcon() {
        return new LightIcon();
    }
    public Header getHeader(){
        return new LightHeader();
    }
    public Text getText(){
        return new LightText();
    }
}
