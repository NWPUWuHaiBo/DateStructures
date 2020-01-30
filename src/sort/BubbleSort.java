package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;




public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = new int[80000];
		for(int i =0; i < 80000;i++) {
			arr[i] = (int)(Math.random() * 8000000); //����һ��[0, 8000000) ��
		}
		
		Date data1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1Str = simpleDateFormat.format(data1);
		System.out.println("����ǰ��ʱ����=" + date1Str);
		
		//����ð������
		bubbleSort(arr);
		
		Date data2 = new Date();
		String date2Str = simpleDateFormat.format(data2);
		System.out.println("������ʱ����=" + date2Str);
		
	}
	
	public static void bubbleSort(int[] arr) {
		// ð������ ��ʱ�临�Ӷ� O(n^2), �Լ�д��
		int temp = 0; // ��ʱ����
		boolean flag = false; // ��ʶ��������ʾ�Ƿ���й�����
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				// ���ǰ������Ⱥ���������򽻻�
				if (arr[j] > arr[j + 1]) {
					//�Ż�
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (!flag) { // ��һ�������У�һ�ν�����û�з�����
				break;
			} else {
				flag = false; // ����flag!!!, �����´��ж�
			}
		}
	}

}
