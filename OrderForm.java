package test;

public class OrderForm {

	/**
	 * 顾客昵称、电话、地址
	 */
	private String name;
	private String tel;
	private String addr;

	// 初始化5个菜单信息
	Menu[] menu = new Menu[3];

	// 订单状态
	int[] states = new int[3];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
