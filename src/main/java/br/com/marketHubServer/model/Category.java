/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marketHubServer.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Tiago Albuquerque
 */
@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToMany
    private List<CategoryItem> items;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<CategoryItem> getItems() {
        return items;
    }

    public void setItems(List<CategoryItem> items) {
        this.items = items;
    }

}
