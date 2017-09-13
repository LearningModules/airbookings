package com.trvl.domain.api.airbookings.airbookings.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by reji on 13/09/17.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactory",
        transactionManagerRef = "transactionManager",
        basePackages = { "com.trvl.domain.api.airbookings.airbookings.domains" })

public class BookingMasterConfig {

    @Bean(name = "bookingMasterDataSource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource bookingMasterDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean bookingMasterEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("bookingMasterDataSource") DataSource bookingMasterDataSource) {
        return builder
                .dataSource(bookingMasterDataSource())
                .packages("com.trvl.domain.api.airbookings.airbookings.domains")
                .persistenceUnit("booking_master")
                .build();
    }
    @Bean(name = "transactionManager")
    public PlatformTransactionManager bookingMasterTransactionManager(
            @Qualifier("entityManagerFactory") EntityManagerFactory bookingMasterEntityManagerFactory) {
        return new JpaTransactionManager(bookingMasterEntityManagerFactory);
    }
}
