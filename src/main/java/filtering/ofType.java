package filtering;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Description：按类类型过滤
 * Create Time：2017/5/25 13:22
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class ofType {
    public static void main(String[] args) {
        Flowable.fromArray(1,2,4,"hello","world").ofType(String.class).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(s);
            }
        });
    }
}
