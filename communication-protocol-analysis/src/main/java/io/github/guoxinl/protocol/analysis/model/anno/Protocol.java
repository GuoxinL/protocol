package io.github.guoxinl.protocol.analysis.model.anno;

import java.lang.annotation.*;

/**
 * 用于将一个对象标注为协议对象
 * <p>
 * 警告：
 * 1. 请给协议对象添加有效的构造函数
 * 2. 请给协议对象添加空构造函数
 * <p>
 * Create by guoxin on 2018/6/13
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Protocol {

    /**
     * 协议头：命令索引
     *
     * @return skip
     */
    short commandIndex();

    /**
     * 协议版本
     *
     * @return skip
     */
    short version();

    /**
     * 描述
     *
     * @return skip
     */
    String description() default "";

}
