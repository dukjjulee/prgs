package Kiosk;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Category> categorys = new ArrayList<>();
    List<MenuItem> menuItems = new ArrayList<>();

    public Menu(){

        //List에 들어있는 MenuItem을 순차적으로 보여주는 함수
        categorys.add(new Category("Burger"));
        categorys.add(new Category("Drink"));

        menuItems.add(new MenuItem(1,"ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거","Burger"));
        menuItems.add(new MenuItem(2,"SmokeShack", "8.9", "베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거","Burger"));
        menuItems.add(new MenuItem(3,"Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", "Burger"));
        menuItems.add(new MenuItem(4,"Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거","Burger"));

        menuItems.add(new MenuItem(5,"Cola", "0.2", "콜라","Drink"));
        menuItems.add(new MenuItem(6,"Grapefruit juice", "0.4", "자몽주스","Drink"));
        menuItems.add(new MenuItem(7,"Grapefruit Ade", "0.4", "자몽에이드","Drink"));
        menuItems.add(new MenuItem(8,"Grapefruit Wine", "0.4", "자몽와인","Drink"));
    }
    //List를 리턴하는 함수
    public List<Category> getCategorys(){
        return categorys;
    }
    public List<MenuItem> getMenuItem() {
        return menuItems;
    }
    //구조에 맞게 함수 선언
}
