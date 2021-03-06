package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Visitor;
import com.example.demo.error.VisitorNotFoundException;

public interface VisitorService {

	Visitor saveVisitor(Visitor visitor);

	List<Visitor> fetchVisitorList();

	Visitor fetchVisitorById(Long visitorId) throws VisitorNotFoundException;

	void deleteVisitorById(Long visitorId) throws VisitorNotFoundException;

	Visitor updateVisitor(Long visitorId, Visitor visitor) throws VisitorNotFoundException;

	Visitor fetchVisitorByName(String visitorName);

	Visitor fetchVisitorByMobileNumber(String visitorMobileNumber);

	Visitor fetchVisitorByEmailId(String visitorEmailId);

	Visitor fetchVisitorByAddress(String visitorAddress);

	Visitor fetchVisitorByDestination(String visitorDestination);

}
