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
public class BaseCustInfoDTO extends BaseDTO {

	/**
	 * ID
	 */
	private int id;
	/**
	 * 客户编号
	 */
	private String custId;
	/**
	 * 客户姓名
	 */
	private String custName;
	/**
	 * 客户电话号码
	 */
	private String custPhoneNumber;
	/**
	 * 客户性别 0:女 1:男
	 */
	private int custSex;
	/**
	 * 客户备注信息
	 */
	private String description;

}
