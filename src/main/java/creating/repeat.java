package creating;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * Description：repeat 重复发送,可指定次数
 * Create Time：2017/5/25 13:04
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class repeat {
    public static void main(String[] args) {
        Observable.fromArray(1,2,3).repeat().subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
    }
}
