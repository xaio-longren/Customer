package test;

import java.util.Scanner;

public class Customer {

	Scanner input = new Scanner(System.in);
	OrderForm order_Form;

	/**
	 * 修改信息 name 昵称 tel 电话号码 addr地址
	 */
	public void modify() {
		if (order_Form.getName() == null) {
			System.out.println("您还没有注册信息！");
		} else {		
				System.out.println("请输入新的昵称：");
				order_Form.setName(input.next());
				System.out.println("请输入新的电话号码：");
				order_Form.setTel(input.next());
				System.out.println("请输入新的地址：");
				order_Form.setAddr(input.next());
				System.out.println("修改成功!");
			} 
		}
	
	/**
	 * 删除订单
	 * 
	 */
	public void del() {
		getForm();
		if (order_Form.menu[0] != null) {
			//为防止损害消费者权益，订单需签收才能删除
			System.out.println("请输入要删除的订单序列号(先签收,后删除)");
			int num = input.nextInt();
			if (order_Form.states[num - 1] == 0) {
				System.out.println("您选择的订单未签收,不可删除！");
			} else {
				for (int i = num - 1; i < this.order_Form.menu.length - 1; i++) {
					this.order_Form.menu[num - 1] = null;
					this.order_Form.states[num - 1] = 0;
					System.out.println("删除成功");
				}
			}
		}
	}

	/**
	 * 签收订单
	 */

	public void signFor() {
		getForm();
		if (order_Form.menu[0] != null) {
			System.out.println("请输入要签收的订单序列号：");
			int num = input.nextInt();

			if (order_Form.states[num - 1] == 0) {
				order_Form.states[num - 1] = 1;
				System.out.println("订单签收成功!");

			} else if (order_Form.states[num - 1] == 1) {
				System.out.println("订单签收成功,不需重新签收!");
			}
		}
	}

	/**
	 * 查看订单信息
	 */
	public void getForm() {

		int count = 0;
		if (order_Form.getName() != null) {
			System.out.println("订餐人：" + order_Form.getName());
			System.out.println("\n订餐人电话：" + order_Form.getTel());
			System.out.println("\n送餐地址：" + order_Form.getAddr());
		}
		if (order_Form.menu != null) {
			System.out.println("订单序号\t所点菜品\t菜品价格\t所点数量\t订单状态");
		}
		for (int i = 0; i < order_Form.menu.length; i++) {
			if (order_Form.menu != null) {
				try {
					order_Form.menu[i].check();
					if (order_Form.states[i] == 0) {
						System.out.println("" + "\t待签收");
					} else {
						System.out.println("\t已签收");
					}
				}catch (NullPointerException e){
					
				}
				count++;
			}
		}
		if (count == 0) {
			System.out.println("您没有任何订单记录！");
		}
	}

	/**
	 * 点餐方法
	 */
	public void order(OrderForm orderForm) {
		if (order_Form.getName() == null) {
			System.out.println("请输入您的昵称：");
			order_Form.setName(input.next());
		}
		if (order_Form.getTel() == null) {
			System.out.println("请输入您的电话号码：");
			order_Form.setTel(input.next());
		}

		if (order_Form.getAddr() == null) {
			System.out.println("请输入您的地址：");
			order_Form.setAddr(input.next());
		}
		if (orderForm.menu[orderForm.menu.length - 1] != null) {
			System.out.println("存储空间已满，无法存储！");
		} else {
			String choice = "";
			Menu menu = null;
			do {
				System.out.println("请选择您想要点的食品类型：1.菜品 2.饮料");
				choice = input.next();
				if (choice.equals("1")) {
					menu = new Dishes();
					menu = (Dishes)menu;
				} else if (choice.equals("2")) {
					menu = new Drinks();
				} else {

					System.out.println("您的输入有误，请重新输入");
				}
			} while (!(choice.equals("1") || choice.equals("2")));

			menu.show();
			System.out.println("请根据编号选择食品");
			int food = input.nextInt();
			System.out.println("请输入点餐份数：");
			int num = input.nextInt();
			menu.add(food, num);

			for (int i = 0; i < this.order_Form.menu.length; i++) {
				if (this.order_Form.menu[i] == null) {
					this.order_Form.menu[i] = menu;
					System.out.println("订餐成功！");
					break;
				}
			}

		}
	}
}
