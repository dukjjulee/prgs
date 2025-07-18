package Kiosk;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuItem {

    //속성
    // List 선언 및 초기화
    String num;
    String name;
    String price;
    String explanation;

    //생성자
    public MenuItem(String num, String name, String price, String explanation) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }


    public String toString() {
        return num + ". " + name + "  | W " + price + " | " + explanation;
    }

    // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("1", "ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("2", "SmokeShack", "8.9", "베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("3", "Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("4", "Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));

    }
}



