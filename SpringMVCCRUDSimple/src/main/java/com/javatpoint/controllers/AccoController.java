package com.javatpoint.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.beans.Account;

import com.javatpoint.dao.AccoDao;
 

@Controller
public class AccoController {
	
	@Autowired
	AccoDao dao;
	
	@RequestMapping("/accoform")
	 public String showform(Model m){  
    	m.addAttribute("command", new Account());
    	return "accoform"; 
    }  
	  @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public String save(@ModelAttribute("acco") Account acco){  
	        dao.save(acco);  
	        return "redirect:/viewacco";//will redirect to viewemp request mapping  
	    } 
	  @RequestMapping("/viewacco")  
	    public String viewacco(Model m){  
	        List<Account> list=dao.getAccount();  
	        m.addAttribute("list",list);
	        return "viewacco";  
	    }  
	  
	  @RequestMapping(value="/editacco/{no}")  
	    public String edit(@PathVariable int no, Model m){  
		  Account acco=dao.getAccount();  
	        m.addAttribute("command",acco);
	        return "accoeditform";  
	    }  
	    /* It updates model object. */  
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
	    public String edit(@ModelAttribute("acco") Account acco){  
	        dao.update(acco);  
	        return "redirect:/viewacco";  
	    }  
	    /* It deletes record for the given id in URL and redirects to /viewemp */  
	    @RequestMapping(value="/deleteacco/{no}",method = RequestMethod.GET)  
	    public String delete(@PathVariable int no){  
	        dao.delete(no);  
	        return "redirect:/viewacco";  
	    }   
}
