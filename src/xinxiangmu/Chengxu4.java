package xinxiangmu;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hao on 2016/5/4.
 */
public class Chengxu4 {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        BookMethod bm=new BookMethod();
        for(;;) {
            System.out.println("---欢迎来到图书系统---");
            System.out.println("1.查询图书列表");
            System.out.println("2.添加书");
            System.out.println("3.删除书");
            System.out.println("4.借书");
            System.out.println("5.还书");
            System.out.println("6.离开");
            Scanner sc =new Scanner(System.in);
            int  i =sc.nextInt();
            switch (i) {
                case 1:
                    bm.LookBook();
                    break;
                case 2:
                    bm.AddBook();

                    break;
                        case 3:
                    break;
                case 4:
                    bm.BorrowBook();
                    break;
                case 5:
                    bm.ReturnBook();
                    continue;
               case 6:
                   break;
                default:
                    System.err.println("您输入的编号有误，请在指定范围内输入相应的数字！");
                    break;
            }
        }
    }
}
