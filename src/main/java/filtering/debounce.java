package filtering;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

import java.util.concurrent.TimeUnit;

/**
 * Description：TODO
 * Create Time：2017/5/25 14:12
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class debounce {
    public static void main(String[] args) {
        Flowable.fromArray(1, 2, 3, 4, 5).debounce(2, TimeUnit.SECONDS).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
}
