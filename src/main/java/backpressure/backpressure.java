package backpressure;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * Description：TODO
 * Create Time：2017/5/24 9:39
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class backpressure {
    public static void main(String[] args) {
        Flowable.create(new FlowableOnSubscribe<Integer>() {
            @Override
            public void subscribe(FlowableEmitter<Integer> flowableEmitter) throws Exception {
                for (int i = 0; i < 1000; i++) {
                    flowableEmitter.onNext(i);
                }
            }
        }, BackpressureStrategy.ERROR).subscribe(new Subscriber<Integer>() {
            @Override
            public void onSubscribe(Subscription s) {
                //subscription必须设置才能收到事件
                s.request(1000);
            }

            @Override
            public void onNext(Integer integer) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(integer);
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
