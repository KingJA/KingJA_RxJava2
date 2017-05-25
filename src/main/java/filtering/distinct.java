package filtering;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * suppress duplicate items emitted by an Observable
 * Description：去重复
 * Create Time：2017/5/25 13:25
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class distinct {
    public static void main(String[] args) {
        Flowable.fromArray(1,2,2,3,3).distinct().subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
}
