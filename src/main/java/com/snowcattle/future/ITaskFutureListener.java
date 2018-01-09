package com.snowcattle.future;

/**
 * Created by jiangwenping on 16/12/27.
 */
public interface ITaskFutureListener<V extends ITaskFuture<?>> extends EventListener {
    //在develop  上继续开发了新的功能
    /**
     *  完成
     * @param v
     * @throws Exception
     */
    void operationComplete(ITaskFuture<V> future) throws Exception;
}
