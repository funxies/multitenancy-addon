/*
 * Copyright (c) 2016 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.
 */

package com.haulmont.sdbmt.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.UserRole;
import com.haulmont.sdbmt.core.HasTenant;
import com.haulmont.sdbmt.core.TenantId;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("SDBMT")
@Entity(name = "sdbmt$SdbmtUserRole")
@Extends(UserRole.class)
public class SdbmtUserRole extends UserRole implements HasTenant {

    @TenantId
    @Column(name = "TENANT_ID")
    protected String tenantId;

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return tenantId;
    }
}