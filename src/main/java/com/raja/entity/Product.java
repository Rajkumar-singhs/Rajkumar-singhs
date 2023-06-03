package com.raja.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class Product {
@Id
@GeneratedValue
private Integer pid;

@NotBlank(message = "name is mandatory")
@Size(min = 3, max =15, message="Name shoud be only have 3 to 15 char")
private String name;

@NotNull(message = "price is mandatory")
@Positive(message="Price shoud be postive Number")
private Double price;

@NotNull(message = "Quantity is mandatory")
@Positive(message="Quantity shoud be postive Number")
private Integer qty;

public Integer getPid() {
return pid;
}

public void setPid(Integer pid) {
this.pid = pid;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Double getPrice() {
return price;
}

public void setPrice(Double price) {
this.price = price;
}

public Integer getQty() {
return qty;
}

public void setQty(Integer qty) {
this.qty = qty;
}

public Product(Integer pid, String name, Double price, Integer qty) {
super();
this.pid = pid;
this.name = name;
this.price = price;
this.qty = qty;
}

public Product() {
super();
}

@Override
public String toString() {
return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
}

}