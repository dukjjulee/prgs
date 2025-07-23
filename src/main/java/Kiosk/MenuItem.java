package Kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    //속성
    // List 선언 및 초기화
    public String name;
    public String price;
    public String explanation;

    //생성자
    public MenuItem( String name, String price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }
    public String toString() {
        return ". " + name + "  | W " + price + " | " + explanation;
    }


}



