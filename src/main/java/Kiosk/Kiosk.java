package Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //생성자를 통해 값 할당
    List<MenuItem> menuItems = new ArrayList<>();

    // menuItem 관리 필드
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //start함수 만들어 입력/ 반복문 로직 관리
    public void start() {
        Scanner sc = new Scanner(System.in);

        int num = 5;

        while (num != 0) {

            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            System.out.println("\n[SHAKESHACK MENU]");
            int number = 0;
            for (number = 0; number < menuItems.size(); number++)
                System.out.println(menuItems.get(number));

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
            System.out.println(menuItems.get(num - 1));


        }
        // 프로그램을 종료
        System.out.print("시스템을 종료합니다.");
    }
    //메뉴 출력
    //사용자 입력 처리
    //main함수에서 객체를 생성할때 값을 넘겨줌

}

