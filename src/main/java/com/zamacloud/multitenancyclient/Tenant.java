package com.zamacloud.multitenancyclient;

import com.zamacloud.commons.multitenancy.tenant.TenantDetails;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Fact S Musingarimi
 * 4/27/19
 * 4:57 AM
 */
@Embeddable
public class Tenant implements TenantDetails {
    @Column(name = "tenant_id")
    private Long id;

    protected Tenant() {
    }

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
