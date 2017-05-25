package filtering;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * emit only item n emitted by an Observable
 * Description：elementAt 发射第N个事件
 * Create Time：2017/5/25 14:08
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class elementAt {
    public static void main(String[] args) {
        Flowable.fromArray(1, 2, 3, 4, 5).elementAt(3).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
        //3
        Flowable.fromArray(1, 2, 3, 4, 5).elementAt(6,10086).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
        //10086
    }
}
