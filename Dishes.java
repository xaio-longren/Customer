package test;

public class Dishes implements Menu {

	// 菜品名称
	private String[] dishes_Names = { "臭豆腐", "肉夹馍", "酸辣粉", "煎饼馃子", "热干面", "烤冷面", "关东煮", "豆腐脑", "麻辣小龙虾", "烤羊肉串" };

	// 菜品单价
	private double[] dishes_Prices = { 5, 18, 20, 12, 22, 16, 35, 8, 60, 5 };

	// 选择菜品的名称
	private String[] choice_Dish_Names = new String[dishes_Names.length];

	// 选择菜品的单价
	private double[] choice_Dish_Prices = new double[dishes_Prices.length];

	// 选择菜品的份数
	private int[] num = new int[choice_Dish_Names.length];

	/**
	 * 打印菜品信息
	 */

	public void show() {
		System.out.println("菜品序号\t菜品名称\t菜品单价");
		for (int i = 0; i < dishes_Names.length; i++) {
			System.out.println((i + 1) + "\t" + dishes_Names[i] + "\t" + dishes_Prices[i]);

		}

	}

	/**
	 * 添加菜品
	 */
	public void add(int index, int num) {
		for (int i = 0; i < choice_Dish_Names.length; i++) {
			if (choice_Dish_Names[i] == null) {
				choice_Dish_Names[i] = dishes_Names[index - 1];
				choice_Dish_Prices[i] = dishes_Prices[index - 1];
				this.num[i] = num;
				break;
			}
		}

	}

	/**
	 * 打印选择的菜品信息
	 */
	public void check() {
		for (int i = 0; i < choice_Dish_Names.length; i++) {
			if (choice_Dish_Names[i] != null) {
				System.out.print(" " + (i + 1));
				System.out.print("\t" + choice_Dish_Names[i] + "\t￥" + choice_Dish_Prices[i] + "\t" + num[i]);
			}
		}

	}

	public String[] getDishes_Names() {
		return dishes_Names;
	}

	public void setDishes_Names(String[] dishes_Names) {
		this.dishes_Names = dishes_Names;
	}

	public double[] getDishes_Prices() {
		return dishes_Prices;
	}

	public void setDishes_Prices(double[] dishes_Prices) {
		this.dishes_Prices = dishes_Prices;
	}

	public String[] getChoice_Dish_Names() {
		return choice_Dish_Names;
	}

	public void setChoice_Dish_Names(String[] choice_Dish_Names) {
		this.choice_Dish_Names = choice_Dish_Names;
	}

	public double[] getChoice_Dish_Prices() {
		return choice_Dish_Prices;
	}

	public void setChoice_Dish_Prices(double[] choice_Dish_Prices) {
		this.choice_Dish_Prices = choice_Dish_Prices;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}
	
	

}
