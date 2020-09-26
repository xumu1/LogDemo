package com.xumu;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/9/26 16:15<br/>
 *
 * @author haolong.sun<br />
 * @since JDK 1.8
 */
public class test {

    public static final Logger LOGGER = LoggerFactory.getLogger(test.class);
    @Test
    public void test1() throws Exception{

        try {
            int i = 1/0;
        }catch (Exception e){
            System.out.println("==========");
            LOGGER.error("exception...",e);
            System.out.println("==========");
        }
    }
}
