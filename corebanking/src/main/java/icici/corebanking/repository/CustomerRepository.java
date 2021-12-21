package icici.corebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import icici.corebanking.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
