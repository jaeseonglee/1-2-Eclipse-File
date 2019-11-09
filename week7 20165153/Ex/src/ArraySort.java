//객체를 크기순으로 정렬 
public class ArraySort {
	public static void dim_sort(Employee [] dim) {
		for(int i =0; i<dim.length-1; i++) {
			int least = i;
			for(int j = i+1;j<dim.length; j++) {
				//가장 작은 연봉을 갖는 객체를 탐색
				if( dim[least].getPay() > dim[j].getPay() ) {
					least = j;
				}
				//객체 교환
				Employee temp =dim[i];
				dim[i] = dim[least];
				dim[least] = temp;
				}
		}
	}
}
