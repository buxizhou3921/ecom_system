package com.ecom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * ClassName: Good
 * Package: com.ecom.entity
 * Description: 商品
 *
 * @ Author: wfz
 * @ Create: 2023-05-15 - 14:52
 * @ Version: v1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Good {
    private Integer gid;
    private String gname;
    private String gimg;
    private String description;
    private LocalDate proDate;
    private Double price;
    private String gtype;
    private String shop;
}
