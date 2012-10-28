/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version ${license.version})
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.web.mvc.viewbean;

import java.io.Serializable;

public class ProductSkuViewBean implements Serializable {

	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = -5163066749293135126L;
	
	protected int positionItem;
	protected String name;
	protected String description;
	protected String backgroundImage;
	protected String carouselImage;
	protected String iconImage;
	
	protected String addToCartUrl;
	protected String addToCartLabel;
	protected String removeFromCartUrl;
	protected String removeFromCartLabel;

	protected String addToWishlistUrl;
	protected String addToWishlistLabel;
	protected String removeFromWishlistUrl;
	protected String removeFromWishlistLabel;
	
	protected String productDetailsUrl;
	protected String productDetailsLabel;

	public int getPositionItem() {
		return positionItem;
	}

	public void setPositionItem(int positionItem) {
		this.positionItem = positionItem;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public String getCarouselImage() {
		return carouselImage;
	}
	
	public void setCarouselImage(String carouselImage) {
		this.carouselImage = carouselImage;
	}
	
	public String getIconImage() {
		return iconImage;
	}

	public void setIconImage(String iconImage) {
		this.iconImage = iconImage;
	}

	public String getAddToCartUrl() {
		return addToCartUrl;
	}

	public void setAddToCartUrl(String addToCartUrl) {
		this.addToCartUrl = addToCartUrl;
	}

	public String getAddToCartLabel() {
		return addToCartLabel;
	}

	public void setAddToCartLabel(String addToCartLabel) {
		this.addToCartLabel = addToCartLabel;
	}

	public String getRemoveFromCartUrl() {
		return removeFromCartUrl;
	}

	public void setRemoveFromCartUrl(String removeFromCartUrl) {
		this.removeFromCartUrl = removeFromCartUrl;
	}

	public String getRemoveFromCartLabel() {
		return removeFromCartLabel;
	}

	public void setRemoveFromCartLabel(String removeFromCartLabel) {
		this.removeFromCartLabel = removeFromCartLabel;
	}

	public String getAddToWishlistUrl() {
		return addToWishlistUrl;
	}

	public void setAddToWishlistUrl(String addToWishlistUrl) {
		this.addToWishlistUrl = addToWishlistUrl;
	}

	public String getAddToWishlistLabel() {
		return addToWishlistLabel;
	}

	public void setAddToWishlistLabel(String addToWishlistLabel) {
		this.addToWishlistLabel = addToWishlistLabel;
	}

	public String getRemoveFromWishlistUrl() {
		return removeFromWishlistUrl;
	}

	public void setRemoveFromWishlistUrl(String removeFromWishlistUrl) {
		this.removeFromWishlistUrl = removeFromWishlistUrl;
	}

	public String getRemoveFromWishlistLabel() {
		return removeFromWishlistLabel;
	}

	public void setRemoveFromWishlistLabel(String removeFromWishlistLabel) {
		this.removeFromWishlistLabel = removeFromWishlistLabel;
	}

	public String getProductDetailsUrl() {
		return productDetailsUrl;
	}

	public void setProductDetailsUrl(String productDetailsUrl) {
		this.productDetailsUrl = productDetailsUrl;
	}

	public String getProductDetailsLabel() {
		return productDetailsLabel;
	}

	public void setProductDetailsLabel(String productDetailsLabel) {
		this.productDetailsLabel = productDetailsLabel;
	}

}
