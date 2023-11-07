package newproj;

public class customers{
		
		private String name,email;
		private int age;
		private double creditLimit;
		
		public customers(){
			name="default";
			email="abc@gmail.com";
			age=12;
			creditLimit=100000;
		}
		
		
		public customers(String n,String e,int a,double c){
			name=n;
			email=e;
			age=a;
			creditLimit=c;
		}
		
		String custdetail() {
			return name+" "+email+" "+age+" "+creditLimit;
		}
		
		
		
}
