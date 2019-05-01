package com.zamacloud.multitenancyclient;

import com.zamacloud.commons.multitenancy.tenant.TenantDetails;
import com.zamacloud.commons.multitenancy.tenant.TenantListService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Fact S Musingarimi
 * 4/27/19
 * 4:55 AM
 */
@Component
class TenantListServiceImpl implements TenantListService {
    @Override
    public List<TenantDetails> getTenants() {
        return Arrays.asList(Tenant.of(1L));
    }
}
