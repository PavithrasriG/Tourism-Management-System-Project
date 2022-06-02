package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long>{

public	Visitor findByVisitorName(String visitorName);

public Visitor findByVisitorMobileNumber(String visitorMobileNumber);

public Visitor findByVisitorEmailId(String visitorEmailId);

public Visitor findByVisitorAddress(String visitorAddress);

public Visitor findByVisitorDestination(String visitorDestination);

}
