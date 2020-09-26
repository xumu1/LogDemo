package com.xumu;

import org.junit.Test;

import java.io.InputStream;
import java.net.URL;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/9/26 10:50<br/>
 *
 * @author haolong.sun<br />
 * @since JDK 1.8
 */
public class testLog {

    @Test
    public void test1() throws Exception{
        Logger logger = Logger.getLogger("com.xumu.testLog");
        logger.info("hello log");
    }
    @Test
    public void test2() throws  Exception{
//        InputStream resource = testLog.class.getClassLoader().getResourceAsStream("logging.properties");
//        LogManager manager = LogManager.getLogManager();
//        manager.readConfiguration(resource);

        Logger logger = Logger.getLogger("com.xumu");
        logger.severe("severe");
        logger.info("info");
        logger.warning("warning");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }
}
