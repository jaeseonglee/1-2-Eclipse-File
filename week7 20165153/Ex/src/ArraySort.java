//��ü�� ũ������� ���� 
public class ArraySort {
	public static void dim_sort(Employee [] dim) {
		for(int i =0; i<dim.length-1; i++) {
			int least = i;
			for(int j = i+1;j<dim.length; j++) {
				//���� ���� ������ ���� ��ü�� Ž��
				if( dim[least].getPay() > dim[j].getPay() ) {
					least = j;
				}
				//��ü ��ȯ
				Employee temp =dim[i];
				dim[i] = dim[least];
				dim[least] = temp;
				}
		}
	}
}
