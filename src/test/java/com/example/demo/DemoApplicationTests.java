package com.example.demo;

import com.example.demo.mapstruct.Person;
import com.example.demo.mapstruct.User;
import com.example.demo.util.ConstansUtil;
import jdk.nashorn.internal.runtime.options.Option;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static org.junit.Assert.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private RedissonClient redissonClient;


	@Test
	public void testrediss(){

		System.out.println(redissonClient);
	}


	@Test
	public void contextLoads() {
		System.out.println("测试成功！");
		String a ="a";
		Assert.assertEquals("比较结果",1l,1l);

		Integer i = null ;
		Assert.assertNull(i);

	}

	@Test
	public void fixedThreadPoolTest(){

		//创建一个固定大小的线程池，可控制并发的线程数，超出的线程会在队列中等待
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i <10 ; i++) {
			executorService.execute(() -> {
				System.out.println("任务被执行，线程："+Thread.currentThread().getName());
			});
		}
	}


	@Test
	public void cachedThreadPool(){

		//创建一个可缓存的线程池，若线程数超过处理所需，缓存一段时间会回收，若线程数不够，则新建线程。
		ExecutorService executorService = Executors.newCachedThreadPool();

		for (int i = 0; i < 10; i++) {
			executorService.execute(() -> {
				System.out.println("任务被执行，线程："+Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			});
		}
	}


	@Test
	public void singleThreadPoolTest(){

		// 创建线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		// 执行任务
		for (int i = 0; i < 10; i++) {
			final int index = i;
			threadPool.execute(() -> {
				System.out.println(  ":任务被执行"+Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
				}
			});
		}
	}


	@Test
	public void  scheduledThreadPoolTest(){

		// 创建线程池
		ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(5);
		// 添加定时执行任务(1s 后执行)
		System.out.println("添加任务,时间:" + new Date());
		threadPool.schedule(() -> {
			System.out.println("任务被执行,时间:" + new Date());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			}
		}, 1, TimeUnit.SECONDS);
	}

	@Test
	public void singleThreadScheduledExecutor(){
		//创建一个单线程的可以执行延迟任务的线程池
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		System.out.println("任务添加时间"+new Date());
		scheduledExecutorService.schedule(()->{
			System.out.println("任务执行时间："+new Date());

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},2,TimeUnit.SECONDS);
	}

	@Test
	public void workStealingPool(){

		//创建一个抢占式线程池（执行顺序不确定）此方法只能在jdk 1.8+ 版本中才能使用
		ExecutorService executorService = Executors.newWorkStealingPool();
		for (int i = 0; i < 10; i++) {
			final int index =i;
			executorService.execute(()->{
				System.out.println(index +"被执行，线程名："+Thread.currentThread().getName());
			});
		}
		//确保任务执行完成
		while (!executorService.isTerminated()){}
	}



	@Test
	public void threadPoolExecutorTest(){

		//最原始的创建线程池的方式 包含7个参数
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10
				,100,TimeUnit.SECONDS,new LinkedBlockingDeque<>(10));

		for (int i = 0; i < 10; i++) {
			final  int index = i;
			threadPoolExecutor.execute(()->{
				System.out.println(index + "被执行，线程名："+Thread.currentThread().getName());

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
	}

	@Test
	public void test01(){
		Integer a = 1;
		Integer b = 2;
		Integer c = null;
		Boolean flag = false;
		// a*b的结果是int类型，那么c会强制拆箱成int类型，抛出NPE异常
		Integer result=(flag? a*b : c);
		System.out.println(result);
	}

	@Test
	public void test02(){
		String value = getValue("123", x->{
			System.out.println("333333");
			return "";});
		System.out.println(value);
	}

	public String getValue(String str , Function<String,String> function){
		return function.apply(str);
	}

	public String  print(String str){
		System.out.println(str+"  hahahahaah");
		return str;
	}

	@Test
	public void test03(){

//		Consumer consumer = (x)-> System.out.println(x);
//		consumer.accept("123");
		consumerMethod("2222",x-> System.out.println(x));
	}


	public void consumerMethod(String x,Consumer<String> consumer){
		consumer.accept(x);
	}

	@Test
	public void test04(){

		new Thread( () -> {;
			int sum=0;
			for (int i = 0; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(sum+=i);
			}
		}).start();


		Comparator<Integer> comparator = (x,y)->{
			x.compareTo(y);
			return Integer.compare(x,y);
		};

	}

	//@Test(expected = NoSuchElementException.class)
	@Test
	public void testOptional(){

//		Optional<Person> empty = Optional.empty();
//		Person person = empty.get();
//		System.out.println(person);

//		Optional<Person> o = Optional.ofNullable(person);
//		o.ifPresent((p)->assertTrue(p.getName().equals("chen")));
//		assertTrue(o.isPresent());
//		System.out.println( o);

//		Person  person1 = new Person();
//		Object o = Optional.ofNullable(person1).orElse(person);
//		System.out.println(o);

//		Person person1 = Optional.ofNullable(person).orElseGet(()->new Person());
//		System.out.println(person1);


		//Object o = Optional.ofNullable(null).orElseThrow(() -> new RuntimeException());
//		String name = Optional.ofNullable(person)
//				.map(p -> p.getEmail())
//				.orElse("122356152@qq.com");
//
//		System.out.println(name);
//
//		String zhang = Optional.ofNullable(person)
//				.flatMap(p -> p.getName())
//				.orElse("zhang");
//
//		System.out.println(zhang);


//		Person person = new Person();
//		person.setBirthday( new Date());
//		person.setName("chen");
//
//		Person person1 = Optional.ofNullable(person)
//				.filter(p -> p.getName().equals("chen"))
//				.get();
//		System.out.println(person1);
//
//		String name ="wwww";
//		if (name != null) {
//
//		}
//
//		boolean flat=true;
//		if (flat) {
//
//			System.out.println("flat = " + flat);
//
//		}
	}

	@Test
	public void test(){

		System.out.println("hello world！！！");
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("wode");
		stringBuilder.append("jianpan");
		System.out.println(stringBuilder);


	}


}
