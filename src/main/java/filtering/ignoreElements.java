package filtering;

import io.reactivex.*;
import io.reactivex.disposables.Disposable;

/**
 * do not emit any items from an Observable but mirror its termination notification
 * Description：ignoreElements 忽略事件，只接受终止回调(错误/完成)
 * Create Time：2017/5/25 13:44
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class ignoreElements {
    public static void main(String[] args) {
        Flowable.create(new FlowableOnSubscribe<Integer>() {
            @Override
            public void subscribe(FlowableEmitter<Integer> flowableEmitter) throws Exception {
                for (int i = 0; i < 5; i++) {
                    flowableEmitter.onNext(i);
                }
                flowableEmitter.onComplete();
            }
        }, BackpressureStrategy.ERROR).ignoreElements().subscribe(new CompletableObserver() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");
            }
        });
    }
}
