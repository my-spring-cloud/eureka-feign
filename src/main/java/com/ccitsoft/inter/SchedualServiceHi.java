package com.ccitsoft.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * <p>Description: [Feign 采用的是基于接口的注解]</p>
 * Created on 2018年6月20日
 * @author  <a href="mailto: lichao8941188@163.com">李超</a>
 * @version 1.0 
 * Copyright (c) 2018
 */
@FeignClient(value = "service-ali1",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	/**
	 * <p>Discription:[将找到注册名称为service-al1下。/hi请求路径]</p>
	 * Created on 2018年6月20日
	 * @param name 参数名称
	 * @return
	 * @author:[李超]
	 */
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
