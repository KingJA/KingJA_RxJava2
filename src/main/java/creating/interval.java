package creating;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * Description：TODO
 * Create Time：2017/5/23 17:20
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class interval {
    public static void main(String[] args) {
//        //不执行?
//        Observable.interval(1, TimeUnit.SECONDS)
//                .subscribe(new Consumer<Long>() {
//                    @Override
//                    public void accept(Long aLong) throws Exception {
//                        System.out.println("Observable.interval");
//                    }
//                });

        Observable.interval(1, TimeUnit.SECONDS, Schedulers.trampoline())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        System.out.println("onNext" + aLong);
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
