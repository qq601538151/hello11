/*
��������������

���ֲ������� & ��Ա����

1. �����ĸ�ʽ�� �������� ������ = ֵ;

2. �����ĸ��
	�����ڴ��п���һ���ڴ�ռ�
	�ڸÿռ�������(��������),������(������)
	�۱���������ָ���ķ�Χ�ڲ��ϵı仯

3. ������ע�⣺
	��ͬһ�����÷�Χ�ڣ������������ظ�
	�ڱ����������������Ƕ� {} ��
	�۾ֲ�����ʹ��ǰ���븳ֵ
	������������ʹ��
*/
class VariableTest1 {
	public static void main(String[] args) {
		
		//1. ����һ����������ֵ
		int var1 = 10;

		//2. ����һ������
		int var2;

		//3. Ϊ������ֵ
		var2 = 20;

		System.out.println(var1);

		var1 = 100;

		System.out.println(var1);


		if(true){
			int var3 = 300;
			System.out.println(var3);

			System.out.println(var1);
		}
		
		
		int var4 = 10;
		System.out.println(var4);

		System.out.println(var1 + var4);
	}


	public static void show(){
		int var1 = 200;
	}
}
