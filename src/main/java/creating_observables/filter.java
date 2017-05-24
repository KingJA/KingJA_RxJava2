package creating_observables;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/**
 * Description：filter 过滤
 * Create Time：2017/5/24 13:33
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class filter {
    public static void main(String[] args) {
        Flowable.fromArray(1,4,5,67,7,34,55).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) throws Exception {
                return integer>20;
            }
        }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
}
