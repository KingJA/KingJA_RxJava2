package filtering;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

import java.util.concurrent.TimeUnit;

/**
 * Description：take 接收从头部开始指定数量/时间的事件
 * Create Time：2017/5/24 13:37
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class take {
    public static void main(String[] args) {
        Flowable.fromArray(1, 2, 3, 4, 5).take(3).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
        Flowable.fromArray(1, 2, 3, 4, 5).take(3, TimeUnit.SECONDS).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
}
