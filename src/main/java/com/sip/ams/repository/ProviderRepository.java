package com.sip.ams.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sip.ams.entities.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {

}
