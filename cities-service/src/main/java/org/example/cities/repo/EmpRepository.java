package org.example.cities.repo;

import org.example.cities.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmpRepository extends PagingAndSortingRepository<Employee, Long>{
	Page<Employee> findAll(Pageable pageable);
}
