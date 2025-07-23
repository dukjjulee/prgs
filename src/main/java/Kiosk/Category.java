package Kiosk;

public class Category {
    //속성
    public String category;

    //생성자
    public Category(String categorys){
        this.category = categorys;
    }
    //기능
    public String toString(){
        return "." + category;
    }
}
