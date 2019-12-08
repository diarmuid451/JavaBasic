package e_oop;

import java.util.Scanner;

public class LOLChamp {

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
			"피들스틱","피오라","피즈","하이머딩거","헤카림","세나"};
	Scanner s = new Scanner(System.in);
	void champName(){	
		System.out.println("챔피언 이름을 검색해주세요. 자주 사용되는 줄임말로도 검색 가능합니다.\r\n현재 정식 출시된 챔피언의 수는 총"+(champName.length)+"이며 가장 최근에 출시된 챔피언은 ["+champName[(champName.length)-1]+"]입니다.\r\n정식 출시 되지 않은 챔피언["+"아펠리오스"+"]는 정식 출시가 되면 업데이트 됩니다.");
		String cc = s.nextLine();
		switch (cc) {
		case "가렌": ch0();break; case "갈리오":ch1();break; case "갱플랭크":case "갱플":	ch2();break; case "그라가스":case "그라":ch3();break; case "그레이브즈":case "그브":ch4();break;	case "나르":ch5();break; case "나미":case "물고기":ch6();break; case "나서스":case "개":ch7();break; case "노틸러스":case "노틸":ch8();break;case "녹턴":ch9();break;
		case "누누와 윌럼프":case "누누":ch10();break; case "니달리":ch11();break; case "니코":ch12();break; case "다리우스":case "다리":ch13();break; case "다이애나":ch14();break; case "드레이븐":case "드븐":ch15();break; case "라이즈":ch16();break; case "라칸":ch17();break; case "람머스":ch18();break; case "럭스":ch19();break;
		case "럼블":ch20();break; case "레넥톤":case "악어":ch21();break; case "레오나":ch22();break; case "렉사이":ch23();break; case "렝가":case "사자":ch24();break; case "루시안":case "흑형":ch25();break; case "룰루":case "커져라":ch26();break; case "르블랑":ch27();break; case "리 신":case "리신":ch28();break; case "리븐":ch29();break;
		case "리산드라":case "리산":ch30();break;case "마스터 이":case "마이":ch31();break;case "마오카이":case "세계수":ch32();break;case "말자하":case "알라딘":ch33();break;case "말파이트":case "말파":ch34();break;case "모데카이저":case "모데":ch35();break;case "모르가나":ch36();break;case "문도 박사":case "문도":ch37();break;case "미스 포츈":case "미포":ch38();break;case "바드":ch39();break;
		case "바루스":ch40();break; 
//		case "바이":ch41();break;case "베이가":ch42();break;case "베인":ch43();break;case "벨코즈":ch44();break;case "볼리베어":case "곰":ch45();break;case "브라움":case "백형":ch46();break;case "브랜드":ch47();break;case "블라디미르":case "블라디":ch48();break;case "블리츠크랭크":case "블츠":case "블크":ch49();break;
//		case "빅토리":ch50();break;case "뽀삐":ch51();break;case "사이온":ch52();break;case "사일러스":case "사일":ch53();break;case "샤코":ch54();break;case "세주아니":case "세주":ch55();break;case "소나":ch56();break;case "소라카":case "어머니":ch57();break;case "쉔":ch58();break;case "쉬바나":case "용":ch59();break;
//		case "스웨인":ch60();break;case "스카너":case "전갈":ch61();break;case "시비르":ch62();break;case "신 짜오":case "신짜오":case "짜오":case "짜장":ch63();break;case "신드라":ch64();break;case "신지드":case "뿡뿡이":ch65();break;case "쓰레쉬":ch66();break;case "아리":case "여우":ch67();break;case "아무무":ch68();break;case "아우렐리온 솔":case "솔":ch69();break;
//		case "아이번":case "나무":ch70();break;case "아지르":case "비둘기":ch71();break;case "아칼리":ch72();break;case "아트록스":case "아트":ch73();break;case "알리스타":case "알리":case "소":ch74();break;case "애니":ch75();break;case "애니비아":case "빙닭":ch76();break;case "애쉬":ch77();break;case "야스오":ch78();break;case "에코":ch79();break;
//		case "엘리스":case "거미":ch80();break; case "오공":case "원숭이":ch81();break; case "오른":ch82();break; case "오리아나":case "오리":ch83();break; case "올라프":ch84();break; case "요릭":ch85();break; case "우디르":ch86();break; case "우르곳":ch87();break; case "워윅":case "늑대":ch88();break; case "유미":case "고양이":ch89();break; 
//		case "이렐리아":case "이렐":ch90();break;case "이블린":ch91();break; case "이즈리얼":case "이즈":ch92();break; case "일라오이":case "일라":ch93();break; case "자르반 4세":case "자르반":ch94();break; case "자야":ch95();break; case "자이라":ch96();break; case "자크":case "젤리":ch97();break; case "잔나":ch98();break; case "잭스":ch99();break; 
//		case "제드":ch100();break; case "제라스":ch101();break; case "제이스":ch102();break; case "조이":ch103();break; case "직스":ch104();break; case "진":ch105();break; case "질리언":ch106();break; case "징크스":ch107();break; case "초가스":ch108();break; case "카르마":case "흑누나":ch109();break; 
//		case "카밀":ch110();break; case "카사딘":ch111();break; case "카서스":ch112();break; case "카시오페아":case "카시":ch113();break; case "카이사":ch114();break; case "카직스":case "메뚜기":ch115();break; case "카타리나":case "카타":ch116();break; case "칼리스타":case "칼리":ch117();break; case "케넨":case "피카츄":ch118();break; case "케이틀린":case "케틀":ch119();break; 
//		case "케인":ch120();break; case "케일":ch121();break; case "코그모":ch122();break; case "코르키":ch123();break; case "퀸":ch124();break; case "클레드":ch125();break; case "키아나":ch126();break; case "킨드레드":case "킨드":ch127();break; case "타릭":ch128();break; case "탈론":case "카레":ch129();break; 
//		case "탈리야":ch130();break; case "탐 켄치":case "탐켄치":case "메기":ch131();break; case "트런들":case "트롤":ch132();break; case "트리스타나":case "트타":ch133();break; case "트린다미어":case "트린":ch134();break; case "트위스티드 페이트":case "트페":ch135();break; case "트위치":case "쥐":ch136();break; case "티모":case "오소리":ch137();break; case "파이크":ch138();break; case "판테온":case "빵테":ch139();break; 
//		case "피들스틱":case "피들":ch140();break; case "피오라":ch141();break; case "피즈":case "상어":ch142();break; case "하이머딩거":case "딩거":ch143();break; case "헤카림":ch144();break; case "세나":ch145();break;
		default: champName(); }}
	
	void ch0() {
		System.out.println("<<내 검과 심장은 데마시아의 것이다!>>\r\n가렌, 데마시아의 힘\r\nGarne, The Might of Demacia\r\n주 역할군 : 전사\t부 역할군 : 탱커\t소속 : 데마시아\r\n출시일 : 2010년 4월 27일");
		sk0();}
	void sk0(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp0();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq0();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw0();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se0();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr0();
		} else {champName();}}
	void sp0(){	
			System.out.println("패시브 : 인내심(Perseverance)\r\n가렌은 7초 동안 피해를 입거나 적의 스킬에 맞지 않으면 5초당 최대 체력의 일정 비율만큼 회복합니다.\r\n"+"미니언과 에픽 몬스터를 제외한 몬스터는 인내심에 영향을 주지 않습니다.\r\n"+"쿨타임 : 7\t5초당 최대 체력의 1.5 ~10.8%");
			sk0();}
	void sq0(){	
		System.out.println("Q : 결정타(Decisive Strike\r\n가렌에게 적용된 모든 둔화 효과가 풀리며 일정 시간 이동 속도가 30% 상승합니다.\r\n4.5초 안에 하는 다음 기본 공격은 추가 물리 피해를 입히고 대상을 1.5초 동안 침묵시킵니다.\r\n쿨타임 : 8 / 1.5/2.0/2.5/3.0/3.5 초 동안 이동속도 증가\r\n물리 피해 : 30/60/90/120/150 (+1.4 총 공격력) - 총 피해");
		sk0();}
	void sw0(){
		System.out.println("W : 용기(Courage)\r\n기본 지속 효과 : 유닛들을 처치하면 영구적으로 0.25의 방어력과 마법 저항력이 부여되어 최대 30까지 증가합니다.\r\n사용 시 :\t가렌이 일정 시간동안 용기백배하여 받는 피해가 30% 감소합니다.\r\n\t첫 0.75초 동안은 최대 체력의 10%에 해당하는 피해를 흡수하는 보호막과 60%의 강인함을 얻습니다.\r\n쿨타임 : 24/23/22/21/20\t2/2.75/3.5/4.25/5초간 유지");
		sk0();}
	void se0(){
		System.out.println("E : 심판(Judgment)\r\n가렌이 3초 동안 검을 들고 빠르게 회전하여 지속 시간 동안 근처 적에게 물리 피해를 입힙니다. 가장 가까운 적에게는 피해이 25% 증가합니다.\r\n(공격 횟수는 아이템과 레벨의 공격 속도에 비례합니다.)\r\n회전에 6번 맞은 적 챔피언은 6초 동안 방어력이 25% 감소합니다.\r\n(6번 이후의 추가 공격은 적중시마다 효과 지속 시간을 초기화합니다.)\r\n스킬을 빨리 취소하면 남은 스킬 지속시간만큼 재사용 대기시간이 감소합니다.\r\n사거리 : 325\r\n쿨타임 : 9\r\n물리 피해 : 4/8/12/16/20(+레벨에 따라 0 ~ 8) (+ 0.32 / 0.34 / 0.36 / 0.38 / 0.40 총 공격력) × (기본 7회 + 아이템 및 레벨 업으로 얻는 공격 속도 20%마다 1회)");
		sk0();}
	void sr0(){
		System.out.println("R : 데마시아의 정의(Demacian Justice)\r\n가렌이 적 챔피언을 처단할 데마시아의 힘을 소환하여 고정 피해를 입히고 대상이 잃은 체력에 비례한 피해를 추가로 입힙니다.\r\n사용한 대상을 1초 동안 볼 수 있으며, 대상이 시야에서 사라져도 스킬이 취소되지 않습니다.\r\n사거리 : 400\r\n쿨타임 : 120/100/80\r\n고정 피해: 150 / 300 / 450 (+ 잃은 체력의 20% / 25% / 30%)");
		sk0();}
	
	void ch1() {
		System.out.println("<<힘을 발휘할 시간이군!>>\r\n갈리오, 위대한 석상\r\nGalio, the Colossus\r\n주 역할군 : 탱커\t부 역할군 : 마법사\t소속 : 데마시아\r\n출시일 : 2010년 8월 10일\r\n(7.6 업데이트 전 갈리오 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk1();}		
	void sk1(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp1();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq1();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw1();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se1();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr1();
		} else {
			champName();}}		
	void sp1(){	
			System.out.println("패시브 - 석상의 강타(Colossal Smash)\r\n갈리오의 다음 기본 공격이 근처 모든 적에게 마법 피해를 입힙니다.\r\n쿨타임 : 5\r\n마법 피해 : (레벨에 따라) 15 ~ 200 (+1.0 총 공격력) (+0.5 주문력) (+0.6 추가 마법 저항력)");
			sk1();}
	void sq1(){	
		System.out.println("Q - 전장의 돌풍(Winds of War)\r\n갈리오가 두 개의 돌풍을 발사해 마법 피해를 입힙니다.\r\n두 돌풍이 합쳐지면 거대한 소용돌이가 일어나 1.5초 동안 적 최대 체력에 비례한 마법 피해를 입힙니다.\r\n소모 마나 : 70 / 75 / 80 / 85 / 90\r\n사거리 : 825\r\n쿨타임 : 12 / 11.5 / 11 / 10.5 / 10\r\n마법 피해 : 80 / 115 / 150 / 185 / 220 (+0.75 주문력) - 돌풍 피해\r\n0.5초당 대상 최대 체력의 2(+0.0066 주문력)% - 소용돌이 피해\r\n80 / 115 / 150 / 185 / 220 (+0.75 주문력) + 대상 최대 체력의 6(+0.02 주문력)% - 총 피해\r\n몬스터 대상 소용돌이 최대 피해: 150\r\n돌풍 속도: 1300\r\n소용돌이 범위: 235");
		sk1();}
	void sw1(){
		System.out.println("W - 듀란드의 방패(Shield of Durand)");
		System.out.println("기본 지속 효과 : 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println("최초 시전 시: 갈리오가 방어 태세를 갖추며 최대 2초 동안 마법 피해 감소 효과를 얻습니다. 해당 효과의 50%만큼 물리 피해도 감소합니다. 방어 태세 중에는 15% 느려집니다.");
		System.out.println("두 번째 시전 시: 갈리오가 주변의 적 챔피언들을 도발하고 마법 피해를 입히며, 피해 감소 효과가 2초 재적용됩니다. 도발 범위 및 지속 시간과 피해은 방어 태세를 유지한 시간에 비례합니다.");
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%\r\n물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%\r\n마법 피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해\r\n도발 지속 시간 : 0.5 ~ 1.5 초");
		sk1();}
	void se1(){
		System.out.println("E - 정의의 주먹(Justice Punch)");
		System.out.println("갈리오가 전방으로 돌진해 첫 번째 적 챔피언에게 마법 피해를 입히고 0.75초 동안 공중으로 띄웁니다. 돌진 경로에 있는 적은 모두 절반에 해당하는 마법 피해를 입습니다.\r\n정의의 주먹 사용 시 지형에 부딪치면 그 자리에 멈춥니다.");
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 14 / 13 / 12 / 11 / 10");
		System.out.println("마법 피해 : 90 / 130 / 170 / 210 / 250 (+0.9 주문력)");
		sk0();}
	void sr1(){
		System.out.println("R - 영웅출현(Hero's Entrance)");
		System.out.println("갈리오가 아군 챔피언의 현재 위치를 착지 지점으로 정합니다.\r\n착지 시 해당 지역에 있던 적은 모두 마법 피해를 입고 0.75초 동안 공중에 떠오릅니다.");
		System.out.println("소모 마나 : 100");
		System.out.println("사거리 : 4000 / 4750 / 5500");
		System.out.println("쿨타임 : 200 / 180 / 160");
		System.out.println("마법 피해 : 150 / 250 / 350 (+0.6 주문력)");
		sk1();}
		
	void ch2() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("Gangplank, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk2();}
	void sk2(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp2();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq2();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw2();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se2();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr2();
		} else {
			champName();}}
	void sp2(){
		System.out.println("패시브 - 불의 심판(Trial By Fire)");
		System.out.println("15초에 한 번씩 갱플랭크의 근접 공격이 대상을 불길로 휩싸며 2.5초에 걸쳐 추가 고정 피해를 입히고, 갱플랭크의 이동 속도를 2초 동안 증가시킵니다.");
		System.out.println("이 효과는 혀어어어업상에는 적용되지 않습니다.");
		System.out.println("화약통을 파괴하면 이 효과가 즉시 활성화됩니다. 구조물에는 절반의 피해이 적용됩니다.");
		System.out.println("쿨타임 : 15초\r\n2+30% 이동속도 증가");
		System.out.println("고정 피해 : 45 + (10 x 레벨) (+ 1.0 추가 공격력)");
		sk2();}
	void sq2(){
		System.out.println("Q - 혀어어어업상(Parrrley)");
		System.out.println("갱플랭크가 적 유닛에게 총을 발사하여 물리 피해를 입힙니다. 혀어어어업상으로 최후의 일격을 가한 경우, 추가 골드를 얻습니다.");
		System.out.println("또한, 추가로 획득하는 골드 + 1의 바다뱀 은화를 획득하며, 상점에서 포탄 세례를 업그레이드하는 데 활용할 수 있습니다.\r\n이 스킬은 근접 기본 공격처럼 치명타 효과와 명중 시 발생 효과가 적용되고, 아이템 효과로 다수의 적을 동시에 처치할 경우 얻는 골드와 바다뱀 은화가 중첩됩니다.");
		System.out.println("소모 마나 : 60 / 55 / 50 / 45 / 40\r\n사거리 : 625");
		System.out.println("쿨타임 :5");
		System.out.println("물리 피해 : 20 / 45 / 70 / 95 / 120 (+ 1.0 총 공격력)\r\n+ 추가 골드 : 3 / 4 / 5 / 6 / 7 + 바다뱀 은화 획득 : 4 / 5 / 6 / 7 / 8");
		sk2();}	
	void sw2(){
		System.out.println("W - 괴혈병 치료(Remove Scurvy)");
		System.out.println("갱플랭크가 귤을 많이 먹어서 방해 효과를 제거하고 체력을 회복합니다.");
		System.out.println("소모 마나 : 80 / 90 / 100 / 110 / 120");
		System.out.println("쿨타임 : 2 / 20 / 18 / 16 / 14");
		System.out.println("회복 : 50 / 75 / 100 / 125 / 150 (+ 0.9 주문력) (+ 잃은 체력의 15%)");
		sk2();}
	void se2(){
		System.out.println("E - 화약통(Powder Keg)");
		System.out.println("목표지점에 25초 동안 갱플랭크나 적이 공격할 수 있는 화약통을 설치합니다.\r\n갱플랭크가 화약통을 파괴하면 폭발 범위 내의 적을 모두 2초간 둔화시키고 물리 피해를 줍니다.\r\n폭발 범위가 겹치는 다른 화약통이 있다면 연쇄 폭발을 일으키지만, 피해는 중첩되지 않습니다.\r\n적이 화약통을 부수면 폭발하지 않고 약간의 골드를 줍니다.");
		System.out.println("화약통의 피해는 40%의 방어구 관통력을 적용받으며, 적 챔피언은 추가 피해를 받습니다.\r\n혀어어어업상 스킬로 폭발을 일으켜 적을 처치했을 경우, 처치한 적 모두 혀어어업상의 레벨에 따른 추가 골드와 바다뱀 은화를 지급합니다.");
		System.out.println("갱플랭크는 3개의 화약통을 들고 다닐 수 있습니다. 화약통의 체력은 3칸, 매 2초마다 줄어들고 7레벨과 13레벨 때 줄어드는 속도가 각각 1초, 0.5초로 빨라집니다.\r\n 사거리 : 1000");
		System.out.println("쿨타임 : 18 / 16 / 14 / 12 / 10");
		System.out.println("물리 피해 : 화약통을 파괴한 공격력\r\n(+챔피언 대상 추가 피해) : 80 / 105 / 130 / 155 / 180");
		System.out.println("둔화율 : 40 / 50 / 60 / 70 / 80%");
		sk2();}
	void sr2(){
		System.out.println("R - 포탄 세례(Cannon Barrage)");
		System.out.println("사용 시: 갱플랭크가 배에 신호를 보내 지정한 지역에 2초 동안 3번, 총 8초 동안 12번의 포탄 세례를 발사하도록 합니다.\r\n한 번의 웨이브는 적에게 마법 피해를 입히고, 포탄 세례를 맞은 적은 0.5초 동안 이동 속도가 30% 만큼 떨어집니다.");
		System.out.println("갱플랭크는 바다뱀 은화를 통해 배를 업그레이드 하여 포탄 세례에 추가 효과를 부여할 수 있습니다.\r\n구매 순서와 상관 없이 가격은 모두 500 바다뱀 은화입니다.");
		System.out.println("죽음의 여신 : 포탄 세례가 시작할 때 목표 지점 중앙에 105 / 180 / 255 (+0.3 주문력)의 고정 피해를 입히는 거대한 포탄을 발사하여 1.5초간 범위내 적의 이동속도를 60% 감소시킵니다.");
		System.out.println("사기진작 : 범위 안에 있는 아군의 이동 속도를 2초간 30%만큼 증가시킵니다.");
		System.out.println("가차없는 포격 : 포탄 세례의 지속 시간 동안 총 6번의 포격이 추가됩니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 전 지역");
		System.out.println("쿨타임 : 180 / 160 / 140\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("마법 피해 : 포격 1회당 40 / 70 / 100 (+0.1 주문력)\r\n 최대480 / 840 / 1200 (+1.2 주문력)");
		sk2();}
		
	void ch3() {
		System.out.println("<<네가 사는 거라면 나도 끼지~>>");
		System.out.println("그라가스, 술취한 난동꾼");
		System.out.println("Gragas, the Rabble Rouser");
		System.out.println("주 역할군 : 전사\t부 역할군 : 마법사\t소속 : 룬테라");
		System.out.println("출시일 : 2010년 2월 2일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk3();}
	void sk3(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp3();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq3();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw3();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se3();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr3();
		} else {
			champName();}}
	void sp3(){
		System.out.println("패시브 - 서비스 시간(Happy Hour)");
		System.out.println("그라가스가 스킬을 사용할 때마다 최대 체력의 6%를 회복합니다. 이 효과는 8초에 한 번씩만 발동됩니다.");
		System.out.println("쿨타임 : 8");
		System.out.println("회복 : 최대 체력의 6%");
		sk3();}
	void sq3(){
		System.out.println("Q - 술통 굴리기(Barrel Roll)");
		System.out.println("그라가스가 술통을 지정한 위치로 굴려 직접 폭발시키거나 4초 뒤 자동으로 폭발해 해당 지역 안의 적들에게 마법 피해를 입히고 2초 동안 이동 속도를 늦춥니다. ");
		System.out.println("피해과 둔화 비율은 술통이 오래 남아 있을수록 증가하여, 2초 후 최대 150%까지 올라갑니다. (미니언에는 70%의 피해만 입힙니다.)");
		System.out.println("소모 마나 : 60 / 65 / 70 / 75 / 80\r\n850 피해 범위 : 375 (추측)");
		System.out.println("쿨타임 : 11 / 10 / 9 / 8 / 7\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("마법 피해 : 80 / 120 / 160 / 200 / 240 (+0.7 주문력)\r\n최대 마법 피해: 120 / 180 / 240 / 300 / 360 (+1.05 주문력)");
		System.out.println("둔화율 : 40 / 45 / 50 / 55 / 60%\t최대 둔화: 60 / 67.5 / 75 / 82.5 / 90%");
		sk3();}	
	void sw3(){
		System.out.println("W - 취중 분노(Drunken Rage)");
		System.out.println("그라가스가 술통에 든 술을 마시고 2.5초 동안 받는 피해이 감소합니다. 술에 취한 그라가스의 5초 이내의 다음 기본 공격은 사거리가 50 증가하며 대상 반경 250 유닛 내의 적들에게 추가 마법 피해를 입힙니다.");
		System.out.println("소모 마나 : 30\r\n사거리 : 기본 공격 사거리 + 50");
		System.out.println("쿨타임 : 6 ");
		System.out.println("피해 감소 : 피해 감소: 10 / 12 / 14 / 16 / 18(+0.04 주문력)%");
		System.out.println("마법 피해 : 추가 마법 피해: 20 / 50 / 80 / 110 / 140 (+0.5 주문력) + (대상의 최대 체력의 7%)");
		System.out.println("몬스터에게 입히는 최대 마법 피해: 300");
		sk3();}
	void se3(){
		System.out.println("E - 몸통 박치기(Body Slam)");
		System.out.println("그라가스가 앞으로 돌진하여 첫 번째 적 유닛에게 부딪힙니다. 부딪히는 적과 그 주변 적에게 마법 피해를 입히고 뒤로 밀어내며, 1초동안 기절시킵니다.\r\n그라가스가 유닛과 충돌하면 몸통 박치기의 재사용 대기시간이 3초 단축됩니다.");
		System.out.println("소모 마나 : 50\r\n사거리 : 600");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n돌진 속도  : 900");
		System.out.println("마법 피해 : 80 / 130 / 180 / 230 / 280 (+0.6 주문력)");
		sk3();}
	void sr3(){
		System.out.println("R - 술통 폭발(Explosive Cask)");
		System.out.println("그라가스가 술통을 던져 해당 지역의 모든 적들에게 마법 피해를 입히며 이들을 중앙에서 바깥으로 밀어냅니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1150");
		System.out.println("쿨타임 : 120 / 100 / 80\r\n피해 범위: 400");
		System.out.println("시야 범위: 1000");
		System.out.println("최대 넉백 거리: 600");
		System.out.println("마법 피해 : 200 / 300 / 400 (+0.7 주문력)");
		sk3();}
	
	void ch4() {
		System.out.println("<<내가 돌아왔다.>>");
		System.out.println("그레이브즈, 무법자");
		System.out.println("Graves, the Outlaw");
		System.out.println("주 역할군 : 원거리\t부 역할군 : 없음\t소속 : 빌지워터");
		System.out.println("출시일 : 2011년 10월 19일");
		System.out.println("(5.22 업데이트 전 그레이브즈 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk4();}
	void sk4(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp4();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq4();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw4();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se4();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr4();
		} else {
			champName();}}
	void sp4(){
		System.out.println("패시브 - 새로운 운명(New Destiny");
		System.out.println("그레이브즈의 산탄총에는 남다른 특징이 몇 가지 있습니다.");
		System.out.println("이중 총열: 그레이브즈는 총탄이 떨어지면 총을 새로 장전해야 합니다. 공격 속도가 재장전 시간은 크게 줄이지 않지만 공격 후 다음 공격까지 걸리는 시간은 대폭 감소시킵니다.");
		System.out.println("12게이지: 공격 시 4개의 탄환이 발사됩니다. 적중한 대상은 공격력과 적중한 탄환의 수에 비례하는 피해를 입습니다.\r\n치명타 발동 시 탄환이 6개로 늘어나고 탄환 당 피해이 40% 증가합니다. 구조물의 경우 피해이 25% 감소합니다.");
		System.out.println("산탄: 유닛을 관통해서 공격할 수 없습니다. 챔피언이 아닌 유닛이 탄환을 둘 이상 맞으면 뒤로 밀려납니다.");
		System.out.println("물리 피해 : 공격력의 70-100% + 추가 탄환으로 23.33-33%");
		System.out.println("범위: 그레이브즈 전방 15° 원추 모양\r\n장전 시간: 2.08 ~ 1.12초\r\n투사체 속도: 3000");
		sk4();}
	void sq4(){
		System.out.println("Q - 화약 역류(End of the Line)");
		System.out.println("화약을 흩뿌리는 탄환을 발사하여 직선상의 적에게 물리 피해를 입힙니다.화약 궤적은 2초 뒤, 지형 충돌 시 0.2초 뒤 폭발하며 근처의 모든 적에게 물리 피해를 입힙니다.");
		System.out.println("소모 마나 : 60 / 65 / 70 / 75 / 80\r\n사거리 : 925");
		System.out.println("쿨타임 : 13 / 12 / 11 / 10 / 9");
		System.out.println("물리 피해 : 45 / 60 / 75 / 90 / 105 (+1.0 추가 공격력) - 최초\r\n85 / 120 / 155 / 190 / 225 (+0.4 / 0.7 / 1.0 / 1.3 / 1.6 추가 공격력) - 폭발\r\n130 / 180 / 230 / 280 / 330 (+1.4 / 1.7 / 2.0 / 2.3 / 2.6 추가 공격력) - 총합");
		sk4();}	
	void sw4(){
		System.out.println("W - 연막탄(Smoke Screen)");
		System.out.println("4초간 지속되는 검은 연기 구름을 만들어냅니다. 연기 속에 갇힌 적은 밖을 볼 수 없습니다.\r\n적중한 적에게 마법 피해를 입히고 0.5초 동안 50%만큼 둔화시킵니다.");
		System.out.println("소모 마나 : 70 / 75 / 80 / 85 / 90\r\n사거리 : 950");
		System.out.println("쿨타임 : 26 / 24 / 22 / 20 / 18");
		System.out.println("마법 피해 60 / 110 / 160 / 210 / 260 (+0.6 주문력)");
		System.out.println("시전 시간 : 0.15초\r\n범위 : 250\t시야 제한 : 675");
		sk4();}
	void se4(){
		System.out.println("E - 빨리 뽑기(Quickdraw)");
		System.out.println("한 방향으로 돌진하며 총탄을 하나 장전합니다. 또한 4초 동안 진정한 용기 효과를 얻습니다. 적 챔피언을 향해 돌진할 경우에는 진정한 용기 효과가 두 번 중첩됩니다.");
		System.out.println("기본 공격이 적중할 때마다 빨리 뽑기 스킬의 재사용 대기시간이 0.5초씩 감소하고, 미니언이 아닌 대상에게 피해를 입힐 때마다 진정한 용기 지속 시간이 초기화됩니다.");
		System.out.println("진정한 용기 효과가 활성화되면 방어력이 증가합니다. (8회까지 중첩됩니다.)");
		System.out.println("소모 마나 : 40\r\n사거리 : 425");
		System.out.println("쿨타임 : 18 / 17 / 16 / 15 / 14");
		System.out.println("방어력 증가 : 8 / 11 / 14 / 17 / 20");
		sk4();}
	void sr4(){
		System.out.println("R - 무고한 희생자(Collateral Damage)");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println("탄환은 챔피언을 맞히거나 사거리 끝까지 날아간 다음 폭발하여 원뿔 형태의 범위에 물리 피해를 줍니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1000\t뒤로 밀려나는 거리 : 300");
		System.out.println("쿨타임 : 120 / 90 / 60");
		System.out.println("물리 피해 : 250 / 400 / 550 (+1.5 추가 공격력) - 최초\r\n\200 / 320 / 440 (+1.2 추가 공격력) - 폭발");
		sk4();}
	
	void ch5() {
		System.out.println("<<나르! 갸다!>>");
		System.out.println("나르, 잃어버린 고리");
		System.out.println("Gnar, the Missing Link");
		System.out.println("주 역할군 : 전사\t부 역할군 : 탱커\t소속 : 프렐요드");
		System.out.println("출시일 : 2014년 8월 14일");
		sk5();}
	void sk5(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp5();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq5();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw5();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se5();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr5();
		} else {
			champName();}}
	void sp5(){
		System.out.println("패시브 - 분노 유전자(Rage Gene)");
		System.out.println("나르는 전투에 참여할 때와 공격할 때 분노가 생성됩니다. 분노가 최고치에 도달하면 다음번 스킬을 사용할 때 변신하여 15초 동안 사용하는 스킬과 능력치가 바뀝니다.");
		System.out.println("분노 생성: 6렙 이전 기본 공격 시 2 + 2초에 걸쳐 4 (총 6) / 스킬 적중 시 1 + 2초에 걸쳐 4 (총 5) / 피해를 받을 시 2초에 걸쳐 4");
		System.out.println("6렙 이후 기본 공격 시 5 + 2초에 걸쳐 5 또는 6 (총 10 / 11) / 스킬 적중 시 1 + 2초에 걸쳐 7 (총 8) / 피해를 받을 시 2초에 걸쳐 7");
		System.out.println("11렙 이후 기본 공격 시 8 + 2초에 걸쳐 8 또는 9 (총 16 / 17) / 스킬 적중 시 2 + 2초에 걸쳐 11 (총 13) / 피해를 받을 시 2초에 걸쳐 11");
		sk5();}
	void sq5(){
		System.out.println("Q - 부메랑 던지기 / 돌덩이 던지기(Boomerang Throw / Boulder Toss)");
		System.out.println("부메랑 던지기 : 부메랑을 던지면 물리 피해를 입히고 2초 동안 적들의 속도를 늦춥니다.\r\n부메랑은 적 하나를 맞힌 다음에는 나르에게 돌아오며, 이후 맞히는 적들은 50%의 피해를 입습니다.");
		System.out.println("적 하나 당 부메랑에 한 번만 맞습니다. 부메랑을 받으면 재사용 대기시간이 40% 감소합니다.");
		System.out.println("사거리 : 1100");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n감소된 쿨타임 : 14 / 10.5 / 9 / 7.5 / 6");
		System.out.println("물리 피해 : 5 / 45 / 85 / 125 / 165 (+1.15 총 공격력)");
		System.out.println("둔화율 : 15 / 20 / 25 / 30 / 35 %\r\n부메랑이 되돌아오는 거리: 3000");
		System.out.println("돌덩이 던지기 : 돌덩이를 던져 맞은 대상과 주변 모든 적을 둔화시키고 물리 피해를 입힙니다. 돌덩이를 집어들면 이 스킬의 재사용 대기시간이 60% 감소합니다.");
		System.out.println("사거리 : 1100");
		System.out.println("쿨타임 : 20 / 17.5 / 15 / 12.5 / 10\r\n감소된 쿨타임 : 감소된 쿨타임 : 8 / 7 / 6 / 5 / 4");
		System.out.println("물리 피해 : 5 / 45 / 85 / 125 / 165 (+1.2 총 공격력)");
		System.out.println("둔화율 : 15 / 20 / 25 / 30 / 35 %");
		sk5();}	
	void sw5(){
		System.out.println("W - 슝슝 / 쿵쾅(Hyper / Wallop");
		System.out.println("슝슝 : 같은 대상에게 매 3번째 기본 공격이나 스킬 공격을 하면 추가로 대상의 최대 체력에 비례한 마법 피해를 입히고\r\n나르의 이동 속도가 상승한 다음 3초에 걸쳐 서서히 감소합니다.");
		System.out.println("마법 피해 : 10 / 20 / 30 / 40 / 50 (+1.0 주문력) (+대상 최대 체력의 6 / 8 / 10 / 12 / 14%)");
		System.out.println("이동속도 증가 : + 30 / 45 / 60 / 75%(나르!의 스킬 레벨에 비례)");
		System.out.println("쿵쾅 : 1.25초 동안 일정 구역 안에 있는 적들을 기절시켜 물리 피해를 입힙니다.\r\n나르가 메가 형태에서 미니 형태로 돌아올 때는 슝슝의 이동 속도 상승 효과를 받습니다.");
		System.out.println("사거리 : 350(추정)");
		System.out.println("쿨타임 : 7");
		System.out.println("물리 피해 : 25 / 45 / 65 / 85 / 105 (+1.0 총 공격력)");
		sk5();}
	void se5(){
		System.out.println("E - 폴짝 / 우지끈(Hop / Crunch");
		System.out.println("폴짝 : 대상 지점으로 폴짝 뛰어 3초 동안 공격 속도가 상승합니다. 유닛 위에 착지하면 튕겨서 더 멀리 날아가며,\r\n착지한 유닛이 적일 경우 물리 피해를 입히고 잠시 둔화시킵니다.");
		System.out.println("사거리 : 475");
		System.out.println("쿨타임 : 22 / 19.5 / 17 / 14.5 / 12\r\n2공격 속도 상승 : + 20 / 30 / 40 / 50 / 60%");
		System.out.println("물리 피해 : 50 / 85 / 120 / 155 / 190 (+최대 체력의 6%)");
		System.out.println("둔화율 : 80 %\t 지속 시간 : 0.5 초");
		System.out.println("우지끈 : 대상 지점으로 훌쩍 뛰어 착지 위치에 있는 적에게 물리 피해를 입힙니다. 나르에게 밟힌 적들은 잠시동안 둔화됩니다.\r\n우지끈으로 변신하게 되면 메가 나르가 되어서도 튕겨 날아갈 수 있습니다.");
		System.out.println("사거리 : 600");
		System.out.println("쿨타임 : 22 / 19.5 / 17 / 14.5 / 12");
		System.out.println("물리 피해 : 50 / 85 / 120 / 155 / 190 (+최대 체력의 6%)");
		System.out.println("둔화율 : 80 %\t 지속 시간 : 0.5 초");
		sk5();}
	void sr5(){
		System.out.println("나르!(GNAR!)");
		System.out.println("기본 지속 효과 : 슝슝의 이동 속도 증가율이 상승합니다.");
		System.out.println("메가 나르: 근처 적을 정해진 방향으로 밀어내서 물리 피해를 입히고 일정 시간 동안 속도를 45% 늦춥니다.\r\n벽에 부딪히는 적은 150%의 피해를 입고, 둔화되는 대신 기절합니다.");
		System.out.println("사거리 : 590");
		System.out.println("쿨타임 : 90 / 60 / 30");
		System.out.println("물리 피해 : 200 / 300 / 400 (+0.2 추가 공격력) (+0.5 주문력) - 기본");
		System.out.println("벽에 부딪힐 시 : 300 / 450 / 600 (+0.3 추가 공격력) (+0.75 주문력) - 벽에 부딪힐 시");
		System.out.println("밀어내는 거리 :  : 500\r\n군중제어 시간: 1.5 / 2 / 2.5 초");
		sk5();}
	
	void ch6() {
		System.out.println("<<파도가 뭘 싣고 올진 나한테 달렸죠.>>");
		System.out.println("나미, 파도 소환사");
		System.out.println("Nami, the Tidecaller");
		System.out.println("주 역할군 : 서포터\t부 역할군 : 마법사\t소속 : 룬테라");
		System.out.println("출시일 : 2012년 12월 7일");
		sk6();}
	void sk6(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp6();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq6();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw6();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se6();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr6();
		} else {
			champName();}}
	void sp6(){
		System.out.println("패시브 - 밀려오는 파도(Surging Tides)");
		System.out.println("나미의 스킬에 맞은 아군 챔피언은 1.5초 동안 이동 속도가 60 (+0.2 주문력) 상승합니다.");
		sk6();}
	void sq6(){
		System.out.println("Q - 물의 감옥(Aqua Prison");
		System.out.println("지정한 위치로 물방울을 보내면, 적에게 마법 피해를 입히고 1.5초 동안 기절시킵니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 875");
		System.out.println("쿨타임 : 12 / 11 / 10 / 9 / 8");
		System.out.println("마법 피해 : 75 / 130 / 185 / 240 / 295 (+0.5 주문력)");
		sk6();}	
	void sw6(){
		System.out.println("W - 밀물 썰물(Ebb and Flow)");
		System.out.println("밀려드는 파도를 보내 아군과 적을 번갈아 맞힙니다.\r\n각 대상에는 한 번만 튕기며, 최대 3명의 대상에게 튕깁니다.\r\n피해과 치유은 한 번 튕길 때마다 -15 (+0.075 주문력)%씩 조정됩니다.");
		System.out.println("아군을 맞힐 때: 맞은 아군을 치유하고, 근처 적 챔피언에게 튕깁니다.");
		System.out.println("적을 맞힐 때: 적에게 마법 피해를 가하고, 근처 아군 챔피언에게 튕깁니다.");
		System.out.println("소모 마나 : 70 / 85 / 100 / 115 / 130\r\n사거리 : 725");
		System.out.println("쿨타임 : 10");
		System.out.println("회복 : 60 / 85 / 110 / 135 / 160 (+0.3 주문력)");
		System.out.println("마법 피해 : 70 / 110 / 150 / 190 / 230 (+0.5 주문력)");
		sk6();}
	void se6(){
		System.out.println("E - 파도 소환사의 축복(Tidecaller's Blessing)");
		System.out.println("아군 챔피언을 6초 동안, 혹은 3번의 공격까지 강화시켜 기본 공격으로 추가 마법 피해를 입히고, 공격 당한 적을 1초 동안 느리게 만듭니다.");
		System.out.println("소모 마나 : 55 / 60 / 65 / 70 / 75\r\n사거리 : 800");
		System.out.println("쿨타임 : 11");
		System.out.println("마법 피해 : 25 / 40 / 55 / 70 / 85 (+0.2 주문력)");
		System.out.println("둔화율 : 15 / 20 / 25 / 30 / 35 (+0.05 주문력)%");
		sk6();}
	void sr6(){
		System.out.println("R - 해일(Tidal Wave)");
		System.out.println("나미가 있는 위치에서 해일을 소환합니다. 해일은 적들을 공중으로 띄우며 둔화를 적용하고 마법 피해를 입힙니다..");
		System.out.println("해일이 이동한 거리가 길수록 둔화 지속 시간도 길어지며, 최소 2초에서 최장 4초 지속됩니다.");
		System.out.println("파도에 맞은 아군은 밀려오는 파도의 효과를 2배로 받습니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 2750");
		System.out.println("쿨타임 : 120 / 110 / 100");
		System.out.println("피해 : 150 / 250 / 350 (+0.6 주문력)");
		System.out.println("에어본 : 0.5초");
		System.out.println("둔화율 : 50 / 60 / 70%");
		System.out.println("투사체 속도 : 850");
		sk6();}
	
	void ch7() {
		System.out.println("<<삶과 죽음의 순환은 계속된다. 우리는 살 것이고, 저들은 죽을 것이다..>>");
		System.out.println("나서스, 사막의 관리자");
		System.out.println("Nasus, the Curator of the Sands");
		System.out.println("주 역할군 : 전사\t부 역할군 : 탱커\t소속 : 슈리마");
		System.out.println("출시일 : 2009년 10월 1일");
		sk7();}
	void sk7(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp7();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq7();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw7();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se7();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr7();
		} else {
			champName();}}
	void sp7(){
		System.out.println("패시브 - 영혼의 포식자(Soul Eater)");
		System.out.println("나서스가 입힌 물리 피해의 일정 비율만큼 체력을 회복합니다.");
		System.out.println("생명력 흡수 : 12 / 18 / 24%");
		sk7();}
	void sq7(){
		System.out.println("Q - 흡수의 일격(Siphoning Strike)");
		System.out.println("나서스의 다음 기본 공격은 추가 물리 피해를 입힙니다. 흡수의 일격으로 적을 처치하면 흡수의 일격에 3의 추가 피해가 영구적으로 추가됩니다.");
		System.out.println("챔피언과 대형 미니언, 대형 또는 에픽 몬스터에 대해서는 이 효과가 12까지 증가합니다.");
		System.out.println("소모 마나 : 20\r\n사거리 : 기본 공격 사거리 + 25");
		System.out.println("쿨타임 : 8 / 7 / 6 / 5 / 4");
		System.out.println("물리 피해 : 30 / 50 / 70 / 90 / 110 (+1.0 총 공격력) (+ 흡수의 일격 중첩 수)");
		sk7();}	
	void sw7(){
		System.out.println("W - 쇠약(Wither)");
		System.out.println("나서스가 5초 동안 대상 챔피언의 노화를 촉진시켜 이동 속도를 35%만큼 늦춥니다.");
		System.out.println("이동 속도는 지속 시간 동안 점차 더 느려집니다. 이 절반만큼 대상의 공격 속도도 감소합니다.");
		System.out.println("소모 마나 : 80\r\n사거리 : 600");
		System.out.println("쿨타임 : 15 / 14 / 13 / 12 / 11");
		System.out.println("이동속도 둔화율 : 47 / 59 / 71 / 83 / 95%");
		System.out.println("공곡속도 둔화율 : - 23.5 / 29.5 / 35.5 / 41.5 / 47.5 %");
		sk7();}
	void se7(){
		System.out.println("E - 영혼의 불길(Spirit Fire)");
		System.out.println("나서스가 대상 지역을 영혼의 불길로 태워 지역 내 적에게 마법 피해를 입힙니다.");
		System.out.println("다음 5초 동안, 지역 내 적의 방어력을 감소시키고 매초 마법 피해를 입힙니다.");
		System.out.println("소모 마나 : 70 / 85 / 100 / 115 / 130\r\n사거리 : 650");
		System.out.println("쿨타임 : 12");
		System.out.println("시전 시 마법 피해 : 55 / 95 / 135 / 175 / 215 (+0.6 주문력)");
		System.out.println("초당 마법 피해 : 11 / 19 / 27 / 35 / 43 (+0.12 주문력)");
		System.out.println("총 마법 피해 : 110 / 190 / 270 / 350 / 430 (+1.2 주문력)");
		System.out.println("방어력 감소 :  - 15 / 20 / 25 / 30 / 35%");
		sk7();}
	void sr7(){
		System.out.println("R - 사막의 분노(Fury of the Sands)[편");
		System.out.println("나서스가 15초 동안 모래 폭풍 속에서 힘을 얻어 최대 체력이 증가하고 방어력과 마법 저항력이 상승합니다.");
		System.out.println("폭풍이 부는 동안 나서스는 매초마다 주변 적이 보유한 최대 체력에 비례한 마법 피해를 입히며");
		System.out.println("(초당 최대 240의 피해) 추가 방어력과 마법 저항력을 얻습니다. 또한 흡수의 일격의 재사용 대기시간이 50% 감소합니다.");
		System.out.println("소모 마나 : 100");
		System.out.println("쿨타임 :120\r\n추가 기본 공격 사거리 : +50");
		System.out.println("추가 체력 : 300 / 450 / 600");
		System.out.println("추가 방어력과 마법 저항력 :\r\n시전시 : + 15 / 35 / 55");
		System.out.println("초당 증가 : + 1 / 2 / 3\r\n최대 증가 : + 30 / 65 / 100");
		System.out.println("마법 피해 범위 : 350");
		System.out.println("초당 마법 피해 : 대상 최대 체력의 3 / 4 / 5 (+0.01 주문력)%");
		System.out.println("총 마법 피해 : 대상 최대 체력의 45 / 60 / 75 (+0.15 주문력)%");
		sk7();}
	
	void ch8() {
		System.out.println("<<물이 깊으니... 조심해...>>");
		System.out.println("노틸러스, 심해의 타이탄");
		System.out.println("Nautilus, the Titan of the Depths");
		System.out.println("주 역할군 : 탱커\t부 역할군 : 전사\t소속 : 빌지워터");
		System.out.println("출시일 : 2012년 2월 14일");
		sk8();}
	void sk8(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp8();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq8();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw8();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se8();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr8();
		} else {
			champName();}}
	void sp8(){
		System.out.println("패시브 - 강력한 일격(Staggering Blow)");
		System.out.println("노틸러스의 기본 공격이 2+(6×레벨)의 추가 물리 피해를 입히고 대상을 잠시 이동 불가로 만듭니다.");
		System.out.println("이 효과는 동일 대상에는 일정 시간마다 한 번만 발동됩니다.");
		System.out.println("대상별 재사용 대기시간 : 6");
		System.out.println("속박 지속 시간 :  0.75 / 1 / 1.25 / 1.5 초");
		sk8();}
	void sq8(){
		System.out.println("Q - 닻줄 견인(Dredge Line)");
		System.out.println("노틸러스가 전방으로 닻을 던집니다.\r\n적 유닛에게 맞으면 노틸러스와 대상이 가까이 당겨지며 마법 피해를 적에게 입히고 잠깐 기절시킵니다.");
		System.out.println("닻이 지형을 맞히면 노틸러스가 전방으로 끌려가며 재사용 대기시간이 50% 감소하고, 소모된 마나의 50%가 회복됩니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 1100");
		System.out.println("쿨타임 : 14 / 13 / 12 / 11 / 10");
		System.out.println("마법 피해 : 80 / 130 / 180 / 230 / 280 (+0.9 주문력)");
		System.out.println("시전 시간 : 0.25초");
		System.out.println("투사체 속도 : 2000\r\n좌우 범위 : 90");
		sk8();}	
	void sw8(){
		System.out.println("W - 타이탄의 분노(Titan's Wrath)");
		System.out.println("노틸러스가 6초 동안 어둠의 기운으로 자신을 감싸, 피해를 흡수합니다.");
		System.out.println("보호막이 지속되는 동안, 노틸러스의 기본 공격은 2초에 걸쳐 공격 대상 주위의 모든 유닛에게 추가 마법 피해를 줍니다.");
		System.out.println("소모 마나 :  60 / 70 / 80 / 90 / 100");
		System.out.println("쿨타임 : 12");
		System.out.println("보호막 :  60 / 70 / 80 / 90 / 100 (+ 최대 체력의 9 / 10 / 11 / 12 / 13 %)");
		System.out.println("마법 피해 : 30 / 40 / 50 / 60 / 70 (+0.4 주문력)");
		System.out.println("마법 피해 범위: 350");
		sk8();}
	void se8(){
		System.out.println("E - 역조(Riptide)");
		System.out.println("노틸러스가 지면을 내리쳐 주위의 땅을 폭발시킵니다. 폭발할 때마다 범위 내의 유닛들에 마법 피해를 주고, 1.25초간 둔화시킵니다.");
		System.out.println("이 둔화 효과는 시간이 지나면 사라집니다.");
		System.out.println("한 유닛이 폭발에 여러 번 맞을 수도 있지만, 추가 폭발에 입는 피해는 50% 감소합니다.");
		System.out.println("소모 마나 : 50 / 60 / 70 / 80 / 90\r\n사거리 : 600");
		System.out.println("쿨타임 : 7 / 6.5 / 6 / 5.5 / 5");
		System.out.println("최소 마법 피해 : 55 / 85 / 115 / 145 / 175 (+0.3 주문력)");
		System.out.println("최대 마법 피해 110 / 170 / 230 / 290 / 350 (+0.6 주문력)");
		System.out.println("둔화율 : 30 / 35 / 40 / 45 / 50 %");
		sk8();}
	void sr8(){
		System.out.println("R - 폭뢰(Depth Charge)");
		System.out.println("노틸러스가 충격파를 발사하면 적 챔피언을 추격해 갑니다. 관통하는 적들에게 마법 피해를 주고 이들을 공중에 띄웁니다.");
		System.out.println("충격파가 목표 대상에게 맞으면 폭발하면서 마법 피해를 주고, 공중으로 띄우며 잠시 기절시킵니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 825");
		System.out.println("쿨타임 : 120 / 100 / 80");
		System.out.println("마법 피해\r\n125 / 175 / 225 (+0.4 주문력) - 관통\r\n150 / 275 / 400 (+0.8 주문력) - 폭발");
		System.out.println("에어본 1초");
		System.out.println("기절 시간: 1 / 1.5 / 2 초");
		sk8();}
	
	void ch9() {
		System.out.println("<<어둠을… 맞이하라…!>>");
		System.out.println("녹턴, 영원한 악몽");
		System.out.println("Nocturne, the Eternal Nightmare");
		System.out.println("주 역할군 : 암살자\t부 역할군 : 전사\t소속 : 룬테라");
		System.out.println("출시일 : 2011년 3월 15일");
		sk9();}
	void sk9(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp9();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq9();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw9();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se9();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr9();
		} else {
			champName();}}
	void sp9(){
		System.out.println("패시브 - 그림자 칼날(Umbra Blades)");
		System.out.println("10초마다 녹턴의 다음 공격이 주변 적에게 120%의 물리 피해를 입히고 자신은 체력을 회복합니다.");
		System.out.println("녹턴이 기본 공격을 할 때마다 그림자 칼날의 재사용 대기시간이 1초 감소합니다. 대상이 적 챔피언일 경우에는 2초 감소합니다.");
		System.out.println("회복 : 15 ~ 40.5 (13.5 + 1.5 × 레벨) (+0.15 주문력)%");
		sk9();}
	void sq9(){
		System.out.println("Q - 황혼의 인도자(Duskbringer)");
		System.out.println("녹턴이 그림자 칼날을 던져 물리 피해를 입히고 5초 동안 황혼의 궤적을 남깁니다. 피격당한 적 챔피언 역시 황혼의 궤적을 남깁니다.");
		System.out.println("궤적에 있는 동안 녹턴은 다른 유닛과 충돌하지 않으며, 이동 속도가 증가하고 공격력이 상승합니다.");
		System.out.println("소모 마나 : 60 / 65 / 70 / 75 / 80\r\n사거리 : 1200");
		System.out.println("쿨타임 : 10");
		System.out.println("물리 피해 : 65 / 110 / 155 / 200 / 245 (+0.75 추가 공격력)");
		System.out.println("이동속도 증가 : + 15 / 20 / 25 / 30 / 35%\r\n공격력 상승 : + 20 / 30 / 40 / 50 / 60");
		sk9();}
	void sw9(){
		System.out.println("W - 어둠의 장막(Shroud of Darkness)");
		System.out.println("기본 지속 효과 : 녹턴의 공격속도가 오릅니다.");
		System.out.println("사용 시 : 녹턴이 1.5초 동안 마법 방패를 생성하여 적의 다음 스킬을 방어합니다.\r\n방패로 스킬을 막아낼 경우 5초 동안 녹턴의 추가 공격 속도가 2배로 상승합니다.");
		System.out.println("공격 속도 상승 : + 30 / 35 / 40 / 45 / 50 %");
		System.out.println("소모 마나 : 50");
		System.out.println("쿨타임 : 20 / 18 / 16 / 14 / 12");
		sk9();}
	void se9(){
		System.out.println("E - 말할 수 없는 공포(Unspeakable Horror)");
		System.out.println("기본 지속 효과 : 녹턴이 공포에 빠진 적들을 향해 갈 때 이동 속도가 상승합니다.");
		System.out.println("사용 시 : 녹턴이 대상의 정신에 악몽을 심어 마법 피해를 2초간 가합니다.\r\n만약 대상이 스킬 유지 시간 동안 스킬의 사정 거리 안에 있을 경우 대상은 일정 시간 동안 공포에 빠집니다.");
		System.out.println("이동 속도 증가 : + 335");
		System.out.println("소모 마나 : 125\r\n사거리 : 425 / 지속 거리 : 625");
		System.out.println("쿨타임 : 15 / 14 / 13 / 12 / 11");
		System.out.println("마법 피해 :  80 / 125 / 170 / 215 / 260 (+1.0 주문력)");
		System.out.println("공포 지속 시간 : 1.25 / 1.5 / 1.75 / 2 / 2.25 초");
		sk9();}
	void sr9(){
		System.out.println("R - 피해망상(Paranoia)");
		System.out.println("녹턴이 모든 적 챔피언의 시야 반경을 줄이고 적 챔피언들 사이의 시야 공유를 6초 동안 중단합니다.");
		System.out.println("피해망상이 발동된 동안 녹턴은 적 챔피언에게 돌격하여 물리 피해를 입힐 수 있습니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 500 / 3250 / 4000");
		System.out.println("쿨타임 : 150 / 125 / 100");
		System.out.println("물리 피해 : 150 / 275 / 400 (+1.2 추가 공격력)");
		System.out.println("시야 감소 : 300");
		sk9();}	
	
	void ch10() {
		System.out.println("<<모험은 역시 친구랑 같이 해야 신나는 법!.>>");
		System.out.println("누누와 윌럼프, 소년과 설인");
		System.out.println("Nunu & Willump, the Boy and His Yeti");
		System.out.println("주 역할군 : 탱커\t부 역할군 : 전사\t소속 : 프렐요드");
		System.out.println("출시일 : 2009년 2월 21일");
		System.out.println("(8.17 업데이트 전 누누와 윌럼프 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk10();}
	void sk10(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp10();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq10();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw10();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se10();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr10();
		} else {
			champName();}}
	void sp10(){
		System.out.println("패시브 - 프렐요드의 부름(Call of the Freljord)");
		System.out.println("적 챔피언, 대형 몬스터 또는 구조물에 피해를 입히면 윌럼프와 공격 속도가 가장 빠른 주변 아군 챔피언 한 명이 프렐요드의 부름을 받아 4초 동안 공격 속도가 20% 증가하고 이동 속도가 10% 증가합니다.");
		System.out.println("프렐요드의 부름이 활성화된 동안 누누와 윌럼프의 기본 공격이 주변을 휩쓸며 기본 공격 피해의 30%에 해당하는 광역 피해를 입힙니다.");
		System.out.println("프렐요드의 부름은 대상 하나당 10초에 한 번씩 발동되며 새로운 대상으로 인해 다시 발동될 경우 총 지속 시간이 늘어납니다.");
		sk10();}
	void sq10(){
		System.out.println("Q - 잡아먹기(Consume)");
		System.out.println("윌럼프가 적을 물어뜯어 피해를 입히고 체력을 회복합니다. 체력이 50% 이하일 경우 회복이 50% 증가합니다.");
		System.out.println("몬스터와 미니언 대상 : 고정 피해를 입히고 체력을 회복합니다.");
		System.out.println("챔피언 대상 : 마법 피해를 입히고 체력을 회복합니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 125");
		System.out.println("쿨타임 : 12 / 11 / 10 / 9 / 8");
		System.out.println("몬스터와 미니언 대상\r\n고정 피해 : 340 / 500 / 660 / 820 / 980\r\n회복 : 75 / 110 / 145 / 180 / 215 (+0.7 주문력) (+0.1 추가 체력)");
		System.out.println("챔피언 대상\r\n마법 피해 : 60 / 100 / 140 / 180 / 220 (+0.5 주문력) (+0.05 추가 체력)\r\n회복 : 60 / 88 / 116 / 144 / 172 (+0.56 주문력) (+0.08 추가 체력)");
		sk10();}	
	void sw10(){
		System.out.println("W - 데굴데굴 눈덩이!(Biggest Snowball Ever!)");
		System.out.println("윌럼프가 크기와 속도가 증가하는 눈덩이를 굴립니다. 눈덩이의 크기에 따라 피해과 띄워 올리기 지속 시간이 증가합니다.");
		System.out.println("눈덩이가 벽이나 적 챔피언, 대형 몬스터에 부딪히면 눈덩이가 터지면서 부딪힌 대상과 주변 적에게 마법 피해를 입히고 공중으로 띄워 올립니다.");
		System.out.println("눈덩이를 같은 방향으로 계속 회전하면 윌럼프의 회전 속도가 점점 빨라집니다. 회전 방향을 바꾸면 회전 속도가 처음으로 다시 돌아옵니다.");
		System.out.println("스킬을 다시 사용하면 눈덩이를 일직선으로 굴려보냅니다.");
		System.out.println("소모 마나 : 50 / 55 / 60 / 65 / 70");
		System.out.println("쿨타임 : 14");
		System.out.println("최소 굴리기 마법 피해 : 12 / 15 / 18 / 21 / 24 (+0.6 주문력)");
		System.out.println("최대 굴리기 마법 피해 : 60 / 75 / 90 / 105 / 120 (+1.0 주문력)");
		System.out.println("최소 폭발 마법 피해 : 36 / 45 / 54 / 63 / 72 (+0.3 주문력)");
		System.out.println("최대 폭발 마법 피해 : 180 / 225 / 270 / 315 / 360 (+1.5 주문력)");
		sk10();}
	void se10(){
		System.out.println("E - 눈덩이 팡팡팡(Snowball Barrage)");
		System.out.println("누누가 3초에 걸쳐 스킬을 사용할 때마다 눈덩이 세 개를 빠르게 난사합니다.");
		System.out.println("눈덩이를 맞은 적은 마법 피해를 입으며, 적 챔피언 또는 대형 몬스터는 눈투성이가 됩니다. 눈덩이를 세 개 맞은 적은 1초 동안 느려집니다.");
		System.out.println("윌럼프가 나설 차례: 누누가 눈덩이를 모두 던진 후 일정 범위 내에 눈투성이가 된 적들이 있다면 이들에게 마법 피해를 입히고 속박합니다.");
		System.out.println("누누는 윌럼프가 나설 차례가 오기 전까지 눈덩이 팡팡팡을 최대 3번까지 사용할 수 있습니다.\r\n누누는 눈덩이 팡팡팡으로 각 적을 한 번씩만 둔화시킬 수 있습니다.");
		System.out.println("소모 마나 : 50 / 55 / 60 / 65 / 70\r\n사거리 : 690");
		System.out.println("쿨타임 : 14");
		System.out.println("눈덩이 개당 마법 피해 : 16 / 24 / 32 / 40 / 48 (+0.06 주문력)\r\n최대 마법 피해 : 최대 피해: 144 / 216 / 288 / 360 / 432 (+0.54 주문력)");
		System.out.println("둔화율 : 30 / 35 / 40 / 45 / 50 %");
		System.out.println("윌럼프가 나설 차례 마법 피해 : 20 / 30 / 40 / 50 / 60 (+0.8 주문력)");
		System.out.println("속박 지속 시간 : 0.5초 (+레벨당 0.6초)");
		sk10();}
	void sr10(){
		System.out.println("R - 절대 영도(Absolute Zero)");
		System.out.println("윌럼프가 3초 동안 정신을 집중하며 주변 열기를 빨아들입니다.");
		System.out.println("근처 적들은 이동 속도가 50% 감소하며 정신을 집중하는 동안 이동 속도 감소은 95%까지 늘어납니다.");
		System.out.println("누누와 윌럼프는 피해를 흡수하는 보호막을 얻으며, 이 보호막은 정신 집중이 끝난 후 3초에 걸쳐 서서히 사라집니다.");
		System.out.println("정신 집중이 끝나면 근처에 있던 적은 마법 피해를 입습니다. 정신 집중 시간이 길면 길수록 더 큰 피해를 받습니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 650");
		System.out.println("쿨타임 : 110 / 100 / 90");
		System.out.println("초당 보호막 : 65 / 75 / 85 (+0.3 / 0.4 / 0.5 추가 체력)");
		System.out.println("최대 마법 피해 : 625 / 925 / 1275 (+2.5 주문력)");
		System.out.println("둔화율 : 50 ~ 95%");
		sk10();}
	
	void ch11() {
		System.out.println("<<야생을 두려워하게 만들어주지.>>");
		System.out.println("니달리, 야성의 사냥꾼");
		System.out.println("Nidalee, the Bestial Huntress");
		System.out.println("주 역할군 : 암살자\t부 역할군 : 마법사\t소속 : 이쉬탈");
		System.out.println("출시일 : 2009년 12월 17일");
		sk11();}
	void sk11(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp11();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq11();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw11();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se11();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr11();
		} else {
			champName();}}
	void sp11(){
		System.out.println("패시브 - 수풀 배회(Prowl)");
		System.out.println("수풀을 통과하면 니달리의 이동 속도가 2초간 10% 상승하며, 1400 범위 안의 적 챔피언 쪽으로 갈 때는 30%까지 올라갑니다.");
		System.out.println("챔피언이나 몬스터에게 창 투척과 매복 덫을 맞히면 사냥이 발동되어 4초간 대상에 대한 절대 시야를 얻습니다.");
		System.out.println("이 동안 니달리는 이동 속도가 10% 상승하고 (사냥 당하는 대상을 향해 갈 때 30% 상승) 이들을 사냥할 때 숨통 끊기와 급습이 강화됩니다.");
		sk11();}
	void sq11(){
		System.out.println("Q - 창 투척 / 숨통 끊기(Javelin Toss / Takedown)");
		System.out.println("창 투척 : 니달리가 창을 던져 마법 피해를 입힙니다. 창 투척이 니달리의 기본 공격 사거리를 넘어가면 피해이 늘기 시작하여, 최대 거리에서의 총 피해은 300%까지 올라갑니다.");
		System.out.println("소모 마나 : 50 / 60 / 70 / 80 / 90\r\n사거리 : 1500");
		System.out.println("쿨타임 : 6");
		System.out.println("최소 마법 피해 : 70 / 85 / 100 / 115 / 130 (+0.4 주문력)\r\n최대 마법 피해 : 210 / 255 / 300 / 345 / 390 (+1.2 주문력)");
		System.out.println("숨통 끊기 : 니달리의 다음 기본 공격 시 사거리가 살짝 늘어나며 대상에게 큰 마법 피해를 입힙니다. 숨통 끊기는 대상의 잃은 체력에 비례한 추가 피해를 줍니다.\r\n사냥 당하는 대상들은 숨통 끊기로 40%의 추가 피해를 입습니다.");
		System.out.println("사거리 : +75");
		System.out.println("쿨타임 : 6");
		System.out.println("최소 마법 피해 : 5 / 30 / 55 / 80 (+0.75 총 공격력) (+0.4 주문력)\r\n최대 마법 피해 : 10 / 67.5 / 137.5 / 220 (+1.5 / 1.68 / 1.87 / 2.06 총 공격력) (+0.8 / 0.9 / 1.0 / 1.1 주문력)");
		System.out.println("사냥상태 적용시\r\n최소 마법 피해 : 7 / 42 / 77 / 112 (+1.05 총 공격력) (+0.56 주문력)\r\n최대 마법 피해 : 14 / 94.5 / 192.5 / 308 (+2.1 / 2.36 / 2.62 / 2.89 총 공격력) (+1.12 / 1.26 / 1.4 / 1.54 주문력)");
		System.out.println("피해량 증폭 : 잃은 체력 1%당 1 / 1.25 / 1.5 / 1.75% 증가\r\n최대 피해량 : 최소 피해량의 200 / 225 / 250 / 275%");
		sk11();}	
	void sw11(){
		System.out.println("W - 매복 덫 / 급습(Bushwhack / Pounce)");
		System.out.println("매복 덫 : 니달리가 2분 동안 유지되는 투명 상태의 매복 덫을 설치합니다. 적이 밟으면 모습이 드러나며 4초간 마법 피해를 입습니다.");
		System.out.println("소모 마나 : 40 / 45 / 50 / 55 / 60\r\n사거리 : 900");
		System.out.println("쿨타임 : 13/12/11/10/9");
		System.out.println("마법 피해 : 40 / 80 / 120 / 160 / 200 (+0.2 주문력)");
		System.out.println("급습 : 니달리가 전방 조금 앞으로 뛰어오르며 주변 적들에게 마법 피해를 입힙니다. 쿠거 형태일 때 유닛을 처치하면 급습의 재사용 대기시간이 40 / 50 / 60 / 70% 감소합니다.");
		System.out.println("사냥 당하는 대상들은 정상 범위의 최대 두 배 거리에서 급습에 당할 수 있습니다. 사냥 당하는 대상을 처음 급습했을 때만 재사용 대기시간이 감소합니다.");
		System.out.println("사거리 : 350 / 700");
		System.out.println("쿨타임 : 6");
		System.out.println("마법 피해 : 65 / 110 / 155 / 200 (+0.3 주문력)");
		System.out.println("피해 범위 : 150(추측)");
		sk11();}
	void se11(){
		System.out.println("E - 태고의 생명력 / 할퀴기(Primal Surge / Swipe)");
		System.out.println("태고의 생명력 : 니달리가 자신 또는 대상 아군 챔피언을 잃은 체력에 비례해 치유하고 7초 동안 공격 속도를 증가시킵니다.");
		System.out.println("소모 마나 : 60 / 75 / 90 / 105 / 120\r\n사거리 : 600");
		System.out.println("쿨타임 : 12");
		System.out.println("회복량 : 최소 35 / 55 / 75 / 95 / 115 (+0.275 주문력) ~ 최대 70 / 110 / 150 / 190 / 230 (+0.55 주문력)");
		System.out.println("공격속도 증가 : + 20 / 30 / 40 / 50 / 60%");
		System.out.println("할퀴기 : 니달리가 전방의 적들을 발톱으로 공격하여 범위 내에 마법 피해를 입힙니다.");
		System.out.println("사거리 : 350\r\n 쿨타임 : 6");
		System.out.println("마법 피해 : 80 / 140 / 200 / 260 (+0.45 주문력)");
		sk11();}
	void sr11(){
		System.out.println("R - 쿠거의 상(Aspect Of The Cougar)");
		System.out.println("쿠거 형태 : 니달리가 사나운 쿠거로 변신하여 기본 스킬이 숨통 끊기, 급습, 할퀴기로 바뀝니다.");
		System.out.println("인간 형태 : 니달리가 인간 형태로 돌아옵니다. 인간 형태일 때 사냥이 발동되면 쿠거의 상 스킬의 재사용 대기시간이 초기화됩니다.");
		System.out.println("쿨타임 : 3초(동일)");
		sk11();}
	
	void ch12() {
		System.out.println("<<니코? 정말 멋진 선택이야!>>");
		System.out.println("니코, 알쏭달쏭 카멜레온");
		System.out.println("Neeko, the Curious Chameleon");
		System.out.println("주 역할군 : 마법사\t부 역할군 : 서포터\t소속 : 이쉬탈");
		System.out.println("출시일 : 2018년 12월 05일");
		sk12();}
	void sk12(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp12();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq12();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw12();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se12();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr12();
		} else {
			champName();}}
	void sp12(){
		System.out.println("패시브 - 태고의 마력(Inherent Glamour)");
		System.out.println("니코가 아군 챔피언 중 한 명으로 변신합니다. 적 챔피언으로부터 직접 피해를 받거나 피해를 입히는 스킬을 사용하면 변신이 풀립니다.");
		System.out.println("쿨타임 : 25 ~ 10");
		sk12();}
	void sq12(){
		System.out.println("Q - 꽃망울 폭발(Blooming Burst)");
		System.out.println("니코가 폭발하는 씨앗을 던져 마법 피해를 입힙니다.\r\n씨앗으로 유닛을 처치하거나 적 챔피언 또는 대형 몬스터를 맞히면 한 번 더 폭발하여 마법 피해를 입힙니다.\r\n최대 두 번까지 추가로 폭발합니다.");
		System.out.println("소모 마나 : 50 / 60 / 70 / 80 / 90\r\n사거리 : 800");
		System.out.println("쿨타임 : 7");
		System.out.println("마법 피해 : 70 / 115 / 160 / 205 / 250 (+0.5 주문력)");
		System.out.println("추가 마법 피해  35 / 55 / 75 / 95 / 115 (+0.2 주문력)");
		System.out.println("최대 마법 피해 : 140 / 225 / 310 / 395 / 480 (+0.9 주문력)");
		System.out.println("피해 반경 : 225");
		sk12();}	
	void sw12(){
		System.out.println("W - 형상 분리(Shapesplitter)");
		System.out.println("기본 지속 효과 : 세 번째 기본 공격마다 추가 마법 피해를 입히고 니코의 이동 속도가 1초 동안 증가합니다.");
		System.out.println("사용 시 : 니코가 0.5초 동안 투명 상태가 되며 3초 동안 유지되는 복제 형상을 만들어 지정한 방향으로 보냅니다.\r\n니코와 복제 형상은 3초 동안 추가 이동 속도를 얻습니다.");
		System.out.println("은신 - 투명: 근처의 적 포탑 또는 절대 시야만이 니코의 모습을 드러낼 수 있습니다.\r\n분신은 은신 상태에서 대상으로 지정될 수 없습니다.");
		System.out.println("쿨타임 : 20 / 19 / 18 / 17 / 16");
		System.out.println("마법 피해 : 50 / 70 / 90 / 110 / 130 (+0.6 주문력)");
		System.out.println("이동 속도 증가 : 10 / 15 / 20 / 25 / 30%");
		sk12();}
	void se12(){
		System.out.println("E - 칭칭 올가미(Tangle-Barbs)");
		System.out.println("니코가 올가미를 던져 마법 피해를 입히고 속박합니다.");
		System.out.println("올가미는 적을 맞히면 강화되어 크기가 커지고 더 빠르게 날아가며, 더 오랫동안 속박합니다.");
		System.out.println("소모 마나 : 60 / 65 / 70 / 75 / 80\r\n사거리 : 1000");
		System.out.println("쿨타임 : 12 / 11.5 / 11 / 10.5 / 10");
		System.out.println("마법 피해 : 80 / 115 / 150 / 185 / 220 (+0.4 주문력)");
		System.out.println("속박 지속 시간 : 0.7 / 0.9 / 1.1 / 1.3 / 1.5 - 처음 적중한 대상\r\n1.8 / 2.1 / 2.4 / 2.7 / 3 - 처음 이후 적중한 모든 대상");
		sk12();}
	void sr12(){
		System.out.println("R - 만개(Pop Blossom)");
		System.out.println("니코가 1.25초 후 공중으로 도약하며 피해량을 흡수하는 보호막을 얻습니다.");
		System.out.println("착지할 때 주변 적들에게 마법 피해를 입히고 1.25초 동안 기절시킵니다.");
		System.out.println("니코가 변신 상태인 경우 이 스킬의 준비 동작이 적에게 보이지 않습니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 600");
		System.out.println("쿨타임 : 90");
		System.out.println("보호막 : 50 / 80 / 110 (+ 주변 적 챔피언 × 40 / 60 / 80) (+0.5 주문력)");
		System.out.println("마법 피해 : 200 / 425 / 650 (+1.3 주문력)");
		sk12();}
	
	void ch13() {
		System.out.println("<<오직 나만이 승리로 이끌 수 있다.>>");
		System.out.println("다리우스, 녹서스의 실력자");
		System.out.println("Darius, the Hand of Noxus");
		System.out.println("주 역할군 : 전사\t부 역할군 : 탱커\t소속 : 녹서스");
		System.out.println("출시일 : 2012년 5월 23일");
		sk13();}
	void sk13(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp13();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq13();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw13();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se13();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr13();
		} else {
			champName();}}
	void sp13(){
		System.out.println("패시브 - 과다출혈(Hemorrhage)");
		System.out.println("다리우스가 도끼날로 적에게 피해를 입힐 때마다 출혈을 일으켜, 5초에 걸쳐 물리 피해를 입힙니다. 이 효과는 최대 5번까지 중첩이 쌓입니다.");
		System.out.println("적 챔피언에 과다출혈 최대 중첩을 적용하거나 녹서스의 단두대 스킬로 처치하면, 다리우스가 5초 동안 녹서스의 힘 효과를 받아, 공격력이 오르며 공격에 맞는 적들에게 과다출혈 최대 중첩이 적용됩니다.");
		System.out.println("13 (+ 레벨) (+ 0.3 추가 공격력) - 1중첩");
		System.out.println("65 (+ 5×레벨) (+ 1.5 추가 공격력) - 최대 중첩");
		System.out.println("+ 30~230 - 녹서스의 힘");
		sk13();}
	void sq13(){
		System.out.println("Q - 학살(Decimate)");
		System.out.println("잠시 후 다리우스가 도끼를 주위로 휘둘러 경로 상의 적들을 가격합니다. 도끼날에 맞은 적들은 물리 피해를 입습니다.");
		System.out.println("도끼 자루에 맞은 적들은 35%의 피해를 입습니다. (도끼 자루에 맞으면 과다출혈 중첩이 적용되지 않습니다.)");
		System.out.println("다리우스는 도끼날로 맞힌 적 챔피언 하나 당 잃은 체력의 15%가 회복됩니다. (최대: 45%)");
		System.out.println("소모 마나 : 30 / 35 / 40 / 45 / 50\r\n사거리 :\r\n도끼 자루 범위 : 0~205\r\n도끼날 범위 : 425");
		System.out.println("쿨타임 : 9 / 8 / 7 / 6 / 5");
		System.out.println("물리 피해 :\r\n50 / 80 / 110 / 140 / 170 (+1.0 / 1.1 / 1.2 / 1.3 / 1.4 총 공격력) - 도끼날 피해량\r\n17.5 / 28 / 38.5 / 49 / 59.5 (+0.35 / 0.385 / 0.42 / 0.455 / 0.49 총 공격력) - 도끼 자루 피해량");
		sk13();}	
	void sw13(){
		System.out.println("W - 마비의 일격(Crippling strike)");
		System.out.println("다리우스의 다음 기본 공격은 추가 물리 피해를 입히고, 1초 동안 대상을 90% 둔화시킵니다.");
		System.out.println("마비의 일격으로 대상을 처치하면 소모한 마나를 되돌려받고, 재사용 대기시간의 50%가 감소합니다.");
		System.out.println("소모 마나 : 30\r\n사거리 : 기본 공격 사거리 +25");
		System.out.println("쿨타임 : 17 / 6.5 / 6 / 5.5 / 5");
		System.out.println("물리 피해 : 1.5 / 1.55 / 1.6 / 1.65 / 1.7 총 공격력 - 총 피해량");
		sk13();}
	void se13(){
		System.out.println("E - 포획(Apprehend)");
		System.out.println("기본 지속 효과: 다리우스의 방어구 관통력이 상승합니다.");
		System.out.println("사용 시: 다리우스 전방에 있는 모든 적들을 끌어당기고, 1초 동안 40% 둔화시킵니다.");
		System.out.println("방어력 관통 : 15 / 20 / 25 / 30 / 35 %");
		System.out.println("소모 마나 : 45\r\n사거리 : 535");
		System.out.println("쿨타임 : 24 / 21 / 18 / 15 / 12");
		System.out.println("시전 시간 : 0.25");
		sk13();}
	void sr13(){
		System.out.println("R - 녹서스의 단두대(Noxian Guillotine)");
		System.out.println("대상 적 챔피언에게 뛰어올라 치명적 타격을 가하여 고정 피해를 입힙니다.대상에 중첩된 과다출혈 당 녹서스의 단두대 스킬에 20%의 추가 피해가 적용됩니다.");
		System.out.println("녹서스의 단두대로 대상을 처치할 경우, 20초 동안 다리우스가 소모값 없이 녹서스의 단두대를 재시전할 수 있습니다.");
		System.out.println("녹서스의 단두대 스킬 3레벨 도달 시 - 챔피언을 처치하면 재사용 대기시간이 완전히 초기화되며 마나 소모 없이 한 번 더 시전할 수 있습니다.");
		System.out.println("소모 마나 : 100 / 100 / 0\r\n사거리 : 460");
		System.out.println("쿨타임 : 120 / 100 / 80");
		System.out.println("최소 고정 피해량 : 100 / 200 / 300 (+ 0.75 추가 공격력)");
		System.out.println("최대 고정 피해량 : 200 / 400 / 600 (+ 1.5 추가 공격력)");
		sk13();}
	
	void ch14() {
		System.out.println("<<새로운 달이 떠오르고 있다.>>");
		System.out.println("다이애나, 차가운 달의 분노");
		System.out.println("Diana, Scorn of the Moon");
		System.out.println("주 역할군 : 전사\t부 역할군 : 마법사\t소속 : 타곤");
		System.out.println("출시일 : 2012년 8월 7일");
		sk14();}
	void sk14(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp14();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq14();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw14();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se14();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr14();
		} else {
			champName();}}
	void sp14(){
		System.out.println("패시브 - 서늘한 달빛 검(Moonsilver Blade)");
		System.out.println("매 세 번째 공격마다 다이애나의 주변에 추가 마법 피해를 줍니다.\r\n서늘한 달빛 검이 적용된 공격을 하면 다이애나의 주문력의 15%만큼 마나가 회복됩니다.");
		System.out.println("스킬 사용 시마다 다음 기본 공격 3회의 공격 속도가 30% 증가하며, 달빛 낙하의 스킬 레벨에 비례해 공격 속도가 추가적으로 증가합니다.");
		System.out.println("마법 피해 : 20 / 25 / 30 / 35 / 40 / 50 / 60 / 70 / 80 / 90 / 105 / 120 / 135 / 155 / 175 / 200 / 225 / 250 (+0.8 주문력)");
		sk14();}
	void sq14(){
		System.out.println("Q - 초승달 검기 (Crescent Strike)");
		System.out.println("달 에너지를 휘어지게 발사하여 마법 피해를 줍니다.\r\n적중당한 적들은 은신 상태가 아닐 경우 달빛을 받아 3초 동안 위치가 노출됩니다.");
		System.out.println("소모 마나 : 55\r\n사거리 : 900");
		System.out.println("쿨타임 : 8 / 7.5 / 7 / 6.5 / 6");
		System.out.println("마법 피해 : 60 / 95 / 130 / 165 / 200 (+0.7 주문력)");
		sk14();}	
	void sw14(){
		System.out.println("W - 은빛 가호(Pale Cascade)");
		System.out.println("이애나가 3개의 구체를 몸 주변에 만들어 적에게 접촉하거나 5초가 지나면 폭발하여 구체당 마법 피해를 줍니다.");
		System.out.println("또한 다이애나는 구체들이 모두 폭발할 때까지 방어막을 가집니다. 이 방어막은 3개의 구체가 폭발하면 동일한 수치만큼 추가됩니다.");
		System.out.println("소모 마나 : 40 / 55 / 70 / 85 / 100\r\n사거리 : 200");
		System.out.println("쿨타임 : 10");
		System.out.println("보호막 : 40 / 55 / 70 / 85 / 100 (+0.3 주문력)");
		System.out.println("마법 피해 :/r/n22 / 34 / 46 / 58 / 70 (+0.2 주문력) (구체당 피해)/r/n66 / 102 / 138 / 174 / 210 (+0.6 주문력) (최대 피해)");
		sk14();}
	void se14(){
		System.out.println("E - 달빛 낙하(Moonfall)");
		System.out.println("기본 지속 효과: 서늘한 달빛 검의 공격 속도 증가 효과가 늘어납니다.");
		System.out.println("사용 시: 다이애나가 인근 주변의 모든 적을 끌어오며 2초 동안 느려지게 합니다.");
		System.out.println("소모 마나 : 70\r\n사거리 : 450");
		System.out.println("쿨타임 : 26 / 24 / 22 / 20 / 18");
		System.out.println("공격 속도 증가 : 50 / 60 / 70 / 80 / 90%");
		System.out.println("둔화율 : 35 / 40 / 45 / 50 / 55%");
		sk14();}
	void sr14(){
		System.out.println("R - 월광 쇄도(Lunar Rush)");
		System.out.println("복수심에 불타는 달의 화신이 되어, 적에게 돌진하여 마법 피해를 입힙니다.");
		System.out.println("달빛 효과를 받고 있는 적에게 돌진한 경우, 월광 쇄도를 즉시 한 번 더 사용할 수 있습니다.\r\n이때, 다른 모든 적들은 월광 쇄도의 대상이었더라도 달빛 효과가 사라집니다.");
		System.out.println("소모 마나 : 50 / 65 / 80\r\n사거리 : 825");
		System.out.println("쿨타임 : 25 / 20 / 15");
		System.out.println("마법 피해 : 100 / 160 / 220 (+0.6 주문력)");
		sk14();}
	
	void ch15() {
		System.out.println("<<드레이븐의 리그에 오신 걸 환영한다!>>");
		System.out.println("드레이븐, 화려한 처형자");
		System.out.println("Draven, the Glorious Executioner");
		System.out.println("주 역할군 : 원거리\t부 역할군 : 없음\t소속 : 녹서스");
		System.out.println("출시일 : 2012년 6월 5일");
		sk15();}
	void sk15(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp15();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq15();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw15();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se15();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr15();
		} else {
			champName();}}
	void sp15(){
		System.out.println("패시브 - 드레이븐의 리그(League of Draven)");
		System.out.println("드레이븐이 회전 도끼를 잡거나 미니언 또는 몬스터를 처치, 포탑을 파괴할 때마다 팬들의 환호 중첩이 쌓입니다.\r\n도끼를 놓치지 않고 미니언 6마리를 연속해서 처치하면 추가로 중첩이 2 오릅니다.");
		System.out.println("드레이븐이 적 챔피언을 처치하면 25골드를 추가로 획득하고 팬들의 환호 중첩을 소모하여 중첩 하나당 2골드를 더 얻습니다.");
		System.out.println("드레이븐이 사망하면 팬들의 환호 중첩의 75%가 사라집니다.");
		sk15();}
	void sq15(){
		System.out.println("Q - 회전 도끼(Spinning Axe)");
		System.out.println("드레이븐의 다음 공격이 추가 물리 피해를 입힙니다.");
		System.out.println("드레이븐의 도끼가 대상에게 맞고 튕겨 나가 공중으로 높이 뜹니다. 공중에 뜬 도끼를 드레이븐이 잡으면 자동으로 회전 도끼를 다시 사용합니다.\r\n드레이븐은 한 번에 두 개의 도끼를 사용할 수 있습니다.");
		System.out.println("소모 마나 : 45");
		System.out.println("쿨타임 : 12 / 11 / 10 / 9 / 8");
		System.out.println("물리 피해 : 35 / 40 / 45 / 50 / 55 (+0.65 / 0.75 / 0.85 / 0.95 / 1.05 추가 공격력)");
		System.out.println("도끼 회수 범위: 250");
		sk15();}	
	void sw15(){
		System.out.println("W - 광기의 피(Blood Rush)");
		System.out.println("드레이븐의 이동 속도가 1.5초 동안 증가하며 공격 속도가 3초 동안 증가합니다. 추가 이동 속도 증가분은 시간이 지날수록 급격하게 감소합니다.");
		System.out.println("드레이븐이 공중에 뜬 회전 도끼를 잡으면 광기의 피 재사용 대기시간이 초기화됩니다.");
		System.out.println("소모 마나 : 40 / 35 / 30 / 25 / 20");
		System.out.println("쿨타임 : 12");
		System.out.println("공격 속도 증가 : + 20 / 25 / 30 / 35 / 40 %");
		System.out.println("이동 속도 증가 : + 40 / 45 / 50 / 55 / 60 %");
		sk15();}
	void se15(){
		System.out.println("E - 비켜서라(Stand Aside)");
		System.out.println("드레이븐이 도끼를 던져 물리 피해를 입히고 도끼에 맞은 적들을 옆으로 밀어냅니다. 타격을 받은 대상은 2초 동안 이동 속도가 감소합니다.");
		System.out.println("소모 마나 : 70\r\n사거리 : 1050");
		System.out.println("쿨타임 : 18 / 17 / 16 / 15 / 14");
		System.out.println("물리 피해 75 / 110 / 145 / 180 / 215 (+0.5 추가 공격력)");
		System.out.println("둔화율 : 20 / 25 / 30 / 35 / 40 %");
		sk15();}
	void sr15(){
		System.out.println("R - 죽음의 소용돌이(Whirling Death)");
		System.out.println("드레이븐이 두 개의 거대한 도끼를 던져 맞은 적 각각에게 물리 피해를 입힙니다.");
		System.out.println("죽음의 소용돌이는 적 챔피언을 하나 맞힌 다음 서서히 방향을 바꿔 드레이븐에게 돌아옵니다.");
		System.out.println("도끼가 나아가는 동안 스킬을 재사용하면 더 빠르게 회수할 수 있습니다.\r\n유닛 하나를 관통할 때마다 피해량이 8%씩 줄어들고 (최소 40%), 되돌아올 때는 피해량이 최대로 회복됩니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 전 지역");
		System.out.println("쿨타임 : 100 / 90 / 80");
		System.out.println("물리 피해 : 175 / 275 / 375 (+1.1 추가 공격력)");
		sk15();}
	
	void ch16() {
		System.out.println("<<대재앙에 한 발 앞서가는 거다!>>");
		System.out.println("라이즈, 룬 마법사");
		System.out.println("Ryze, the Rune Mage");
		System.out.println("주 역할군 : 마법사\t부 역할군 : 전사\t소속 : 룬테라");
		System.out.println("출시일 : 2009년 2월 21일");
		System.out.println("(6.14 업데이트 전 라이즈 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk16();}
	void sk16(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp16();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq16();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw16();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se16();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr16();
		} else {
			champName();}}
	void sp16(){
		System.out.println("패시브 - 비전 연마(Arcane Mastery)");
		System.out.println("라이즈의 스킬이 추가 마나에 따라 추가 피해를 입히고, 최대 마나가 주문력 100당 5%씩 증가합니다.");
		sk16();}
	void sq16(){
		System.out.println("Q - 과부하(Overload)");
		System.out.println("기본 지속 효과: 룬 감옥과 주문 전이 사용 시 과부하의 재사용 대기시간이 초기화되고 4초 동안 룬이 충전됩니다. 룬은 최대 2개까지 충전되며 과부하 사용 시 룬을 전부 방출합니다.\r\n룬을 2개 방출하면 2초 동안 이동 속도가 상승합니다.");
		System.out.println("사용 시: 돌풍을 발사하여 처음으로 맞힌 적에게 마법 피해를 입힙니다. 대상에게 전이 표식이 있으면 과부하가 표식을 소모하여 증가한 피해를 입히고 전이 표식이 있는 주변 적에게 튕깁니다.");
		System.out.println("소모 마나 : 40\r\n사거리 : 1000");
		System.out.println("쿨타임 : 6");
		System.out.println("이동 속도 증가 :  + 20 / 25 / 30 / 35 / 40%");
		System.out.println("마법 피해 : 80 / 105 / 130 / 155 / 180 (+0.45 주문력) (+0.03 추가 마나)");
		System.out.println("전이 표식 추가 피해 : (공간 왜곡 스킬 레벨에 따라) + 10 / 40 / 70 / 100%");
		sk16();}	
	void sw16(){
		System.out.println("W - 룬 감옥(Rune Prison)");
		System.out.println("즉시 마법 피해를 입히고 적을 1.5초 동안 35% 둔화시킵니다. 대상에게 전이 표식이 있으면 전이 표식을 소모하여 대상을 속박합니다.");
		System.out.println("소모 마나 : 40 / 55 / 70 / 85 / 100\r\n사거리 : 615");
		System.out.println("쿨타임 : 113 / 12 / 11 / 10 / 9");
		System.out.println("마법 피해 : 80 / 100 / 120 / 140 / 160 (+0.6 주문력) (+0.04 추가 마나)");
		sk16();}
	void se16(){
		System.out.println("E - 주문 전이(Spell Flux)");
		System.out.println("구체를 발사해 마법 피해를 입히며 대상과 주변의 모든 적에게 4초 동안 전이 표식을 퍼뜨립니다.");
		System.out.println("이미 전이 표식이 있는 적에게 전이 표식을 남기려고 하면 표식이 더 퍼져나갑니다.");
		System.out.println("소모 마나 : 40 / 55 / 70 / 85 / 100\r\n사거리 : 615");
		System.out.println("쿨타임 : 3.25 / 3 / 2.75 / 2.5 / 2.25");
		System.out.println("표식 전이 범위 : 325");
		System.out.println("마법 피해 : 60 / 80 / 100 / 120 / 140 (+0.3 주문력) (+0.02 추가 마나)");
		sk16();}
	void sr16(){
		System.out.println("R - 공간 왜곡(Realm Warp)");
		System.out.println("기본 지속 효과: 과부하가 전이 표식이 있는 적에게 추가 피해를 입힙니다.");
		System.out.println("사용 시: 다른 위치로 이동하는 차원문을 엽니다. 2초 후, 차원문 근처의 모든 아군이 해당 위치로 순간이동합니다.");
		System.out.println("라이즈가 이동 혹은 스킬 사용 불가 상태가 되면 공간 왜곡이 취소됩니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1000~3000");
		System.out.println("쿨타임 : 210 / 180 / 150");
		System.out.println("차원문 반경 : 475");
		sk16();}
	
	void ch17() {
		System.out.println("<<한번 신나게 춰볼까!>>");
		System.out.println("라칸, 매혹하는 자");
		System.out.println("Rakan, the Charmer");
		System.out.println("주 역할군 : 서포터\t부 역할군 : 없음\t소속 : 아이오니아");
		System.out.println("출시일 : 2017년 4월 19일");
		sk17();}
	void sk17(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp17();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq17();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw17();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se17();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr17();
		} else {
			champName();}}
	void sp17(){
		System.out.println("패시브 - 요술 망토(Fey Feathers)");
		System.out.println("일정 시간마다 라칸에게 피해를 흡수하는 보호막이 생깁니다. 적 챔피언에게 스킬 또는 기본 공격 시 요술 망토의 재사용 대기시간이 1초 감소합니다.");
		System.out.println("연인의 귀환: 자야와 라칸 중 한 명이 귀환 중이라면, 다른 한 명도 귀환 시점을 맞춰 같은 시점에 기지로 귀환할 수 있습니다.");
		System.out.println("쿨타임 : 40~16(홀수 레벨마다 3초씩 감소)");
		System.out.println("보호막 : 20 + 레벨×13 (+0.9 주문력)");
		sk17();}
	void sq17(){
		System.out.println("Q - 빛나는 깃털(Gleaming Quill)");
		System.out.println("마법이 깃든 깃털을 던져 처음 적중한 적에게 마법 피해를 입힙니다.");
		System.out.println("챔피언 또는 에픽 몬스터에게 맞힐 경우 3초 뒤 라칸과 주변 아군의 체력이 회복됩니다. 라칸이 아군에게 닿으면 회복 효과가 즉시 발동됩니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 900");
		System.out.println("쿨타임 : 12 / 11 / 10 / 9 / 8");
		System.out.println("회복량 : 12 + 레벨×6 (+0.7 주문력)");
		System.out.println("마법 피해 : 70 / 115 / 160 / 205 / 250 (+0.6 주문력)");
		sk17();}	
	void sw17(){
		System.out.println("W - 화려한 등장(Grand Entrance)");
		System.out.println("라칸이 목표 지점으로 도약합니다. 착지 후 공중으로 날아 오르며, 주변 적에게 마법 피해를 입히고 1초 동안 공중으로 띄워올립니다.");
		System.out.println("소모 마나 : 50 / 60 / 70 / 80 / 90\r\n사거리 : 600");
		System.out.println("쿨타임 : 18 / 16.5 / 15 / 13.5 / 12");
		System.out.println("마법 피해 : 70 / 120 / 170 / 220 / 270 (+ 0.7 주문력)");
		System.out.println("범위: 250\t선 딜레이: 0.35\t속도: 1700");
		sk17();}
	void se17(){
		System.out.println("E - 전쟁무도(Battle Dance)");
		System.out.println("아군 챔피언에게 도약하여 3초 동안 피해를 흡수하는 보호막을 씌웁니다.");
		System.out.println("5초 안에 다시 한 번 사용할 수 있으며, 이 경우 마나가 소모되지 않습니다.\r\n자야에게 사용할 경우, 전쟁무도의 사거리가 늘어납니다.");
		System.out.println("소모 마나 : 70\r\n사거리 : 700\r\n자야에게 사용시 : 1000");
		System.out.println("쿨타임 : 20 / 18 / 16 / 14 / 12");
		System.out.println("보호막 : 40 / 65 / 90 / 115 / 140 (+0.8 주문력)");
		sk17();}
	void sr17(){
		System.out.println("R - 매혹의 질주(The Quickness)");
		System.out.println("4초 동안 50%의 추가 이동 속도를 얻습니다.");
		System.out.println("적에게 닿으면 마법 피해를 입히고 일정 시간 동안 매혹합니다. 매혹 효과는 한 챔피언당 한 번씩만 적용됩니다.");
		System.out.println("라칸이 처음으로 챔피언에게 닿으면 이동 속도가 150% 빨라졌다가 점차 정상으로 돌아옵니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 150");
		System.out.println("쿨타임 : 130 / 110 / 90");
		System.out.println("마법 피해 : 100 / 200 / 300 (+0.5 주문력)");
		System.out.println("매혹 지속 시간 : 1 / 1.25 / 1.5");
		sk17();}
	
	void ch18() {
		System.out.println("<<그래.>>");
		System.out.println("람머스, 중무장 아르마딜로");
		System.out.println("Rammus, the Armordillo");
		System.out.println("주 역할군 : 탱커\t부 역할군 : 전사\t소속 : 슈리마");
		System.out.println("출시일 : 2009년 7월 10일");
		sk18();}
	void sk18(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp18();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq18();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw18();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se18();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr18();
		} else {
			champName();}}
	void sp18(){
		System.out.println("패시브 - 가시박힌 껍질(Spiked Shell)");
		System.out.println("람머스가 기본 공격 시 추가 마법 피해를 입힙니다.");
		System.out.println("마법 피해 : 10 (+ 0.1 방어력)");
		sk18();}
	void sq18(){
		System.out.println("Q - 대회전(Powerball)");
		System.out.println("머스가 공 모양으로 몸을 만 후 돌진하며 이동 속도가 6초에 걸쳐 150+(5x챔피언 레벨)%만큼 빨라집니다.\r\n적에게 충돌 시 돌진을 멈추고 근처의 적에게 마법 피해를 입히고 뒤로 밀어내며, 1초 동안 이동 속도를 낮춥니다.");
		System.out.println("다시 사용하면 대회전이 원래 지속시간보다 더 빨리 종료되며, 재사용 대기시간이 시작됩니다.\r\n대회전은 정신 집중 스킬이므로 정신 집중을 방해하는 스킬의 대상이 될 수 있습니다.");
		System.out.println("소모 마나 : 60 / 65 / 70 / 75 / 80");
		System.out.println("쿨타임 :16 / 13.5 / 11 / 8.5 / 6");
		System.out.println("마법 피해 : 100 / 135 / 170 / 205 / 240 (+1.0 주문력)");
		System.out.println("둔화율 : 40 / 50 / 60 / 70 / 80 %");
		System.out.println("충볼 범위 : 250\t밀쳐내는 거리 : 100\t밀쳐내는 시간 : 0.75");
		sk18();}
	void sw18(){
		System.out.println("W - 몸 말아 웅크리기(Defensive Ball Curl)");
		System.out.println("람머스가 최대 6초 동안 몸을 말아 웅크려 자신의 방어력과 마법 저항력을 증가시킵니다. 이동 속도는 30% 감소합니다.");
		System.out.println("몸 말아 웅크리기를 사용하는 동안 가시박힌 껍질 효과가 150%로 강화되며, 자신에게 기본 공격을 하는 대상에게도 동일한 피해를 입힙니다.");
		System.out.println("다시 사용하면 몸 말아 웅크리기가 원래 지속시간보다 더 빨리 종료되며, 재사용 대기시간이 시작됩니다.");
		System.out.println("소모 마나 : 40");
		System.out.println("쿨타임 : 6");
		System.out.println("마법 피해 : 15 (+ 0.15 방어력)");
		System.out.println("방어력 증가 : + 30 (+ 0.6 / 0.7 / 0.8 / 0.9 / 1.0 방어력)");
		System.out.println("마법 저항력 증가 : + 10 (+ 0.3 / 0.35 / 0.4 / 0.45 / 0.5 마법 저항력)");
		sk18();}
	void se18(){
		System.out.println("E - 광란의 도발(Frenzying Taunt)");
		System.out.println("잠시 동안 람머스의 공격 속도가 증가하고 적 챔피언이나 몬스터를 도발합니다.");
		System.out.println("람머스의 다른 스킬이 활성화된 상태일 경우 광란의 도발 공격 속도 증가 효과가 초기화됩니다.");
		System.out.println("소모 마나 : 50\r\n사거리 : 325");
		System.out.println("쿨타임 : 12");
		System.out.println("공격 속도 증가 : + 20 / 25 / 30 / 35 / 40 %");
		System.out.println("도발 지속 시간 :  1.25 / 1.5 / 1.75 / 2 / 2.25 초");
		sk18();}
	void sr18(){
		System.out.println("R - 지진(Tremors)");
		System.out.println("람머스가 7초 동안 바닥에 지진을 일으켜 근처의 적에게 마법 피해를 입히고 1.5초 동안 느려지게 합니다.");
		System.out.println("둔화 효과는 최대 8회까지 중첩됩니다.포탑에는 200%의 피해를 입힙니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 300");
		System.out.println("쿨타임 : 100 / 80 / 60");
		System.out.println("초당 마법 피해 : 30 / 60 / 90 (+0.2 주문력)");
		System.out.println("최대 마법 피해 : 240 / 480 / 720 (+1.6 주문력)");
		System.out.println("초당 둔화량 : 8 / 10 / 12 %");
		System.out.println("최대 둔화량 : 64 / 80 / 96 %");
		sk18();}
	
	void ch19() {
		System.out.println("<<어디 한번 길을 밝혀보죠!>>");
		System.out.println("럭스, 광명의 소녀");
		System.out.println("Lux, the Lady of Luminosity");
		System.out.println("주 역할군 : 마법사\t부 역할군 : 서포터\t소속 : 데마시아");
		System.out.println("출시일 : 2010년 10월 19일");
		sk19();}
	void sk19(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp19();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq19();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw19();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se19();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr19();
		} else {
			champName();}}
	void sp19(){
		System.out.println("패시브 - 광채(Illumination)");
		System.out.println("공격 스킬에 맞은 적에게 6초간 빛의 에너지가 주입됩니다. 럭스의 기본 공격은 이 에너지를 소모해 대상에게 마법 피해를 줍니다.");
		System.out.println("마법 피해 : 10 + (10 × 레벨) (+0.2 주문력)");
		sk19();}
	void sq19(){
		System.out.println("Q - 빛의 속박(Light Binding)");
		System.out.println("빛의 구체를 발사하여 적중한 적 두 명까지 2초 동안 속박하고 각각에게 마법 피해를 입힙니다.");
		System.out.println("소모 마나 : 50\r\n사거리 : 1175");
		System.out.println("쿨타임 : 13 / 12 / 11 / 10 / 9");
		System.out.println("마법 피해 : 70 / 115 / 160 / 205 / 250 (+0.7 주문력)");
		System.out.println("투사체 속도 : 1190");
		sk19();}	
	void sw19(){
		System.out.println("W - 프리즘 보호막(Prismatic Barrier)");
		System.out.println("럭스가 지정한 방향으로 마법봉을 던져 자신과 봉에 맞은 모든 아군 챔피언을 2.5초 동안 일정 피해로부터 보호합니다.");
		System.out.println("마법봉이 지정한 위치에 도달한 뒤 다시 돌아올 때도 럭스와 봉에 맞은 모든 아군 챔피언을 2.5초 동안 같은 수치의 피해로부터 보호합니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 1075");
		System.out.println("쿨타임 : 14 / 13 / 12 / 11 / 10");
		System.out.println("보호막 : 50 / 75 / 100 / 125 / 150 (+0.3 주문력)\r\n최대 보호막 : 100 / 150 / 200 / 250 / 300 (+0.6 주문력)");
		System.out.println("투사체 속도 : 1400");
		sk19();}
	void se19(){
		System.out.println("E - 광휘의 특이점(Lucent Singularity)");
		System.out.println("적의 이동 속도를 느리게 하는 지역을 조성합니다. 5초 후 폭발이 일어나 해당 지역의 적에게 마법 피해를 입힙니다.");
		System.out.println("스킬을 다시 사용하여 더 빨리 폭발시킬 수 있습니다.");
		System.out.println("소모 마나 : 70 / 80 / 90 / 100 / 110\r\n사거리 : 1100");
		System.out.println("쿨타임 : 10 / 9.5 / 9 / 8.5 / 8");
		System.out.println("마법 피해 : 60 / 105 / 150 / 195 / 240 (+0.6 주문력)");
		System.out.println("둔화량 : 25 / 30 / 35 / 40 / 45%");
		System.out.println("피해 범위 : 310\t시야 범위 : 575(추정)\t발사체 속도 : 1200");
		sk19();}
	void sr19(){
		System.out.println("R - 최후의 섬광(Final Spark)");
		System.out.println("눈부신 광선을 발사하여 일직선 상에 있는 모든 적에게 마법 피해를 입힙니다.\r\n최후의 섬광은 광채 효과를 점화시키며 재적용시킵니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 3340");
		System.out.println("쿨타임 : 180 / 60 / 40");
		System.out.println("마법 피해 : 300 / 400 / 500 (+1.0 주문력)");
		System.out.println("시전 시간 : 1.0\t시야 범위 : 575(추정)");
		sk19();}
	
	void ch20() {
		System.out.println("<<자! 한번 붙어 보자구!>>");
		System.out.println("럼블, 기계 악동");
		System.out.println("Rumble, the Mechanized Menace");
		System.out.println("주 역할군 : 전사\t부 역할군 : 마법사\t소속 : 밴들 시티");
		System.out.println("출시일 : 2011년 04월 26일");
		sk20();}
	void sk20(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp20();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq20();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw20();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se20();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr20();
		} else {
			champName();}}
	void sp20(){
		System.out.println("패시브 - 고철장 거인 (Junkyard Titan)");
		System.out.println("일반 상태(0~49) : 럼블은 스킬을 사용할 때마다 20의 열기를 얻습니다.");
		System.out.println("위험 상태(50~99) : 열기가 50%에 달하면 럼블은 위험 상태에 들어갑니다. 위험 상태가 되면 럼블의 모든 스킬은 추가 효과를 얻습니다.");
		System.out.println("과열 상태(100) : 열기가 100%에 달하면 과열 상태가 되어 기본 공격에 마법 피해가 추가되나 6초간 스킬을 사용할 수 없게 됩니다.");
		System.out.println("마법 피해 : 20 + ( 5 X 레벨 ) (+0.25 주문력) - 과열 상태 기본공격 추가 피해");
		sk20();}
	void sq20(){
		System.out.println("Q - 화염방사기 (Flamespitter)");
		System.out.println("럼블이 3초 동안 정면을 향해 원뿔 형태의 공격을 가하며 적에게 불을 붙이고 마법 피해를 입힙니다.");
		System.out.println("미니언에게는 60 / 65 / 70 / 75 / 80%의 피해만 입힙니다. 위험 상태일 경우 피해가 50% 증가합니다.");
		System.out.println("사거리 : 600");
		System.out.println("쿨타임 : 10 / 9 / 8 / 7 / 6");
		System.out.println("일반 상태 초당 피해 : 58.3 / 70 / 81.7 / 93.3 / 105 (+0.36 주문력)");
		System.out.println("일반 상태 총 피해 : 175 / 210 / 245 / 280 / 315 (+1.1 주문력)");
		System.out.println("위험 상태 초당 피해 : 87.5 / 105 / 122.5 / 140 / 157.5 (+0.55 주문력)");
		System.out.println("위험 상태 총 피해 : 262.5 / 315 / 367.5 / 420 / 472.5 (+1.65 주문력)");
		sk20();}	
	void sw20(){
		System.out.println("W - 고철 방패 (Scrap Shield)");
		System.out.println("럼블이 방어막을 전개하여 자신을 보호하고 순간적으로 이동 속도를 높입니다.");
		System.out.println("위험 상태에서는 방어막의 내구력과 럼블의 이동 속도 증가량이 50% 증가합니다.");
		System.out.println("쿨타임 : 6");
		System.out.println("일반 상태 보호막 : 80 / 110 / 140 / 170 / 200 (+0.5 주문력)");
		System.out.println("위험 상태 보호막 : 120 / 165 / 210 / 255 / 300 (+0.75 주문력)");
		System.out.println("일반 상태 이동 속도 증가 : +20 / 25 / 30 / 35 / 40 %");
		System.out.println("위험 상태 이동 속도 증가 : 30 / 37.5 / 45 / 52.5 / 60 %");
		sk20();}
	void se20(){
		System.out.println("E - 전기 작살 (Electro Harpoon)");
		System.out.println("럼블이 전기 충격기를 발사하여 적에게 마법 피해를 입히고 2초 동안 이동 속도를 감소시킵니다.\r\n작살은 최대 2발까지 장전되며 2발 모두 장전되어 있다면 첫번째 작살로 인해 과열 상태가 되어도 두번째 작살의 사용이 가능합니다.");
		System.out.println("만약 두 번째 작살을 첫 번째 작살에 맞은 적에게 다시 맞힌다면 둔화 효과는 중첩됩니다. 위험 상태일 경우 피해량과 적 둔화율이 50% 증가합니다.");
		System.out.println("사거리 : 850\r\n쿨타임 : 1발 당 6초");
		System.out.println("일반 상태 1발 피해 : 60 / 85 / 110 / 135 / 160 (+0.4 주문력)");
		System.out.println("위험 상태 1발 피해 : 90 / 127.5 / 165 / 202.5 / 240 (+0.6 주문력)");
		System.out.println("일반 상태 둔화율 : 15 / 20 / 25 / 30 / 35 %");
		System.out.println("위험 상태 둔화율 : 22.5 / 30 / 37.5 / 45 / 52.5 %");
		sk20();}
	void sr20(){
		System.out.println("R - 이퀄라이저 미사일 (The Equalizer)");
		System.out.println("럼블이 일직선으로 로켓을 발사하여 5초 동안 불타는 궤적을 만듭니다. 범위 내의 적들은 이동 속도가 감소하고 매 초마다 마법 피해를 입습니다.");
		System.out.println("사거리 : 1750");
		System.out.println("쿨타임 : 100 / 85 / 70");
		System.out.println("초당 마법 피해 : 140 / 210 / 280 (+0.35 주문력)");
		System.out.println("총 마법 피해 : 700 / 1050 / 1400 (+1.75 주문력)");
		System.out.println("둔화율 : - 35%");
		sk20();}
	
	void ch21() {
		System.out.println("<<내가 살아있는 한, 모두 죽는다!>>");
		System.out.println("레넥톤, 사막의 도살자");
		System.out.println("Renekton, the Butcher of the Sands");
		System.out.println("주 역할군 : 전사\t부 역할군 : 탱커\t소속 : 슈리마");
		System.out.println("출시일 : 2009년 8월 19일");
		sk21();}
	void sk21(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp21();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq21();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw21();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se21();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr21();
		} else {
			champName();}}
	void sp21(){
		System.out.println("패시브 - 분노의 지배(Reign of Anger)");
		System.out.println("레넥톤이 매번 공격할 때마다 분노를 5씩 획득합니다.\r\n분노가 50 이상 쌓이면 스킬에 추가 효과를 부여할 수 있지만 이렇게 사용한 스킬은 분노 50을 소모합니다.");
		System.out.println("비전투 중일 때는 분노가 5초마다 20씩 감소합니다. 레넥톤의 체력이 50% 이하일 때는 50%의 분노를 더 획득합니다.");
		sk21();}
	void sq21(){
		System.out.println("Q - 양떼 도륙(Cull the Meek)");
		System.out.println("사용 시: 레넥톤이 검을 휘둘러 주변의 모든 적에게 물리 피해를 입히고, 해당 피해 수치의 일부를 체력으로 회복합니다.");
		System.out.println("챔피언 이외의 적을 맞힐 때는 분노 2.5, 챔피언을 맞힐 때마다 분노 10이 생성되어 최대 30의 분노가 생성됩니다.");
		System.out.println("분노 50 추가 효과: 피해량과 치료 능력이 모두 상승합니다. 더 이상 분노가 생성되지 않습니다.\r\n사거리 : 325");
		System.out.println("쿨타임 : 8");
		System.out.println("물리 피해 : 65 / 100 / 135 / 170 / 205 (+0.8 추가 공격력)");
		System.out.println("회복량 :\r\n미니언 대상 : 3 / 4.5 / 6 / 7.5 / 9 (+0.04 추가 공격력)\r\n챔피언 대상 : 12 / 18 / 24 / 30 / 36 (+0.12 추가 공격력)");
		System.out.println("분노 50 추가 효과 물리 피해 : 100 / 150 / 200 / 250 / 300 (+1.2 추가 공격력)");
		System.out.println("회복량 :\r\n미니언 대상 : 9 / 13.5 / 18 / 22.5 / 27 (+0.12 추가 공격력)\r\n챔피언 대상 : 36 / 54 / 72 / 90 / 108 (+0.24 추가 공격력)");
		sk21();}	
	void sw21(){
		System.out.println("W - 무자비한 포식자(Ruthless Predator)");
		System.out.println("사용 시: 레넥톤의 다음 기본 공격은 목표를 두 번 베어 물리 피해를 입히며, 0.75초 동안 적을 기절시킵니다.");
		System.out.println("각 공격은 적중 시 발동 효과가 적용되며 분노가 생성됩니다. 레넥톤이 챔피언을 맞히면 추가로 10의 분노를 획득합니다.");
		System.out.println("분노 50 추가 효과: 레넥톤이 세 번 공격하여 대상의 보호막을 파괴한 후 높은 물리 피해를 입히고 1.5초 동안 적을 기절시킵니다.더 이상 분노가 생성되지 않습니다.");
		System.out.println("쿨타임 : 13 / 12 / 11 / 10 / 9");
		System.out.println("일반 상태\r\n물리 피해 : 10 / 30 / 50 / 70 / 90 (+1.5 총 공격력)");
		System.out.println("기절 지속 시간 : 0.75");
		System.out.println("분노 50 추가 효과\r\n물리 피해 : 15 / 45 / 75 / 105 / 135 (+2.25 총 공격력)");
		System.out.println("기절 지속 시간 : 1.5 초");
		sk21();}
	void se21(){
		System.out.println("E - 자르고 토막내기(Slice and Dice)");
		System.out.println("자르기 : 레넥톤이 돌격을 하며 여러 적 유닛에게 피해를 입힙니다.");
		System.out.println("사거리 : 550");
		System.out.println("쿨타임 : 18 / 17 / 16 / 15 / 14");
		System.out.println("물리 피해 : 40 / 70 / 100 / 130 / 160 (+0.9 추가 공격력)");
		System.out.println("토막 내기 : 레넥톤이 돌격을 하며 여러 적 유닛에게 피해를 입힙니다. 챔피언 이외의 적을 맞힐 때는 분노 2,\r\n챔피언을 맞힐 때마다 분노 10이 생성되어 최대 30의 분노가 생성됩니다.");
		System.out.println("사거리 : 550");
		System.out.println("4초 이내에 사용 가능");
		System.out.println("물리 피해 : 40 / 70 / 100 / 130 / 160 (+0.9 추가 공격력)");
		System.out.println("분노 50 추가\r\n물리 피해 : 70 / 115 / 160 / 205 / 250 (+1.35 추가 공격력)");
		System.out.println("방어력 감소 : 25 / 27.5 / 30 / 32.5 / 35%");
		sk21();}
	void sr21(){
		System.out.println("R - 강신(Dominus) ");
		System.out.println("넥톤이 15초 동안 폭군의 형상을 취하여 분노 20과 추가 체력을 얻고 주변 적에게 피해를 입힙니다.");
		System.out.println("폭군 형태로 있는 동안에는 레넥톤의 분노가 초당 5씩 상승합니다.");
		System.out.println("사거리 : 350");
		System.out.println("쿨타임 :120");
		System.out.println("추가 체력 : 250 / 500 / 750");
		System.out.println("초당 마법 피해 : 40 / 80 / 120 (+0.2 주문력)");
		System.out.println("최대 마법 피해 : 600 / 1200 / 1800 (+3.0 주문력)");
		sk21();}
	
	void ch22() {
		System.out.println("<<새벽이 밝았습니다!>>");
		System.out.println("레오나, 여명의 빛");
		System.out.println("Leona, the Radiant Dawn");
		System.out.println("주 역할군 : 탱커\t부 역할군 : 서포터\t소속 : 타곤");
		System.out.println("출시일 : 2011년 07월 8일");
		sk22();}
	void sk22(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp22();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq22();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw22();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se22();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr22();
		} else {
			champName();}}
	void sp22(){
		System.out.println("패시브 - 햇빛(Sunlight)");
		System.out.println("레오나의 스킬은 대상에게 1.5초간 표식을 남깁니다. 아군 챔피언이 대상을 공격할 경우 표식이 터지면서 대상에게 마법 피해를 입힙니다.");
		System.out.println("이 추가 피해는 아군 챔피언의 피해로 인식되며, 아군 챔피언의 마법 관통력을 따릅니다. 레오나 자신은 추가 피해를 입힐 수 없습니다.");
		System.out.println("마법 피해 : 25(+ 레발당 7");
		sk22();}
	void sq22(){
		System.out.println("Q - 여명의 방패(Shield of Daybreak)");
		System.out.println("레오나의 다음 기본 공격은 추가 마법 피해를 입히고 적을 1초간 기절시킵니다.");
		System.out.println("소모 마나 : 45 / 50 / 55 / 60 / 65\r\n사거리 : 175");
		System.out.println("쿨타임 : 5");
		System.out.println("마법 피해 : 10 / 35 / 60 / 85 / 110 (+0.3 주문력)");
		sk22();}	
	void sw22(){
		System.out.println("W - 일식(Eclipse)");
		System.out.println("3초 동안 피해량 감소 효과와 추가 방어력, 마법 저항력을 얻습니다.\r\n지속시간이 종료될 때 레오나 근처에 적이 있는 경우 마법 피해를 입히며 이때 위의 방어 효과가 3초만큼 더 오래 유지됩니다.");
		System.out.println("받는 피해량 감소 효과는 50%를 넘을 수 없습니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 450");
		System.out.println("쿨타임 : 14 / 13 / 12 / 11 / 10");
		System.out.println("피해량 감소 : 8 / 12 / 16 / 20 / 24");
		System.out.println("물리 피해 감소 : + 20 / 25 / 30 / 35 / 40 (+0.2 추가 방어력)");
		System.out.println("마법 피해 감소 : + 20 / 25 / 30 / 35 / 40 (+0.2 추가 마법저항력)");
		System.out.println("마법 피해 : 60 / 100 / 140 / 180 / 220 (+0.4 주문력)");
		sk22();}
	void se22(){
		System.out.println("E - 천공의 검(Zenith Blade)");
		System.out.println("레오나가 직선상의 모든 적에게 마법 피해를 입히는 햇빛의 검을 던집니다.");
		System.out.println("레오나는 이 공격으로 피해를 받은 마지막 적 챔피언을 0.5초 동안 구속하며 그 위치로 달려갑니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 700");
		System.out.println("쿨타임 : 12 / 10.5 / 9 / 7.5 / 6");
		System.out.println("마법 피해 : 60 / 100 / 140 / 180 / 220 (+0.4 주문력)");
		System.out.println("투사체 폭 : 70");
		sk22();}
	void sr22(){
		System.out.println("R - 흑점 폭발(Solar Flare)");
		System.out.println("태양 에너지를 소환하여 눈부신 광선으로 적에게 마법 피해를 입히고 1.5초 동안 이동 속도를 80%만큼 늦춥니다.");
		System.out.println("폭발의 중앙에 있는 적은 모두 기절합니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1200");
		System.out.println("쿨타임 : 90 / 75 / 60");
		System.out.println("마법 피해 : 100 / 175 / 250 (+0.8 주문력)");
		System.out.println("피해 범위 : 250\t기절 범위 : 100\t시야 범위 : 700");
		sk22();}	
	
	void ch23() {
		System.out.println("<<...(울음소리)>>");
		System.out.println("렉사이, 공허의 복병");
		System.out.println("Rek'Sai, the Void Burrower");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 공허");
		System.out.println("출시일 : 2014년 12월 11일");
		sk23();}
	void sk23(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp23();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq23();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw23();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se23();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr23();
		} else {
			champName();}}
	void sp23(){
		System.out.println("패시브 - 제르사이의 분노 (Fury of the Xer'Sai)");
		System.out.println("렉사이가 돌출 상태일 때는 스킬 및 기본 공격 시 25의 분노가 생성됩니다.");
		System.out.println("매복을 사용하면 3초에 걸쳐 분노가 소모되며 체력을 회복합니다.");
		System.out.println("회복량 : (최대) 10 + 레벨 × 10");
		sk23();}
	void sq23(){
		System.out.println("Q - 여왕의 진노 / 먹잇감 추적 (Queen's Wrath / Prey Seeker)");
		System.out.println("여왕의 진노 : 돌출 상태: 렉사이의 기본 공격은 5초 안에 최대 3회까지 주변 적에게 추가 물리 피해를 입힙니다.");
		System.out.println("사거리 : 325");
		System.out.println("쿨타임 : 4");
		System.out.println("물리 피해 : 20 / 25 / 30 / 35 / 40 (+0.5 추가 공격력)\r\n총 물리 피해 : 60 / 75 / 90 / 105 / 120 (+1.5 추가 공격력)");
		System.out.println("먹잇감 추적 : 매복 상태: 렉사이가 공허 에너지가 주입된 흙을 발사하면 처음 맞는 유닛 위에서 폭발하며 물리 피해를 입히고, 2.5초 동안 비 은신 상태인 적의 위치를 드러냅니다.\r\n챔피언에게 적중할 경우 25의 분노가 생성됩니다.");
		System.out.println("사거리 : 1650");
		System.out.println("쿨타임 : 12 / 11.5 / 11 / 10.5 / 10");
		System.out.println("물리 피해 : 60 / 90 / 120 / 150 / 180 (+0.7 주문력) (+0.5 추가 공격력)");
		sk23();}	
	void sw23(){
		System.out.println("W - 매복 / 돌출 (Burrow / Un-burrow)");
		System.out.println("매복 : 돌출 상태: 지면을 파고 들어갑니다.");
		System.out.println("매복 상태 효과: 새로운 스킬 사용, 이동 속도 증가, 시야 범위 축소, 기본 공격 불가, 진동 감지\r\n진동 감지: 주변의 전장의 안개 속에서 이동하는 적들의 위치를 렉사이와 아군이 감지합니다.");
		System.out.println("쿨타임 : 4\r\n이동 속도 증가 : + 15 / 20 / 25 / 30");
		System.out.println("시야 : 250\r\n진동 감지범위 : 1650");
		System.out.println("돌출 : 매복 상태: 매복을 풀고 나와 물리 피해를 입히고, 가장 가까이 있는 적을 1초 동안 띄워올립니다.\r\n다른 근처의 적은 모두 250의 거리만큼 뒤로 밀려납니다. 공중에 띄워졌던 적은 10초 동안 돌출 효과에 면역됩니다.");
		System.out.println("사거리 : 165\r\n쿨타임 : 4");
		System.out.println("물리 피해 : 55 / 70 / 85 / 100 / 115 (+0.8 추가 공격력)");
		sk23();}
	void se23(){
		System.out.println("E - 성난 이빨 / 땅굴 파기 (Furious Bite / Tunnel)");
		System.out.println("성난 이빨 : 돌출 상태: 렉사이가 대상을 물어뜯어 물리 피해를 입힙니다. 분노가 최대치일 경우 피해량이 100% 증가하고 고정 피해로 적용됩니다.");
		System.out.println("사거리 : 250\r\n쿨타임 : 12");
		System.out.println("물리 피해 : 50 / 60 / 70 / 80 / 90 (+0.85 추가 공격력)\r\n최대 분노 시 고정 피해: 100 / 120 / 140 / 160 / 180 (+1.7 추가 공격력)");
		System.out.println("매복 상태: 렉사이가 땅굴을 파고 전진하여 연결된 두 개의 땅굴 입구를 남깁니다. 땅굴 입구중 하나를 클릭하면 렉사이가 다른쪽 입구로 뛰어듭니다.");
		System.out.println("땅굴 입구는 10분간 유지되며, 적이 파괴할 수 있습니다. 렉사이는 한 번에 최대 8개의 땅굴을 유지할 수 있습니다. 터널은 이용하고 나면 재사용 대기시간이 적용됩니다.");
		System.out.println("사거리 : 600\r\n쿨타임 : 26 / 23 / 20 / 17 / 14");
		System.out.println("땅굴 재사용 대기시간: 10 / 8 / 6 / 4 / 2");
		sk23();}
	void sr23(){
		System.out.println("R - 공허의 돌진 (Void Rush)");
		System.out.println("기본 지속 효과: 렉사이가 피해를 가한 챔피언에 5초 동안 표식을 남깁니다.");
		System.out.println("사용 시: 렉사이가 매복하기 전 괴기스러운 울음소리를 내며 표식이 남은 대상을 찾습니다.\r\n1.5초 후, 지하에서 도약해 대상이 잃은 체력에 비례한 물리 피해를 입힙니다. 시전 및 공격 중에는 저지 불가 상태가 됩니다.");
		System.out.println("사거리 : 1500\r\n쿨타임 : 100 / 90 / 80");
		System.out.println("물리 피해 : 100 / 250 / 400 (+1.75 추가 공격력) (+대상이 잃은 체력의 20 / 25 / 30%)");
		sk23();}	
	
	void ch24() {
		System.out.println("<<오늘 밤! 사냥을 나선다...>>");
		System.out.println("렝가, 추적하는 사자");
		System.out.println("Rengar, the Pridestalker");
		System.out.println("주 역할군 : 암살자\t부 역할군 : 전사\t소속 : 이쉬탈");
		System.out.println("출시일 : 2012년 8월 21일");
		sk24();}
	void sk24(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp24();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq24();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw24();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se24();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr24();
		} else {
			champName();}}
	void sp24(){
		System.out.println("패시브 - 보이지 않는 포식자 (Unseen Predator)");
		System.out.println("수풀에 있을 때, 혹은 위장했을 시 기본 공격을 하면 렝가가 대상을 향해 도약합니다.");
		System.out.println("도약해서 전투를 개시하면 야성 중첩을 1 얻습니다. 야성 중첩은 8초 동안 전투에서 벗어날 경우 사라집니다.");
		System.out.println("야성 중첩이 4회 쌓이면 다음 스킬이 강화됩니다. 강화된 스킬을 시전하면 렝가의 이동 속도가 1.5초 동안 증가합니다.");
		System.out.println("야성 중첩을 최대로 쌓을 때 사용된 스킬만이 강화됩니다.");
		System.out.println("사거리 : 725\r\n이동속도 증가 : +30 / 40 / 50%");
		System.out.println("전용 버프 - 뼈이빨 목걸이(Bonetooth Necklace)");
		System.out.println("전리품 1개: (+ 0.01 추가 공격력)\r\n" + 
				"전리품 2개: (+ 0.04 추가 공격력)\r\n" + 
				"전리품 3개: (+ 0.09 추가 공격력)\r\n" + 
				"전리품 4개: (+ 0.16 추가 공격력)\r\n" + 
				"전리품 5개: (+ 0.25 추가 공격력)\r\n" + 
				"카직스의 머리: (+ 0.36 추가 공격력)");
		sk24();}
	void sq24(){
		System.out.println("Q - 포악함 (Savagery)");
		System.out.println("다음 2회의 기본 공격 시 렝가의 공격 속도가 40% 증가합니다. 3초 이내에 이루어지는 첫 번째 공격은 추가 물리 피해를 입힙니다.");
		System.out.println("사거리 : 150");
		System.out.println("쿨타임 : 6 / 5.5 / 5 / 4.5 / 4");
		System.out.println("야성 효과: 5초 동안 포악함의 피해량이 더욱 증가하며 공격 속도가 렝가의 레벨에 따라 50 ~ 101% 상승합니다.");
		System.out.println("소모값 : 야성 4");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("사거리 : 150");
		System.out.println("물리 피해 : (렝가의 레벨에 따라) 30 ~ 240 (+1.4 총 공격력)");
		sk24();}	
	void sw24(){
		System.out.println("W - 전투의 포효 (Battle Roar)");
		System.out.println("근처의 적에게 마법 피해를 입히고 지난 1.5초 동안 입은 피해[9]의 50%를 회복합니다.");
		System.out.println("사거리 : 500");
		System.out.println("쿨타임 : 16 / 14.5 / 13 / 11.5 / 10");
		System.out.println("마법 피해 : 50 / 80 / 110 / 140 / 170 (+0.8 주문력)");
		System.out.println("회복량 : 1.5초간 입은 피해량의 50%");
		System.out.println("야성 효과: 기본 효과 외에 추가로 모든 군중 제어 효과를 없애고 마법 피해를 입힙니다.");
		System.out.println("소모값 : 야성 4\r\n사거리 : 500");
		System.out.println("마법 피해 : (렝가의 레벨에 따라) 50 ~ 220 (+0.8 주문력)");
		System.out.println("회복량 : 1.5초간 입은 피해량의 50%");
		sk24();}
	void se24(){
		System.out.println("E - 올가미 투척 (Bola Strike)");
		System.out.println("올가미를 던져 물리 피해를 입히고, 처음으로 맞힌 적을 1.75초 동안 둔화시킵니다.");
		System.out.println("사거리 : 1000");
		System.out.println("쿨타임 : 10");
		System.out.println("물리  피해 : 55 / 100 / 145 / 190 / 235 (+0.8 추가 공격력)");
		System.out.println("둔화율 : 30 / 45 / 60 / 75 / 90%\r\n도약 도중 시전 시간 : 0.125");
		System.out.println("야성 효과: 레벨에 비례하여 물리 피해를 입히고, 1.75초 동안 대상을 제자리에 묶습니다.");
		System.out.println("소모값 : 야성 4\r\n사거리 : 1000");
		System.out.println("물리 피해 : (렝가의 레벨에 따라) 50 ~ 305 (+0.8 추가 공격력)");
		sk24();}
	void sr24(){
		System.out.println("R - 사냥의 전율 (Thrill of the Hunt)");
		System.out.println("킬 지속시간 동안 동안 렝가의 이동 속도가 증가하고 사거리 안의 가장 가까운 적 챔피언에 대한 절대 시야를 얻습니다.");
		System.out.println("궁극기 사용 후 2초가 지나면 렝가는 위장 상태가 되어 수풀에 있지 않아도 적에게 도약할 수 있습니다.\r\n렝가가 궁극기 상태에서 도약하면 추가 피해를 입히며 대상의 방어력을 4초 동안 감소시킵니다.");
		System.out.println("1600 사거리 내에 있는 적 챔피언과 그 근처에 있는 적 챔피언들은 사냥의 전율을 사용 중인 렝가를 감지할 수 있습니다.");
		System.out.println("렝가와 가장 가까운 적이 1200 거리 내에 있는 렝가의 아군 모두에게 자신의 모습을 드러냅니다.");
		System.out.println("사냥의 전율로 모습이 드러난 적은 스킬 지속시간 동안 모습이 드러나게 됩니다.");
		System.out.println("기본 공격 및 대부분의 스킬 사용 시 사냥의 전율 효과가 종료됩니다.");
		System.out.println("은신 - 위장: 이 챔피언은 시야에서 사라졌습니다. 적 챔피언이나 포탑에 가까이 가면 모습이 드러납니다.");
		System.out.println("사거리 : 2500 / 3000 / 3500");
		System.out.println("쿨타임 : 110 / 90 / 70\r\n스킬 지속시간 : 12 / 16 / 20");
		System.out.println("이동 속도 증가 : + 40 / 50 / 60%");
		System.out.println("물리 피해 : 1.5 총 공격력");
		System.out.println("방어력 감소 : - 12 / 18 / 24");
		sk24();}
	
	void ch25() {
		System.out.println("<<결국 모두 죽기 마련… 내가 좀 거들어주지.>>");
		System.out.println("루시안, 정화의 사도");
		System.out.println("Lucian, the Purifier");
		System.out.println("주 역할군 : 원거리\t부 역할군 : 없음\t소속 : 데마시아");
		System.out.println("출시일 : 2013년 8월 22일");
		sk25();}
	void sk25(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp25();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq25();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw25();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se25();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr25();
		} else {
			champName();}}
	void sp25(){
		System.out.println("패시브 - 빛의 사수(Lightslinger)");
		System.out.println("루시안은 스킬을 사용한 후 기본 공격을 하면 총을 두 번 연속 발사합니다.");
		System.out.println("두 번째 공격은 적 챔피언과 구조물에 대해서는 공격력의 일정 비율의 피해를 입히고 적중 시 효과를 적용합니다.\r\n미니언은 두 번째 공격에서 100%의 피해를 입습니다.");
		System.out.println("물리 피해 : 0.5 / 0.55 / 0.6 총 공격력");
		System.out.println("치명타 피해 : 0.875 / 0.9625 / 1.05 총 공격력");
		sk25();}
	void sq25(){
		System.out.println("Q - 꿰뚫는 빛(Piercing Light)");
		System.out.println("적 유닛 하나를 관통하는 빛 줄기를 발사하여, 일직선 상의 적들에게 물리 피해를 입힙니다.");
		System.out.println("소모 마나 : 50 / 60 / 70 / 80 / 90\r\n사거리 : 500");
		System.out.println("쿨타임 : 9 / 8 / 7 / 6 / 5");
		System.out.println("물리 피해 : 85 / 120 / 155 / 190 / 225 (+0.6 / 0.75 / 0.9 / 1.05 / 1.2 추가 공격력)");
		System.out.println("시전 시간 : 0.4~0.25초\t빛 줄기 길이 : 900\t좌우 범위 : 100");
		sk25();}	
	void sw25(){
		System.out.println("W - 타는 불길(Ardent Blaze)");
		System.out.println("적을 맞히거나 경로 끝에 도달하면 폭발하는 탄환을 발사합니다. 폭발에 맞은 적에게 마법 피해를 입히고 6초 동안 표식을 남깁니다.");
		System.out.println("루시안이나 아군이 표식이 남은 적을 공격하면 루시안의 이동 속도가 1초간 상승합니다.");
		System.out.println("소모 마나 : 70\r\n사거리 : 900");
		System.out.println("쿨타임 : 14 / 13 / 12 / 11 / 10");
		System.out.println("마법 피해 : 75 / 110 / 145 / 180 / 215 (+0.9 주문력)");
		System.out.println("이동 속도 증가 : + 60 / 65 / 70 / 75 / 80\r\n시전 시간: 0.4 ~ 0.25 초");
		sk25();}
	void se25(){
		System.out.println("E - 끈질긴 추격(Relentless Pursuit)");
		System.out.println("짧은 거리를 빠르게 돌진합니다.\r\n빛의 사수로 적을 맞힐 때마다 끈질긴 추격의 재사용 대기시간이 1초씩 감소합니다. (적 챔피언의 경우 두 배인 2초 감소)");
		System.out.println("소모 마나 : 40 / 30 / 20 / 10 / 0\r\n사거리 : 425");
		System.out.println("쿨타임 : 22 / 20 / 18 / 16 / 14");
		sk25();}
	void sr25(){
		System.out.println("R - 빛의 심판(The Culling)");
		System.out.println("루시안이 한 방향으로 3초 동안 빠르게 총을 난사하며 자유롭게 이동합니다. 이 총알들은 처음 맞는 적에게 충돌하며, 각각 물리 피해를 입힙니다.");
		System.out.println("총 20/25/30발 사격. 빛의 심판은 미니언에게는 200%의 피해를 입힙니다.");
		System.out.println("루시안은 빛의 심판을 사용하는 동안 끈질긴 추격을 사용할 수 있습니다.\r\n빛의 심판을 한 번 더 사용하면 사격을 중지합니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1200");
		System.out.println("쿨타임 : 110 / 100 / 90");
		System.out.println("탄환 당 물리 피해 : 20 / 40 / 60 (+0.25 공격력) (+0.1 주문력)");
		System.out.println("총 물리 피해 : 400 / 1000 / 1800 (+5 / 6.25 / 7.5 공격력) (+2 / 2.5 / 3 주문력)");
		sk25();}

	void ch26() {
		System.out.println("<<만나서 반갑습니다!>>");
		System.out.println("룰루, 요정 마법사");
		System.out.println("Lulu, the Fae Sorceress");
		System.out.println("주 역할군 : 서포터\t부 역할군 : 마법사\t소속 : 밴들 시티");
		System.out.println("출시일 : 2012년 3월 20일");
		sk26();}
	void sk26(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp26();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq26();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw26();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se26();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr26();
		} else {
			champName();}}
	void sp26(){
		System.out.println("패시브 - 요정 친구 픽스(Pix, Faerie Companion)");
		System.out.println("픽스는 룰루가 공격하는 대상에게 광선을 3번 연속 발사해 마법 피해를 줍니다.");
		System.out.println(" 이 광선들은 대상을 추적하지만, 다른 유닛들이 대신 막아줄 수 있습니다.");
		System.out.println("마법 피해 : 15 ~ 117 (+0.15 주문력)");
		sk26();}
	void sq26(){
		System.out.println("Q - 반짝반짝 창(Glitterlance)");
		System.out.println("룰루와 픽스가 각자 예리한 마법 화살을 발사하여 처음 맞은 적에게 마법 피해를 주고, 추가로 맞은 적에게는 70%의 마법 피해를 입힙니다.");
		System.out.println("적중당한 적은 80%만큼 둔화되었다가 2초에 걸쳐 점차 정상으로 돌아옵니다.");
		System.out.println("소모 마나 : 50 / 55 / 60 / 65 / 70\r\n사거리 : 925");
		System.out.println("쿨타임 : 7");
		System.out.println("마법 피해 : 80 / 125 / 170 / 215 / 260 (+0.5 주문력)");
		System.out.println("감소 마법 피해 : 56 / 87.5 / 119 / 150.5 / 182 (+0.35 주문력)");
		sk26();}	
	void sw26(){
		System.out.println("W - 변덕쟁이(Whimsy)");
		System.out.println("아군에게 시전: 일정 시간 동안 대상 아군 챔피언의 이동속도와 공격속도가 상승합니다.");
		System.out.println("적에게 시전: 일정 시간 동안 적 챔피언을 변이시켜 기본 공격이나 스킬 공격을 할 수 없게 만들고, 기본 이동 속도를 60만큼 감소시킵니다.");
		System.out.println("소모 마나 : 65\r\n사거리 : 650");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12");
		System.out.println("이동 속도 증가 : + 30 (+0.05 AP)%");
		System.out.println("공격 속도 증가 : + 25 / 30 / 35 / 40 / 45 %");
		System.out.println("버프 유지 시간 : 버프 시간: 3 / 3.25 / 3.5 / 3.75 / 4초");
		System.out.println("변이 시간 : 1.25 / 1.5 / 1.75 / 2 / 2.25초");
		sk26();}
	void se26(){
		System.out.println("E - 도와줘, 픽스!(Help, Pix!)");
		System.out.println("아군에게 시전: 픽스가 룰루 대신 대상에게 점프한 다음 6초 동안 따라다니며 공격을 돕습니다.\r\n대상이 아군 챔피언일 경우, 픽스는 2.5초 동안 피해를 흡수하는 보호막을 씌워 줍니다.");
		System.out.println("적에게 시전: 픽스가 대상 적 유닛에게 마법 피해를 줍니다. 그 후 픽스가 4초 동안 대상을 따라다녀 절대 시야가 생깁니다.");
		System.out.println("소모 마나 : 60 / 65 / 70 / 75 / 80\r\n사거리 : 650");
		System.out.println("쿨타임 : 10");
		System.out.println("보호막 : 80 / 120 / 160 / 200 / 240 (+0.6 주문력)");
		System.out.println("마법 피해 : 80 / 120 / 160 / 200 / 240 (+0.4 주문력)");
		sk26();}
	void sr26(){
		System.out.println("R - 급성장(Wild Growth)");
		System.out.println("룰루가 아군 챔피언의 몸집을 키우며, 대상 근처의 적들을 공중으로 띄웁니다.");
		System.out.println("7초 동안 아군은 추가 체력을 얻고, 1초 동안 근처의 적들은 느려집니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 900");
		System.out.println("쿨타임 : 110 / 95 / 80");
		System.out.println("추가 체력 : 300 / 450 / 600 (+0.5 주문력)");
		System.out.println("에어본 : 0.75초");
		System.out.println("둔화량 : 30 / 45 / 60%");
		sk26();}

	void ch27() {
		System.out.println("<<검은 장미단은, 다시 피어날 겁니다.>>");
		System.out.println("르블랑, 환술사");
		System.out.println("LeBlanc, the Deceiver");
		System.out.println("주 역할군 : 암살자\t부 역할군 : 마법사\t소속 : 녹서스");
		System.out.println("출시일 : 2010년 11월 2일");
		sk27();}
	void sk27(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp27();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq27();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw27();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se27();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr27();
		} else {
			champName();}}
	void sp27(){
		System.out.println("패시브 - 거울 환영(Mirror Image)");
		System.out.println("르블랑의 체력이 40% 이하가 되면 1초 동안 투명 상태가 되며 거울 환영을 생성합니다. 환영은 피해를 입힐 수 없고 최대 8초까지 지속됩니다.");
		System.out.println("은신-투명: 근처의 적 포탑 혹은 절대 시야만이 르블랑의 모습을 드러낼 수 있습니다.");
		System.out.println("쿨타임 : 60");
		sk27();}
	void sq27(){
		System.out.println("Q - 악의의 인장(Sigil of Malice)");
		System.out.println("르블랑이 인장을 날려 대상에게 마법 피해를 주고 3.5초간 표식을 남깁니다.");
		System.out.println("표식이 남은 대상을 스킬로 공격하면 인장이 폭발하며 마법 피해를 입힙니다.");
		System.out.println("소모 마나 : 50 / 60 / 70 / 80 / 90\r\n사거리 : 700");
		System.out.println("쿨타임 : 6");
		System.out.println("구체 마법 피해 : 55 / 80 / 105 / 130 / 155 (+0.4 주문력)");
		System.out.println("인장 폭발 마법 피해 : 55 / 80 / 105 / 130 / 155 (+0.4 주문력)");
		System.out.println("총 마법 피해 : 110 / 160 / 210 / 260 / 310 (+0.8 주문력)");
		System.out.println("투사체 속도 : 2000");
		sk27();}	
	void sw27(){
		System.out.println("W - 왜곡(Distortion)");
		System.out.println("르블랑이 지정 위치로 돌진하여 해당 지점 주변 적에게 마법 피해를 줍니다.");
		System.out.println("4초 안에 왜곡을 다시 사용하면 처음 위치로 돌아옵니다.");
		System.out.println("소모 마나 : 60 / 75 / 90 / 105 / 120\r\n사거리 : 600\t피해 범위 : 260");
		System.out.println("쿨타임 : 18 / 16 / 14 / 12 / 10");
		System.out.println("마법 피해 : 75 / 115 / 155 / 195 / 235 (+0.6 주문력)");
		System.out.println("돌진 속도 : 1450\t첫 시전 후 딜레이 : 돌진 종료 후 0.2초");
		sk27();}
	void se27(){
		System.out.println("E - 환영 사슬(Ethereal Chains)");
		System.out.println("르블랑이 처음 명중한 적을 옭아매는 사슬을 던져 마법 피해를 주고 대상에 대한 절대 시야를 얻습니다.");
		System.out.println("대상이 1.5초 동안 사슬에 묶여 있으면 대상을 1.5초 동안 속박하고 추가로 마법 피해를 줍니다.");
		System.out.println("소모 마나 : 70\r\n사거리 : 865");
		System.out.println("쿨타임 : 14 / 13.25 / 12.5 / 11.75 / 11");
		System.out.println("환영 사슬 마법 피해 : 40 / 60 / 80 / 100 / 120 (+0.3 주문력)");
		System.out.println("속박 마법 피해 70 / 110 / 150 / 190 / 230 (+0.7 주문력)");
		System.out.println("총 마법 피해 감소 : 110 / 170 / 230 / 290 / 350 (+1.0 주문력)");
		System.out.println("투사체 폭 : 55\t투사체 속도 : 1750");
		sk27();}
	void sr27(){
		System.out.println("R - 모방(Mimic)");
		System.out.println("르블랑이 가장 최근에 사용한 스킬을 모방하여 다시 사용합니다.");
		System.out.println("쿨타임 : 60 / 45 / 30");
		System.out.println("인장 구체 마법 피해 : 70 / 140 / 210 (+0.4 주문력)");
		System.out.println("인장 폭발 마법 피해 : 140 / 280 / 420 (+0.8 주문력)");
		System.out.println("총 마법 피해 : 210 / 420 / 630 (+1.2 주문력)");
		System.out.println("왜곡 마법 피해 : 150 / 300 / 450 (+0.75 주문력)");
		System.out.println("환영 사슬 마법 피해 : 70 / 140 / 210 (+0.4 주문력)");
		System.out.println("속박 마법 피해 140 / 280 / 420 (+0.8 주문력)");
		System.out.println("총 마법 피해 감소 : 210 / 420 / 630 (+1.2 주문력)");
		sk27();}	

	void ch28() {
		System.out.println("<<당신의 뜻대로, 싸우겠소.>>");
		System.out.println("리 신, 눈 먼 수도승");
		System.out.println("Lee Sin, the Blind Monk");
		System.out.println("주 역할군 : 전사\t부 역할군 : 암살자\t소속 : 아이오니아");
		System.out.println("출시일 : 2011년 4월 1일");
		sk28();}
	void sk28(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp28();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq28();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw28();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se28();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr28();
		} else {
			champName();}}
	void sp28(){
		System.out.println("패시브 - 질풍격(Flurry)");
		System.out.println("리 신이 스킬을 사용하면 그의 다음 두 번의 기본 공격 속도가 40%만큼 증가합니다.");
		System.out.println("첫 번째 기본 공격 시 20 / 30 / 40, 두 번째는 10 / 15 / 20의 기력을 돌려받습니다.");
		sk28();}
	void sq28(){
		System.out.println("Q - 음파 / 공명의 일격(Sonic Wave / Resonating Strike)");
		System.out.println("음파 : 리 신이 불협화음으로 된 음파를 발사하여 적의 위치를 파악하고, 처음 명중하는 적에게 물리 피해를 입히며, 대상에 대한 절대 시야를 얻습니다.");
		System.out.println("적이 음파에 명중하면 3초 안에 공명의 일격을 시전할 수 있습니다.");
		System.out.println("소모 기력 : 50\r\n사거리 : 975");
		System.out.println("쿨타임 : 11 / 10 / 9 / 8 / 7");
		System.out.println("물리 피해 : 55 / 80 / 105 / 130 / 155 (+1.0 추가 공격력)");
		System.out.println("공명의 일격 : 리 신이 음파를 맞은 적에게 돌진하여 물리 피해를 입히고, 잃은 체력에 비례하여 추가 피해를 입힙니다.");
		System.out.println("소모 기력 : 30\r\n사거리 : 1200");
		System.out.println("최소 물리 피해 : 55 / 80 / 105 / 130 / 155 (+1.0 추가 공격력)\r\n최대 물리 피해 : 110 / 160 / 210 / 260 / 310 (+2.0 추가 공격력)");
		sk28();}	
	void sw28(){
		System.out.println(" W - 방호 / 강철의 의지(Safeguard / Iron Will)");
		System.out.println("방호 :  신이 대상 아군에게 돌격합니다. 아군이 챔피언인 경우 2초 동안 아군과 자신을 일정량의 피해로부터 보호하고, 방호의 재사용 대기시간이 50% 감소합니다.");
		System.out.println("방호를 사용하고 난 뒤 다음 3초 동안 강철의 의지를 시전할 수 있습니다.");
		System.out.println("소모 기력 : 50\r\n사거리 : 700");
		System.out.println("쿨타임 : 12");
		System.out.println("보호막 : 40 / 100 / 160 / 220 / 280 (+0.8 주문력)");
		System.out.println("강철의 의지 : 고된 수행으로 리 신이 전투에서 보다 잘 살아남을 수 있게 됩니다. 4초 동안 생명력 흡수, 주문 흡혈률이 증가합니다.");
		System.out.println("소모 기력 : 30");
		System.out.println("생명력 흡수/주문 흡혈 증가 : + 10 / 15 / 20 / 25 / 30%");
		sk28();}
	void se28(){
		System.out.println("E - 폭풍 / 무력화(Tempest / Cripple)");
		System.out.println("폭풍 : 리 신이 바닥을 내리쳐 충격파를 방출하여 마법 피해를 가합니다.");
		System.out.println("폭풍이 적에게 명중하면 다음 3초 안에 무력화를 사용할 수 있습니다.");
		System.out.println("소모 기력 : 50\r\n사거리 : 350");
		System.out.println("쿨타임 : 10");
		System.out.println("마법 피해 : 80 / 120 / 160 / 200 / 240 (+1.0 추가 공격력)");
		System.out.println("무력화 : 리 신이 폭풍으로 피해를 입힌 적을 4초 동안 약화시키며 이동 속도를 느리게 합니다. 저하된 이동 속도는 시간이 지남에 따라 점차 회복됩니다.%");
		System.out.println("소모 기력 : 30\r\n사거리 : 600");
		System.out.println("둔화율 :  20 / 30 / 40 / 50 / 60%");
		sk28();}
	void sr28(){
		System.out.println("R - 용의 분노(Dragon's Rage)");
		System.out.println("리 신이 강력한 돌려차기로 적 챔피언을 뒤로 날려버리고, 날아간 대상과 부딪히는 모든 적에게 물리 피해를 입힙니다.");
		System.out.println("대상과 부딪힌 적은 잠시 공중에 떠오르고 최초 대상의 추가 체력에 비례한 추가 물리 피해를 입습니다.");
		System.out.println("사거리 : 375");
		System.out.println("쿨타임 : 110 / 85 / 60");
		System.out.println("물리 피해 : 175 / 400 / 625 (+2.0 추가 공격력)");
		System.out.println("충돌 추가 물리 피해 : + 최초 대상 추가 체력의 12 / 15 / 18%");
		System.out.println("에어본 : 1초");
		System.out.println("날아가는 거리 : 1200");
		sk28();}

	void ch29() {
		System.out.println("<<부러진 건, 다시 붙이면 돼.>>");
		System.out.println("리븐, 추방자");
		System.out.println("Riven, the Exile");
		System.out.println("주 역할군 : 전사\t부 역할군 : 암살자\t소속 : 녹서스");
		System.out.println("출시일 : 2011년 9월 14일");
		sk29();}
	void sk29(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp29();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq29();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw29();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se29();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr29();
		} else {
			champName();}}
	void sp29(){
		System.out.println("패시브 - 룬 검(Runic Blade)");
		System.out.println("리븐이 스킬을 사용할 때마다 검에 에너지가 축적되어 기본 공격에 총 공격력에 비례한 물리 피해가 추가됩니다.");
		System.out.println("리븐의 검은 최대 3번까지 충전되며, 매 공격 시 한 번의 충전량이 소모됩니다. (룬 충전 지속시간 5초)");
		System.out.println("물리 피해 : + 0.25 / 0.3 / 0.35 / 0.4 / 0.45 / 0.5 총 공격력");
		sk29();}
	void sq29(){
		System.out.println("Q - 부러진 날개(Broken Wings)");
		System.out.println("리븐이 전방으로 짧게 돌진합니다. 이 스킬은 2회 다시 사용할 수 있습니다.");
		System.out.println("처음과 두 번째 사용 시: 전방을 베며 리븐과 부딪힌 모든 유닛에게 물리 피해를 줍니다.");
		System.out.println("세 번째 사용 시: 공중으로 뛰어 오른 후 땅을 내려찍으며 물리 피해를 주는 동시에 떨어진 곳 주위의 적들을 띄워올립니다.\r\n이 도약을 이용해 통과할 수 없는 지형을 가로지를 수 있습니다.");
		System.out.println("스킬 사용 시 커서를 유닛 위에 올려두면 해당 유닛을 대상으로 삼습니다.\r\n어떤 대상도 지정하고 있지 않으면 리븐이 보고 있는 방향을 향해 돌진합니다.");
		System.out.println("쿨타임 : 13");
		System.out.println("타격 당 물리 피해 : 15 / 35 / 55 / 75 / 95 (+0.4 / 0.45 / 0.5 / 0.55 / 0.6 총 공격력)");
		System.out.println("총 물리 피해 : 45 / 105 / 165 / 225 / 285 (+1.2 / 1.35 / 1.5 / 1.65 / 1.8 총 공격력)");
		System.out.println("돌진 거리 : 260 / 총 780\t1,2번째 피해 범위 :225(추정)\t3번째 피해 범위 : 300(추정)");
		sk29();}	
	void sw29(){
		System.out.println("W - 기 폭발(Ki Burst)");
		System.out.println("리븐의 검에서 룬 에너지가 방출되어 주위에 있는 적에게 충격을 줍니다. 물리 피해를 주며 0.75초간 적을 기절시킵니다.");
		System.out.println("사거리 : 260");
		System.out.println("쿨타임 : 11 / 10 / 9 / 8 / 7");
		System.out.println("물리 피해 : 55 / 85 / 115 / 145 / 175 (+1.0 추가 공격력)");
		System.out.println("시전 시간 : 0.25");
		sk29();}
	void se29(){
		System.out.println("E - 용맹(Valor)");
		System.out.println("리븐이 보호막을 두르며 마우스 커서가 있는 방향으로 돌진합니다. 보호막은 일정 피해를 흡수하며 1.5초 동안 지속됩니다.");
		System.out.println("사거리 : 325");
		System.out.println("쿨타임 : 12 / 11 / 10 / 9 / 8");
		System.out.println("보호막 : 95 / 125 / 155 / 185 / 215 (+1.0 추가 공격력)");
		sk29();}
	void sr29(){
		System.out.println("R - 추방자의 검(Blade of the Exile) / 바람 가르기(Wind Slash)");
		System.out.println("리븐이 자신의 옛 검에 힘을 불어넣어 15초 동안 공격력이 20% 상승하며 공격 스킬과 기본 공격의 사거리가 증가합니다. 또한 강력한 원거리 스킬인 바람 가르기를 한 번 사용할 수 있게 됩니다.");
		System.out.println("사거리 : +75");
		System.out.println("쿨타임 : 120 / 90 / 60\r\n시전 시간 : 0.25");
		System.out.println("바람 가르기 : 범위 내에 있는 모든 적에게 물리 피해를 주는 충격파를 방출합니다. 적이 잃은 체력이 많을 수록 더 많은 피해를 입힙니다.");
		System.out.println("사거리 : 900");
		System.out.println("최소 물리 피해 : 100 / 150 / 200 (+0.6 추가 공격력)");
		System.out.println("최대 물리 피해 : 300 / 450 / 600 (+1.8 추가 공격력)");
		System.out.println("투사체 속도 : 1600");
		sk29();}

	void ch30() {
		System.out.println("<<이 세상을... 꽁꽁 얼려주지>>");
		System.out.println("리산드라, 얼음 마녀");
		System.out.println("Lissandra, the Ice Witch");
		System.out.println("주 역할군 : 마법사\t부 역할군 : 없음\t소속 : 프렐요드");
		System.out.println("출시일 : 2013년 4월 30일");
		sk30();}
	void sk30(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp30();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq30();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw30();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se30();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr30();
		} else {
			champName();}}
	void sp30(){
		System.out.println("패시브 - 냉기의 지배(Iceborn Subjugation)");
		System.out.println("리산드라 주변의 적 챔피언이 쓰러지면 얼음 노예가 됩니다.\r\n얼음 노예는 주변의 적을 모두 둔화시키고 4초가 지나면 극도로 차가운 냉기에 의해 폭발하며 마법 피해를 입힙니다.");
		System.out.println("둔화율 : 25%");
		System.out.println("마법 피해 : (리산드라의 레벨에 따라) 120 ~ 520 (+0.5 주문력)");
		sk30();}
	void sq30(){
		System.out.println("Q - 얼음 파편(Ice Shard)");
		System.out.println("처음 맞는 적에게서 부서지는 얼음창을 던져 처음 맞는 적에게 마법 피해를 입히고 1.5초 동안 이동 속도를 늦춥니다.");
		System.out.println("그 후 파편들이 대상을 꿰뚫고 나가, 여기에 맞는 다른 적들에게도 동일한 피해를 입힙니다.");
		System.out.println("소모 마나 : 60 / 65 / 70 / 75 / 80\r\n사거리 : (창)725 / (파편)825");
		System.out.println("쿨타임 : 10 / 8.5 / 7 / 5.5 / 4");
		System.out.println("마법 피해 : 70 / 100 / 130 / 160 / 190 (+0.7 주문력)");
		System.out.println("둔화율 : 16 / 19 / 22 / 25 / 28 %");
		sk30();}	
	void sw30(){
		System.out.println("W - 서릿발(Ring of Frost)");
		System.out.println("주변 적들에게 마법 피해를 입히고 일정 시간동안 발을 묶습니다.");
		System.out.println("소모 마나 : 40\r\n사거리 : 450");
		System.out.println("쿨타임 : 14 / 13 / 12 / 11 / 10");
		System.out.println("마법 피해 : 70 / 105 / 140 / 175 / 210 (+0.7 주문력)");
		System.out.println("속박 지속 시간 : 1.1 / 1.2 / 1.3 / 1.4 / 1.5 초");
		sk30();}
	void se30(){
		System.out.println("E - 얼음갈퀴 길(Glacial Path)");
		System.out.println("얼음갈퀴를 던져 여기에 맞는 모든 적들에게 마법 피해를 입힙니다.\r\n이 스킬을 다시 시전하면 리산드라가 얼음갈퀴의 현재 위치로 순간이동합니다.");
		System.out.println("소모 마나 : 80 / 85 / 90 / 95 / 100\r\n사거리 : 1050");
		System.out.println("쿨타임 : 24 / 21 / 18 / 15 / 12");
		System.out.println("마법 피해 : 70 / 105 / 140 / 175 / 210 (+0.6 주문력)");
		sk30();}
	void sr30(){
		System.out.println("R - 얼음 무덤(Frozen Tomb)");
		System.out.println("적에게 시전: 대상 챔피언을 꽁꽁 얼려 1.5초 동안 기절시킵니다.");
		System.out.println("자신에게 시전: 리산드라가 2.5초 동안 어둠의 얼음으로 자기 몸을 감싸 체력이 회복되며, 잃은 체력 1%당 회복되는 체력 수치는 1%씩 상승합니다./r/n이 때 아무런 행동도 취할 수 없는 대신 공격도 받지 않는 무적 상태가 됩니다.");
		System.out.println("그 다음 어둠의 얼음이 대상에게서 번져나가 적들에게 마법 피해를 입힙니다. 얼음은 3초 동안 유지되며 적의 이동 속도를 늦춥니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 550");
		System.out.println("쿨타임 : 120 / 100 / 80");
		System.out.println("마법 피해 : 150 / 250 / 350 (+0.75 주문력)");
		System.out.println("회복량 : 100 / 150 / 200 (+0.3 주문력)");
		System.out.println("둔화량 : 30 / 45 / 75 %");
		sk30();}
	
	void ch31() {
		System.out.println("<<나의 검은 당신의 것이오!>>");
		System.out.println("마스터 이, 우주 검사");
		System.out.println("Master Yi, the Wuju Bladesman");
		System.out.println("주 역할군 : 암살자\t부 역할군 : 전사\t소속 : 아이오니아");
		System.out.println("출시일 : 2009년 2월 21일");
		sk31();}
	void sk31(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp31();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq31();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw31();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se31();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr31();
		} else {
			champName();}}
	void sp31(){
		System.out.println("패시브 - 2연속 공격(Double Strike)");
		System.out.println("매 4번째 기본 공격마다 마스터 이가 2번 연속 공격합니다. (두 번째 공격은 50%의 피해를 입힙니다.)");
		sk31();}
	void sq31(){
		System.out.println("Q - 일격 필살(Alpha Strike)");
		System.out.println("마스터 이가 대상으로 지정할 수 없는 상태가 되어 순간이동한 후 대상 주변 적들을 순식간에 공격합니다.");
		System.out.println("공격이 4회 적중한 후 적중하는 모든 공격은 적에게 물리 피해를 입힙니다.");
		System.out.println("일격 필살에는 치명타가 적용될 수 있으며, 이 경우 60% 공격력의 물리 피해를 추가로 입힙니다.몬스터에게 추가 피해를 입힙니다.");
		System.out.println("반복하여 사용하면 즉시 25%의 피해를 입힙니다.기본 공격 시 일격 필살의 재사용 대기시간이 1초 감소합니다.");
		System.out.println("소모 마나 : 50 / 55 / 60 / 65 / 70\r\n사거리 : 600");
		System.out.println("쿨타임 : 18 / 17 / 16 / 15 / 14");
		System.out.println("기본 물리 피해 : 25 / 60 / 95 / 130 / 165 (+1.0 총 공격력)");
		System.out.println("치명타 물리 피해 : 25 / 60 / 95 / 130 / 165 (+1.6 총 공격력)");
		System.out.println("문스터 추가 피해 : 75 / 100 / 125 / 150 / 175");
		System.out.println("단일 대상 최대 물리 피해 : 43.75 / 105 / 166.25 / 227.5 / 288.75 (+1.75 총 공격력)");
		System.out.println("치명타 단일 대상 최대 물리 피해 : 43.75 / 105 / 166.25 / 227.5 / 288.75 (+2.8 총 공격력)");
		sk31();}	
	void sw31(){
		System.out.println("W - 명상(Meditation");
		System.out.println("마스터 이가 정신을 집중해 4초 동안 체력을 회복하고 입는 피해를 감소시킵니다. 회복량은 마스터 이의 잃은 체력에 비례해 최대 100%까지 증가합니다.");
		System.out.println("정신을 집중하는 동안 매초 2연속 공격 중첩을 얻고 최후의 전사와 우주류 검술의 남은 지속시간이 일시 정지됩니다.\r\n명상의 피해량 감소 효과가 구조물 상대로는 절반으로 감소합니다.");
		System.out.println("소모 마나 : 50");
		System.out.println("쿨타임 : 28");
		System.out.println("초당 회복량 : 30 / 50 / 70 / 90 / 110 (+0.25 주문력)");
		System.out.println("피해량 감소 : 60 / 62.5 / 65 / 67.5 / 70%");
		sk31();}
	void se31(){
		System.out.println("E - 우주류 검술(Wuju Style)");
		System.out.println("5초 동안 기본 공격으로 추가 고정 피해를 입힙니다.");
		System.out.println("쿨타임 : 18 / 17 / 16 / 15 / 14");
		System.out.println("추가 고정 피해 : 18 / 26 / 34 / 42 / 50 (+0.35 추가 공격력)");
		sk31();}
	void sr31(){
		System.out.println("R - 최후의 전사(Highlander)");
		System.out.println("기본 지속 효과: 챔피언을 처치하거나 어시스트를 올리면 마스터 이의 기본 스킬 재사용 대기시간이 70% 감소합니다.");
		System.out.println("사용 시: 이동 속도와 공격 속도가 상승하며, 7초 동안 모든 둔화 효과에 대해 면역이 됩니다.");
		System.out.println("스킬이 활성화된 동안 챔피언을 처치하거나 어시스트를 올리면 최후의 전사의 지속 시간이 7초 늘어납니다.");
		System.out.println("소모 마나 : 100");
		System.out.println("쿨타임 : 85");
		System.out.println("이동 속도 증가 : + 35 / 45 / 55%");
		System.out.println("공격 속도 증가 : + 30 / 55 / 80%");
		sk31();}
	
	void ch32() {
		System.out.println("<<군도의 빛을 되찾으리라!>>");
		System.out.println("마오카이, 뒤틀린 나무 정령");
		System.out.println("Maokai, the Twisted Treant");
		System.out.println("주 역할군 : 탱커\t부 역할군 : 마법사\t소속 : 그림자 군도");
		System.out.println("출시일 : 22011년 2월 16일");
		sk32();}
	void sk32(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp32();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq32();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw32();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se32();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr32();
		} else {
			champName();}}
	void sp32(){
		System.out.println("패시브 - 마법 흡수(Sap magic)");
		System.out.println("마오카이가 자연에서 마법의 힘을 빨아들여 일정 시간마다 다음 기본 공격 시 체력을 회복합니다.");
		System.out.println("마오카이가 스킬을 사용하거나 적의 스킬에 적중당하면 마법 흡수의 재사용 대기시간이 4초 줄어듭니다.");
		System.out.println("쿨타임 : 30 / 25 / 20");
		System.out.println("회복량 : 5 / 15 / 25 / 35 / 45 / 55 / 65 + 최대 체력의 6 / 7.5 / 9 / 10 / 11 / 12 / 13 %");
		System.out.println("시전 시간 : 0.25초");
		sk32();}
	void sq32(){
		System.out.println("Q - 덤불 주먹(Bramble Smash)");
		System.out.println("마오카이가 주먹으로 지면을 강타해 충격파를 일으킵니다. 근처의 적은 뒤로 날아가며 마법 피해를 입고 잠시 둔화됩니다.");
		System.out.println("소모 마나 : 50\r\n사거리 : 700");
		System.out.println("쿨타임 : 8 / 7.25 / 6.5 / 5.75 / 5");
		System.out.println("마법 피해 : 70 / 115 / 160 / 205 / 250 (+0.4 주문력)");
		System.out.println("둔화율 : 99&");
		System.out.println("시전시간 : 0.35초\t밀어내는 최대 거리 :300\t둔화 지속 시간 : 0.25초");
		sk32();}	
	void sw32(){
		System.out.println("W - 뒤틀린 전진(Twisted Advance)");
		System.out.println("마오카이가 움직이는 뿌리 덩어리로 변신해 대상에게 돌진합니다. 이때 마오카이는 대상으로 지정할 수 없습니다.");
		System.out.println("적에게 부딪히면 마법 피해를 입히고 속박합니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 525");
		System.out.println("쿨타임 :13 / 12 / 11 / 10 / 9");
		System.out.println("마법 피해 : 70 / 95 / 120 / 145 / 170 (+0.4 주문력)");
		System.out.println("속박 지속 시간 : 1 / 1.1 / 1.2 / 1.3 / 1.4 초");
		sk32();}
	void se32(){
		System.out.println("E - 묘목 던지기(Sapling Toss)");
		System.out.println("마오카이가 30초 동안 주변을 감시하는 묘목을 던집니다. 묘목은 근처 적을 추적해 가까이 가면 폭발하며 마법 피해를 입힙니다.\r\n폭발에 맞은 적은 2초 동안 35% 둔화됩니다..");
		System.out.println("수풀에 설치된 묘목은 잠시 동안 유지되고 더 강력한 폭발을 일으켜 맞은 적 모두에게 2초 동안 두 배의 피해를 입힙니다.");
		System.out.println("챔피언이 아닌 대상에게는 최대 300의 피해를 입히며, 수풀에 설치될 경우 이 수치가 두 배로 증가합니다.");
		System.out.println(" 60 / 65 / 70 / 75 /80\r\n사거리 : 1100");
		System.out.println("쿨타임 : 10");
		System.out.println("유지 시간 : 30 (+추가 체력의 2.5%) 초");
		System.out.println("마법 피해 :  25 / 50 / 75 / 100 / 125 + 대상 최대 체력의 7 / 7.25 / 7.5 / 7.75 / 8% (+0.01 주문력%)");
		sk32();}
	void sr32(){
		System.out.println("R - 대자연의 마수(Nature’s Grasp)");
		System.out.println("마오카이가 나뭇가지와 가시로 된 거대 벽을 소환합니다. 벽은 천천히 전진하며 벽에 닿은 적에게 마법 피해를 입히고 속박합니다.");
		System.out.println("속박 시간은 벽이 이동한 거리에 비례합니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 3000");
		System.out.println("쿨타임 : 120 / 100 / 80");
		System.out.println("마법 피해 : 150 / 225 / 300 (+0.75 주문력)");
		System.out.println("속박 지속 시간 : 0.8 ~ 2.6 초");
		sk32();}
	
	void ch33() {
		System.out.println("<<종말이 기다린다!>>");
		System.out.println("말자하, 공허의 예언자");
		System.out.println("Malzahar, the Prophet of the Void");
		System.out.println("주 역할군 : 마법사\t부 역할군 : 암살자\t소속 : 공허");
		System.out.println("출시일 : 2010년 06월 01일");
		sk33();}
	void sk33(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp33();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq33();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw33();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se33();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr33();
		} else {
			champName();}}
	void sp33(){
		System.out.println("패시브 - 공허 태세(Void Shift)");
		System.out.println("말자하는 차원의 경계를 아슬아슬하게 오가며 일정 시간 직접 피해를 입지 않으면 공허 태세에 들어갑니다.");
		System.out.println("공허 태세가 활성화된 동안에는 말자하가 입는 피해가 크게 줄어들며 군중 제어기에 면역이 됩니다.");
		System.out.println("공허 태세 효과는 미니언 외의 적에게 피해를 입거나, 군중 제어기를 막아내고 나면 0.25초 후에 사라집니다.");
		System.out.println("쿨타임 : (1/6/11/16레벨에) 30/24/18/12 초");
		System.out.println("공허 태세 피해량 감소 : 90%");
		sk33();}
	void sq33(){
		System.out.println("Q - 공허의 부름(Call of the Void)");
		System.out.println("말자하가 공허로 이어지는 두 개의 문을 엽니다.\r\n얼마 뒤 문에서 탄도체가 발사되어 적에게 마법 피해를 입히고 일정 시간동안 적 챔피언을 침묵시킵니다.");
		System.out.println("소모 마나 : 80\r\n사거리 : 900\t 문 사이의 거리 : 400");
		System.out.println("쿨타임 : 6");
		System.out.println("마법 피해 : 70 / 105 / 140 / 175 / 210 (+0.65 주문력)");
		System.out.println("침묵 지속 시간 : 1 / 1.25 / 1.5 / 1.75 / 2 초");
		sk33();}	
	void sw33(){
		System.out.println("W - 공허의 무리(Void Swarm)");
		System.out.println("공허충을 소환해 8 / 8 / 9 / 9 / 10초 동안 주변의 적과 싸우게 합니다.");
		System.out.println("공허의 무리 스킬을 배운 상태에서 공허의 무리 외의 다른 스킬을 사용하면 공허충 증식 중첩이 1회 누적됩니다. (최대 2회) ");
		System.out.println("공허의 무리 발동 시, 공허충 증식 중첩을 전부 소모하고 공허충 증식 중첩만큼 공허충을 추가로 소환합니다. (최대 3마리)");
		System.out.println("소모 마나 : 40 / 45 / 50 / 55 / 60\r\n사거리 : 150");
		System.out.println("쿨타임 : 8");
		sk33();}
	void se33(){
		System.out.println("E - 재앙의 환상(Malefic Visions)");
		System.out.println("말자하가 대상의 정신을 오염시켜 4초 동안 마법 피해를 입힙니다.\r\n그 동안 대상이 쓰러지면 환상이 주변 적에게 옮겨가고, 말자하는 마나를 획득합니다.");
		System.out.println("말자하의 공허충들은 환상에 오염된 대상에게 몰려갑니다.\r\n대상이 공허의 부름 또는 황천의 손아귀 스킬에 적중당하면 재앙의 환상의 지속 시간이 초기화됩니다.");
		System.out.println("소모 마나 : 60 / 70 / 80 / 90 / 100\r\n사거리 : 650");
		System.out.println("쿨타임 : 15 / 13 / 11 / 9 / 7");
		System.out.println("마법 피해 : 80 / 115 / 150 / 185 / 220 (+0.8 주문력)");
		System.out.println("마나 획득 : (최대 마나의 2%)");
		sk33();}
	void sr33(){
		System.out.println("R - 황천의 손아귀(Nether Grasp)");
		System.out.println("말자하가 대상 챔피언을 제압하고 그 주변에 부정적인 기운이 맴도는 지대를 생성합니다.");
		System.out.println("근처의 적은 5초 동안 매 초마다 최대 체력 비례 마법 피해를 입습니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 700");
		System.out.println("쿨타임 : 140 / 110 / 80");
		System.out.println("광선 마법 피해 : 2.5초에 걸쳐 125 / 200 / 275 (+0.8 주문력)");
		System.out.println("마법 피해 : 5초에 걸쳐 대상 최대 체력의 10 / 15 / 20% (+0.125 주문력)%문력)%");
		System.out.println("제압 지속 시간 : 2.5초");
		sk33();}

	void ch34() {
		System.out.println("<<바위처럼 단단하게!>>");
		System.out.println("말파이트, 거석의 파편");
		System.out.println("Malphite, Shard of the Monolith");
		System.out.println("주 역할군 : 탱커\t부 역할군 : 전사\t소속 : 이쉬탈");
		System.out.println("출시일 : 2009년 9월 2일");
		sk34();}
	void sk34(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp34();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq34();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw34();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se34();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr34();
		} else {
			champName();}}
	void sp34(){
		System.out.println("패시브 - 화강암 방패(Granite Shield)");
		System.out.println("파이트는 여러 겹의 돌로 감싸져 있어 자신의 최대 체력의 10%만큼의 피해를 흡수할 수 있습니다.");
		System.out.println("말파이트가 (1/7/13 레벨에서) 10/8/6초 동안 공격받지 않으면 보호막이 재생성됩니다.");
		sk34();}
	void sq34(){
		System.out.println("Q - 지진의 파편(Seismic Shard)");
		System.out.println("말파이트가 원초적인 원소 에너지를 사용하여 땅을 통해 대지의 조각을 날려 마법 피해를 입히며 3초 동안 이동 속도를 훔칩니다.");
		System.out.println("소모 마나 : 70 / 75 / 80 / 85 / 90\r\n사거리 : 625");
		System.out.println("쿨타임 : 8");
		System.out.println("마법 피해 : 70 / 120 / 170 / 220 / 270 (+0.6 주문력)");
		System.out.println("훔치는 이동속도 20 / 25 / 30 / 35 / 40 %");
		sk34();}	
	void sw34(){
		System.out.println("W - 천둥소리(Thunderclap)");
		System.out.println("기본 지속 효과: 말파이트의 방어력이 증가합니다. 화강암 방패가 활성화되어 있으면 이 효과가 세 배로 증가합니다.\r\n" + 
				"사용 시: 기본 공격 시 5초 동안 여진을 일으켜 부채꼴 영역에 물리 피해를 입힙니다. 천둥소리를 사용한 후 첫 공격 시 대상에게 추가 물리 피해를 입힙니다.기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println("방어력 증가 : 10% / 15% / 20% / 25% / 30%");
		System.out.println("소모 마나 : 30 / 35 / 40 / 45 / 50");
		System.out.println("쿨타임 : 12");
		System.out.println("첫 번째 공격 추가 물리 피해 : 30 / 45 / 60 / 75 / 90 (+0.2 주문력) (+0.15 총 방어력)");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("부채꼴 영역에 대한 물리 피해 : 10 / 20 / 30 / 40 / 50 (+0.2 주문력) (+0.1 총 방어력)");
		sk34();}
	void se34(){
		System.out.println("E - 지면 강타(Ground Slam)");
		System.out.println("말파이트가 땅을 내리쳐 충격파를 만들어 내 주변 적에게 마법 피해를 입힙니다. 충격파에 맞은 적은 공격 속도가 3초간 감소합니다.");
		System.out.println("소모 마나 : 50 / 55 / 60 / 65 / 70\r\n사거리 : 400");
		System.out.println("쿨타임 : 7");
		System.out.println("마법 피해 : 60 / 95 / 130 / 165 / 200 (+0.4 방어력) (+0.6 주문력)");
		System.out.println("공격 속도 감소 : - 30 / 35 / 40 / 45 / 50%");
		sk34();}
	void sr34(){
		System.out.println("R - 멈출 수 없는 힘(Unstoppable Force)");
		System.out.println("말파이트가 목표 위치로 난폭하게 돌진하여 적에게 마법 피해를 입히고 공중으로 1.5초간 띄워 올립니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1000\t범위 : 325");
		System.out.println("쿨타임 : 130 / 105 / 80");
		System.out.println("마법 피해 : 200 / 300 / 400 (+0.8 주문력)");
		sk34();}
	
	void ch35() {
		System.out.println("<<운명, 지배, 그리고 기만.>>");
		System.out.println("모데카이저, 강철의 망령");
		System.out.println("Mordekaiser, the Iron Revenant");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 녹서스");
		System.out.println("출시일 : 2010년 2월 24일");
		System.out.println("(9.12 업데이트 전 모데카이저 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk35();}
	void sk35(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp35();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq35();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw35();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se35();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr35();
		} else {
			champName();}}
	void sp35(){
		System.out.println("패시브 - 암흑 탄생(Darkness Rise)");
		System.out.println("모데카이저가 적 챔피언에게 기본 공격 또는 스킬을 3회 사용한 후 주위에 초당 피해를 입히고 이동 속도가 증가합니다.\r\n" + 
				"\r\n" + 
				"모데카이저의 기본 공격도 주문력의 40%에 해당하는 추가 마법 피해를 입힙니다.\r\n" + 
				"\r\n" + 
				"암흑 탄생 효과는 에픽 몬스터에게도 적용됩니다.\r\n" + 
				"오오라/속도는 5초 동안 유지되며 적 챔피언에게 공격 또는 스킬이 적중할 때마다 초기화됩니다.");
		System.out.println("사거리 : 375");
		System.out.println("초당 마법 피해 : 4.4 + 레벨 x 0.6 + 대상 최대 체력의 1 ~ 5% (+ 0.3 주문력)");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("이동 속도 증가 : + (1 / 6 / 11레벨에서) 3 / 6 / 9%");
		sk35();}
	void sq35(){
		System.out.println("Q - 말살(Obliterate)");
		System.out.println("모데카이저가 몰락의 밤으로 땅을 내리쳐 해당 지역에 있는 모든 적에게 마법 피해를 입히며, 단일 대상 적중 시 피해량이 증가합니다.");
		System.out.println("사거리 : 675");
		System.out.println("쿨타임 : 9 / 7.75 / 6.5 / 5.25 / 4");
		System.out.println("마법 피해 :  75 / 95 / 115 / 135 / 155 (+ 0.6 주문력) + (5 ~ 139)");
		System.out.println("단일 대상 추가 마법 피해 : + 20 / 25 / 30 / 35 / 40%");
		System.out.println("단일 대상 총 마법 피해 : 90 / 118.75 / 149.5 / 182.25 / 217 (+ 0.72 / 0.75 / 0.78 / 0.81 / 0.84 주문력) + (6 ~ 194.6)");
		sk35();}
	void sw35(){
		System.out.println("W - 불멸(Indestructible)");
		System.out.println("모데카이저가 (입히는/받는) 모든 피해의 (35%/15%)를 흡수하여 보호막을 충전합니다.\r\n" + 
				"\r\n" + 
				"불멸 사용 시 모데카이저에게 보호막이 생깁니다.\r\n" + 
				"\r\n" + 
				"보호막 흡수량은 시간이 지남에 따라 감소합니다.\r\n" + 
				"챔피언이 아닌 유닛으로부터 받는 피해는 75% 감소된 양만 흡수합니다.\r\n" + 
				"보호막 최소 흡수량: 최대 체력의 5% // 보호막 최대 흡수량: 최대 체력의 30%.");
		System.out.println("두 번째 사용 시 보호막을 소모하여 남아있는 보호막 흡수량의 일정 비율만큼 체력을 회복합니다.");
		System.out.println("쿨타임 : 14 / 13 / 12 / 11 / 10");
		System.out.println("회복량 : 남아있는 보호막 흡수량의 40 / 42.5 / 45 / 47.5 / 50%");
		sk35();}	
	void se35(){
		System.out.println("E - 죽음의 손아귀(Death’s Grasp)");
		System.out.println("기본 지속 효과: 모데카이저가 마법 관통력을 얻습니다.\r\n" + 
				"사용 시: 모데카이저가 선택된 지역에 있는 적을 끌어당겨 마법 피해를 입힙니다.");
		System.out.println("마법 저항력 관통 : 5 / 7.5 / 10 / 12.5 / 15 %");
		System.out.println("사거리 : 700");
		System.out.println("쿨타임 : 24 / 21 / 18 / 15 / 12");
		System.out.println("마법 피해 : 80 / 95 / 110 / 125 / 140 (+0.6 주문력)");
		sk35();}
	void sr35(){
		System.out.println("R - 죽음의 세계(Realm of Death)");
		System.out.println("모데카이저가 대상 적 챔피언 하나를 7초 동안 죽음의 세계로 추방해 지속시간 동안 대상이 지닌 주요 능력치들의 10%를 훔칩니다.\r\n" + 
				"\r\n" + 
				"모데카이저가 죽음의 세계에서 대상을 처치하면 영혼을 흡수하여 대상이 부활할 때까지 훔친 능력치를 유지합니다.\r\n" + 
				"\r\n" + 
				"훔칠 수 있는 주요 능력치: 주문력, 공격력, 공격 속도, 방어력, 마법 저항력, 최대 체력");
		System.out.println("사거리 : 650");
		System.out.println("쿨타임 : 140 / 120 / 100\r\n효과 반경: 1200");
		sk35();}
	
	void ch36() {
		System.out.println("<<날개를 묶었다고 의지까지 꺾인 건 아니야.>>");
		System.out.println("모르가나, 타락한 자");
		System.out.println("Morgana, the Fallen");
		System.out.println("주 역할군 : 마법사\t부 역할군 : 서포터\t소속 : 데마시아");
		System.out.println("출시일 : 2009년 2월 21일");
		sk36();}
	void sk36(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp36();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq36();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw36();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se36();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr36();
		} else {
			champName();}}
	void sp36(){
		System.out.println("패시브 - 영혼 흡수(Soul Siphon)");
		System.out.println("모르가나가 스킬로 챔피언 및 대형 미니언, 대형 몬스터에게 피해를 입히면 피해량의 20%만큼 체력을 회복합니다.");
		sk36();}
	void sq36(){
		System.out.println("Q - 어둠의 속박(Dark Binding)");
		System.out.println("별의 화염이 깃든 에너지를 발사하여 첫 번째로 명중한 대상을 일정 시간 동안 속박하고 마법 피해를 입힙니다.");
		System.out.println("소모 마나 : 50 / 55 / 60 / 65 / 70\r\n사거리 : 1175");
		System.out.println("쿨타임 : 11");
		System.out.println("마법 피해 : 80 / 135 / 190 / 245 / 300 (+0.9 주문력)");
		System.out.println("속박 지속 시간 :2 / 2.25 / 2.5 / 2.75 / 3 초");
		sk36();}	
	void sw36(){
		System.out.println("W - 고통의 그림자(Tormented Shadow)");
		System.out.println("5초 동안 대상 지역을 불태워 안에 있는 적에게 매초 마법 피해를 입힙니다. 피해는 대상이 잃은 체력에 비례해 최대 170%까지 증가합니다.\r\n" + 
				"\r\n" + 
				"고통의 그림자 재사용 대기시간은 모르가나가 영혼 흡수로 체력을 회복할 때마다 5%씩 감소합니다.");
		System.out.println("소모 마나 : 70 / 85 / 100 / 115 / 130\r\n사거리 : 900");
		System.out.println("쿨타임 : 12");
		System.out.println("초당 마법 피해 : 6 / 12 / 18 / 24 / 30 (+0.07 주문력) ~ 60 / 120 / 180 / 240 / 300 (+ 0.7 주문력)");
		System.out.println("총 마법 피해 : 16.2 / 32.4 / 48.6 / 64.8 / 81 (+0.189 주문력) ~ 162 / 324 / 486 / 648 / 810 (+1.89 주문력)");
		System.out.println("반경 : 275");
		sk36();}
	void se36(){
		System.out.println("E - 칠흑의 방패(Black Shield)");
		System.out.println("아군 챔피언에게 5초 동안 지속되는 보호막을 씌웁니다. 이 보호막은 마법 피해를 흡수하며 아군은 보호막이 유지되는 동안 모든 종류의 방해 효과에 면역이 됩니다.");
		System.out.println("소모 마나 : 80\r\n사거리 : 800");
		System.out.println("쿨타임 : 126 / 24 / 22 / 20 / 18");
		System.out.println("보호막 : 60 / 120 / 180 / 240 / 300 (+0.7 주문력)");
		sk36();}
	void sr36(){
		System.out.println("R - 영혼의 족쇄(Soul Shackles)");
		System.out.println("모르가나가 자신과 주변 적 챔피언을 사슬로 묶어 대상에게 마법 피해를 입히고 이동 속도를 20% 늦춥니다. 3초가 지난 후 사슬을 벗어나지 못한 적은 추가로 마법 피해를 입고 1.5초 동안 기절합니다.\r\n" + 
				"\r\n" + 
				"영혼의 족쇄를 사용하는 동안 모르가나가 사슬로 묶은 적을 향해 이동할 때 이동 속도가 증가합니다.\r\n" + 
				"모르가나는 영혼의 족쇄에 걸린 모든 적에 대해 절대 시야를 얻습니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 625\t사슬 유지 최대 거리 : 1050");
		System.out.println("쿨타임 : 120 / 110 / 100");
		System.out.println("최초 마법 피해 : 150 / 225 / 300 (+ 0.7 주문력)");
		System.out.println("추가 마법 피해 : 150 / 225 / 300 (+ 0.7 주문력)");
		System.out.println("이동 속도 증가 : + 5 / 30 / 55%");
		sk36();}
	
	void ch37() {
		System.out.println("<<문도!>>");
		System.out.println("문도 박사, 자운의 광인");
		System.out.println("Dr. Mundo, the Madman of Zaun");
		System.out.println("주 역할군 : 전사\t부 역할군 : 탱커\t소속 : 자운");
		System.out.println("출시일 : 2009년 9월 2일");
		sk37();}
	void sk37(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp37();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq37();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw37();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se37();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr37();
		} else {
			champName();}}
	void sp37(){
		System.out.println("패시브 - 아드레날린 분출(Adrenaline Rush)");
		System.out.println("문도 박사의 체력이 5초마다 최대 체력의 1.5%씩 회복됩니다.");
		sk37();}
	void sq37(){
		System.out.println("Q - 오염된 대형식칼(Infected Cleaver)");
		System.out.println("문도 박사가 식칼을 던져 적의 현재 체력에 비례한 마법 피해를 입히고 2초 동안 적의 속도를 40% 늦춥니다.\r\n" + 
				"\r\n" + 
				"식칼이 명중하면 체력을 소모값의 40%만큼 돌려받습니다. (처치할 경우 80%)");
		System.out.println("소모 체력 : 50 / 60 / 70 / 80 / 90\r\n사거리 : 1000");
		System.out.println("쿨타임 : 4");
		System.out.println("마법 피해 : 대상 현재 체력의 20 / 22.5 / 25 / 27.5 / 30%");
		System.out.println("최소 마법 피해 : 80 / 130 / 180 / 230 / 280 - 최소 피해량");
		System.out.println("몬스터 대상 최대 피해량: 300 / 350 / 400 / 450 / 500");
		sk37();}	
	void sw37(){
		System.out.println("W - 타오르는 고통(Burning Agony)");
		System.out.println("활성화/비활성화: 문도 박사가 주변 적에게 마법 피해를 입히고 문도 박사에게 걸린 방해 효과의 지속 시간을 감소시킵니다.");
		System.out.println("소모 체력 : 초당 10 / 15 / 20 / 25 / 30\r\n사거리 : 325");
		System.out.println("쿨타임 :4");
		System.out.println("마법 피해 : 40 / 55 / 70 / 85 / 100 (+0.2 주문력)");
		System.out.println("방해 효과 지속 시간 감소: 30 %");
		sk37();}
	void se37(){
		System.out.println("E - 피학증(Masochism)");
		System.out.println("기본 지속 효과: 문도 박사가 마법 피해를 받거나 스킬로 체력을 소모할 때 2초 동안 마법 저항력이 3% 증가합니다.\r\n" + 
				"사용 시: 문도 박사의 다음 기본 공격은 적에게 박치기를 하여 최대 체력에 비례한 물리 피해를 추가로 입힙니다. 문도 박사는 이 스킬을 사용 시 체력을 소모합니다.\r\n" + 
				"\r\n" + 
				"활성화 시 문도 박사가 잃은 체력에 비례하여 5초 동안 공격력을 얻습니다.");
		System.out.println("소모 체력 : 25 / 35 / 45 / 55 / 65");
		System.out.println("쿨타임 : 6 / 5.5 / 5 / 4.5 / 4");
		System.out.println("중첩 한도: 2 / 5 / 8 / 11 / 14 회");
		System.out.println("물리 피해 : 최대 체력의 3 / 3.5 / 4 / 4.5 / 5 %");
		System.out.println("공격력 증가 : + 40 / 55 / 70 / 85 / 100\r\n" + 
				"+ 잃은 체력 1%당 +0.4 / 0.55 / 0.7 / 0.85 / 1.0");
		sk37();}
	void sr37(){
		System.out.println("R - 가학증(Sadism)");
		System.out.println("문도 박사가 12초에 걸쳐 체력을 회복합니다. 또한 이 동안 이동 속도가 증가합니다.");
		System.out.println("소모 체력 : 현재 체력의 25%");
		System.out.println("쿨타임 : 110 / 100 / 90");
		System.out.println("회복량 : 최대 체력의 50 / 75 / 100 %");
		System.out.println("이동 속도 증가 : + 15 / 25 / 35 %");
		sk37();}
	
	void ch38() {
		System.out.println("<<행운은 멍청이를 싫어하는 법이지.>>");
		System.out.println("미스 포츈, 현상금 사냥꾼");
		System.out.println("Miss Fortune, the Bounty Hunter");
		System.out.println("주 역할군 : 원거리\t부 역할군 : 없음\t소속 : 빌지워터");
		System.out.println("출시일 : 2010년 9월 8일");
		sk38();}
	void sk38(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp38();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq38();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw38();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se38();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr38();
		} else {
			champName();}}
	void sp38(){
		System.out.println("패시브 - 사랑의 한 방(Love Tap)");
		System.out.println("미스 포츈이 새로운 대상을 공격할 때마다 기본 공격으로 추가 물리 피해를 입힙니다. 미니언을 대상으로는 피해량이 반으로 줄어듭니다.");
		System.out.println("추가 물리 피해 : 0.5 / 0.6 / 0.7 / 0.8 / 0.9 / 1.0 총 공격력");
		sk38();}
	void sq38(){
		System.out.println("Q - 한 발에 두 놈(Double Up)");
		System.out.println("미스 포츈이 적을 관통하는 총알을 발사하여 두 대상에게 각각 물리 피해를 입힙니다. 두 번 모두 적중 시 효과를 적용합니다.\r\n" + 
				"\r\n" + 
				"두 번째 대상에게는 치명타를 입힐 수 있으며, 첫 번째 대상을 처치했을 경우 두 번째 대상에게는 항상 치명타가 적용됩니다.");
		System.out.println("소모 마나 : 43 / 46 / 49 / 52 / 55\r\n사거리 : 500\t도탄 사거리 : 500");
		System.out.println("쿨타임 : 7 / 6 / 5 / 4 / 3");
		System.out.println("물리 피해 : 20 / 40 / 60 / 80 / 100 (+1.0 총 공격력) (+0.35 주문력)");
		sk38();}	
	void sw38(){
		System.out.println("W - 활보(Strut)");
		System.out.println("기본 지속 효과: 5초간 직접적인 피해를 받지 않으면 미스 포츈의 이동 속도가 25만큼 증가합니다. 다음 5초간 피해를 입지 않으면 이동 속도가 더욱 증가합니다.\r\n" + 
				"사용 시: 4초 동안 공격 속도를 상승시키고 활보의 이동 속도 증가 효과를 최대로 활성화합니다.\r\n" + 
				"\r\n" + 
				"사랑의 한 방 발동 시 활보의 재사용 대기시간이 2초 줄어듭니다.");
		System.out.println("이동 속도 증가 : + 60 / 70 / 80 / 90 / 100 - 최대");
		System.out.println("소모 마나 : 30");
		System.out.println("쿨타임 : 12");
		System.out.println("공격 속도 증가 :  + 40 / 55 / 70 / 85 / 100 %");
		sk38();}
	void se38(){
		System.out.println("E - 총알은 비를 타고(Make It Rain)");
		System.out.println("미스 포츈이 지정 지역에 총알을 퍼부어 시야를 밝히고 2초간 마법 피해를 입힙니다. 총알에 맞은 적은 이동 속도가 느려집니다.");
		System.out.println("소모 마나 : 80\r\n사거리 : 1000\t범위 : 400");
		System.out.println("쿨타임 : 18 / 16 / 14 / 12 / 10");
		System.out.println("최대 마법 피해 : 80 / 115 / 150 / 185 / 220 (+0.8 주문력)");
		System.out.println("둔화율 : 40 / 45 / 50 / 55 / 60 %");
		sk38();}
	void sr38(){
		System.out.println("R - 쌍권총 난사(Bullet Time)");
		System.out.println("스 포츈이 3초 동안 정신 집중 상태로 총을 난사해 공격 한 차례에 (+0.75 총 공격력) (+0.2 주문력)의 물리 피해를 입힙니다.\r\n" + 
				"\r\n" + 
				"쌍권총 난사는 피해량의 120%로 치명타가 적용될 수 있습니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1400");
		System.out.println("쿨타임 : 120 / 110 / 100");
		System.out.println("난사 횟수 : 12 / 14 / 16");
		System.out.println("최대 물리 피해 : (+9 / 10.5 / 12 총 공격력) (+2.4 / 2.8 / 3.2 주문력)");
		sk38();}
	
	void ch39() {
		System.out.println("<< ♪ ♪♩ ♬ >>");
		System.out.println("바드, 영겁의 수호자");
		System.out.println("Bard, the Wandering Caretaker");
		System.out.println("주 역할군 : 서포터\t부 역할군 : 마법사\t소속 : 룬테라");
		System.out.println("출시일 : 2015년 3월 12일");
		sk39();}
	void sk39(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp39();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq39();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw39();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se39();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr39();
		} else {
			champName();}}
	void sp39(){
		System.out.println("패시브 - 방랑자의 부름(Traveler’s Call)");
		System.out.println("바드가 있으면 전장에 성스러운 고대의 종이 나타납니다. 이 종을 획득하면 경험치, 마나가 증가하고 잠시 동안 이동 속도가 크게 증가합니다. 또한, 하급 정령들이 바드를 따라다니며 공격을 돕습니다. 고대의 종을 획득하면 정령들이 영구적으로 더 강력해집니다.\r\n" + 
				"고대의 종 효과\r\n" + 
				"맵에 무작위로 종을 소환합니다. 바드는 종이 생성되자마자 전장의 안개 유무와 상관 없이 미니맵으로 볼 수 있습니다. 종은 특히 초반에 바드 근처에서 더 생성됩니다. 아군이든 적군이든 다른 플레이어들 모두 종들을 볼 수 있지만 미니맵에 나타나지도 않고, 전혀 상호작용 하지 못합니다. 모은 종은 버프형식으로 표시되며 회색의 버프창으로 남은 종을 표시합니다. 아직 모으지 않은 종은 맵에 노란색 아이콘으로 나타나며 각 종의 지속 시간은 생성 후 10분입니다.\r\n" + 
				"고대의 종을 획득할 시 경험치(기본 20 , 게임 시작 5분 후 분당 +1)와 마나(최대 마나의 12%)를 얻고, 잠시 동안 이동속도가 크게 증가합니다. 단 전투 시 이동 속도 증가 효과가 사라집니다. 많이 획득할수록 이동 속도가 빨라집니다. 버프가 종료되기 전에 또 다른 종을 획득할 시 이 버프는 중첩됩니다.(최대 5회 중첩)\r\n" + 
				"고대의 종들을 모으면 정령들이 다음과 같은 버프를 줍니다. 종을 모아갈수록 바드를 따라다니는 정령이 많아지고, 더 강력해집니다.\r\n" + 
				"파일:external/upload2.inven.co.kr/i0215251125.png\r\n" + 
				"정령\r\n" + 
				"바드가 정령이라고 알려진 작은 영혼을 끌어모읍니다. 바드가 공격하면, 정령이 대상에게 스스로를 던져 기본 40 (+종 5개당 15) (+0.3 주문력)의 추가 마법 피해를 입히고 영혼의 세계로 돌아갑니다. 정령은 종의 수에 따라 바드의 기본공격에 맞은 적에게 25~75%의 둔화 효과를 1초 동안 적용시킵니다. 정령은 8~4 초마다 하나씩 생성되며, 한 번에 최대 1~9마리까지 데리고 다닐 수 있습니다.\r\n" + 
				"정령 획득 시 부가 효과\r\n" + 
				"5개: 정령들이 1초 동안 25%의 둔화 효과를 적용합니다.\r\n" + 
				"10개: 바드를 따라다니는 정령이 최대 2마리 생성됩니다.\r\n" + 
				"15개: 정령이 대상 뒤쪽의 원뿔 범위에도 피해를 줍니다.\r\n" + 
				"20개: 정령이 부활하는 시간이 7초로 감소합니다.\r\n" + 
				"25개: 둔화율이 10% 증가합니다.(둔화율 35%)[3]\r\n" + 
				"30개: 바드를 따라다니는 정령이 최대 3마리 생성됩니다.\r\n" + 
				"35개: 정령이 피해를 주는 원뿔의 범위가 증가합니다.\r\n" + 
				"40개: 정령이 부활하는 시간이 6초로 감소합니다.\r\n" + 
				"45개: 둔화율이 10% 증가합니다.(둔화율 45%)\r\n" + 
				"50개: 바드를 따라다니는 정령이 최대 4마리 생성됩니다.\r\n" + 
				"55개: 정령이 부활하는 시간이 5초로 감소합니다.\r\n" + 
				"60개: 정령의 둔화율이 10% 증가합니다.\r\n" + 
				"65개: 바드를 따라다니는 정령이 최대 5마리 생성됩니다.\r\n" + 
				"70개: 정령이 부활하는 시간이 4초로 감소합니다.\r\n" + 
				"75개: 둔화율이 10% 증가합니다.(둔화율 65%)\r\n" + 
				"80개: 바드를 따라다니는 정령이 최대 6마리 생성됩니다.\r\n" + 
				"85개: 정령의 둔화율이 10% 증가합니다.(둔화율 75%)\r\n" + 
				"90개: 바드를 따라다니는 정령이 최대 7마리 생성됩니다.\r\n" + 
				"95개: 바드를 따라다니는 정령이 최대 8마리 생성됩니다.\r\n" + 
				"100개: 바드를 따라다니는 정령이 최대 9마리 생성됩니다.\r\n" + 
				"105개: 이후 종 5개당 정령이 15의 피해를 더 줍니다.");
		sk39();}
	void sq39(){
		System.out.println("Q - 우주의 결속(Cosmic Binding)");
		System.out.println("드가 에너지 줄기를 직선으로 발사해 적중하는 대상 하나 또는 둘에게 마법 피해를 입힙니다. 처음 적중한 대상은 일정 시간 동안 60% 둔화됩니다.\r\n" + 
				"\r\n" + 
				"광선이 두 번째 대상이나 벽을 맞히면 적중당한 모든 적이 일정 시간 동안 기절합니다.");
		System.out.println("소모 마나 : 60\r\n사거리 : 925");
		System.out.println("쿨타임 : 11 / 10 / 9 / 8 / 7");
		System.out.println("마법 피해 : 80 / 125 / 170 / 215 / 260 (+0.65 주문력)");
		System.out.println("투사체 속도 : 1500");
		System.out.println("둔화 및 기절 지속 시간 : 1 / 1.2 / 1.4 / 1.6 / 1.8");
		sk39();}	
	void sw39(){
		System.out.println("W - 수호자의 성소(Caretaker’s Shrine)");
		System.out.println("바드가 체력 회복 성소를 세웁니다. 성소는 나타난 직후엔 낮은 체력을 회복시키지만, 10초간 강화되면서 회복량이 증가합니다. 또한, 성소는 이동 속도를 50% 높여주며, 이 효과는 1.5초에 걸쳐 점차 감소합니다.\r\n" + 
				"\r\n" + 
				"바드는 동시에 최대 3개까지 성소를 세울 수 있으며, 성소는 아군이 방문하거나 적 챔피언이 파괴하면 사라집니다.");
		System.out.println("소모 마나 : 70\r\n사거리 : 1000");
		System.out.println("쿨타임 : 12");
		System.out.println("최소 회복량 : 30 / 60 / 90 / 120 / 150 (+0.3 주문력) ");
		System.out.println("최대 회복량 :  70 / 110 / 150 / 190 / 230 (+0.6 주문력)");
		sk39();}
	void se39(){
		System.out.println("E - 신비한 차원문(Magical Journey)");
		System.out.println("바드가 근처 지형지물을 통과하는 일방 통행 차원문을 엽니다. 적과 아군 모두 입구 근처에서 통로 아무 곳이나 클릭하면 출구로 이동할 수 있으며, 이 때 아군이 적보다 빠르게 이동합니다.\r\n" + 
				"통로는 10초가 지나면 사라집니다.");
		System.out.println("소모 마나 : 30\r\n사거리 : 900~3000");
		System.out.println("쿨타임 : 18 / 17 / 16 / 15 / 14");
		System.out.println("아군 추가 통과 속도 : 33%");
		sk39();}
	void sr39(){
		System.out.println("R - 운명의 소용돌이(Tempered Fate)");
		System.out.println("바드가 대상 지점을 향해 포물선을 그리며 날아가는 신비한 에너지를 발사합니다. 지면에 떨어지면 범위 안의 모든 챔피언, 미니언, 몬스터, 포탑이 정지 상태가 되어 2.5초간 대상으로 지정할 수 없고, 무적이 되는 대신 어떤 행동도 할 수 없는 상태가 됩니다.\r\n" + 
				"\r\n" + 
				"일반적인 상태 이상 효과가 통하지 않는 에픽 몬스터들도 이 스킬의 영향은 받습니다.");
		System.out.println("소모 마나 : 10\r\n사거리 : 3400");
		System.out.println("쿨타임 : 110 / 95 / 80");
		System.out.println("투사체 속도 : 1800");
		sk39();}
	
	void ch40() {
		System.out.println("<<죄 지은 자, 고통받을지어다.>>");
		System.out.println("바루스, 응징의 화살");
		System.out.println("Varus, the Arrow of Retribution");
		System.out.println("주 역할군 : 원거리\t부 역할군 : 마법사\t소속 : 아이오니아");
		System.out.println("출시일 : 2012년 5월 8일");
		sk40();}
	void sk40(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp40();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq40();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw40();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se40();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr40();
		} else {
			champName();}}
	void sp40(){
		System.out.println("패시브 - 죽지 않는 복수심(Living Vengeance)");
		System.out.println("바루스가 적을 처치하면 복수심에 불타올라 5초 동안 공격 속도가 상승합니다.\r\n" + 
				"\r\n" + 
				"챔피언 킬 및 어시스트: 공격 속도 40% (+추가 공격 속도의 30%)\r\n" + 
				"\r\n" + 
				"챔피언 외의 대상 처치: 공격 속도 20% (+추가 공격 속도의 15%)");
		sk40();}
	void sq40(){
		System.out.println("Q - 꿰뚫는 화살(Piercing Arrow)");
		System.out.println("최초 사용 시: 바루스가 다음 화살을 조준하여 점차 사거리와 피해량이 증가합니다. 조준하는 동안 바루스의 이동 속도가 20% 감소합니다. 4초가 경과하면 꿰뚫는 화살이 발사되지 못하고 소모된 마나의 50%가 회복됩니다.\r\n" + 
				"\r\n" + 
				"두 번째 사용 시: 바루스가 화살을 발사하여 물리 피해를 입힙니다. 관통 당한 적 하나당 15%씩 피해량이 감소합니다. (최소 33%)\r\n" + 
				"\r\n" + 
				"꿰뚫는 화살이 최소 한 명의 적 챔피언에게서 역병 중첩을 폭발시킬 경우 재사용 대기시간이 4초 감소합니다.");
		System.out.println("소모 마나 : 70 / 75 / 80 / 85 / 90\r\n사거리 : 925 ~ 1625");
		System.out.println("쿨타임 : 20 / 18 / 16 / 14 / 12");
		System.out.println("최소 물리 피해 : 10 / 47 / 83 / 120 / 157 (+1.1 총 공격력)");
		System.out.println("최대 물리 피해 : 15 / 70 / 125 / 180 / 235 (+1.65 총 공격력)");
		System.out.println("투사체 속도 : 1900");
		sk40();}	
	void sw40(){
		System.out.println("W - 역병 화살(Blighted Quiver)");
		System.out.println("기본 지속 효과: 바루스의 기본 공격이 추가 마법 피해를 입히고 6초 동안 역병을 붙입니다. (3번 중첩 가능)\r\n" + 
				"\r\n" + 
				"바루스가 다른 스킬을 사용해 역병을 폭발시키면 중첩 횟수당 대상 최대 체력에 비례한 마법 피해를 입힙니다.\r\n" + 
				"\r\n" + 
				"역병 화살이 몬스터에게 최대 360의 피해를 입힙니다.");
		System.out.println("기본 추가 마법 피해량 : 7 / 10.5 / 14 / 17.5 / 21 (+0.25 주문력)");
		System.out.println("역병 1중첩 폭발 마법 피해 : 대상 최대 체력의 3 / 3.5 / 4 / 4.5 / 5 (+0.02 주문력)%");
		System.out.println("역병 3중첩 폭발 마법 피해 : 대상 최대 체력의 9 / 10.5 / 12 / 13.5 / 15 (+0.06 주문력)%");
		System.out.println("사용 시: 다음번 꿰뚫는 화살이 충전 정도에 따라 적에게 잃은 체력에 비례한 추가 마법 피해를 입힙니다.");
		System.out.println("쿨타임 : 40");
		System.out.println("최소 마법 피해 : 대상 잃은 체력의 6 / 8 / 10 / 12 / 14% (1 / 4 / 7 / 10 / 13레벨)");
		System.out.println("최대 마법 피해 : 대상 잃은 체력의 9 / 12 / 15 / 18 / 21% (1 / 4 / 7 / 10 / 13레벨)");
		sk40();}
	void se40(){
		System.out.println("E - 퍼붓는 화살(Hail of Arrows)");
		System.out.println("바루스가 화살을 비처럼 쏟아부어 물리 피해를 입히고 4초 동안 지면을 오염시킵니다.\r\n" + 
				"\r\n" + 
				"오염된 지면은 적의 이동 속도를 늦추고 회복 효과를 40% 감소시킵니다.");
		System.out.println("소모 마나 : 80\r\n사거리 : 925");
		System.out.println("쿨타임 : 18 / 16 / 14 / 12 / 10");
		System.out.println("물리 피해 : 70 / 105 / 140 / 175 / 210 (+0.6 추가 공격력)");
		System.out.println("둔화율 : 25 / 30 / 35 / 40 / 45 %");
		sk40();}
	void sr40(){
		System.out.println("R - 부패의 사슬(Chain of Corruption)");
		System.out.println("기루스가 부패의 촉수를 발사해 마법 피해를 입히고, 처음 맞은 적의 이동을 2초간 막습니다.\r\n" + 
				"\r\n" + 
				"이후 근처의 감염되지 않은 적 챔피언에게 촉수가 뻗어나가, 닿은 적에게 동일한 양의 피해를 입히고 이동 불가 상태로 만듭니다. 이동 불가 상태가 된 적은 일정 시간에 걸쳐 역병 중첩이 3회 쌓입니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1075");
		System.out.println("쿨타임 : 110 / 90 / 70");
		System.out.println("마법 피해 : 150 / 200 / 250 (+1.0 주문력)");
		System.out.println("투사체 속도 : 2000\t투사체 폭 : 120\t감염 거리 :550");
		sk40();}
	
	void ch41() {
		System.out.println("<<영웅이라뇨, 전 그저 망치를 든 요들일 뿐이에요.>>");
		System.out.println("뽀삐, 망치의 수호자");
		System.out.println("Poppy, Keeper of the Hammer");
		System.out.println("주 역할군 : 탱커\t부 역할군 : 전사\t소속 : 데마시아");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.24 업데이트 전 뽀삐 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk41();}
	void sk41(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp41();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq41();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw41();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se41();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr41();
		} else {
			champName();}}
	void sp41(){
		System.out.println("패시브 - 강철의 외교관 (Iron Ambassador)");
		System.out.println("뽀삐가 주기적으로 기본 공격 시 평소보다 늘어난 사거리로 방패를 던져 추가 마법 피해를 입힙니다.\r\n" + 
				"\r\n" + 
				"근처에 떨어진 방패를 주우면 3초간 피해를 흡수하는 보호막이 생성됩니다. 방패는 적에게 밟히면 파괴됩니다.\r\n" + 
				"\r\n" + 
				"강철의 외교관으로 대상을 처치할 경우 방패가 바로 뽀삐에게 되돌아옵니다.");
		System.out.println("사거리 : +350");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 15 / 17.5 / 20%");
		System.out.println("마법 피해 : 20 ~ 180");
		sk41();}
	void sq41(){
		System.out.println("Q - 망치 강타(Hammer Shock)");
		System.out.println("뽀삐가 땅을 힘껏 내리쳐 물리 피해를 입히고 지대를 불안정하게 만듭니다.\r\n" + 
				"\r\n" + 
				"지대 내부의 적은 이동 속도가 느려집니다. 지대는 1초 뒤 폭발하며, 이때 피해량은 최초에 입힌 피해량과 동일합니다.");
		System.out.println("소모 마나 : 35 / 40 / 45 / 50 / 55\r\n사거리 : 430");
		System.out.println("쿨타임 : 8 / 7 / 6 / 5 / 4");
		System.out.println("물리 피해 : 40 / 60 / 80 / 100 / 120 (+0.9 추가 공격력) (+적 최대 체력의 8%)");
		System.out.println("둔화율 : 20 / 25 / 30 / 35 / 40%");
		sk41();}	
	void sw41(){
		System.out.println("W - 굳건한 태세 (Steadfast Presence)");
		System.out.println("기본 지속 효과: 뽀삐가 방어력과 마법 저항력을 추가로 얻습니다. (방어력과 마법 저항력의 10%) 뽀삐의 체력이 40% 미만일 때는 효과가 두 배로 늘어납니다.");
		System.out.println("사용 시: 뽀삐의 이동 속도가 2초 동안 40% 증가하며, 주변에서 돌진하는 적을 막고 마법 피해를 입힙니다. 가로 막힌 적은 2초 동안 이동 스킬을 사용할 수 없으며 이동 속도가 25% 감소합니다.");
		System.out.println("소모 마나 : 50\r\n사거리 : 400");
		System.out.println("쿨타임 : 24 / 22 / 20 / 18 / 16");
		System.out.println("마법 피해 : 70 / 110 / 150 / 190 / 230 (+0.7 주문력)");
		sk41();}
	void se41(){
		System.out.println("E - 용감한 돌진 (Heroic Charge)");
		System.out.println("뽀삐가 하나의 적에게 돌진해 물리 피해를 입히고 앞으로 밀어냅니다. 적이 지형에 부딪히면 추가 물리 피해를 입고 일정 시간 동안 기절합니다.");
		System.out.println("소모 마나 : 70\r\n사거리 : 475");
		System.out.println("쿨타임 : 14 / 13 / 12 / 11 / 10");
		System.out.println("물리 피해 : 60 / 80 / 100 / 120 / 140 (+0.5 추가 공격력)");
		System.out.println("추가 물리 피해 : 60 / 80 / 100 / 120 / 140 (+0.5 추가 공격력)");
		System.out.println("기절 지속 시간 :1.6 / 1.7 / 1.8 / 1.9 / 2.0");
		sk41();}
	void sr41(){
		System.out.println("R - 수호자의 심판 (Keeper’s Verdict)");
		System.out.println("첫 번째 시전 시: 뽀삐가 최대 4초간 정신을 집중하고 이동 속도가 15% 느려집니다.\r\n" + 
				"두 번째 시전 시: 뽀삐가 지면에 강력한 일격을 날려 균열을 일으킵니다. 처음 적중한 적 챔피언 근처의 적은 물리 피해를 입고 모두 적 기지 쪽으로 밀려납니다. 균열의 길이와 적을 밀어내는 거리는 정신을 집중한 시간에 비례합니다.\r\n" + 
				"\r\n" + 
				"정신을 집중하지 않고 바로 다시 사용할 경우 절반의 피해를 주며 적을 0.75초간 공중에 띄웁니다.\r\n" + 
				"\r\n" + 
				"정신을 집중하여 사용한 수호자의 심판에 적중한 적은 대상으로 지정할 수 없습니다.");
		System.out.println("소모 마나 : 100\r\n사거리 : 1900");
		System.out.println("쿨타임 : 140 / 120 / 100");
		System.out.println("물리 피해 : 200 / 300 / 400 (+0.9 추가 공격력)");
		System.out.println("투사체 속도: 2000");
		sk41();}
	
	void ch42() {
		System.out.println("<<휴식은... 산 자를 위한... 것이다..!>>");
		System.out.println("사이온, 언데드 학살병기");
		System.out.println("Sion, the Undead Juggernaut");
		System.out.println("주 역할군 : 탱커\t부 역할군 : 전사\t소속 : 녹서스");
		System.out.println("출시일 : 2009년 2월 21일");
		System.out.println("(4.18 업데이트 전 사이온 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk42();}
	void sk42(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp42();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq42();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw42();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se42();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr42();
		} else {
			champName();}}
	void sp42(){
		System.out.println("패시브 - 영광스러운 죽음(Glory in Death)");
		System.out.println("사이온은 사망한 이후 되살아나, 체력이 급속히 떨어집니다.\r\n" + 
				"\r\n" + 
				"이 동안 이동과 공격이 가능합니다. 생명력 흡수 효과가 100% 증가하고, 매우 빠르게 공격하며 적중 시 대상의 최대 체력의 10%에 해당하는 추가 물리 피해를 입힙니다. 몬스터 상대로는 최대 75의 추가 피해를 입힙니다.\r\n" + 
				"\r\n" + 
				"모든 스킬이 죽음의 물결로 대체되어 이동 속도가 대폭 상승합니다.");
		System.out.println("죽음의 물결 : 사이온의 속도가 1.5초 동안 대폭 상승합니다.");
		System.out.println("쿨타임 : 100(소환사의 제단에서 완전히 부활할 경우 초기화)");
		System.out.println("이동 속도 증가 : + 50%");
		sk42();}
	void sq42(){
		System.out.println("Q - 대량 학살 강타(Decimating Smash)");
		System.out.println("사이온이 2초 동안 강력한 일격을 준비합니다. 일격을 날리면 반경 안의 적들에게 물리 피해를 입힙니다. (미니언에게는 60%의 피해를 입힙니다.) 여기에 맞은 적들은 0.25초 동안 이동 속도가 50% 느려집니다.\r\n" + 
				"\r\n" + 
				"사이온이 최소 1초라도 정신을 집중했을 때는 적들이 띄워올려지고 1.25에서 2.25초 동안 기절합니다.");
		System.out.println("소모 마나 : 45\r\n사거리 : 300 ~ 600");
		System.out.println("쿨타임 : 10 / 9 / 8 / 7 / 6");
		System.out.println("최소 물리 피해 : 30 / 50 / 70 / 90 / 110 (+0.45 / 0.525 / 0.6 / 0.675 / 0.75 총 공격력)");
		System.out.println("최대 물리 피해 70 / 135 / 200 / 265 / 330 (+1.35 / 1.575 / 1.8 / 2.025 / 2.25 총 공격력)");
		sk42();}	
	void sw42(){
		System.out.println("W - 영혼의 용광로(Soul Furnace)");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk42();}
	void se42(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk42();}
	void sr42(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk42();}
	
	void ch43() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk43();}
	void sk43(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp43();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq43();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw43();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se43();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr43();
		} else {
			champName();}}
	void sp43(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk43();}
	void sq43(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk43();}	
	void sw43(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk43();}
	void se43(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk43();}
	void sr43(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk43();}
	
	void ch44() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk44();}
	void sk44(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp44();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq44();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw44();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se44();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr44();
		} else {
			champName();}}
	void sp44(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk44();}
	void sq44(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk44();}	
	void sw44(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk44();}
	void se44(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk44();}
	void sr44(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk44();}

	void ch45() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk45();}
	void sk45(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp45();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq45();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw45();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se45();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr45();
		} else {
			champName();}}
	void sp45(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk45();}
	void sq45(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk45();}	
	void sw45(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk45();}
	void se45(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk45();}
	void sr45(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk45();}
	
	void ch46() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk46();}
	void sk46(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp46();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq46();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw46();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se46();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr46();
		} else {
			champName();}}
	void sp46(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk46();}
	void sq46(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk46();}	
	void sw46(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk46();}
	void se46(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk46();}
	void sr46(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk46();}
	
	void ch47() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk47();}
	void sk47(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp47();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq47();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw47();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se47();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr47();
		} else {
			champName();}}
	void sp47(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk47();}
	void sq47(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk47();}	
	void sw47(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk47();}
	void se47(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk47();}
	void sr47(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk47();}
	
	void ch48() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk48();}
	void sk48(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp48();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq48();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw48();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se48();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr48();
		} else {
			champName();}}
	void sp48(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk48();}
	void sq48(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk48();}	
	void sw48(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk48();}
	void se48(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk48();}
	void sr48(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk48();}
	
	void ch49() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk49();}
	void sk49(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp49();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq49();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw49();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se49();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr49();
		} else {
			champName();}}
	void sp49(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk49();}
	void sq49(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk49();}	
	void sw49(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk49();}
	void se49(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk49();}
	void sr49(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk49();}
	
	void ch50() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk50();}
	void sk50(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp50();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq50();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw50();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se50();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr50();
		} else {
			champName();}}
	void sp50(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk50();}
	void sq50(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk50();}	
	void sw50(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk50();}
	void se50(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk50();}
	void sr50(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk50();}
	
	void ch51() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk51();}
	void sk51(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp51();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq51();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw51();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se51();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr51();
		} else {
			champName();}}
	void sp51(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk51();}
	void sq51(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk51();}	
	void sw51(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk51();}
	void se51(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk51();}
	void sr51(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk51();}
	
	void ch52() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk52();}
	void sk52(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp52();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq52();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw52();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se52();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr52();
		} else {
			champName();}}
	void sp52(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk52();}
	void sq52(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk52();}	
	void sw52(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk52();}
	void se52(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk52();}
	void sr52(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk52();}
	
	void ch53() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk53();}
	void sk53(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp53();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq53();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw53();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se53();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr53();
		} else {
			champName();}}
	void sp53(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk53();}
	void sq53(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk53();}	
	void sw53(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk53();}
	void se53(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk53();}
	void sr53(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk53();}

	void ch54() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk54();}
	void sk54(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp54();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq54();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw54();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se54();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr54();
		} else {
			champName();}}
	void sp54(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk54();}
	void sq54(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk54();}	
	void sw54(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk54();}
	void se54(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk54();}
	void sr54(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk54();}
	
	void ch55() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk55();}
	void sk55(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp55();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq55();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw55();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se55();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr55();
		} else {
			champName();}}
	void sp55(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk55();}
	void sq55(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk55();}	
	void sw55(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk55();}
	void se55(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk55();}
	void sr55(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk55();}
	
	void ch56() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk56();}
	void sk56(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp56();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq56();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw56();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se56();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr56();
		} else {
			champName();}}
	void sp56(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk56();}
	void sq56(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk56();}	
	void sw56(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk56();}
	void se56(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk56();}
	void sr56(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk56();}
	
	void ch57() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk57();}
	void sk57(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp57();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq57();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw57();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se57();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr57();
		} else {
			champName();}}
	void sp57(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk57();}
	void sq57(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk57();}	
	void sw57(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk57();}
	void se57(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk57();}
	void sr57(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk57();}
	
	void ch58() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk58();}
	void sk58(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp58();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq58();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw58();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se58();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr58();
		} else {
			champName();}}
	void sp58(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk58();}
	void sq58(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk58();}	
	void sw58(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk58();}
	void se58(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk58();}
	void sr58(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk58();}
	
	void ch59() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk59();}
	void sk59(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp59();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq59();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw59();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se59();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr59();
		} else {
			champName();}}
	void sp59(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk59();}
	void sq59(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk59();}	
	void sw59(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk59();}
	void se59(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk59();}
	void sr59(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk59();}
	
	void ch60() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk60();}
	void sk60(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp60();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq60();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw60();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se60();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr60();
		} else {
			champName();}}
	void sp60(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk60();}
	void sq60(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk60();}	
	void sw60(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk60();}
	void se60(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk60();}
	void sr60(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk60();}
	
	void ch61() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk61();}
	void sk61(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp61();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq61();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw61();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se61();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr61();
		} else {
			champName();}}
	void sp61(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk61();}
	void sq61(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk61();}	
	void sw61(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk61();}
	void se61(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk61();}
	void sr61(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk61();}

	void ch62() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk62();}
	void sk62(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp62();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq62();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw62();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se62();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr62();
		} else {
			champName();}}
	void sp62(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk62();}
	void sq62(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk62();}	
	void sw62(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk62();}
	void se62(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk62();}
	void sr62(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk62();}
	
	void ch63() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk63();}
	void sk63(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp63();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq63();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw63();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se63();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr63();
		} else {
			champName();}}
	void sp63(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk63();}
	void sq63(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk63();}	
	void sw63(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk63();}
	void se63(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk63();}
	void sr63(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk63();}
	
	void ch64() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk64();}
	void sk64(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp64();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq64();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw64();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se64();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr64();
		} else {
			champName();}}
	void sp64(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk64();}
	void sq64(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk64();}	
	void sw64(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk64();}
	void se64(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk64();}
	void sr64(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk64();}

	void ch65() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk65();}
	void sk65(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp65();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq65();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw65();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se65();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr65();
		} else {
			champName();}}
	void sp65(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk65();}
	void sq65(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk65();}	
	void sw65(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk65();}
	void se65(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk65();}
	void sr65(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk65();}
	
	void ch66() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk66();}
	void sk66(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp66();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq66();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw66();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se66();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr66();
		} else {
			champName();}}
	void sp66(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk66();}
	void sq66(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk66();}	
	void sw66(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk66();}
	void se66(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk66();}
	void sr66(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk66();}

	void ch67() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk67();}
	void sk67(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp67();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq67();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw67();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se67();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr67();
		} else {
			champName();}}
	void sp67(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk67();}
	void sq67(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk67();}	
	void sw67(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk67();}
	void se67(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk67();}
	void sr67(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk67();}
	
	void ch68() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk68();}
	void sk68(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp68();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq68();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw68();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se68();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr68();
		} else {
			champName();}}
	void sp68(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk68();}
	void sq68(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk68();}	
	void sw68(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk68();}
	void se68(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk68();}
	void sr68(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk68();}
	
	void ch69() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk69();}
	void sk69(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp69();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq69();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw69();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se69();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr69();
		} else {
			champName();}}
	void sp69(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk69();}
	void sq69(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk69();}	
	void sw69(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk69();}
	void se69(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk69();}
	void sr69(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk69();}
	
	void ch70() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk70();}
	void sk70(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp70();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq70();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw70();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se70();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr70();
		} else {
			champName();}}
	void sp70(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk70();}
	void sq70(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk70();}	
	void sw70(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk70();}
	void se70(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk70();}
	void sr70(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk70();}
	
	void ch71() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk71();}
	void sk71(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp71();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq71();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw71();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se71();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr71();
		} else {
			champName();}}
	void sp71(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk71();}
	void sq71(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk71();}	
	void sw71(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk71();}
	void se71(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk71();}
	void sr71(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk71();}
	
	void ch72() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk72();}
	void sk72(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp72();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq72();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw72();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se72();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr72();
		} else {
			champName();}}
	void sp72(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk72();}
	void sq72(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk72();}	
	void sw72(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk72();}
	void se72(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk72();}
	void sr72(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk72();}
	
	void ch73() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk73();}
	void sk73(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp73();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq73();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw73();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se73();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr73();
		} else {
			champName();}}
	void sp73(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk73();}
	void sq73(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk73();}	
	void sw73(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk73();}
	void se73(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk73();}
	void sr73(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk73();}
	
	void ch74() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk74();}
	void sk74(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp74();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq74();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw74();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se74();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr74();
		} else {
			champName();}}
	void sp74(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk74();}
	void sq74(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk74();}	
	void sw74(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk74();}
	void se74(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk74();}
	void sr74(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk74();}
	
	void ch75() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk75();}
	void sk75(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp75();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq75();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw75();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se75();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr75();
		} else {
			champName();}}
	void sp75(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk75();}
	void sq75(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk75();}	
	void sw75(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk75();}
	void se75(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk75();}
	void sr75(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk75();}
	
	void ch76() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk76();}
	void sk76(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp76();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq76();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw76();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se76();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr76();
		} else {
			champName();}}
	void sp76(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk76();}
	void sq76(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk76();}	
	void sw76(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk76();}
	void se76(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk76();}
	void sr76(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk76();}

	void ch77() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk77();}
	void sk77(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp77();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq77();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw77();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se77();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr77();
		} else {
			champName();}}
	void sp77(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk77();}
	void sq77(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk77();}	
	void sw77(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk77();}
	void se77(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk77();}
	void sr77(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk77();}
	
	void ch78() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk78();}
	void sk78(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp78();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq78();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw78();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se78();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr78();
		} else {
			champName();}}
	void sp78(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk78();}
	void sq78(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk78();}	
	void sw78(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk78();}
	void se78(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk78();}
	void sr78(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk78();}
	
	void ch79() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk79();}
	void sk79(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp79();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq79();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw79();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se79();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr79();
		} else {
			champName();}}
	void sp79(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk79();}
	void sq79(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk79();}	
	void sw79(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk79();}
	void se79(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk79();}
	void sr79(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk79();}

	void ch80() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk80();}
	void sk80(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp80();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq80();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw80();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se80();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr80();
		} else {
			champName();}}
	void sp80(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk80();}
	void sq80(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk80();}	
	void sw80(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk80();}
	void se80(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk80();}
	void sr80(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk80();}
	
	void ch81() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk81();}
	void sk81(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp81();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq81();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw81();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se81();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr81();
		} else {
			champName();}}
	void sp81(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk81();}
	void sq81(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk81();}	
	void sw81(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk81();}
	void se81(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk81();}
	void sr81(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk81();}
	
	void ch82() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk82();}
	void sk82(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp82();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq82();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw82();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se82();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr82();
		} else {
			champName();}}
	void sp82(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk82();}
	void sq82(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk82();}	
	void sw82(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk82();}
	void se82(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk82();}
	void sr82(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk82();}
	
	void ch83() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk83();}
	void sk83(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp83();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq83();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw83();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se83();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr83();
		} else {
			champName();}}
	void sp83(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk83();}
	void sq83(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk83();}	
	void sw83(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk83();}
	void se83(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk83();}
	void sr83(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk83();}
	
	void ch84() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk84();}
	void sk84(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp84();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq84();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw84();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se84();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr84();
		} else {
			champName();}}
	void sp84(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk84();}
	void sq84(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk84();}	
	void sw84(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk84();}
	void se84(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk84();}
	void sr84(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk84();}
	
	void ch85() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk85();}
	void sk85(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp85();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq85();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw85();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se85();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr85();
		} else {
			champName();}}
	void sp85(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk85();}
	void sq85(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk85();}	
	void sw85(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk85();}
	void se85(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk85();}
	void sr85(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk85();}
	
	void ch86() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk86();}
	void sk86(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp86();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq86();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw86();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se86();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr86();
		} else {
			champName();}}
	void sp86(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk86();}
	void sq86(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk86();}	
	void sw86(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk86();}
	void se86(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk86();}
	void sr86(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk86();}

	void ch87() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk87();}
	void sk87(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp87();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq87();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw87();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se87();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr87();
		} else {
			champName();}}
	void sp87(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk87();}
	void sq87(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk87();}	
	void sw87(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk87();}
	void se87(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk87();}
	void sr87(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk87();}
	
	void ch88() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk88();}
	void sk88(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp88();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq88();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw88();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se88();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr88();
		} else {
			champName();}}
	void sp88(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk88();}
	void sq88(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk88();}	
	void sw88(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk88();}
	void se88(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk88();}
	void sr88(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk88();}
	
	void ch89() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk89();}
	void sk89(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp89();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq89();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw89();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se89();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr89();
		} else {
			champName();}}
	void sp89(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk89();}
	void sq89(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk89();}	
	void sw89(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk89();}
	void se89(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk89();}
	void sr89(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk89();}
	
	void ch90() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk90();}
	void sk90(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp90();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq90();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw90();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se90();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr90();
		} else {
			champName();}}
	void sp90(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk90();}
	void sq90(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk90();}	
	void sw90(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk90();}
	void se90(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk90();}
	void sr90(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk90();}
	
	void ch91() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk91();}
	void sk91(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp91();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq91();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw91();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se91();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr91();
		} else {
			champName();}}
	void sp91(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk91();}
	void sq91(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk91();}	
	void sw91(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk91();}
	void se91(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk91();}
	void sr91(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk91();}
	
	void ch92() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk92();}
	void sk92(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp92();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq92();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw92();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se92();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr92();
		} else {
			champName();}}
	void sp92(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk92();}
	void sq92(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk92();}	
	void sw92(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk92();}
	void se92(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk92();}
	void sr92(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk92();}
	
	void ch93() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk93();}
	void sk93(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp93();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq93();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw93();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se93();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr93();
		} else {
			champName();}}
	void sp93(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk93();}
	void sq93(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk93();}	
	void sw93(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk93();}
	void se93(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk93();}
	void sr93(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk93();}
	
	void ch94() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk94();}
	void sk94(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp94();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq94();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw94();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se94();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr94();
		} else {
			champName();}}
	void sp94(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk94();}
	void sq94(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk94();}	
	void sw94(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk94();}
	void se94(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk94();}
	void sr94(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk94();}
	
	void ch95() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk95();}
	void sk95(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp95();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq95();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw95();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se95();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr95();
		} else {
			champName();}}
	void sp95(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk95();}
	void sq95(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk95();}	
	void sw95(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk95();}
	void se95(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk95();}
	void sr95(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk95();}
	
	void ch96() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk96();}
	void sk96(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp96();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq96();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw96();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se96();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr96();
		} else {
			champName();}}
	void sp96(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk96();}
	void sq96(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk96();}	
	void sw96(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk96();}
	void se96(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk96();}
	void sr96(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk96();}
	
	void ch97() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk97();}
	void sk97(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp97();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq97();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw97();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se97();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr97();
		} else {
			champName();}}
	void sp97(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk97();}
	void sq97(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk97();}	
	void sw97(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk97();}
	void se97(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk97();}
	void sr97(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk97();}
	
	void ch98() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk98();}
	void sk98(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp98();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq98();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw98();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se98();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr98();
		} else {
			champName();}}
	void sp98(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk98();}
	void sq98(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk98();}	
	void sw98(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk98();}
	void se98(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk98();}
	void sr98(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk98();}
	
	void ch99() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk99();}
	void sk99(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp99();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq99();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw99();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se99();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr99();
		} else {
			champName();}}
	void sp99(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk99();}
	void sq99(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk99();}	
	void sw99(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk99();}
	void se99(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk99();}
	void sr99(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk99();}
	
	void ch100() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk100();}
	void sk100(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp100();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq100();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw100();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se100();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr100();
		} else {
			champName();}}
	void sp100(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk100();}
	void sq100(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk100();}	
	void sw100(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk100();}
	void se100(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk100();}
	void sr100(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk100();}
	
	void ch101() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk101();}
	void sk101(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp101();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq101();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw101();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se101();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr101();
		} else {
			champName();}}
	void sp101(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk101();}
	void sq101(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk101();}	
	void sw101(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk101();}
	void se101(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk101();}
	void sr101(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk101();}
	
	void ch102() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk102();}
	void sk102(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp102();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq102();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw102();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se102();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr102();
		} else {
			champName();}}
	void sp102(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk102();}
	void sq102(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk102();}	
	void sw102(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk102();}
	void se102(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk102();}
	void sr102(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk102();}
	
	void ch103() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk103();}
	void sk103(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp103();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq103();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw103();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se103();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr103();
		} else {
			champName();}}
	void sp103(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk103();}
	void sq103(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk103();}	
	void sw103(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk103();}
	void se103(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk103();}
	void sr103(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk103();}
	
	void ch104() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk104();}
	void sk104(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp104();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq104();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw104();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se104();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr104();
		} else {
			champName();}}
	void sp104(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk104();}
	void sq104(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk104();}	
	void sw104(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk104();}
	void se104(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk104();}
	void sr104(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk104();}
	
	void ch105() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk105();}
	void sk105(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp105();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq105();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw105();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se105();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr105();
		} else {
			champName();}}
	void sp105(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk105();}
	void sq105(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk105();}	
	void sw105(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk105();}
	void se105(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk105();}
	void sr105(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk105();}
	
	void ch106() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk106();}
	void sk106(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp106();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq106();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw106();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se106();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr106();
		} else {
			champName();}}
	void sp106(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk106();}
	void sq106(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk106();}	
	void sw106(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk106();}
	void se106(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk106();}
	void sr106(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk106();}
	
	void ch107() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk107();}
	void sk107(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp107();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq107();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw107();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se107();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr107();
		} else {
			champName();}}
	void sp107(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk107();}
	void sq107(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk107();}	
	void sw107(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk107();}
	void se107(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk107();}
	void sr107(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk107();}
	
	void ch108() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk108();}
	void sk108(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp108();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq108();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw108();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se108();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr108();
		} else {
			champName();}}
	void sp108(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk108();}
	void sq108(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk108();}	
	void sw108(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk108();}
	void se108(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk108();}
	void sr108(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk108();}
	
	void ch109() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk109();}
	void sk109(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp109();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq109();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw109();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se109();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr109();
		} else {
			champName();}}
	void sp109(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk109();}
	void sq109(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk109();}	
	void sw109(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk109();}
	void se109(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk109();}
	void sr109(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk109();}

	void ch110() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk110();}
	void sk110(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp110();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq110();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw110();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se110();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr110();
		} else {
			champName();}}
	void sp110(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk110();}
	void sq110(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk110();}	
	void sw110(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk110();}
	void se110(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk110();}
	void sr110(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk110();}
	
	void ch111() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk111();}
	void sk111(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp111();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq111();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw111();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se111();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr111();
		} else {
			champName();}}
	void sp111(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk111();}
	void sq111(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk111();}	
	void sw111(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk111();}
	void se111(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk111();}
	void sr111(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk111();}
	
	void ch112() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk112();}
	void sk112(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp112();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq112();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw112();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se112();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr112();
		} else {
			champName();}}
	void sp112(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk112();}
	void sq112(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk112();}	
	void sw112(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk112();}
	void se112(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk112();}
	void sr112(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk112();}
	
	void ch113() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk113();}
	void sk113(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp113();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq113();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw113();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se113();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr113();
		} else {
			champName();}}
	void sp113(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk113();}
	void sq113(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk113();}	
	void sw113(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk113();}
	void se113(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk113();}
	void sr113(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk113();}
	
	void ch114() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk114();}
	void sk114(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp114();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq114();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw114();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se114();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr114();
		} else {
			champName();}}
	void sp114(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk114();}
	void sq114(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk114();}	
	void sw114(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk114();}
	void se114(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk114();}
	void sr114(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk114();}
	
	void ch115() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk115();}
	void sk115(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp115();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq115();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw115();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se115();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr115();
		} else {
			champName();}}
	void sp115(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk115();}
	void sq115(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk115();}	
	void sw115(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk115();}
	void se115(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk115();}
	void sr115(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk115();}
	
	void ch116() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk116();}
	void sk116(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp116();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq116();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw116();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se116();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr116();
		} else {
			champName();}}
	void sp116(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk116();}
	void sq116(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk116();}	
	void sw116(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk116();}
	void se116(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk116();}
	void sr116(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk116();}
	
	void ch117() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk117();}
	void sk117(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp117();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq117();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw117();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se117();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr117();
		} else {
			champName();}}
	void sp117(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk117();}
	void sq117(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk117();}	
	void sw117(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk117();}
	void se117(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk117();}
	void sr117(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk117();}
	
	void ch118() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk118();}
	void sk118(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp118();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq118();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw118();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se118();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr118();
		} else {
			champName();}}
	void sp118(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk118();}
	void sq118(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk118();}	
	void sw118(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk118();}
	void se118(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk118();}
	void sr118(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk118();}
	
	void ch119() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk119();}
	void sk119(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp119();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq119();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw119();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se119();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr119();
		} else {
			champName();}}
	void sp119(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk119();}
	void sq119(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk119();}	
	void sw119(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk119();}
	void se119(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk119();}
	void sr119(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk119();}

	void ch120() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk120();}
	void sk120(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp120();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq120();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw120();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se120();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr120();
		} else {
			champName();}}
	void sp120(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk120();}
	void sq120(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk120();}	
	void sw120(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk120();}
	void se120(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk120();}
	void sr120(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk120();}
	
	void ch121() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk121();}
	void sk121(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp121();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq121();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw121();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se121();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr121();
		} else {
			champName();}}
	void sp121(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk121();}
	void sq121(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk121();}	
	void sw121(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk121();}
	void se121(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk121();}
	void sr121(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk121();}	

	void ch122() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk122();}
	void sk122(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp122();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq122();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw122();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se122();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr122();
		} else {
			champName();}}
	void sp122(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk122();}
	void sq122(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk122();}	
	void sw122(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk122();}
	void se122(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk122();}
	void sr122(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk122();}
	
	void ch123() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk123();}
	void sk123(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp123();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq123();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw123();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se123();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr123();
		} else {
			champName();}}
	void sp123(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk123();}
	void sq123(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk123();}	
	void sw123(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk123();}
	void se123(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk123();}
	void sr123(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk123();}
	
	void ch124() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk124();}
	void sk124(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp124();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq124();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw124();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se124();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr124();
		} else {
			champName();}}
	void sp124(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk124();}
	void sq124(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk124();}	
	void sw124(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk124();}
	void se124(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk124();}
	void sr124(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk124();}
	
	void ch125() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk125();}
	void sk125(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp125();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq125();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw125();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se125();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr125();
		} else {
			champName();}}
	void sp125(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk125();}
	void sq125(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk125();}	
	void sw125(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk125();}
	void se125(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk125();}
	void sr125(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk125();}
	
	void ch126() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk126();}
	void sk126(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp126();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq126();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw126();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se126();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr126();
		} else {
			champName();}}
	void sp126(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk126();}
	void sq126(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk126();}	
	void sw126(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk126();}
	void se126(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk126();}
	void sr126(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk126();}
	
	void ch127() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk127();}
	void sk127(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp127();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq127();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw127();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se127();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr127();
		} else {
			champName();}}
	void sp127(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk127();}
	void sq127(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk127();}	
	void sw127(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk127();}
	void se127(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk127();}
	void sr127(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk127();}
	
	void ch128() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk128();}
	void sk128(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp128();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq128();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw128();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se128();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr128();
		} else {
			champName();}}
	void sp128(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk128();}
	void sq128(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk128();}	
	void sw128(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk128();}
	void se128(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk128();}
	void sr128(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk128();}
	
	void ch129() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk129();}
	void sk129(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp129();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq129();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw129();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se129();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr129();
		} else {
			champName();}}
	void sp129(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk129();}
	void sq129(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk129();}	
	void sw129(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk129();}
	void se129(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk129();}
	void sr129(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk129();}
	
	void ch130() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk130();}
	void sk130(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp130();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq130();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw130();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se130();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr130();
		} else {
			champName();}}
	void sp130(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk130();}
	void sq130(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk130();}	
	void sw130(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk130();}
	void se130(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk130();}
	void sr130(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk130();}	
	
	void ch131() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk131();}
	void sk131(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp131();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq131();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw131();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se131();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr131();
		} else {
			champName();}}
	void sp131(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk131();}
	void sq131(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk131();}	
	void sw131(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk131();}
	void se131(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk131();}
	void sr131(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk131();}
	
	void ch132() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk132();}
	void sk132(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp132();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq132();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw132();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se132();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr132();
		} else {
			champName();}}
	void sp132(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk132();}
	void sq132(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk132();}	
	void sw132(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk132();}
	void se132(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk132();}
	void sr132(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk132();}
	
	void ch133() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk133();}
	void sk133(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp133();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq133();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw133();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se133();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr133();
		} else {
			champName();}}
	void sp133(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk133();}
	void sq133(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk133();}	
	void sw133(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk133();}
	void se133(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk133();}
	void sr133(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk133();}
	
	void ch134() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk134();}
	void sk134(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp134();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq134();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw134();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se134();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr134();
		} else {
			champName();}}
	void sp134(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk134();}
	void sq134(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk134();}	
	void sw134(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk134();}
	void se134(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk134();}
	void sr134(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk134();}
	
	void ch135() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk135();}
	void sk135(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp135();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq135();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw135();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se135();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr135();
		} else {
			champName();}}
	void sp135(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk135();}
	void sq135(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk135();}	
	void sw135(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk135();}
	void se135(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk135();}
	void sr135(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk135();}
	
	void ch136() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk136();}
	void sk136(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp136();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq136();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw136();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se136();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr136();
		} else {
			champName();}}
	void sp136(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk136();}
	void sq136(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk136();}	
	void sw136(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk136();}
	void se136(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk136();}
	void sr136(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk136();}
	
	void ch137() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk137();}
	void sk137(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp137();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq137();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw137();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se137();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr137();
		} else {
			champName();}}
	void sp137(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk137();}
	void sq137(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk137();}	
	void sw137(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk137();}
	void se137(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk137();}
	void sr137(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk137();}
	
	void ch138() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk138();}
	void sk138(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp138();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq138();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw138();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se138();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr138();
		} else {
			champName();}}
	void sp138(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk138();}
	void sq138(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk138();}	
	void sw138(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk138();}
	void se138(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk138();}
	void sr138(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk138();}
	
	void ch139() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk139();}
	void sk139(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp139();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq139();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw139();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se139();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr139();
		} else {
			champName();}}
	void sp139(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk139();}
	void sq139(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk139();}	
	void sw139(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk139();}
	void se139(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk139();}
	void sr139(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk139();}
	
	void ch140() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk140();}
	void sk140(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp140();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq140();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw140();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se140();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr140();
		} else {
			champName();}}
	void sp140(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk140();}
	void sq140(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk140();}	
	void sw140(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk140();}
	void se140(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk140();}
	void sr140(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk140();}
	
	void ch141() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk141();}
	void sk141(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp141();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq141();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw141();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se141();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr141();
		} else {
			champName();}}
	void sp141(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk141();}
	void sq141(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk141();}	
	void sw141(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk141();}
	void se141(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk141();}
	void sr141(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk141();}
	
	void ch142() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk142();}
	void sk142(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp142();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq142();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw142();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se142();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr142();
		} else {
			champName();}}
	void sp142(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk142();}
	void sq142(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk142();}	
	void sw142(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk142();}
	void se142(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk142();}
	void sr142(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk142();}
	
	void ch143() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk143();}
	void sk143(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp143();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq143();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw143();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se143();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr143();
		} else {
			champName();}}
	void sp143(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk143();}
	void sq143(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk143();}	
	void sw143(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk143();}
	void se143(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk143();}
	void sr143(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk143();}
	
	void ch144() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk144();}
	void sk144(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp144();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq144();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw144();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se144();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr144();
		} else {
			champName();}}
	void sp144(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk144();}
	void sq144(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk144();}	
	void sw144(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk144();}
	void se144(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk144();}
	void sr144(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk144();}
	
	void ch145() {
		System.out.println("<<지옥의 불길도, 죽음의 심연도, 이 몸을 넘볼 수는 없다.>>");
		System.out.println("갱플랭크, 바다의 무법자");
		System.out.println("ch, the Saltwater Scourge");
		System.out.println("주 역할군 : 전사\t부 역할군 : 없음\t소속 : 빌지워터 ");
		System.out.println("출시일 : 2009년 8월 19일");
		System.out.println("(5.14 업데이트 전 갱플랭크 에 대한 내용은 1.1패치 버전에서 만나 보실 수 있습니다.)");
		sk145();}
	void sk145(){	
		System.out.println("<<검색할 스킬버튼을 입력하세요. 챔피언 검색으로 돌아가려면 스킬버튼 이외의 문자를 입력하세요.>>");
		String cc = s.nextLine();
		if(cc.equalsIgnoreCase("p") ||cc.equalsIgnoreCase("passive")||cc.equals("패시브")||cc.equals("ㅔ")) {
			sp145();
		} else if (cc.equalsIgnoreCase("q") || cc.equals("ㅂ")){ 
			sq145();
		} else if (cc.equalsIgnoreCase("w") || cc.equals("ㅈ")){
			sw145();	
		} else if (cc.equalsIgnoreCase("e") || cc.equals("ㄷ")){
			se145();
		} else if (cc.equalsIgnoreCase("r") || cc.equals("ㄱ")){
			sr145();
		} else {
			champName();}}
	void sp145(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk145();}
	void sq145(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk145();}	
	void sw145(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk145();}
	void se145(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk145();}
	void sr145(){
		System.out.println("패시브 - ");
		System.out.println("기본 지속 효과: 12초 동안 피해를 입지 않으면 마법 피해를 흡수하는 보호막을 얻습니다.");
		System.out.println();
		System.out.println("소모 마나 : 50\r\n사거리 : 275");
		System.out.println("쿨타임 : 16 / 15 / 14 / 13 / 12\r\n2/2.75/3.5/4.25/5초간 유지");
		System.out.println("보호막 : 최대 체력의 8 / 11 / 14 / 17 / 20%");
		System.out.println("마법 피해 감소 : 20 / 25 / 30 / 35 / 40 (+0.08 추가 마법 저항력) (+0.05 주문력)%");
		System.out.println("물리 피해 감소 : 10 / 12.5 / 15 / 17.5 / 20 (+0.04 추가 마법 저항력) (+0.025 주문력)%");
		System.out.println("피해 : 20 / 35 / 50 / 65 / 80 (+0.3 주문력) - 최소 피해\r\n\t60 / 105 / 150 / 195 / 240 (+0.9 주문력) - 최대 피해");
		System.out.println("도발 지속 시간 : 0.5 ~ 1.5 초");
		sk145();}
public static void main(String[] args) {
		
	new LOLChamp().champName();
		
	}
}
