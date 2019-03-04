/**
 * @author Anjali
 *Dec 14, 2018
 *
 */
package com.collections;

public class HashCodeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setEmail("abc@mail.com");
		user.setId(12333);
		user.setName("Anjali");
		
		User us = new User();
		us.setEmail("abc@mail.com");
		us.setId(12333);
		us.setName("Anjali");
		
		System.out.println("user hashcode: "+user.hashCode());
		System.out.println("us hashcode: "+ us.hashCode());

		System.out.println(user.equals(us));
	}

}
class User{
	private long id;
	private String name;
	private String email;
	@Override
	public int hashCode() {
		//return 1;
		//implementing some hashcode logic
		
		return (int)id * name.hashCode() * email.hashCode();
		//int hash = new HashCodeBuilder(17,37).append(id).append(name); //can be added from Apache Commons Lang's HashCodeBuilder class
	}
	
	public boolean equals(Object o) {
		if(this ==o) return true;
		if(o==null) return false;
		if (this.getClass()!=o.getClass()) return false;
		User user = (User)o;
		return id == user.id && (name.equals(user.name)) && (email.equals(user.email));
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}