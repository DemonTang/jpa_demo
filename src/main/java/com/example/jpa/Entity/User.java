package com.example.jpa.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by tanglemo on 16/6/3.
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
