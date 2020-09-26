package com.xumu;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/9/26 13:49<br/>
 *
 * @author haolong.sun<br />
 * @since JDK 1.8
 */
public class testLog4j {

    @Test
    public void test1() throws Exception{
        LogLog.setInternalDebugging(true);

        Logger logger = Logger.getLogger(testLog4j.class);
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.trace("trace");

    }
}
