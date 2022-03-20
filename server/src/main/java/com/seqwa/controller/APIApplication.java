package com.seqwa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seqwa.dao.AutocompleteResult;
import com.seqwa.service.SeqwaAutocompleteService;

@RestController
@RequestMapping(value = "/api")
public class APIApplication {

	@Autowired
	private SeqwaAutocompleteService autocompleteService;

	/**
	 * 
	 * @param query
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/autocomplete")
	public AutocompleteResult autocomplete(@ModelAttribute(value = "query") String query) {
		return autocompleteService.autocomplete(query);
	}

}
