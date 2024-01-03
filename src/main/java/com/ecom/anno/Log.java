package com.ecom.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: Log
 * Package: com.ecom.anno
 * Description:
 *
 * @Author: 王方舟
 * @Create: 2024-01-03 - 15:31
 * @Version: v1.0
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {
}
