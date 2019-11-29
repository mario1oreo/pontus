package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 *
 * @date 2019-11-20
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class PrdInventoryInfoDTO extends BaseDTO {

	/**
	 * ID
	 */
	private int id;
	/**
	 * 商品ID
	 */
	private String productId;
	/**
	 * 商品批次号
	 */
	private int batchNo;
	/**
	 * 产品规格单位
	 */
	private String productUnit;
	/**
	 * 商品数量
	 */
	private java.math.BigDecimal productQuantity;

}
