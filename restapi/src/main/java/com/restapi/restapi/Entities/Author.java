package com.restapi.restapi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int author_id;
    private String Name;
    private String Address;
    public int getAuthor_id() {
        return author_id;
    }
    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    @Override
    public String toString() {
        return "Author [author_id=" + author_id + ", Name=" + Name + ", Address=" + Address + "]";
    }
    public Author(int author_id, String name, String address) {
        this.author_id = author_id;
        Name = name;
        Address = address;
    }
    public Author() {
    }
    

}
