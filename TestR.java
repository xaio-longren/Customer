package test;

import java.util.Scanner;

/**
 * 
 * @author XiaoLong
 *
 * @date 2022年8月1日 上午9:32:44
 *
 */
public class TestR {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Customer cus = new Customer();
		cus.order_Form = new OrderForm();

		System.out.println("欢迎光临来一口小吃店！");
		boolean exit = false;
		do {
			System.out.println("\n------------------------------------\n");
			System.out.println("1.开始点餐");
			System.out.println("2.查看口袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.修改信息");
			System.out.println("6.退出系统");
			System.out.println("\n------------------------------------\n");
			System.out.println("请根据序号进行选择：");
			switch (input.next()) {
			case "1":
				System.out.println("---开始点餐---");
				cus.order(cus.order_Form);
				break;
			case "2":
				System.out.println("---查看口袋---");
				cus.getForm();
				break;
			case "3":
				System.out.println("---签收订单---");
				cus.signFor();
				break;
			case "4":
				System.out.println("---删除订单---");
				cus.del();
				break;
			case "5":
				System.out.println("---修改信息---");
				cus.modify();
				break;
			case "6":
				System.err.println("是否退出系统（1.退出 2.继续）");
				if (input.next().equals("1")) {
					exit = true;

				}
				break;

			default:
				System.out.println("您的输入有误，请重新输入");

			}
		} while (!exit);
		if (exit)

		{
			System.out.println("感谢您的使用，再见！");
		}

	}

}
