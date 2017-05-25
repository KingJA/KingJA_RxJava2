package creating;

import io.reactivex.Observable;

/**
 * Description：TODO
 * Create Time：2017/5/23 17:15
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class fromArray {
    public static void main(String[] args) {
        Observable.fromArray(1,2,3,4,5).subscribe(ints -> System.out.println(ints));
    }
}
