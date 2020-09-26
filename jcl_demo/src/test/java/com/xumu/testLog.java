package com.xumu;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/9/26 15:19<br/>
 *
 * @author haolong.sun<br />
 * @since JDK 1.8
 */
public class testLog {

    @Test
    public void test1() throws  Exception{
        Log log = LogFactory.getLog(testLog.class);
        log.info("Hello info");
    }
}
