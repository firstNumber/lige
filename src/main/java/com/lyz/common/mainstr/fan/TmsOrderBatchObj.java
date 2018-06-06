package com.lyz.common.mainstr.fan;

import java.util.ArrayList;
import java.util.List;

public class TmsOrderBatchObj {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String batchNum;
	private String batchStatus;
	private String orderType;
	private String totalVolume;
	private String totalWeight;
	private String createTime;
	private String warehouseNum;
	private String warehouseName;
	private String warehouseAdd;
	private String storageNum;
	private String storageName;
	private String storeNum;
	private String storeName;
	private String addressNum;
	private String address;
	private List orderShortList = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getWarehouseNum() {
		return warehouseNum;
	}

	public void setWarehouseNum(String warehouseNum) {
		this.warehouseNum = warehouseNum;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseAdd() {
		return warehouseAdd;
	}

	public void setWarehouseAdd(String warehouseAdd) {
		this.warehouseAdd = warehouseAdd;
	}

	public String getStorageNum() {
		return storageNum;
	}

	public void setStorageNum(String storageNum) {
		this.storageNum = storageNum;
	}

	public String getStorageName() {
		return storageName;
	}

	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}

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

	public List getOrderShortList() {
		return orderShortList;
	}

	public void setOrderShortList(List orderShortList) {
		this.orderShortList = orderShortList;
	}

	@Override
	public String toString() {
		return "TmsOrderBatchObj [id=" + id + ", batchNum=" + batchNum + ", batchStatus=" + batchStatus + ", orderType="
				+ orderType + ", totalVolume=" + totalVolume + ", totalWeight=" + totalWeight + ", createTime="
				+ createTime + ", warehouseNum=" + warehouseNum + ", warehouseName=" + warehouseName + ", warehouseAdd="
				+ warehouseAdd + ", storageNum=" + storageNum + ", storageName=" + storageName + ", storeNum="
				+ storeNum + ", storeName=" + storeName + ", addressNum=" + addressNum + ", address=" + address
				+ ", orderShortList=" + orderShortList + "]";
	}

}
