package com.cabralbots.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "B_USER_PRODUCT")
public class UserProduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer idUserProduct;

    @ManyToMany
    @JoinColumn(name = "id")
    @Column(name = "id_user")
    private User user;

    @ManyToMany
    @JoinColumn(name = "id")
    @Column(name = "id_product")
    private Product product;

    @Column(name = "activation_code")
    private String activationCode;

    @Override
    public String toString() {
        return "UserProduct{" +
                "id=" + idUserProduct +
                ", user=" + user +
                ", product=" + product +
                '}';
    }
}
