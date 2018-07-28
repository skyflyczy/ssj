package com.ssj.biz.api;

import org.springframework.cloud.netflix.feign.FeignClient;
/**
 * 用户信息
 * @author zhiya.chai
 * @date 2018年7月3日 下午6:05:24
 */
@FeignClient(value = "ssj-biz",path="/userinfo")
public interface UserInfoAPI{

}
