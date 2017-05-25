package combining;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * Description：按顺序连接多个Observable
 * Create Time：2017/5/25 14:28
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class concat {
    public static void main(String[] args) {
        Observable<Integer> integerObservable1 = Observable.fromArray(1, 2, 3);
        Observable<Integer> integerObservable2 = Observable.fromArray(4,5,6);

        Observable.concat(integerObservable1,integerObservable2).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }


}
