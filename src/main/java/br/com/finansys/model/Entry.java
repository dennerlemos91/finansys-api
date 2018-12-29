package br.com.finansys.model;

import br.com.finansys.model.enums.TypeLancamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Entry {

    private Long id;
    private String name;
    private String description;
    private TypeLancamento type;
    private BigDecimal amount;
    private LocalDate date;
    private Boolean paid;
    private Category category;

    public Entry(Long id, String name, String description, TypeLancamento type, BigDecimal amount, LocalDate date, Boolean paid, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.category = category;
    }

    public Entry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeLancamento getType() {
        return type;
    }

    public void setType(TypeLancamento type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
