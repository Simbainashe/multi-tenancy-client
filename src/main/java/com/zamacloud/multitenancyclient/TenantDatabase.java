package com.zamacloud.multitenancyclient;

import com.zamacloud.commons.multitenancy.hibernate.strategy.database.TenantDatabaseDetails;

/**
 * @author Fact S Musingarimi
 * 4/27/19
 * 5:56 PM
 */
public class TenantDatabase implements TenantDatabaseDetails {
    private String tenantId;
    private String url;
    private String username;
    private String password;
    private String driverClassName;

    private TenantDatabase(String tenantId, String url, String username, String password, String driverClassName) {
        this.tenantId = tenantId;
        this.url = url;
        this.username = username;
        this.password = password;
        this.driverClassName = driverClassName;
    }

    public static TenantDatabase of(String tenantId, String url, String username, String password, String driverClassName) {
        return new TenantDatabase(tenantId, url, username, password, driverClassName);
    }

    @Override
    public String getTenantId() {
        return tenantId;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getDriverClassName() {
        return driverClassName;
    }
}
