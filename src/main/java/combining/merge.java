package combining;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Description：TODO
 * Create Time：2017/5/25 14:34
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class merge {
    public static void main(String[] args) {
        Observable<Integer> integerObservable1 = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {
                for (int i = 0; i < 3; i++) {
                    observableEmitter.onNext(i);
                    Thread.sleep(100);
                }
            }
        });
        Observable<Integer> integerObservable2 = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {
                for (int i = 0; i < 3; i++) {
                    observableEmitter.onNext(i);
                    Thread.sleep(100);
                }
            }
        }).subscribeOn(Schedulers.io());

        Observable.merge(integerObservable1,integerObservable2).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
}
