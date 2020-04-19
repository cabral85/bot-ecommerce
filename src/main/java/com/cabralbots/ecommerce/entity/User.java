package com.cabralbots.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "B_USER")
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUser;

    @Column(name = "login", length = 20, nullable = false)
    private String login;

    @Column(name = "name", length = 40, nullable = true)
    private String name;

    @Column(name = "last_name", length = 40, nullable = true)
    private String lastName;

    @Column(name = "password", length = 200, nullable = false)
    private String password;

    @Column(name = "email", length = 300, nullable = false)
    private String email;

    @Column(name = "create_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
