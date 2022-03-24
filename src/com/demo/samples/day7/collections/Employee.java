package com.demo.samples.day7.collections;

public class Employee implements Comparable{
	
	    private String empname;
	    private int rollno;
	    private int empage;

	    public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public int getEmpage() {
			return empage;
		}
		public void setEmpage(int empage) {
			this.empage = empage;
		}
		public Employee(int rollno, String empname, int empage) {
	        this.rollno = rollno;
	        this.empname = empname;
	        this.empage = empage;
	    }
	    
	    @Override
	    public String toString() {
	        return "[ rollno=" + rollno + ", name=" + empname + ", age=" + empage + "]";
	    }
		
		
		@Override
		public int compareTo(Object o) {
			// For Ascending order of age
			//int compareage=((Employee)o).getEmpage();
			// return this.empage - compareage;
	        
			
			/* For Ascending order of names*/
			
			String name = ((Employee)o).getEmpname();
			
	        return this.empname.compareTo(name);
		}

	}

