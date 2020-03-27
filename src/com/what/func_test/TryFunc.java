package com.what.func_test;
import com.alibaba.fastjson.JSON;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import com.test.RSAUtils;

import java.security.interfaces.RSAPublicKey;
import java.sql.Timestamp;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.codec.binary.Base64;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import redis.clients.jedis.*;


public class TryFunc {

	// json check
	public static void trytry() {

		// jsoncheck()
		//String jsonstring = "{\"respCode\":\"0000\",\"respMsg\":null,\"data\":{\"list\":[{\"id\":211,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99182,\"goodsNo\":\"samole7\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:04\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10001\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10001\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":212,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99187,\"goodsNo\":\"samole8\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:04\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10002\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10002\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":213,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99183,\"goodsNo\":\"samole9\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:04\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10003\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10003\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":214,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99193,\"goodsNo\":\"samole10\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:04\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰美辰美辰实物test\",\"goodsName\":\"后台管理测试S1000134_10004\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10004\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":215,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole11\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:04\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10005\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10005\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":216,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole12\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:04\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10006\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10006\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":217,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole13\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:04\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10007\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10007\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":218,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99201,\"goodsNo\":\"samole14\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:04\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10008\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10008\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":219,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole15\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:05\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10009\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10009\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":220,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole16\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:05\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10010\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10010\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":221,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole17\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:05\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10011\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10011\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":222,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole18\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:05\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10012\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10012\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":223,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole19\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:05\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10013\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10013\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":224,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole20\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:05\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10014\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10014\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null},{\"id\":225,\"merId\":\"S1000134\",\"goodsKind\":\"0\",\"goodsMax\":2,\"goodsStock\":99203,\"goodsNo\":\"samole21\",\"shelfState\":1,\"createTime\":\"2018-12-11 18:02:05\",\"goodsTaxRate\":0.16,\"goodsCategoryName\":\"美辰实物\",\"goodsCategoryNo\":\"000312\",\"brand\":\"美辰\",\"goodsName\":\"后台管理测试S1000134_10015\",\"goodsAbbreviation\":\"a后台管理测试S1000134_10015\",\"goodsImg\":\"/uploadimage/mer/goods/GDSP10000001.jpg\",\"goodsPrice\":14.92,\"internalGoodsNo\":null}],\"limitMer\":true,\"totalSize\":250,\"isAllPay\":true}}";
		//jsontest(jsonstring);
		/* 公约数check
		 * gcdlcm a =new gcdlcm(); System.out.println("兩數的最大公約數是："+a.gcd(1333, 16));
		 * System.out.println("兩數的最小公倍數是："+a.lcm(16, 10));
		 */
/*		String msg=decode_Base64();
		reg_test(msg);  // decode test*/ 
		//redis_test();
		//stringcheck1();
		test10();
		//reg_test3();
		//substring();
		//reg_test2();
		//encryped_psw();
		//contains();

	}
	
	public static void test10() {
		String test="abc";

		System.out.println(test);
		String test2=test;
		test="111";
		Timestamp tmp=new Timestamp(System.currentTimeMillis());
		System.out.println(tmp.toString());
		System.out.println(tmp);
		Timestamp tmp2=new Timestamp(new Date().getTime());
		System.out.println(tmp2);
		//时间戳
		System.out.println("hello: "+new Date().getTime());
		
	}
	
	
	//import fastjson
	public static void test9() {
			JSONObject jo= JSON.parseObject("{\"_start1_time\":null,\"_start_time\":null,\"_end_time\":null,\"page\":null,\"rows\":null,\"_start_price\":null,\"_end_price\":null,\"categoryid\":\"000009\",\"parentid\":\"000372\",\"position\":2,\"categoryname\":\"生活卡券\",\"description\":\"\",\"linkurl\":\"http://www.umpay.com\",\"icon\":\"glyphicon-asterisk\",\"state\":1,\"modtime\":\"2018-01-18 11:22:15.000\",\"intime\":\"2018-01-18 11:22:15.000\",\"poppic\":\"uploadimage/IMG20180118112214624.png\",\"taxrate\":6.000,\"departmentId\":\"\",\"departmentName\":null,\"useCmcc\":0,\"useBos\":0,\"useCes\":0,\"categoryLevel\":2,\"parentname\":null}");
			String categoryid=jo.getString("categoryid");
			if (categoryid=="000009") {
				System.out.println("here");
			}else {
				System.out.println("failed");
			}
			System.out.println(categoryid);
	}
	
