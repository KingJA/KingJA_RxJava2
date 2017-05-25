package filtering;

import io.reactivex.*;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * Description：TODO
 * Create Time：2017/5/25 10:05
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class sample {
    public static void main(String[] args) {
        Flowable.fromArray(1,2,3,4,5).sample(1000, TimeUnit.MILLISECONDS,Schedulers.trampoline()).subscribeOn(Schedulers.io()).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });

    }
}
