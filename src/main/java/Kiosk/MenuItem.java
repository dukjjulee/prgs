package Kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    //속성
    // List 선언 및 초기화
    public int numbers;
    public String name;
    public String price;
    public String explanation;
    public String categoryset;

    //생성자
    public MenuItem(int numbers, String name, String price, String explanation, String categoryset) {
        this.numbers = numbers;
        this.name = name;
        this.price = price;
        this.explanation = explanation;
        this.categoryset = categoryset;
    }
    public String toString() {
        return numbers + ". " + name + "  | W " + price + " | " + explanation;
    }


}



