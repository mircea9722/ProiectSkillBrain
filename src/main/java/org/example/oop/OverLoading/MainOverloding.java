package org.example.oop.OverLoading;

public class MainOverloding {
    public static void main(String[] args) {
    }
    public void main (){
        System.out.println("Mainul care primeste parametru");

    }
    public void main (String text ){
        System.out.println("Mainul care primeste overloding");
    }
}
