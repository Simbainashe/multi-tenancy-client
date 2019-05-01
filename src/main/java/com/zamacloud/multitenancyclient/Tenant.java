package com.zamacloud.multitenancyclient;

import com.zamacloud.commons.multitenancy.tenant.TenantDetails;

/**
 * @author Fact S Musingarimi
 * 4/27/19
 * 4:57 AM
 */
public class Tenant implements TenantDetails {
    private Long id;

    private Tenant(Long id) {
        this.id = id;
    }

    public static Tenant of(Long id) {
        return new Tenant(id);
    }

    @Override
    public Long getId() {
        return id;
    }
}
