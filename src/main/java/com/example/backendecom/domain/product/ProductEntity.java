package com.example.backendecom.domain.product;

import lombok.*;
import jakarta.persistence.*;
@Table(name = "products")
@Entity(name = "product")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProductEntity {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    public String id;
    private String code;
    private String name;
    private String description;
    private int price;

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
