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
public class ConfProductCategoryDTO extends BaseDTO {

	/**
	 * ID
	 */
	private int id;
	/**
	 * 产品类别ID
	 */
	private String productCategoryId;
	/**
	 * 产品类别编码
	 */
	private String productCategoryCode;
	/**
	 * 产品类别名称
	 */
	private String productCategoryName;
	/**
	 * 产品类别级别 1 2 3
	 */
	private int productCategoryLevel;

}
