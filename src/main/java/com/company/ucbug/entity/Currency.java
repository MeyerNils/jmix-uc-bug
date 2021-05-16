package com.company.ucbug.entity;

import io.jmix.core.entity.annotation.CaseConversion;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JmixEntity
@Table(name = "BASE_CURRENCY")
@Entity
public class Currency {

    @CaseConversion
    @Size(min = 3, max = 3)
    @Column(name = "CODE", nullable = false, length = 3)
    @NotNull
    @Id
    private String code;

    @InstanceName
    @Column(name = "NAME", nullable = false, unique = true)
    @NotNull
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}