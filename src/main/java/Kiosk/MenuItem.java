package Kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    //속성
    // List 선언 및 초기화
    private int numbers;
    private String name;
    private String price;
    private String explanation;
    private String categoryset;

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

    public int getNumbers(){
        return numbers;
    }

    public String getName(){
        return name;
    }

    public String getPrice(){
        return price;
    }

    public String getExplanation(){
        return explanation;
    }

    public String getCategoryset(){
        return categoryset;
    }
}



