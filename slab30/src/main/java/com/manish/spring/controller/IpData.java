package com.manish.spring.controller;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@ConfigurationProperties("myserver")
@Data
@ToString
public class IpData {
	List<String> ip;
}
