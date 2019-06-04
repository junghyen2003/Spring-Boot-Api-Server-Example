package com.springboot.oauth.apiserver.repository;

import com.springboot.oauth.apiserver.dao.Node;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NodeRepository extends PagingAndSortingRepository <Node, Long>{
}
