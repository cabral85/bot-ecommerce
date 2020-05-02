package com.cabralbots.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "B_USER_PRODUCT")
public class UserProduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user_product")
    private Long idUserProduct;

    @OneToOne
    @JoinColumn(name = "id_user")
    @Column(name = "id_user")
    private User user;

    @OneToOne
    @JoinColumn(name = "id_product")
    @Column(name = "id_product")
    private Product product;

    @Column(name = "activation_code")
    private String activationCode;

    @Override
    public String toString() {
        return "UserProduct{" +
                "idUserProduct=" + idUserProduct +
                ", user=" + user +
                ", product=" + product +
                ", activationCode='" + activationCode + '\'' +
                '}';
    }
}
