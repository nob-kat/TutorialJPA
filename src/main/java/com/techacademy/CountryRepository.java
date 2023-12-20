package com.techacademy;

import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryがJpaRepositoryを使用することで省略可能
public interface CountryRepository extends JpaRepository<Country, String> {

}