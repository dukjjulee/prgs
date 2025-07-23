package org.example;
import Kiosk.Kiosk;
import Kiosk.Menu;

public class Main {

    public static void main(String[] args) {

        //Menu 객체 생성을 통해 이름 설정
        Menu menu = new Menu();

        //Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menu.getMenuItem(), menu.getCategorys());

        //kiosk 내에서 시작하는 함수 호출
        kiosk.start();

    }
}