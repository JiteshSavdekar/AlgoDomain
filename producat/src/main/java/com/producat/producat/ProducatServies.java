package com.producat.producat;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ProducatServies {

	@Autowired
	PoducatRepo Jr;
	
	
public List<ProducatPojoFile> getData() {
		
		return Jr.findAll();
	}

	
	public ProducatPojoFile saveProducatPojoFileDataToDB(ProducatPojoFile producat)
	{
		return Jr.save(producat);
		
	}
	
	public Optional<ProducatPojoFile> fetchProducatDataById(int ProducatId) 
	{ 
		return Jr.findById(ProducatId);
		
	}
	
	public String deleteProducatDataById(int ProducatId) 
	{ 
		String result;
		try {
			Jr.deleteById(ProducatId);
			result="Coustmer Succesfilly Deleted";
		}
		catch (Exception e)
		{
			result="Coustmer Not Deleted";
		}
		return result;
	}
}
