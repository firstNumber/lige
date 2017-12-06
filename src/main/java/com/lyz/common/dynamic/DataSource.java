package com.lyz.common.dynamic;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default DataSource.masterDataSource;
 
    public static String masterDataSource = "masterDataSource";
 
    public static String salveDataSource = "salveDataSource";

 
}
