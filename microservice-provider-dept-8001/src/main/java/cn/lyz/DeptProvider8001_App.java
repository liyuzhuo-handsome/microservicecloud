package cn.lyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient //服务发现
@ComponentScan(value = "cn.lyz")
@EnableDiscoveryClient
public class DeptProvider8001_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
