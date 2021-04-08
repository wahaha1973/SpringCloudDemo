import java.time.ZonedDateTime;

public class T2 {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();//默认时区
        System.out.println(zbj);
        //2021-03-23T10:14:19.664+08:00[Asia/Shanghai]
    }
}
