package RentCar;
import java.util.Scanner;
/**
 * author fuqiangwang
 * date
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎来到租车系统");
        double total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入租车天数：");
        int days=sc.nextInt();


        while(true){
            System.out.println("请选择租车类型：1.货车 2.客车 3.退出");
            int op=sc.nextInt();
            switch (op){
                case 1:
                    Trucks car1=new Trucks(50,4);
                    total=car1.getPrice()*days;
                    System.out.println("单价为："+car1.getPrice()+"载重为："+car1.getLoad()+"总费用为："+total);
                    break;
                case 2:
                    PassengerCar car2=new PassengerCar(60,20);
                    total=car2.getPrice()*days;
                    System.out.println("单价为："+car2.getPrice()+"载客量为："+car2.getPcount()+"总费用为："+total);
                    break;
                case 3:
                    return;
            }
        }

    }
}
