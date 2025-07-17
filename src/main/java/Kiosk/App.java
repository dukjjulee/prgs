package Kiosk;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 5;

        // 0번 선택시 프로그램 종료

        while (num != 0){
            //햄버거 메뉴 출력
            System.out.print(
                    "[ SHAKESHACK MENU]\n" +
                            "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                            "2. SmokeShack    | W 8.9 | 베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거\n" +
                            "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                            "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                            "0. 종료\n:");

            //사용자에게 메뉴 번호 입력받기

            num = sc.nextInt();

            //입력받은 번호에 따라 각각 다른 로직 실행
            if(num == 1){
                num = 1;
            }

            else if(num == 2){
                num = 2;
            }

            else if(num == 3){
                num = 3;
            }

            else if(num == 4){
                num = 4;
            }

        }

        System.out.print("시스템을 종료합니다.");
    }

}
