package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 *
 * @date 2019-11-13
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class BaseAddressInfoDTO extends BaseDTO {

	/**
	 * ID
	 */
	private int id;
	/**
	 * 地址编号
	 */
	private String addressId;
	/**
	 * 地址全称
	 */
	private String addressFull;
	/**
	 * 完整地址
	 */
	private String addressAddress;
	/**
	 * 地址-省
	 */
	private String addressProvince;
	/**
	 * 地址-市
	 */
	private String addressCity;
	/**
	 * 地址-区
	 */
	private String addressRegion;
	/**
	 * 地址-街道
	 */
	private String addressStreet;

}
