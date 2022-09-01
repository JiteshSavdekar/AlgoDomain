package com.producat.producat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducatController {
	@Autowired
	public ProducatServies li;
	@GetMapping(path="/Getproducatlist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<ProducatPojoFile> getData() {
		List<ProducatPojoFile>producat =new ArrayList<ProducatPojoFile>();
		producat=li.getData();
		return producat;
	}
	
	@PostMapping("/PostCoustomer")
	@CrossOrigin(origins = "http://localhost:4200")
	public ProducatPojoFile saveproducat(@RequestBody ProducatPojoFile producat)
	{
		return li.saveProducatPojoFileDataToDB(producat);
	}
	
	@GetMapping("/GetOneIdCoustomer/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ProducatPojoFile  GetById(@PathVariable int id) {
		return li.fetchProducatDataById(id).get();
	}
	
	@DeleteMapping("/DeleteCoustomer/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String DeleteById(@PathVariable int id) {
		return li.deleteProducatDataById(id);
	}
}
