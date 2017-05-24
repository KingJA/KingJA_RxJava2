package creating_observables;

import io.reactivex.*;

/**
 * Description：TODO
 * Create Time：2017/5/23 16:56
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class create {
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> observableEmitter) throws Exception {
                for (int i = 0; i < 5; i++) {
                    observableEmitter.onNext("Observable publish: "+i);
                }

            }
        }).subscribe(integer -> System.out.println(integer));

        Flowable.create(new FlowableOnSubscribe<String>() {
            @Override
            public void subscribe(FlowableEmitter<String> flowableEmitter) throws Exception {
                for (int i = 0; i < 5; i++) {
                    flowableEmitter.onNext("Flowable publish: "+i);
                }
            }
        },BackpressureStrategy.DROP).subscribe(integer -> System.out.println(integer));
    }
}
