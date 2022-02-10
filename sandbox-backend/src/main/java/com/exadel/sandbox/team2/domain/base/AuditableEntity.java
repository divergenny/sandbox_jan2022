package com.exadel.sandbox.team2.domain.base;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditableEntity extends BaseEntity{

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String modifiedBy;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @PrePersist
    void onCreate() {
        this.createdBy = "me";
        this.modifiedBy = "me";
        this.createdDate = LocalDateTime.now();
        this.modifiedDate = LocalDateTime.now();
    }
}