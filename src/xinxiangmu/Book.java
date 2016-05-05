package xinxiangmu;

import java.util.Date;

/**
 * book实体类
 * Created by hao on 2016/5/4.
 */
public class Book {
   public int  BookId;
    public String  BookName;
    public String BookWriter;
    public String Booktime;
    public int BookNumber;

    public Book(int bookId, String bookName, String bookWriter, String booktime, int bookNumber) {
        BookId = bookId;
        BookName = bookName;
        BookWriter = bookWriter;
        Booktime = booktime;
        BookNumber = bookNumber;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookWriter() {
        return BookWriter;
    }

    public void setBookWriter(String bookWriter) {
        BookWriter = bookWriter;
    }

    public String getBooktime() {
        return Booktime;
    }

    public void setBooktime(String booktime) {
        Booktime = booktime;
    }

    public int getBookNumber() {
        return BookNumber;
    }

    public void setBookNumber(int bookNumber) {
        BookNumber = bookNumber;
    }

    @Override
    public String toString() {
        return  "图书编号：" + BookId +
                " 图书名：" + BookName +
                " 图书作家：" + BookWriter  +
                " 出版时间：" + Booktime  +
                " 图书数量：" + BookNumber
                ;
    }

    public Book() {
    }
}
