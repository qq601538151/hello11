/*
标识符：在 Java 中凡是自己命名的地方都叫标识符。例如：包名、类名、接口名、变量名、方法名、常量名

关键字：被 Java 赋予了特殊含义的单词

1. 命名的规则（必须遵守，若不遵守编译不能通过）
①只能有字母 a-z  A-Z  数字 0-9  特殊字符 下划线"_"  美元符"$"
②数字不能开头
③名字之间不能有空格
④不能使用关键字和保留字，但是可以包含关键字和保留字
⑤Java 严格区分大小，但是长度无限制

2. 命名的规范（可以不遵守，但是会受到鄙视）
①包名：所有字母都小写。 如: xxxyyyzzz
②类名、接口名：若有多个单词，每个单词首字母大写。 如：XxxYyyZzz
③方法名、变量名：若有多个单词，第一个单词首字母小写，其余单词首字母都大写。如：xxxYyyZzz
④常量名：所有字母都大写，每个单词之间以 "_" 隔开。如： XXX_YYY_ZZZ
*/
class IdentificationTest {
	public static void main(String[] args) {

		int staticcc = 10;

		System.out.println(staticcc);

	}
}
