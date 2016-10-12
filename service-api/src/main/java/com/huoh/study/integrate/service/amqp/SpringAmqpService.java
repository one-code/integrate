package com.huoh.study.integrate.service.amqp;

/**
 * spring amqp
 * Created by huohao on 16/8/2.
 */
public interface SpringAmqpService {

    //发送消息
    void sendMsg(String msg);
}
