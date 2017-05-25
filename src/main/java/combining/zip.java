package combining;

import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Description：zip 合并多个Observable，如果在一个线程会按顺序发射，如果在不同线程会一个个发射合并，合并的数量为最少的
 * Observable发射的数量
 * Create Time：2017/5/25 9:31
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class zip {
    public static void main(String[] args) {
        Observable<Integer> integerObservable1 = Observable.fromArray(1, 2, 3).subscribeOn(Schedulers.io());
        Observable<Integer> integerObservable2 = Observable.fromArray(3, 2, 1,0).subscribeOn(Schedulers.io());

        integerObservable1.subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println("integerObservable1发射:" + integer);
            }
        });
        integerObservable2.subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println("integerObservable2发射:" + integer);
            }
        });

        Observable.zip(integerObservable1, integerObservable2, new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer integer, Integer integer2) throws Exception {
                return "结果：" + integer + integer2;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(s);
            }
        });
    }
}
