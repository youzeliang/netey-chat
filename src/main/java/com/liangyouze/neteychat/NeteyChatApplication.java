package com.liangyouze.neteychat;

import com.liangyouze.neteychat.server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NeteyChatApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(NeteyChatApplication.class, args);
        NettyServer nettyServer = context.getBean(NettyServer.class);
        nettyServer.start();
    }
}
