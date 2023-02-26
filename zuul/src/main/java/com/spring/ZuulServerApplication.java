package com.spring;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }

//	public static void main(String[] args) {
//		List<Product> list = new ArrayList<Product>();
//		Product p1 = new Product(1, "p1", 1);
//		Product p2 = new Product(2, "p2", 3);
//		Product p3 = new Product(1, null, 5);
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//
//		List<Product> distinctElements = list.stream().filter(distinctByKey(p -> p.getId()))
//				.collect(Collectors.toList());
//		System.out.println("test");
//		
//		Map<Product, Long> map = list.stream().collect(Collectors.groupingBy(e->e, LinkedHashMap::new, Collectors.counting()));
//		List<Product> keys = new ArrayList<>(map.keySet());
//	}
//
//	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
//		Map<Object, Boolean> map = new ConcurrentHashMap<>();
//		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
////	}

}
