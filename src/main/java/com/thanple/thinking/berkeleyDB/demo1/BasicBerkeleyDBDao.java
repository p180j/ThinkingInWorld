package com.thanple.thinking.berkeleyDB.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author macrotea@qq.com
 * @since 2014-8-8 下午7:03
 */
public class BasicBerkeleyDBDao extends BerkeleyDBTemplate {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getEnvFilePath() {
        return "berkeley-db-data";
    }

    @Override
    public String getDatabaseName() {
        return "db_demo1";
    }

    @Override
    public Boolean allowDuplicatedKey() {
        //重点在这里
        return true;
    }


}
