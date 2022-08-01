package test;

public class Drinks implements Menu {

	// 饮料名称
	private String[] drinks_Names = { "红茶", "绿茶", "矿泉水", "牛奶", "奶茶" };

	// 饮料单价
	private double[] drinks_Prices = { 5, 5, 3, 6, 16 };

	// 选择饮料的名称
	private String[] choice_Drinks_Names = new String[drinks_Names.length];

	// 选择菜品的单价
	private double[] choice_Drinks_Prices = new double[drinks_Prices.length];

	// 选择饮料的份数
	private int[] num = new int[choice_Drinks_Names.length];

	/**
	 * 打印饮品信息
	 */

	public void show() {
		System.out.println("饮品序号\t饮品名称\t饮品单价");
		for (int i = 0; i < drinks_Names.length; i++) {
			System.out.println((i + 1) + "\t" + drinks_Names[i] + "\t" + drinks_Prices[i]);

		}

	}

	/**
	 * 添加饮品
	 */
	public void add(int index, int num) {
		for (int i = 0; i < choice_Drinks_Names.length; i++) {
			if (choice_Drinks_Names[i] == null) {
				choice_Drinks_Names[i] = drinks_Names[index - 1];
				choice_Drinks_Prices[i] = drinks_Prices[index = 1];
				this.num[i] = num;
				break;
			}
		}

	}

	/**
	 * 打印选择的饮品信息
	 */
	public void check() {
		for (int i = 0; i < choice_Drinks_Names.length; i++) {
			if (choice_Drinks_Names[i] != null) {
				System.out.print("\t" + choice_Drinks_Names[i] + "\t￥" + choice_Drinks_Prices[i] + "\t" + num[i]);
			}
		}

	}

}
