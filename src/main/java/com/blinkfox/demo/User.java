package com.blinkfox.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * User.
 *
 * @author blinkfox on 2022-03-28.
 * @since 1.0.0
 */
@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "t_ar_table")
public class User {

    /**
     * ID.
     */
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
