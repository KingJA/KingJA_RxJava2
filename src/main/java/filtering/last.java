package filtering;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Description：只发送第一个事件
 * Create Time：2017/5/25 13:31
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class last {
    public static void main(String[] args) {
        Flowable.fromArray(1,2,3,4,5).last(1).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
}
