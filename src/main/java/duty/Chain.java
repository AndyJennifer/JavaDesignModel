package duty;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:  andy.xwt
 * Date:    2019/1/30 16:33
 * Description:
 */


public class Chain implements Interceptor.Chain {

    /**
     * 用于存储所有的拦截链
     */
    private List<Interceptor> mInterceptors = new ArrayList<>();

    /**
     * 用于变量拦截链的角标
     */
    private int index = 0;

    /**
     * 添加拦截链
     */
    @Override
    public Chain addInterceptor(Interceptor interceptor) {
        mInterceptors.add(interceptor);
        return this;
    }

    @Override
    public void proceed(String input) {
        if (index == mInterceptors.size()) return;
        Interceptor interceptor = mInterceptors.get(index);
        index++;
        interceptor.intercept(input, this);
    }



}

