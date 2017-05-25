package creating;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * Description：直接发射onError
 * Create Time：2017/5/25 14:19
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class error {
    public static void main(String[] args) {
        Flowable.error(new Exception("error info")).subscribe(new Subscriber<Object>() {
            @Override
            public void onSubscribe(Subscription s) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Object o) {
                System.out.println("onNext");
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("onError:"+t.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        });
    }
}
