package com.lyz.cabox.mogoDao;

public class Order {
	private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Order [account=" + account + "]";
	}

}
