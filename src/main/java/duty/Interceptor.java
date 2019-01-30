package duty;

/**
 * Author:  andy.xwt
 * Date:    2019/1/30 16:33
 * Description:
 */


public interface Interceptor {

    void intercept(String input, Chain chain);

    interface Chain {

        void proceed(String input);

        Chain addInterceptor(Interceptor interceptor);
    }

}
