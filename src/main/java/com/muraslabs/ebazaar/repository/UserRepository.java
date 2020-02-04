package com.muraslabs.ebazaar.repository;

import com.muraslabs.ebazaar.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
