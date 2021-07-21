package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
    
	@Query(value="SELECT * FROM product u WHERE u.userid =?1",nativeQuery=true)
	List<Product> findbyUserId(Integer id);
    
//	@Query(value="SELECT * FROM product WHERE userid =:1",nativeQuery=true)
//	Iterable<Product> findAllByUserId(Iterable<Integer> id);
    
//	@Query(value="SELECT * FROM product u WHERE u.user =?1",nativeQuery=true)
//	List<Product> findAll(Product prods);
//    
	

	
	

}