	public static void test8() {
		String a="a";
		a=a.concat("b");
		String c=a+"b";
		System.out.println(c);
		System.out.println(a);
	}
	
	
	//日期字符串转为时间戳
	public static void test7() {
		String datestr="2019-05-08 15:29:21";
		String format="YYYY-MM-dd HH:mm:ss";
		SimpleDateFormat df=new SimpleDateFormat(format);
		try {
			System.out.println(df.parse(datestr).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	//import org.json
//	public static void test6() {
//		try {
//			JSONObject jo=new JSONObject("{\"_start1_time\":null,\"_start_time\":null,\"_end_time\":null,\"page\":null,\"rows\":null,\"_start_price\":null,\"_end_price\":null,\"categoryid\":\"000009\",\"parentid\":\"000372\",\"position\":2,\"categoryname\":\"生活卡券\",\"description\":\"\",\"linkurl\":\"http://www.umpay.com\",\"icon\":\"glyphicon-asterisk\",\"state\":1,\"modtime\":\"2018-01-18 11:22:15.000\",\"intime\":\"2018-01-18 11:22:15.000\",\"poppic\":\"uploadimage/IMG20180118112214624.png\",\"taxrate\":6.000,\"departmentId\":\"\",\"departmentName\":null,\"useCmcc\":0,\"useBos\":0,\"useCes\":0,\"categoryLevel\":2,\"parentname\":null}");
//			String taxrate=jo.getString("taxrate");
//			System.out.println(jo.length());
//			System.out.println(taxrate);
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	

	//import org.json
//	public static void test5() {
//		try {
//			JSONArray ja=new JSONArray("[{\"text\":\"000008_冰淇淋电子券 \",\"value\":\"000008\"},{\"text\":\"000009_生活卡券 \",\"value\":\"000009\"},{\"text\":\"000010_油卡 \",\"value\":\"000010\"},{\"text\":\"000101_摄影摄像 1231\",\"value\":\"000101\"},{\"text\":\"000103_汽车用品-sunhuaiqing测试\",\"value\":\"000103\"},{\"text\":\"000109_美妆个护--sunhuaiqingtest\",\"value\":\"000109\"},{\"text\":\"000107_123\",\"value\":\"000107\"}]");
//			String text=ja.getJSONObject(0).getString("text");
//			System.out.println(text);
//			String value=ja.getJSONObject(0).getString("value");
//			System.out.println(value);
//			System.out.println(ja.length());
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	// double change to int\string etc
	public static void test4() {
		double a=2089.5;
		int b=(int) Math.ceil(a); //向上取整
		int h=(int) Math.floor(a);
		double hh=Math.floor(a);
		int c=(int)a;
		int d=(int)101.11*10; //从左至右计算
		int e=(int)(101.11*10);
		double f=Double.parseDouble("11.11");  // string to double
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(String.valueOf(f));  //double to string
		System.out.println(h);
		System.out.println(hh);
		
		//method1: double, 截取小数点后4位
		double test=3044.400000;
		BigDecimal bb = new BigDecimal(test);
		double f1 = bb.setScale(4, BigDecimal.ROUND_FLOOR).doubleValue();  //如果小数点后几位为0，则不不显示不保留
		System.out.println(f1);
		
		DecimalFormat df=new DecimalFormat("#.00"); 
		double k=3045.400000;
		System.out.println(df.format(k)); 
		
		//new test
		//BigDecimal bd=new BigDecimal(1.99*10); //19.89999999999999857891452847979962825775146484375 //这是double 的精度问题，而不是BigDecimal 的精度问题；所以构造BigDecimal 对象时要用字符串而不是浮点型。
	    BigDecimal bd=new BigDecimal(String.valueOf(2.99*10)); //19.89999999999999857891452847979962825775146484375
	    
	    System.out.println(1.99*10);
	    System.out.println(bd.toString());
	    double tmpamount=bd.setScale(2,BigDecimal.ROUND_FLOOR).doubleValue();
	    System.out.println(String.valueOf(tmpamount));	
		
		
	}
	
	// 正则循环匹配查
	public static void reg_test3() {
		String msg="{\"total\":8.0,\"rows\":[{\"id\":644.0,\"orgId\":null,\"batchNo\":\"0cc4452b-3a08-44d7-9e4d-0bcbc2d12ca5\",\"type\":\"2\",\"address\":\"auto_test\",\"county\":\"杨浦\",\"city\":\"上海\",\"province\":\"上海\",\"storeImg\":null,\"storeId\":\"TAJTEST1000002\",\"storeName\":\"test to be reviewed\",\"merid\":\"S10JA001\",\"contacts\":\"勿动J2_2\",\"contactsMobile\":\"18300846391\",\"merSource\":\"TPSAFCS\",\"status\":\"1\",\"remark\":null,\"createTimeBegin\":null,\"createTimeEnd\":null,\"updateTimeBegin\":null,\"updateTimeEnd\":null,\"createUser\":\"S10JA001\",\"updateUser\":null,\"createTime\":\"2019-05-05 13:50:36\",\"updateTime\":null,\"page\":null,\"rows\":null,\"review\":\"8\",\"lastUpdateTime\":null,\"lastUpdateUser\":null},{\"id\":645.0,\"orgId\":null,\"batchNo\":\"ab67c5b5-607a-45d3-80fe-237bf2e83ede\",\"type\":\"1\",\"address\":\"auto_test_store_address1\",\"county\":\"琼山区\",\"city\":\"海口市\",\"province\":\"海南省\",\"storeImg\":\"/uploadimage/check/018c49401d1948cba6386b497087715f.png\",\"storeId\":\"S10JA001SA0004\",\"storeName\":\"auto_test_store\",\"merid\":\"S10JA001\",\"contacts\":\"auto_test_store1\",\"contactsMobile\":\"15000846401\",\"merSource\":\"TPSAFCS\",\"status\":\"3\",\"remark\":null,\"createTimeBegin\":null,\"createTimeEnd\":null,\"updateTimeBegin\":null,\"updateTimeEnd\":null,\"createUser\":\"S10JA001\",\"updateUser\":null,\"createTime\":\"2019-05-05 14:50:46\",\"updateTime\":null,\"page\":null,\"rows\":null,\"review\":\"0\",\"lastUpdateTime\":null,\"lastUpdateUser\":null},{\"id\":646.0,\"orgId\":null,\"batchNo\":\"2b3d9ae1-0dea-407c-90e4-ae9bfb65861f\",\"type\":\"1\",\"address\":\"auto_test_store_address1\",\"county\":\"琼山区\",\"city\":\"海口市\",\"province\":\"海南省\",\"storeImg\":\"/uploadimage/check/fa8b7fad82564c8fa1615203b36a5e28.jpg\",\"storeId\":\"S10JA001SA0005\",\"storeName\":\"auto_test_store\",\"merid\":\"S10JA001\",\"contacts\":\"auto_test_store1\",\"contactsMobile\":\"15000846401\",\"merSource\":\"TPSAFCS\",\"status\":\"3\",\"remark\":null,\"createTimeBegin\":null,\"createTimeEnd\":null,\"updateTimeBegin\":null,\"updateTimeEnd\":null,\"createUser\":\"S10JA001\",\"updateUser\":null,\"createTime\":\"2019-05-05 15:05:34\",\"updateTime\":null,\"page\":null,\"rows\":null,\"review\":\"0\",\"lastUpdateTime\":null,\"lastUpdateUser\":null},{\"id\":647.0,\"orgId\":null,\"batchNo\":\"33a6f484-902b-451f-99ce-fff158e88a0b\",\"type\":\"1\",\"address\":\"auto_test_store_address1\",\"county\":\"琼山区\",\"city\":\"海口市\",\"province\":\"海南省\",\"storeImg\":\"/uploadimage/check/0e341b0b72e846758ad1fb3d92468e24.jpg\",\"storeId\":\"S10JA001SA0006\",\"storeName\":\"auto_test_store\",\"merid\":\"S10JA001\",\"contacts\":\"auto_test_store1\",\"contactsMobile\":\"15000846401\",\"merSource\":\"TPSAFCS\",\"status\":\"3\",\"remark\":null,\"createTimeBegin\":null,\"createTimeEnd\":null,\"updateTimeBegin\":null,\"updateTimeEnd\":null,\"createUser\":\"S10JA001\",\"updateUser\":null,\"createTime\":\"2019-05-05 15:18:04\",\"updateTime\":null,\"page\":null,\"rows\":null,\"review\":\"0\",\"lastUpdateTime\":null,\"lastUpdateUser\":null},{\"id\":648.0,\"orgId\":null,\"batchNo\":\"8a5825c9-44b3-4a97-8663-060ea73a80f5\",\"type\":\"1\",\"address\":\"auto_test_store_batch_save_address1\",\"county\":\"琼山区\",\"city\":\"海口市\",\"province\":\"海南省\",\"storeImg\":\"/uploadimage/check/6e6b9abb7c2e4cbc8a8f5474df94b77b.jpg\",\"storeId\":\"S10JA001SA0007\",\"storeName\":\"auto_test_store_batch_save1\",\"merid\":\"S10JA001\",\"contacts\":\"auto_contacts1\",\"contactsMobile\":\"15000846401\",\"merSource\":\"TPSAFCS\",\"status\":\"3\",\"remark\":null,\"createTimeBegin\":null,\"createTimeEnd\":null,\"updateTimeBegin\":null,\"updateTimeEnd\":null,\"createUser\":\"S10JA001\",\"updateUser\":null,\"createTime\":\"2019-05-05 15:28:57\",\"updateTime\":null,\"page\":null,\"rows\":null,\"review\":\"0\",\"lastUpdateTime\":null,\"lastUpdateUser\":null},{\"id\":649.0,\"orgId\":null,\"batchNo\":\"8a5825c9-44b3-4a97-8663-060ea73a80f5\",\"type\":\"1\",\"address\":\"auto_test_store_batch_save_address2\",\"county\":\"琼水区\",\"city\":\"河口市\",\"province\":\"海北省\",\"storeImg\":\"/uploadimage/check/6e6b9abb7c2e4cbc8a8f5474df94b77b.jpg\",\"storeId\":\"S10JA001SA0008\",\"storeName\":\"auto_test_store_batch_save2\",\"merid\":\"S10JA001\",\"contacts\":\"auto_contacts2\",\"contactsMobile\":\"15000846402\",\"merSource\":\"TPSAFCS\",\"status\":\"3\",\"remark\":null,\"createTimeBegin\":null,\"createTimeEnd\":null,\"updateTimeBegin\":null,\"updateTimeEnd\":null,\"createUser\":\"S10JA001\",\"updateUser\":null,\"createTime\":\"2019-05-05 15:28:57\",\"updateTime\":null,\"page\":null,\"rows\":null,\"review\":\"0\",\"lastUpdateTime\":null,\"lastUpdateUser\":null},{\"id\":650.0,\"orgId\":null,\"batchNo\":\"8144f4a3-68a5-4a96-8e4a-5b9495f01033\",\"type\":\"1\",\"address\":\"auto_test_store_batch_save_address1\",\"county\":\"琼山区\",\"city\":\"海口市\",\"province\":\"海南省\",\"storeImg\":\"/uploadimage/check/6f157ffa0177416b8f42a32509372d88.jpg\",\"storeId\":\"S10JA001SA0009\",\"storeName\":\"auto_test_store_batch_save1\",\"merid\":\"S10JA001\",\"contacts\":\"auto_contacts1\",\"contactsMobile\":\"15000846401\",\"merSource\":\"TPSAFCS\",\"status\":\"3\",\"remark\":null,\"createTimeBegin\":null,\"createTimeEnd\":null,\"updateTimeBegin\":null,\"updateTimeEnd\":null,\"createUser\":\"S10JA001\",\"updateUser\":null,\"createTime\":\"2019-05-05 15:29:58\",\"updateTime\":null,\"page\":null,\"rows\":null,\"review\":\"0\",\"lastUpdateTime\":null,\"lastUpdateUser\":null},{\"id\":651.0,\"orgId\":null,\"batchNo\":\"8144f4a3-68a5-4a96-8e4a-5b9495f01033\",\"type\":\"1\",\"address\":\"auto_test_store_batch_save_address2\",\"county\":\"琼水区\",\"city\":\"河口市\",\"province\":\"海北省\",\"storeImg\":\"/uploadimage/check/6f157ffa0177416b8f42a32509372d88.jpg\",\"storeId\":\"S10JA001SA0010\",\"storeName\":\"auto_test_store_batch_save2\",\"merid\":\"S10JA001\",\"contacts\":\"auto_contacts2\",\"contactsMobile\":\"15000846402\",\"merSource\":\"TPSAFCS\",\"status\":\"3\",\"remark\":null,\"createTimeBegin\":null,\"createTimeEnd\":null,\"updateTimeBegin\":null,\"updateTimeEnd\":null,\"createUser\":\"S10JA001\",\"updateUser\":null,\"createTime\":\"2019-05-05 15:29:58\",\"updateTime\":null,\"page\":null,\"rows\":null,\"review\":\"99\",\"lastUpdateTime\":null,\"lastUpdateUser\":null}]}";
		//System.out.println(msg);
		String result="";
		String regex="\"review\":\"(.+?)\"";
		//String regex="Content-disposition: (.+?)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(msg);

		while(matcher.find()) {
			result=matcher.group(1);
			System.out.println("here is "+result);
		}
		
		
	}
	
	public static void substring() {
		String msg="TAJTEST1000001R01";
		msg=msg.substring(15, msg.length());
		System.out.println(msg);
	}
	
	public static void contains() {
		String a="abc";
		String b="bcabca";
		if (b.contains(a)) {
			System.out.println("yep");
		}else {
			System.out.println("no");
		}
		List<String> excelelements = new ArrayList<String>();

		excelelements.add("畅由手机号");
		excelelements.add("交易时间");
		excelelements.add("商户订单号");
		excelelements.add("畅由手机号");
		excelelements.add("交易类型");
		Iterator<String> ite=excelelements.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	
	public static void encryped_psw()  {
//		com.PublicKeyMap keymap=new com.PublicKeyMap();
		String modulus="008191bd2309c2f46d3ccb0440d2ed4659e96a91194a04b204c647233c7ddbbd8deed38266252112b3e4dc220f49315ff8b11ffc83423b800f40b13d204101fc7c572a0cb043fc0a7e53ec62468e0530afb2ac051c62c01b63203650ffdd40b83a6fff5279fce0cd313b27c30d9d6f861fbde3fa34f83afd3cca4a30d0515f08bf";
		String public_exponent="010001";
		RSAPublicKey publickey=RSAUtils.generateRSAPublicKey(modulus.getBytes(), public_exponent.getBytes());
		String encrypted_psw;
		try {
			encrypted_psw = new String(RSAUtils.encrypt(publickey, "123456".getBytes()));
			System.out.println(encrypted_psw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void reg_test2() {
		String msg="Content-disposition: attachment; filename=OrderMessage_2019_03_14.xls   Content-Encoding: gzip";
		System.out.println(msg);
		String result="";
		String regex="Content-disposition: (.+?)\\S+Content-Encoding: ";
		//String regex="Content-disposition: (.+?)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(msg);
		while(matcher.find()) {
			result=matcher.group(1);
		}
		System.out.println("here is "+result);
		
	}
	
	
	public static void redis_test() {	
		// init
		Jedis jedis=new Jedis("172.16.17.200",6379);
		jedis.auth("umpredis");
		//get value by key
		String value=jedis.get("SEND_CODE_022d7315cff950fa68a06adcfe487403");
		System.out.println(value.length()!=4);
		
	}
	
	public static void reg_test(String msg) {
		String result="";
		String regex="验证码为(.+?)。";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(msg);
		while(matcher.find()) {
			result=matcher.group(1);
		}
		System.out.println(result);
		
	}
	
	public static String decode_Base64() {
//		String msg="[{msg=44CQ55WF55Sx5bmz5Y+w44CR5oKo5q2j5Zyo55Sz6K+35L2/55So55WF55Sx56ev5YiG5pSv5LuY\r\n" + 
//				"77yM6aqM6K+B56CB5Li6MTMwM+OAguaCqOacrOasoea2iOi0ueWPr+S9v+eUqDE3MTU455WF55Sx\r\n" + 
//				"56ev5YiG77yM5oq15omjMTQ5LjIw5YWD546w6YeR44CC}]\r\n" + 
//				"";
		String msg="44CQ55WF55Sx5bmz5Y+w44CR5oKo5q2j5Zyo55Sz6K+35L2/55So55WF55Sx56ev5YiG5pSv5LuY\r\n" + 
				"77yM6aqM6K+B56CB5Li6NTMxNOOAguaCqOacrOasoea2iOi0ueWPr+S9v+eUqDE3MTU455WF55Sx\r\n" + 
				"56ev5YiG77yM5oq15omjMTQ5LjIw5YWD546w6YeR44CC";
		//msg=msg.substring(6, msg.length()-4);
		Base64 base64=new Base64();
		try {
			msg=new String(base64.decode(msg),"UTF-8");
			System.out.println(msg);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;

	}
	
	public static void stringcheck1() {
		System.out.println("0000"=="0000");
		System.out.println("0000".equals("0000"));
		String s="1234567890";
		int a=Integer.parseInt(s);
		System.out.println(a);
		System.out.println(s.substring(0, 2));
		System.out.println(s.substring(0, s.length()-2));
		Integer b=Integer.parseInt("456");
		System.out.println(b.toString());
		System.out.println(0!=0);
	}

	//import org.json
//	public static void jsontest(String response_data) {
//		if (response_data == "") {
//			response_data = "{'respCode':'0000','respMsg':'登陆成功','data':{'storeName':'中华西路营业厅11'}}";
//		}
//		try {
//			JSONObject responseJson = new JSONObject(response_data);
//			String token=responseJson.getJSONObject("data").getJSONArray("list").getJSONObject(0).getString("id"); // .get("storeName").toString();
//			//System.out.println(responseJson.getJSONObject("data").getJSONArray("list").getClass().getName().toString());
//			System.out.println(token);
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}

class gcdlcm {
	int gcd(int m, int n) {
		if (m < n) { // 這個判斷是爲了將大數放在前面
			int temp = n;
			n = m;
			m = temp;
		}
		if (m % n == 0) {
			return n;
		} else {
			m %= n;
			return gcd(m, n);
			// 這裡也可以寫成gcd(n,m)，就省掉了前面的判斷了，會快一點
		}
	}

	int lcm(int m, int n) {
		int i = 1;
		if (m < n) { // 這個判斷是爲了將大數放在前面
			int temp = n;
			n = m;
			m = temp;
		}
		int lcm = m;
		while (lcm % n != 0) {
			lcm = m * i;
			i++;
		}
		return lcm;
	}
}