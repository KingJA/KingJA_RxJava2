package other;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Description：doOnNext 在执行事件消费前执行的回调
 * Create Time：2017/5/25 9:12
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class doOnNext {
    public static void main(String[] args) {
        Flowable.fromArray(1,2,3).doOnNext(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println("即将输出："+integer);

            }
        }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println("输出："+integer);
            }
        });
    }
}
