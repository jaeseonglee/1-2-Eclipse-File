// 과제 2번 
public class Date {
	public int years,month,day;
	
	public String display1() { // "2012.7.12" 형식으로 출력
		return years+"."+ month+"."+ day;
	}
	
	public String display2() { // "July 12, 2012" 형식으로 출력
		String[] m ={"January", "February", "March","April","May","June","July","August","September","October","November"," December"}; 
		return m[month-1] +" "+ day+". "+ years;
	}
}
