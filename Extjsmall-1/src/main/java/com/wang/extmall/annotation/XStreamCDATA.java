package com.wang.extmall.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:yang.wang@ozstrategy.com">Yang Wang</a>
 * @version  06/12/2016 11:00
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface XStreamCDATA { }
