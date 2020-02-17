package com.bible.java.chapter14.donghwan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<OrgDvo> list = makeData();
		System.out.println("All "+list.size());
		list = list.stream().filter(distinctByKey(OrgDvo::getOrgCode)).sorted(Comparator.comparingInt(OrgDvo::getSortSeq)).collect(Collectors.toList());
		//List<OrgDvo> divList = list.stream().filter(x -> x.getLvl() <3).sorted(Comparator.comparingInt(OrgDvo::getSortSeq)).collect(Collectors.toList());
		List<OrgDvo> divList = list.stream().filter(x -> x.getLvl() <3).collect(Collectors.toList());
		List<OrgDvo> gbmList = list.stream().filter(x -> x.getLvl() ==3).collect(Collectors.toList());
		List<OrgDvo> fctList = list.stream().filter(x -> x.getLvl() ==4).collect(Collectors.toList());
		
		divList.forEach((c) -> System.out.println("divCode::"+c.getOrgCode()));
		//for-each 여러문장
//		saveDvo.forEach(x -> 
//		{x.setOrgAuthId(IdGenUtil.generate());
//		 x.setUserId(BaseUtil.getUsername());});		
		System.out.println(list.size());
		System.out.println(divList.size());
		System.out.println(gbmList.size());
		System.out.println(fctList.size());
		//실전
//		orgList = orgList.stream().filter(distinctByKey(x -> x.getOrgCode())).collect(Collectors.toList());
//		svo.setDivCodeList(orgList.stream().filter(x -> (x.getLevel().compareTo(new BigDecimal(3))==-1)).collect(Collectors.toList()));
//		svo.setGbmCodeList(orgList.stream().filter(x -> (x.getLevel().compareTo(new BigDecimal(3))==0)).collect(Collectors.toList()));
//		svo.setFctCodeList(orgList.stream().filter(x -> (x.getLevel().compareTo(new BigDecimal(4))==0)).collect(Collectors.toList()));
		
		
//		saveDvo.forEach(x -> 
//		{x.setOrgAuthId(IdGenUtil.generate());
//		 x.setUserId(BaseUtil.getUsername());});
//List<TbrBiKpiRptUserOrgDVO> delDvo = BaseUtil.populate(svo.getUserOrgCodeList().stream().filter(x -> x.get_status().equals("D")).collect(Collectors.toList()), TbrBiKpiRptUserOrgDVO.class);		
		
	}
	
//	public static  Predicate distinctByKey(Function keyExtractor) {
//		  Map seen = new ConcurrentHashMap<>();
//		  return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
//		 }
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> attributeKey) {
		Set<Object> seen = ConcurrentHashMap.newKeySet();
		return t -> seen.add(attributeKey.apply(t));
	}	

	private static List<OrgDvo> makeData() {
		List<OrgDvo> list = new ArrayList();
		//div
		list.add(new OrgDvo(2,"HME","HME",1210));
		list.add(new OrgDvo(1,"SET","SET",0));
		list.add(new OrgDvo(2,"IM","IM",3));
		list.add(new OrgDvo(2,"CE","CE",1));
		
		//gbm
		list.add(new OrgDvo(3,"W","MOBILE",2));
		list.add(new OrgDvo(3,"L","DA",3));
		list.add(new OrgDvo(3,"V","VD",4));
		list.add(new OrgDvo(3,"N","NETWORK",6));
		list.add(new OrgDvo(3,"H","HME",9));
		
		//fct
		list.add(new OrgDvo(4,"C100E","MOBILE GUMI",1500));
		list.add(new OrgDvo(4,"C5H0A","SEV",1510));
		list.add(new OrgDvo(4,"C550A","SIEL-P(N)",1565));
		list.add(new OrgDvo(4,"C100D","GWANGJU",2000));
		list.add(new OrgDvo(4,"C670A","SEHZ",1540));
		list.add(new OrgDvo(4,"C820A","SEDA-P(M)",1545));
		list.add(new OrgDvo(4,"C820A","SEDA-P(M)",1545));
		list.add(new OrgDvo(4,"C100F","NET SUWON",3100));
		list.add(new OrgDvo(4,"C6K0A","SSET",3110));
		list.add(new OrgDvo(4,"C100I","HME SUWON",3500));
		
		return list;
	}
}
