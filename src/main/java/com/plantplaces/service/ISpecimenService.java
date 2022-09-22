package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/**
 * @CRUD operations for specimens
 *
 */

/**
 * @Get specimens from persistence layer
 * @param id a unique lookup
 * @return a specimen with a matching id
 *
 */
public interface ISpecimenService {
	
	

	SpecimenDTO fetchById(int id);
	
	
	/**
	 * Persist the given DTO
	 * @param specmenDTO
	 */
	void save(SpecimenDTO specimenDTO);

}