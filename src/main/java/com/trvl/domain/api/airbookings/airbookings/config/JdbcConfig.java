package com.trvl.domain.api.airbookings.airbookings.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by reji on 14/09/17.
 */
@Component
public class JdbcConfig {

    @Value("${msjdbcSqlDriverClass}")
    String msjdbcSqlDriverClass;
    @Value("${msjdbcSqlConnectionString}")
    String msjdbcSqlConnectionString;
    @Value("${msjdbcSqlUserName}")
    String msjdbcSqlUserName;
    @Value("${msjdbcSqlPassword}")
    String msjdbcSqlPassword;
    @Value("${msjdbcConnectionPoolInitialSize}")
    int msjdbcConnectionPoolInitialSize;
    @Value("${msjdbcConnectionPoolMaxActive}")
    int msjdbcConnectionPoolMaxActive;

    @Bean
    @Primary
    BasicDataSource mySqlDataSource() {
        BasicDataSource dbs = new BasicDataSource();
        try{
            dbs.setDriverClassName(msjdbcSqlDriverClass);
            dbs.setUrl(msjdbcSqlConnectionString);
            dbs.setUsername(msjdbcSqlUserName);
            dbs.setPassword(msjdbcSqlPassword);
            dbs.setInitialSize(msjdbcConnectionPoolInitialSize);
            dbs.setMaxActive(msjdbcConnectionPoolMaxActive);
        }catch(Exception ex){
        }
        return dbs;
    }
}
