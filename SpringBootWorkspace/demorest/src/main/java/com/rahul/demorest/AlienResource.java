package com.rahul.demorest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.Statement;

@Path("aliens")
public class AlienResource {

	/*@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		Alien a1=new Alien();
		a1.setId(101);
		a1.setName("rahul");
		
		Alien a2=new Alien();
		a2.setId(102);
		a2.setName("pankaj");
		
		List<Alien> list=Arrays.asList(a1,a2);
		
		
		return list;
	}*/
	
	AlienRepo repo=new AlienRepo();
	
	//this mock db using class replica of jdbc
	
	/*@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})	
  public List<Alien> getAliens() {
	return (List<Alien>) repo.getAliens();
	  
  }
	
	@Path("alien/{id}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})	
  public Alien getAlien(@PathParam("id") int id) {
	return  repo.getAlien(id);
	  
  }
	
	@Path("create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Alien create(Alien a) {
		
		Alien al=null;
		System.out.println(a.getId()+a.getName());
	    al=	repo.create(a);
		
		return al;
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien saveOrUpdate(Alien a) {
		Alien al=repo.getAlien(a.getId());
		System.out.println(al.getId()+" "+al.getName());
		System.out.println(a.getId()+" "+a.getName());
		 al.setId(a.getId());
		 al.setName(a.getName());
		repo.saveOrUpdate(al);
		 return al;
	}
	
	@Path("delete/{id}")
	@DELETE
	public String delete(@PathParam("id")int  id) {
		Alien al=repo.getAlien(id);
		repo.delete(al);
		 return "deleted";
	}*/

	
	//using jdbc connection DB
	
	 
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})	
    public List<Alien> getAliens() {
	return (List<Alien>) repo.getAliens();
	}

	
	@Path("/{id}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})	
    public Alien getAlien(@PathParam("id") int id) {
		
		Alien a=repo.getAlien(id);
	return  a;
	  
  }
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Alien create(Alien a) {
		
		System.out.println(a.getId()+a.getNama());
	    repo.create(a);
		return a;
		
		
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Alien saveOrUpdate(Alien a) {
	
		if(repo.getAlien(a.getId()).getId()==0) {
			repo.create(a);
		}
		else {
	    repo.saveOrUpdate(a);
		}
		return a;
		
		
	}
	@Path("/{id}")
	@DELETE
	public Alien delete(@PathParam("id")int id) {
		
		Alien al=repo.getAlien(id);
		if(al.getId()!=0) {
		
		repo.delete(id);
			
			/*List<Integer> ids=new ArrayList<>();
			ids.add(104);
			ids.add(105);
		
		repo.deleteBySelectingID(ids);*/
	}
		
		return al;
		
	}
	
	/*@Path("deleteMultiple/{id}")
	@DELETE
	public Alien deleteList(@PathParam("id")List<Integer> id) {
		
		repo.deleteBySelectingID(id);
	
		
		return new Alien();
		
	}*/
}
