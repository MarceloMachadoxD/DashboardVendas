package com.github.marcelomachadoxd.dsvendas.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer visited;
    private Integer deals;
    private Double amount;

    @Column(name = "date")
    private Date localDate;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    public Sale() {
    }


    public Sale(Long id, Integer visited, Integer deals, Double amount, Date localDate, Seller seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.localDate = localDate;
        this.seller = seller;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getLocalDate() {
        return localDate;
    }

    public void setLocalDate(Date localDate) {
        this.localDate = localDate;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(id, sale.id) && Objects.equals(visited, sale.visited) && Objects.equals(deals, sale.deals) && Objects.equals(amount, sale.amount) && Objects.equals(localDate, sale.localDate) && Objects.equals(seller, sale.seller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, visited, deals, amount, localDate, seller);
    }

    @Override
    public String toString() {
        return "Sale{" +
            "id=" + id +
            ", visited=" + visited +
            ", deals=" + deals +
            ", amount=" + amount +
            ", localDate=" + localDate +
            ", seller=" + seller +
            '}';
    }
}
