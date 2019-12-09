package 정대석;

import java.util.Scanner;

public class LOLChamp {
	CI ci = new CI();
	
	String champName[] = {"가렌","갈리오","갱플랭크","그라가스","그레이브즈","나르","나미","나서스","노틸러스","녹턴",
			"누누와 윌럼프","니달리","니코","다리우스","다이애나","드레이븐","라이즈","라칸","람머스","럭스",
			"럼블","레넥톤","레오나","렉사이","렝가","루시안","룰루","르블랑","리 신","리븐",
			"리산드라","마스터 이","마오카이","말자하","말파이트","모데카이저","모르가나","문도 박사","미스 포츈","바드",
			"바루스","바이", "베이가","베인","벨코즈","볼리베어","브라움","브랜드","블라디미르","블리츠크랭크",
			"빅토르","뽀삐","사이온","사일러스","샤코","세주아니","소나","소라카","쉔","쉬바나",
			"스웨인","스카너","시비르","신 짜오","신드라","신지드","쓰레쉬","아리","아무무","아우렐리온 솔",
			"아이번","아지르","아칼리","아트록스","알리스타","애니","애니비아","애쉬","야스오","에코",
			"엘리스","오공","오른","오리아나","올라프","요릭","우디르","우르곳","워윅","유미",
			"이렐리아","이블린","이즈리얼","일라오이","자르반 4세","자야","자이라","자크","잔나","잭스",
			"제드","제라스","제이스","조이","직스","진","질리언","징크스","초가스","카르마",
			"카밀","카사딘","카서스","카시오페아","카이사","카직스","카타리나","칼리스타","케넨","케이틀린",
			"케인","케일","코그모","코르키","퀸","클레드","키아나","킨드레드","타릭","탈론",
			"탈리야","탐 켄치","트런들","트리스타나","트린다미어","트위스티드 페이트","트위치","티모","파이크","판테온",
			"피들스틱","피오라","피즈","하이머딩거","헤카림","세나","아펠리오스"};
	Scanner s = new Scanner(System.in);
	void champName(){	
		System.out.println("챔피언 이름을 검색해주세요. 자주 사용되는 줄임말로도 검색 가능합니다.\r\n현재 정식 출시된 챔피언의 수는 총"+(champName.length)+" 명이며 가장 최근에 출시된 챔피언은 ["+champName[(champName.length)-1]+"]입니다.");
		String cc = s.nextLine();
		switch (cc) {
		case "가렌": ch0();break; case "갈리오":ch1();break; case "갱플랭크":case "갱플":	ch2();break; case "그라가스":case "그라":ch3();break; case "그레이브즈":case "그브":ch4();break;	case "나르":ch5();break; case "나미":case "물고기":ch6();break; case "나서스":case "개":ch7();break; case "노틸러스":case "노틸":ch8();break;case "녹턴":ch9();break;
		case "누누와 윌럼프":case "누누":ch10();break; case "니달리":ch11();break; case "니코":ch12();break; case "다리우스":case "다리":ch13();break; case "다이애나":ch14();break; case "드레이븐":case "드븐":ch15();break; case "라이즈":ch16();break; case "라칸":ch17();break; case "람머스":ch18();break; case "럭스":ch19();break;
		case "럼블":ch20();break; case "레넥톤":case "악어":ch21();break; case "레오나":ch22();break; case "렉사이":ch23();break; case "렝가":case "사자":ch24();break; case "루시안":case "흑형":ch25();break; case "룰루":case "커져라":ch26();break; case "르블랑":ch27();break; case "리 신":case "리신":ch28();break; case "리븐":ch29();break;
		case "리산드라":case "리산":ch30();break;case "마스터 이":case "마이":ch31();break;case "마오카이":case "세계수":ch32();break;case "말자하":case "알라딘":ch33();break;case "말파이트":case "말파":ch34();break;case "모데카이저":case "모데":ch35();break;case "모르가나":ch36();break;case "문도 박사":case "문도":ch37();break;case "미스 포츈":case "미포":ch38();break;case "바드":ch39();break;
		case "바루스":ch40();break; case "바이":ch41();break;case "베이가":ch42();break;case "베인":ch43();break;case "벨코즈":ch44();break;case "볼리베어":case "곰":ch45();break;case "브라움":case "백형":ch46();break;case "브랜드":ch47();break;case "블라디미르":case "블라디":ch48();break;case "블리츠크랭크":case "블츠":case "블크":ch49();break;
		case "빅토리":ch50();break;case "뽀삐":ch51();break;case "사이온":ch52();break;case "사일러스":case "사일":ch53();break;case "샤코":ch54();break;case "세주아니":case "세주":ch55();break;case "소나":ch56();break;case "소라카":case "어머니":ch57();break;case "쉔":ch58();break;case "쉬바나":case "용":ch59();break;
		case "스웨인":ch60();break;case "스카너":case "전갈":ch61();break;case "시비르":ch62();break;case "신 짜오":case "신짜오":case "짜오":case "짜장":ch63();break;case "신드라":ch64();break;case "신지드":case "뿡뿡이":ch65();break;case "쓰레쉬":ch66();break;case "아리":case "여우":ch67();break;case "아무무":ch68();break;case "아우렐리온 솔":case "솔":ch69();break;
		case "아이번":case "나무":ch70();break;case "아지르":case "비둘기":ch71();break;case "아칼리":ch72();break;case "아트록스":case "아트":ch73();break;case "알리스타":case "알리":case "소":ch74();break;case "애니":ch75();break;case "애니비아":case "빙닭":ch76();break;case "애쉬":ch77();break;case "야스오":ch78();break;case "에코":ch79();break;
		case "엘리스":case "거미":ch80();break; case "오공":case "원숭이":ch81();break; case "오른":ch82();break; case "오리아나":case "오리":ch83();break; case "올라프":ch84();break; case "요릭":ch85();break; case "우디르":ch86();break; case "우르곳":ch87();break; case "워윅":case "늑대":ch88();break; case "유미":case "고양이":ch89();break; 
		case "이렐리아":case "이렐":ch90();break;case "이블린":ch91();break; case "이즈리얼":case "이즈":ch92();break; case "일라오이":case "일라":ch93();break; case "자르반 4세":case "자르반":ch94();break; case "자야":ch95();break; case "자이라":ch96();break; case "자크":case "젤리":ch97();break; case "잔나":ch98();break; case "잭스":ch99();break; 
		case "제드":ch100();break; case "제라스":ch101();break; case "제이스":ch102();break; case "조이":ch103();break; case "직스":ch104();break; case "진":ch105();break; case "질리언":ch106();break; case "징크스":ch107();break; case "초가스":ch108();break; case "카르마":case "흑누나":ch109();break; 
		case "카밀":ch110();break; case "카사딘":ch111();break; case "카서스":ch112();break; case "카시오페아":case "카시":ch113();break; case "카이사":ch114();break; case "카직스":case "메뚜기":ch115();break; case "카타리나":case "카타":ch116();break; case "칼리스타":case "칼리":ch117();break; case "케넨":case "피카츄":ch118();break; case "케이틀린":case "케틀":ch119();break; 
		case "케인":ch120();break; case "케일":ch121();break; case "코그모":ch122();break; case "코르키":ch123();break; case "퀸":ch124();break; case "클레드":ch125();break; case "키아나":ch126();break; case "킨드레드":case "킨드":ch127();break; case "타릭":ch128();break; case "탈론":case "카레":ch129();break; 
		case "탈리야":ch130();break; case "탐 켄치":case "탐켄치":case "메기":ch131();break; case "트런들":case "트롤":ch132();break; case "트리스타나":case "트타":ch133();break; case "트린다미어":case "트린":ch134();break; case "트위스티드 페이트":case "트페":ch135();break; case "트위치":case "쥐":ch136();break; case "티모":case "오소리":ch137();break; case "파이크":ch138();break; case "판테온":case "빵테":ch139();break; 
		case "피들스틱":case "피들":ch140();break; case "피오라":ch141();break; case "피즈":case "상어":ch142();break; case "하이머딩거":case "딩거":ch143();break; case "헤카림":ch144();break; case "세나":ch145();break; case "아펠리오스":case "아펠":ch146();break;
		
		default: champName(); }}
	
