package creating_observables;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

/**
 * Description：TODO
 * Create Time：2017/5/23 17:20
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class interval {
    public static void main(String[] args) {
//        Flowable.interval(1000, TimeUnit.MILLISECONDS).subscribe(new Subscriber<Long>() {
//            @Override
//            public void onSubscribe(Subscription s) {
//                s.request(Integer.MAX_VALUE);
//            }
//
//            @Override
//            public void onNext(Long aLong) {
//                System.out.println("onError");
//                System.out.println(aLong);
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.out.println("onError");
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("{onComplete");
//            }
//        });
        Flowable.interval(1, TimeUnit.MICROSECONDS)
                .subscribe(new Subscriber<Long>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        System.out.println("onSubscribe");
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Long aLong) {
                        System.out.println("onNext");
                        try {
                            Thread.sleep(1000);  //延时1秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.out.println("onError");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("onComplete");
                    }
                });
    }
}
