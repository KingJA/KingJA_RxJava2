package filtering;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Description：take 接收从尾部开始指定数量/时间的事件
 * Create Time：2017/5/24 13:37
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class takeLast {
    public static void main(String[] args) {
        Flowable.fromArray(1, 2, 3, 4, 5).takeLast(3).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
    //3,4,5
}
