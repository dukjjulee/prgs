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

        List<MenuItem> manuItems = new ArrayList<>();

        manuItems.add(new MenuItem("1", "ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        manuItems.add(new MenuItem("2", "SmokeShack", "8.9", "베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거"));
        manuItems.add(new MenuItem("3", "Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        manuItems.add(new MenuItem("4", "Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        int num = 5;

        while (num != 0) {

            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            System.out.println("\n[SHAKESHACK MENU]");
            int number = 0;
            for (number = 0; number < manuItems.size(); number++)
                System.out.println(manuItems.get(number));

            System.out.println("0. 종료");

            // 숫자를 입력 받기
            num = sc.nextInt();

            if(num == 0 ){
                break;
            }
            else if(num >= 1){
                System.out.println("해당 메뉴는 없습니다(1~4)");
                num = sc.nextInt();
            }
                // 선택한 메뉴 : 이름, 가격, 설명
                System.out.println(manuItems.get(num - 1));


        }
        // 프로그램을 종료
        System.out.print("시스템을 종료합니다.");
    }
}



