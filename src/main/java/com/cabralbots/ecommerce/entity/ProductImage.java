package com.cabralbots.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "B_PRODUCT_IMAGE")
@NoArgsConstructor
public class ProductImage implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProductImage;

    @Column(name = "id_product")
    @ManyToOne
    @JoinColumn(name = "id")
    private Product product;

    @Column(name = "path_image", length = 1000, nullable = false)
    private String pathImage;

    @Override
    public String toString() {
        return "ProductImage{" +
                "idProductImage=" + idProductImage +
                ", Product=" + product +
                ", pathImage='" + pathImage + '\'' +
                '}';
    }
}
