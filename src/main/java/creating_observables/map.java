package creating_observables;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * Description：TODO
 * Create Time：2017/5/24 13:01
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class map {
    public static void main(String[] args) {
        Flowable.fromArray(1,2,3,4,5).map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) throws Exception {
                return "消息："+integer;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(s);

            }
        });
    }
}
