import java.text.*;
import java.util.*;


public class Main{
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //원하는 데이터 포맷 지정
        String strNowDate = simpleDateFormat.format(date);
        //지정한 포맷으로 변환
        System.out.print(strNowDate);
    }
}