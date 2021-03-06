package com.saber.ecom.order.dto;

import java.io.Serializable;
import java.util.Objects;

public class OrderDto implements Serializable, Cloneable {

    private Integer id;
    private Double price;
    private Integer number;
    private String orderStatus;
    private String productDescription;
    public OrderDto() {
    }

    public OrderDto(Integer id, Double price, Integer number, String orderStatus, String productDescription) {
        this.id = id;
        this.price = price;
        this.number = number;
        this.orderStatus = orderStatus;
        this.productDescription = productDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDto orderDto = (OrderDto) o;
        return Objects.equals(id, orderDto.id) &&
                Objects.equals(price, orderDto.price) &&
                Objects.equals(number, orderDto.number) &&
                Objects.equals(orderStatus, orderDto.orderStatus) &&
                Objects.equals(productDescription, orderDto.productDescription)   ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, number, orderStatus, productDescription);
    }

    @Override
    public OrderDto clone() {
        try {
            return (OrderDto) super.clone();
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", price=" + price +
                ", number=" + number +
                ", orderStatus='" + orderStatus + '\'' +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
