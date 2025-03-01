package DesignPatterns.Adapter;

//Client
public class Receiver{
    public static void main(String[] args) {
        TargetPackage tp = new Repackager("aaaaa", 600768986);
        TargetPackage tp2 = new Repackager("bbbbb", 2930020);
        tp.gimmeDetails();
        tp2.gimmeDetails();
    }
}