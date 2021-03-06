package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Mobile;
import com.capgemini.model.Response;
import com.capgemini.service.MobileService;

@RestController
@RequestMapping("/mobiles")
public class MobileController {
	
	@Autowired
	private MobileService mobileService; 
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Mobile> addMobiles(@RequestBody Mobile mobile){
		return mobileService.addMobile(mobile);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Mobile> updateMobile(@RequestBody Mobile mobile){
		return mobileService.updateMobile(mobile);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<Mobile>> getAllMobiles(){
		return mobileService.getAllMobiles();
	}
	
	@GetMapping(value="/{mobileId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Mobile> getMobile(@PathVariable("mobileId") Integer mobileId){
		return mobileService.getMobile(mobileId);
	}
	
	@GetMapping(value="/company/{compName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<Mobile>> getMobileByCompanyName(@PathVariable("compName") String compName){
		return mobileService.getMobileByCompany(compName);
	}
	
	@DeleteMapping(value="/{mobileId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Boolean> deleteMobile(@PathVariable("mobileId") Integer mobileId){
		return mobileService.deleteMobile(mobileId);
	}

}
