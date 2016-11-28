package org.say.valuation.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by say on 18/11/2016.
 */
@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {
    @Column
    private String name;
    @ManyToMany
    private List<User> users;
    @ManyToMany
    private List<Permission> permissions;
}
