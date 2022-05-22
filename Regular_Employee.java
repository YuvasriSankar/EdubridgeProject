package com.tableperhierarchyusingannotation;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
	//import javax.persistence.*;  
@Entity  
		@DiscriminatorValue("regularemployee")  
	public class Regular_Employee extends Employee{    
		      
		@Column(name="salary")    
		private float salary;  
		  
		@Column(name="bonus")     
		private int bonus;

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public int getBonus() {
			return bonus;
		}

		public void setBonus(int bonus) {
			this.bonus = bonus;
		}  


}
