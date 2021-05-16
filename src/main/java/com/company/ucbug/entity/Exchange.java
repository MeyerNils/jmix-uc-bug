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
@Table(name = "BASE_EXCHANGE")
@Entity
public class Exchange {
    @Size(min = 4, max = 4)
    @CaseConversion
    @Column(name = "MIC", nullable = false, length = 4)
    @Id
    private String mic;

    @InstanceName
    @Column(name = "NAME", nullable = false, unique = true)
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMic() {
        return mic;
    }

    public void setMic(String id) {
        this.mic = id;
    }
}