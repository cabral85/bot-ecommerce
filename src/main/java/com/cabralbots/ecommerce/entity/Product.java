package com.cabralbots.ecommerce.entity;

import com.cabralbots.ecommerce.base.TypeProduct;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "B_PRODUCT")
@NoArgsConstructor
@Entity
public class Product implements Serializable {
    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;

    @Column(name = "product_name", length = 30, nullable = false)
    private String productName;

    @Column(name = "product_desc", length = 400, nullable = false)
    private String productDesc;

    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "download_path", length = 1000, nullable = false)
    private String downloadPath;

    @Column(name = "type_product")
    private TypeProduct typeProduct;

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", isAvailable=" + isAvailable +
                ", price=" + price +
                ", downloadPath='" + downloadPath + '\'' +
                ", typeProduct ='" + typeProduct + '\'' +
                '}';
    }
}
