package com.tinnkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tinnkm on 2017/8/3.
 * 系统启动类，默认会去扫描他的下一级文件目录
 * 通常放在顶级目录下，否则无法正确扫描路径
 */
@SpringBootApplication
public class CasClientApplication {
    public static void main(String[] args){
        SpringApplication.run(CasClientApplication.class,args);
    }
}
