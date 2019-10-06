/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marketHubServer.dao;

import br.com.marketHubServer.model.CategoryItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tiago Albuquerque
 */
@Repository
public interface CategoryItemDAO extends PagingAndSortingRepository<CategoryItem, Integer> {
  
}