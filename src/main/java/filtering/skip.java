package filtering;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * Description：跳过头部指定数量/时间的事件
 * Create Time：2017/5/25 13:36
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class skip {
    public static void main(String[] args) {
        Observable.fromArray(1,2,3,4,5).skip(3).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
    //4,5
}
