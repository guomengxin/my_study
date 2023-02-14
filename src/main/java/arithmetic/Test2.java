package arithmetic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-23");
        Date nowDate = new Date();
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - nowDate.getTime();
        // 计算差多少天
        long day = diff / nd;
        System.out.println("天：" + day);
        // 计算差多少小时
        long hour = diff % nd / nh;
        System.out.println("小时：" + hour);
        // 计算差多少分钟
        long min = diff / nm;
        System.out.println("分钟：" + min);
    }
}
