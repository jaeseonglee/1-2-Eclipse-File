// ���� 2�� 
public class Date {
	public int years,month,day;
	
	public String display1() { // "2012.7.12" �������� ���
		return years+"."+ month+"."+ day;
	}
	
	public String display2() { // "July 12, 2012" �������� ���
		String[] m ={"January", "February", "March","April","May","June","July","August","September","October","November"," December"}; 
		return m[month-1] +" "+ day+". "+ years;
	}
}
