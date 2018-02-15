package SampleFeb15.Test;

public class JenkinsTest {
	static int empId;
	static int age;
	static double salary;
	static double vpay;
	
	public static void main(String[] args)
	{
		JenkinsTest jt = new JenkinsTest();
		jt.empId=1002;
		jt.age=32;
		jt.salary=1234.56;
		jt.vpay=123.32;
		System.out.println("Employee Id is" +empId);
		System.out.println("Employee age is" +age);
		System.out.println("Employee salary is" +salary);
		System.out.println("Employee variablepay is" +vpay);
		System.out.println("Hello All");
	}
}
