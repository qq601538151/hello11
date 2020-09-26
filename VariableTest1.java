/*
变量：保存数据
“局部变量” & 成员变量
1. 变量的格式： 数据类型 变量名 = 值;

2. 变量的概念：
	①在内存中开辟一块内存空间
	②该空间有类型(数据类型),有名称(变量名)
	③变量可以在指定的范围内不断的变化

3. 变量的注意：
	①同一个作用范围内，变量名不能重复
	②变量作用在所属的那对 {} 内
	③局部变量使用前必须赋值
	④先声明，后使用
*/
class VariableTest1 {
	public static void main(String[] args) {
		
		//1. 声明一个变量并赋值
		int var1 = 10;

		//2. 声明一个变量
		int var2;

		//3. 为变量赋值
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


	
}
