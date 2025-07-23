package Kiosk;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Kiosk {

    List<MenuItem> menuItems = new ArrayList<>();
    List<Category> categorys = new ArrayList<>();

    public Kiosk(List<MenuItem> menuItems, List<Category> categorys){
        this.menuItems = menuItems;
        this.categorys = categorys;

    }

    //start함수 만들어 입력/ 반복문 로직 관리
    public void start() {

        // menuItem 관리 필드

        int num = -1;

        //스케너 선언
        Scanner sc = new Scanner(System.in);

        //반복문 시작
        while (num != 0){
            try {// 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
                System.out.println("[MAIN MENU]");

                int number = 0;
                for (number = 0; number < categorys.size(); number++) {
                    System.out.print(number + 1);
                    System.out.println(categorys.get(number));
                }

                System.out.println("0. 종료");

                // 숫자를 입력 받기
                num = sc.nextInt();

                //입력 받은 숫자가 올바르다면 인덱스로 활용하여 List 에 접근하기
                if (num == 0)  break;

                else if (num < 1 || num > (categorys.size())) {
                    System.out.println("해당 메뉴는 없습니다(1~" + (categorys.size()) + ")");
                }

                //입력받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는```List<MenuItem>```에 접근하기
                else if (num >= 1 && num <= categorys.size()) {

                    number = num - 1;
                    System.out.println("\n[" + categorys.get(num - 1).category + " MENU]");
                    for (number = 0; number < menuItems.size(); number++) {

                        if (menuItems.get(number).categoryset.equals(categorys.get(num - 1).category)) {
                            System.out.println(menuItems.get(number));

                        }
                    }

                    System.out.println("0. 뒤로가기");

                    // 숫자를 입력 받기
                    num = sc.nextInt();

                    //입력 받은 숫자가 올바르다면 인덱스로 활용하여 List 에 접근하기
                    if (num == 0) {
                        num = -1;
                    } else if (num < 1 || num > (menuItems.size())) {
                        System.out.println("해당 메뉴는 없습니다(1~" + (menuItems.size()) + ")");
                    }

                    // 선택한 메뉴 : 이름, 가격, 설명

                    //입력받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는```List<MenuItem>```에 접근하기
                    else if (num >= 1 && num <= (menuItems.size())) {
                        System.out.println(menuItems.get(num - 1));
                    }
                }
            }
            catch(InputMismatchException e){
            System.out.println("*숫자만 입력하세요*");
            sc.nextLine();
            num = -1;
            }
        }// 프로그램을 종료
        System.out.print("시스템을 종료합니다.");
    }
}