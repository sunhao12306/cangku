package xinxiangmu;


import java.util.*;

/**程序4方法
 * Created by hao on 2016/5/4.
 */

public class BookMethod {
    Book book=new Book();
    List<Book>  list =new ArrayList<>();
    Map<Integer,List> map = new LinkedHashMap<>();
    Scanner sc =new Scanner(System.in);
        int l=0;

    /**
     * 查询书籍
     */
    public void LookBook(){
//        book.setBookId(1);
//        book.getBookId();
//        book.getBookName();
//        book.getBookWriter();
//        book.getBooktime();
//        book.getBookNumber();
////        list.add(book);
        for (Map.Entry< Integer,List> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("总共"+map.size()+"本书");
        System.out.println("共借出"+l+"本书");
   }

    /**
     * 添加书籍
     */
    public void AddBook() {
    System.out.println("a.添加已有的书");
        System.out.println("b.添加新书");
        String j = sc.next();
        switch (j) {
            case "a":
                for (; ; ) {
                    for (Map.Entry<Integer, List> entry : map.entrySet()) {
                        System.out.println( entry.getValue());
                    }
                    System.out.println("请输入你要添加的书的编号");
                    int sd = sc.nextInt();
                    if(sd<=map.size()){
                        book.setBookNumber(book.BookNumber+1);
                        map.put(sd,map.get(sd));
                        System.out.println("添加成功");
                    }
                    break;
                }
                break;
            case "b":
                System.out.println("请输入你要添加的图书编号：");
                System.out.println("请输入你要添加的图书名：");
                System.out.println("请输入你要添加的图书作家：");
                System.out.println("请输入你要添加的图书出版时间：");
                System.out.println("请输入你要添加的图书数量：");
                int sda=sc.nextInt();
                book.setBookId(sda);
                String sdb=sc.next();
                book.setBookName(sdb);
                String sdc=sc.next();
                book.setBookWriter(sdc);
                String sdd=sc.next();
                book.setBooktime(sdd);
                int sde=sc.nextInt();
                book.setBookNumber(sde);
                list.add(book);
                map.put(map.size()+1,list);
                System.out.println("添加成功");
                break;
            default:
                System.err.println("请输入范围内的字母");
        }
   }
    /***
     * 删除书籍
     */
    public void DelectBook(){
        System.out.println("选择你要删除的书的编号");
        int shchu=sc.nextInt();
        if (shchu<=map.size()){
            map.remove(shchu);
            System.out.println("删除成功");
        }else{
            System.out.println("输入不存在");
        }
    }

    /**
     * 借阅书籍
     */
    public void BorrowBook(){
        for (Map.Entry<Integer, List> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("借阅的书的编号最大不超过"+map.size());
        System.out.println("请输入你要借阅的书的编号");
        int sdf=sc.nextInt();
        if(sdf<=map.size()){
            book.setBookNumber(book.BookNumber-1);
            map.put(sdf,map.get(sdf));
            System.out.println("借阅成功");
            l+=1;
        }
    }
    /**
     * 还书
     */
    public void ReturnBook(){
        for (Map.Entry<Integer, List> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("还书的编号最大不超过"+map.size());
        System.out.println("请输入你要还书的编号");
        int snf=sc.nextInt();
        if(snf<=map.size()){
            book.setBookNumber(book.BookNumber+1);
            map.put(snf,map.get(snf));
            System.out.println("借阅成功");
            l-=1;
        }
    }
}
