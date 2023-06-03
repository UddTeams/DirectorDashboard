package com.dashboard.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.main.entity.CommonCardDirectorDashboard;
import com.dashboard.main.service.CommonCardDirectorDashboardService;

@RestController
public class CommonCardDirectorDashboardController {
	
	@Autowired
	CommonCardDirectorDashboardService commonCardDirectorDashboardService;
	
	

	@PostMapping("/common_card_data_create")
	public String CommonCardDataCreate(@RequestBody CommonCardDirectorDashboard obj) {
		String result = commonCardDirectorDashboardService.CommonCardDataCreateService(obj);
		return result;
	}
	
	@PostMapping("/common_card_data_fetch")
	public List<CommonCardDirectorDashboard> CommonCardDataFetch(@RequestBody CommonCardDirectorDashboard obj) {
		List<CommonCardDirectorDashboard> result = commonCardDirectorDashboardService.CommonCardDataFetchService(obj);
		return result;
	}
	
	
}
