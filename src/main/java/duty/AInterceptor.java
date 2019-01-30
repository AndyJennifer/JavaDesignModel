package duty;

/**
 * Author:  andy.xwt
 * Date:    2019/1/30 16:47
 * Description:
 */


class AInterceptor implements Interceptor {

    @Override
    public void intercept(String input, Chain chain) {
        System.out.println("A 处理了----->" + input);
        //这里可以选择传递，也可以选择不传递下去
        chain.proceed(input);
    }
}
