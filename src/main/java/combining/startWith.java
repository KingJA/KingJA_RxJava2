package combining;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * Description：startWith在序列头部加入新的事件
 * Create Time：2017/5/25 11:23
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class startWith {
    public static void main(String[] args) {
        Observable.fromArray(3,4,5).startWith(1).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
}