	void ch0() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI0(); champName();}else{ champName();}}
	void ch1() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI1(); champName();}else{ champName();}}
	void ch2() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI2(); champName();}else{ champName();}}
	void ch3() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI3(); champName();}else{ champName();}}
	void ch4() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI4(); champName();}else{ champName();}}
	void ch5() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI5(); champName();}else{ champName();}}
	void ch6() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI6(); champName();}else{ champName();}}
	void ch7() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI7(); champName();}else{ champName();}}
	void ch8() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI8(); champName();}else{ champName();}}
	void ch9() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI9(); champName();}else{ champName();}}
	void ch10() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI10(); champName();}else{ champName();}}
	void ch11() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI11(); champName();}else{ champName();}}
	void ch12() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI12(); champName();}else{ champName();}}
	void ch13() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI13(); champName();}else{ champName();}}
	void ch14() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI14(); champName();}else{ champName();}}
	void ch15() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI15(); champName();}else{ champName();}}
	void ch16() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI16(); champName();}else{ champName();}}
	void ch17() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI17(); champName();}else{ champName();}}
	void ch18() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI18(); champName();}else{ champName();}}
	void ch19() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI19(); champName();}else{ champName();}}
	void ch20() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI20(); champName();}else{ champName();}}
	void ch21() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI21(); champName();}else{ champName();}}
	void ch22() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI22(); champName();}else{ champName();}}
	void ch23() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI23(); champName();}else{ champName();}}
	void ch24() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI24(); champName();}else{ champName();}}
	void ch25() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI25(); champName();}else{ champName();}}
	void ch26() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI26(); champName();}else{ champName();}}
	void ch27() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI27(); champName();}else{ champName();}}
	void ch28() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI28(); champName();}else{ champName();}}
	void ch29() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI29(); champName();}else{ champName();}}
	void ch30() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI30(); champName();}else{ champName();}}
	void ch31() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI31(); champName();}else{ champName();}}
	void ch32() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI32(); champName();}else{ champName();}}
	void ch33() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI33(); champName();}else{ champName();}}
	void ch34() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI34(); champName();}else{ champName();}}
	void ch35() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI35(); champName();}else{ champName();}}
	void ch36() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI36(); champName();}else{ champName();}}
	void ch37() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI37(); champName();}else{ champName();}}
	void ch38() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI38(); champName();}else{ champName();}}
	void ch39() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI39(); champName();}else{ champName();}}
	void ch40() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI40(); champName();}else{ champName();}}
	void ch41() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI41(); champName();}else{ champName();}}
	void ch42() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI42(); champName();}else{ champName();}}
	void ch43() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI43(); champName();}else{ champName();}}
	void ch44() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI44(); champName();}else{ champName();}}
	void ch45() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI45(); champName();}else{ champName();}}
	void ch46() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI46(); champName();}else{ champName();}}
	void ch47() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI47(); champName();}else{ champName();}}
	void ch48() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI48(); champName();}else{ champName();}}
	void ch49() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI49(); champName();}else{ champName();}}
	void ch50() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI50(); champName();}else{ champName();}}
	void ch51() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI51(); champName();}else{ champName();}}
	void ch52() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI52(); champName();}else{ champName();}}
	void ch53() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI53(); champName();}else{ champName();}}
	void ch54() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI54(); champName();}else{ champName();}}
	void ch55() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI55(); champName();}else{ champName();}}
	void ch56() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI56(); champName();}else{ champName();}}
	void ch57() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI57(); champName();}else{ champName();}}
	void ch58() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI58(); champName();}else{ champName();}}
	void ch59() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI59(); champName();}else{ champName();}}
	void ch60() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI60(); champName();}else{ champName();}}
	void ch61() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI61(); champName();}else{ champName();}}
	void ch62() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI62(); champName();}else{ champName();}}
	void ch63() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI63(); champName();}else{ champName();}}
	void ch64() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI64(); champName();}else{ champName();}}
	void ch65() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI65(); champName();}else{ champName();}}
	void ch66() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI66(); champName();}else{ champName();}}
	void ch67() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI67(); champName();}else{ champName();}}
	void ch68() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI68(); champName();}else{ champName();}}
	void ch69() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI69(); champName();}else{ champName();}}
	void ch70() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI70(); champName();}else{ champName();}}
	void ch71() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI71(); champName();}else{ champName();}}
	void ch72() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI72(); champName();}else{ champName();}}
	void ch73() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI73(); champName();}else{ champName();}}
	void ch74() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI74(); champName();}else{ champName();}}
	void ch75() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI75(); champName();}else{ champName();}}
	void ch76() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI76(); champName();}else{ champName();}}
	void ch77() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI77(); champName();}else{ champName();}}
	void ch78() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI78(); champName();}else{ champName();}}
	void ch79() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI79(); champName();}else{ champName();}}
	void ch80() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI80(); champName();}else{ champName();}}
	void ch81() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI81(); champName();}else{ champName();}}
	void ch82() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI82(); champName();}else{ champName();}}
	void ch83() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI83(); champName();}else{ champName();}}
	void ch84() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI84(); champName();}else{ champName();}}
	void ch85() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI85(); champName();}else{ champName();}}
	void ch86() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI86(); champName();}else{ champName();}}
	void ch87() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI87(); champName();}else{ champName();}}
	void ch88() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI88(); champName();}else{ champName();}}
	void ch89() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI89(); champName();}else{ champName();}}
	void ch90() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI90(); champName();}else{ champName();}}
	void ch91() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI91(); champName();}else{ champName();}}
	void ch92() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI92(); champName();}else{ champName();}}
	void ch93() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI93(); champName();}else{ champName();}}
	void ch94() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI94(); champName();}else{ champName();}}
	void ch95() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI95(); champName();}else{ champName();}}
	void ch96() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI96(); champName();}else{ champName();}}
	void ch97() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI97(); champName();}else{ champName();}}
	void ch98() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI98(); champName();}else{ champName();}}
	void ch99() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI99(); champName();}else{ champName();}}
	void ch100() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI100(); champName();}else{ champName();}}
	void ch101() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI101(); champName();}else{ champName();}}
	void ch102() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI102(); champName();}else{ champName();}}
	void ch103() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI103(); champName();}else{ champName();}}
	void ch104() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI104(); champName();}else{ champName();}}
	void ch105() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI105(); champName();}else{ champName();}}
	void ch106() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI106(); champName();}else{ champName();}}
	void ch107() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI107(); champName();}else{ champName();}}
	void ch108() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI108(); champName();}else{ champName();}}
	void ch109() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI109(); champName();}else{ champName();}}
	void ch110() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI110(); champName();}else{ champName();}}
	void ch111() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI111(); champName();}else{ champName();}}
	void ch112() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI112(); champName();}else{ champName();}}
	void ch113() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI113(); champName();}else{ champName();}}
	void ch114() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI114(); champName();}else{ champName();}}
	void ch115() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI115(); champName();}else{ champName();}}
	void ch116() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI116(); champName();}else{ champName();}}
	void ch117() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI117(); champName();}else{ champName();}}
	void ch118() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI118(); champName();}else{ champName();}}
	void ch119() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI119(); champName();}else{ champName();}}
	void ch120() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI120(); champName();}else{ champName();}}
	void ch121() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI121(); champName();}else{ champName();}}
	void ch122() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI122(); champName();}else{ champName();}}
	void ch123() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI123(); champName();}else{ champName();}}
	void ch124() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI124(); champName();}else{ champName();}}
	void ch125() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI125(); champName();}else{ champName();}}
	void ch126() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI126(); champName();}else{ champName();}}
	void ch127() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI127(); champName();}else{ champName();}}
	void ch128() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI128(); champName();}else{ champName();}}
	void ch129() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI129(); champName();}else{ champName();}}
	void ch130() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI130(); champName();}else{ champName();}}
	void ch131() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI131(); champName();}else{ champName();}}
	void ch132() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI132(); champName();}else{ champName();}}
	void ch133() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI133(); champName();}else{ champName();}}
	void ch134() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI134(); champName();}else{ champName();}}
	void ch135() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI135(); champName();}else{ champName();}}
	void ch136() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI136(); champName();}else{ champName();}}
	void ch137() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI137(); champName();}else{ champName();}}
	void ch138() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI138(); champName();}else{ champName();}}
	void ch139() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI139(); champName();}else{ champName();}}
	void ch140() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI140(); champName();}else{ champName();}}
	void ch141() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI141(); champName();}else{ champName();}}
	void ch142() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI142(); champName();}else{ champName();}}
	void ch143() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI143(); champName();}else{ champName();}}
	void ch144() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI144(); champName();}else{ champName();}}
	void ch145() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI145(); champName();}else{ champName();}}
	void ch146() {
		System.out.println("인터넷 검색 창으로 이동하시겠습니까?");
		String yes = s.nextLine();
		if(yes.equalsIgnoreCase("yes")) {ci.CI146(); champName();}else{ champName();}}

public static void main(String[] args) {
		
	new LOLChamp().champName();
		
	}
}
