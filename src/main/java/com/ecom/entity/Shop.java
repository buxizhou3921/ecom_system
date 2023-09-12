package com.ecom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Shop
 * Package: com.ecom.entity
 * Description: 商店
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:52
 * @ Version: v1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private Integer sid;
    private String sname;
    private String introduce;
}
