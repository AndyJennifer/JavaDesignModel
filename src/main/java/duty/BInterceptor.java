package duty;

/**
 * Author:  andy.xwt
 * Date:    2019/1/30 16:48
 * Description:
 */


class BInterceptor implements Interceptor {

    @Override
    public void intercept(String input, Chain chain) {
        System.out.println("B 处理了----->" + input);
        chain.proceed(input);
    }
}
