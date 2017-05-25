package creating;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.concurrent.TimeUnit;

/**
 * Description：TODO
 * Create Time：2017/5/23 17:20
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class timer {
    public static void main(String[] args) {
        Observable.timer(1000, TimeUnit.MICROSECONDS).subscribe(new Consumer<Long>() {
            @Override
            public void accept(Long aLong) throws Exception {
                System.out.println("执行Observable timer" + aLong);
            }
        });
        //不执行?
        Flowable.timer(1000, TimeUnit.MICROSECONDS).subscribe(new Consumer<Long>() {
            @Override
            public void accept(Long aLong) throws Exception {
                System.out.println("执行Flowable timer" + aLong);
            }
        });
        //不执行?
        Flowable.timer(1000, TimeUnit.MICROSECONDS).subscribe(new Subscriber<Long>() {
            @Override
            public void onSubscribe(Subscription s) {

            }

            @Override
            public void onNext(Long aLong) {
                System.out.println("执行Flowable timer subscribe" + aLong);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
