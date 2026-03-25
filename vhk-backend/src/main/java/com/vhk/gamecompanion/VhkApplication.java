package com.vhk.gamecompanion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * VHK游戏陪玩小程序后端应用主类
 */
@SpringBootApplication
@EnableScheduling
public class VhkApplication {
    public static void main(String[] args) {
        SpringApplication.run(VhkApplication.class, args);
    }
}