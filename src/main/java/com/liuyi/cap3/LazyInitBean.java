package com.liuyi.cap3;

import lombok.Data;

/**
 * lazy-init="true"
 * 容器启动时，不会实例化Bean
 * 调用context.getBean()时，才会进行实例化
 */
@Data
public class LazyInitBean {
}
