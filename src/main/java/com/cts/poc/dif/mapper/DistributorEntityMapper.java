package com.cts.poc.dif.mapper;

import org.springframework.stereotype.Service;

@Service
public class DistributorEntityMapper {

	/*
	 * public DistributorEntity populateEntity(com.cts.poc.dif.model.Distributor
	 * distributorModel) { DistributorEntity distributorEntity = new
	 * DistributorEntity();
	 * distributorEntity.setProcess_manager_identifier(distributorModel.
	 * getProcess_manager_identifier());
	 * distributorEntity.setName(distributorModel.getName());
	 * distributorEntity.setEstablishment_date(new Date());
	 * distributorEntity.setEnterprise_number(distributorModel.getEnterprise_number(
	 * )); distributorEntity.setLvf(distributorModel.getLvf().charAt(0));
	 * 
	 * Set<ConventionEntity> conventionEntitySet = new HashSet<>();
	 * distributorModel.getConvention().forEach(conventionModel -> {
	 * com.cts.poc.dif.entity.ConventionEntity conventionEntity = new
	 * com.cts.poc.dif.entity.ConventionEntity();
	 * conventionEntity.setProcess_manager_identifier(convention.
	 * getProcess_manager_identifier());
	 * conventionEntity.setCreated_by(convention.getCreated_by());
	 * 
	 * Set<ProcessSetupEntity> processSetupEntitySet = new HashSet<>();
	 * conventionModel.getProcess().forEach(processModel -> { ProcessSetupEntity
	 * processSetupEntity = new ProcessSetupEntity();
	 * BeanUtils.copyProperties(processModel, processSetupEntity);
	 * processSetupEntitySet.add(processSetupEntity); });
	 * conventionEntity.setProcess(processSetupEntitySet);
	 * conventionEntitySet.add(conventionEntity); });
	 * distributorEntity.setConvention(conventionEntitySet);
	 * 
	 * Set<com.cts.poc.dif.entity.EmployeeEntity> employeeEntitySet = new
	 * HashSet<>(); distributorModel.getEmployee().forEach(employee -> {
	 * com.cts.poc.dif.entity.EmployeeEntity employeeEntity = new
	 * com.cts.poc.dif.entity.EmployeeEntity();
	 * employeeEntity.setProcess_manager_identifier(employee.
	 * getProcess_manager_identifier());
	 * employeeEntity.setFirst_name(employee.getFirst_name());
	 * employeeEntity.setLast_name(employee.getLast_name());
	 * employeeEntity.setLvf(employee.getLvf().charAt(0));
	 * 
	 * employeeEntitySet.add(employeeEntity); });
	 * distributorEntity.setEmployee(employeeEntitySet);
	 * 
	 * return distributorEntity; }
	 */
}
