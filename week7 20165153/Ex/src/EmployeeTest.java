// 객체 배열을 사용하여 처리
import java.util.*;
public class EmployeeTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Employee [] obj = new Employee[4];
		
		for(int i=0; i<obj.length; i++) {
			System.out.print("\n이름 입력: ");
			String name = key.nextLine();
			System.out.print("월급 입력: ");
			int sal = key.nextInt();
			          key.nextLine();
			//사용자로부터입력받은값을생성자형식매개변수로전달
			        //생성된객체의참조를객체배열 i번째에저장
			          obj[i] = new Employee(name,sal);
		}
		//객체배열원소출력
		for(Employee em : obj) {
			System.out.println(em);
		}
		//연봉을 기준으로 정렬한 후 출력 - 본인작성
		ArraySort sort = new ArraySort();
		sort.dim_sort(obj);
		// 필드 count 값 출력 - 본인작성
		System.out.println("객체수 출력: "+obj[3].getCount());
		
		
		
	}
}
