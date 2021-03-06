package edu.fudan.autologin.pojos;

public class ItemInfo {
private String impress;
	public String getImpress() {
	return impress;
}

public void setImpress(String impress) {
	this.impress = impress;
}

	private String sellerId;
	private String priceRange = "0";
	private String freightPrice = "0";
	private int saleNumIn30Days = 0;
	private int reviews = 0;
	private int viewCounter = 0;

	private String payType;

	private String serviceType = "0";
	private String spec = "0";
	private String capacity = "0";
	private String firstReviewDate = "0";
	private String lastReviewDate = "0";
	private String userRateHref;
	private String itemDetailHref;
	private String itemType = "0";
	
	private String indicator = "0";

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getUserRateHref() {
		return userRateHref;
	}

	public void setUserRateHref(String userRateHref) {
		this.userRateHref = userRateHref;
	}

	public String getItemReviewsHref() {
		return itemReviewsHref;
	}

	public void setItemReviewsHref(String itemReviewsHref) {
		this.itemReviewsHref = itemReviewsHref;
	}

	public String getItemBuyersHref() {
		return itemBuyersHref;
	}

	public void setItemBuyersHref(String itemBuyersHref) {
		this.itemBuyersHref = itemBuyersHref;
	}

	private String itemReviewsHref;
	private String itemBuyersHref;

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public String getItemDetailHref() {
		return itemDetailHref;
	}

	public void setItemDetailHref(String itemDetailHref) {
		this.itemDetailHref = itemDetailHref;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public String getFreightPrice() {
		return freightPrice;
	}

	public void setFreightPrice(String freightPrice) {
		this.freightPrice = freightPrice;
	}

	public int getSaleNumIn30Days() {
		return saleNumIn30Days;
	}

	public int getViewCounter() {
		return viewCounter;
	}

	public void setViewCounter(int viewCounter) {
		this.viewCounter = viewCounter;
	}

	public void setSaleNumIn30Days(int saleNumIn30Days) {
		this.saleNumIn30Days = saleNumIn30Days;
	}

	public int getReviews() {
		return reviews;
	}

	public void setReviews(int reviews) {
		this.reviews = reviews;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getFirstReviewDate() {
		return firstReviewDate;
	}

	public void setFirstReviewDate(String firstReviewDate) {
		this.firstReviewDate = firstReviewDate;
	}

	public String getLastReviewDate() {
		return lastReviewDate;
	}

	public void setLastReviewDate(String lastReviewDate) {
		this.lastReviewDate = lastReviewDate;
	}
}
