package com.zamacloud.multitenancyclient;

import com.zamacloud.commons.multitenancy.strategy.hibernate.database.TenantDatabaseDetails;
import com.zamacloud.commons.multitenancy.strategy.hibernate.database.TenantDatabaseDetailsService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Fact S Musingarimi
 * 4/27/19
 * 6:07 PM
 */
@Service
public class TenantDatabaseDetailsServiceImpl implements TenantDatabaseDetailsService {
    @Override
    public List<TenantDatabaseDetails> getTenantDatabaseDetails() {
        return Arrays.asList(TenantDatabase.of("1","jdbc:postgresql://127.0.0.1:5432/tenant_1?currentSchema=online_shopping",
                "developer","pass123","org.postgresql.Driver"));
    }

}
