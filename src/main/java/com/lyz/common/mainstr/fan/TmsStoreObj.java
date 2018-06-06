package com.lyz.common.mainstr.fan;

public class TmsStoreObj {
	private static final long serialVersionUID = 1L;
	private String storeNum;
	private String storeName;
	private String addressNum;
	private String address;
	private String totalVolume;
	private String totalWeight;

	public String getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddressNum() {
		return addressNum;
	}

	public void setAddressNum(String addressNum) {
		this.addressNum = addressNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(String totalVolume) {
		this.totalVolume = totalVolume;
	}

	public String getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	@Override
	public String toString() {
		return "TmsStoreObj [storeNum=" + storeNum + ", storeName=" + storeName + ", addressNum=" + addressNum
				+ ", address=" + address + ", totalVolume=" + totalVolume + ", totalWeight=" + totalWeight + "]";
	}

}
