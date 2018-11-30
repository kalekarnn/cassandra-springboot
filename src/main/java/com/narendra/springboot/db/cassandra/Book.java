package com.narendra.springboot.db.cassandra;


import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;


@Table(value = "book")
public class Book {

    @PrimaryKeyColumn(name = "auther", ordinal = 0, type = PrimaryKeyType.CLUSTERED)
    String auther;

    @PrimaryKeyColumn(name = "isbn", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    int isbn;

    @Column
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", auther='" + auther + '\'' +
                '}';
    }
}
