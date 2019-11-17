package com.builderpattern.ex2;

public class User {

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	
	public User (String firstName, String lastName, int age, String phone, String address){
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	    this.phone = phone;
	    this.address = address;
	}
	
    public User(UserBuilder builder) {
    	  this.firstName = builder.firstName;
          this.lastName = builder.lastName;
          this.age = builder.age;
          this.phone = builder.phone;
          this.address = builder.address;
	}
	@Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
    
    
    
	public static void main(String[] args) {
	
		User user =  new UserBuilder("Karan", "Sharma").build();
				
		UserBuilder userBuilder2 = new UserBuilder("chinto", "Gandhi").address("Noida");
		
		UserBuilder userBuilder3 = new UserBuilder("chinto", "Peterson").age(12).phone("9891838838").address("Gurgaon");
				
		System.out.println(user);
		
	}
	
	static class UserBuilder 
	    {
	        private final String firstName;
	        private final String lastName;
	        private int age;
	        private String phone;
	        private String address;
	 
	        public UserBuilder(String firstName, String lastName) {
	            this.firstName = firstName;
	            this.lastName = lastName;
	        }
	        public UserBuilder age(int age) {
	            this.age = age;
	            return this;
	        }
	        public UserBuilder phone(String phone) {
	            this.phone = phone;
	            return this;
	        }
	        public UserBuilder address(String address) {
	            this.address = address;
	            return this;
	        }
	        //Return the finally consrcuted User object
	        public User build() {
	            User user =  new User(this);
	            validateUserObject(user);
	            return user;
	        }
	        private void validateUserObject(User user) {
	            //Do some basic validations to check 
	            //if user object does not break any assumption of system
	        }
	    }
	


}




