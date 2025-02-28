package DesignPatterns.AbstractFactory;

public class DarkThemeCreator implements AbstractFactory {
    public Icon getIcon(){
        return new DarkIcon();
    }
    public Header getHeader(){
        return new DarkHeader();
    }
    public Text getText(){
        return new DarkText();
    }
}
