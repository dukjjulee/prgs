package Kiosk;
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
}



