package e_oop;

import java.util.Scanner;

public class LOLChamp {
	
	String champName[] = {"가렌","갈리오","갱플랭크",	"그레이브즈",
			"나르","나미","나서스","노틸러스","녹턴","누누와 윌럼프","니달리","니코",
			"다리우스","다이애나","드레이븐",
			"라이즈","라칸","람머스","럭스","럼블","레넥톤","레오나","렉사이","렝가","루시안","룰루","르블랑","리 신","리븐","리산드라",
			"마스터 이","마오카이","말자하","말파이트","모데카이저","모르가나","문도 박사","미스 포츈",
			"바드","바루스","바이", "베이가","베인","벨코즈","볼리베어","브라움","브랜드","블라디미르","블리츠크랭크","빅토르","뽀삐",
			"사이온","사일러스","샤코","세나","세주아니","소나","소라카","쉔","쉬바나","스웨인","스카너","시비르","신 짜오","신드라","신지드","쓰레쉬",
			"아리","아무무","아우렐리온 솔","아이번","아지르","아칼리","아트록스","아펠리오스","알리스타","애니","애니비아","애쉬","야스오","에코","엘리스",
			"오공","오른","오리아나","올라프","요릭","우디르","우르곳","워윅","유미","이렐리아","이블린","이즈리얼","일라오이","자르반 4세",
			"자야","자이라","자크","잔나","잭스","제드","제라스","제이스","조이","직스","진","질리언","징크스",
			"초가스","카르마","카밀","카사딘","카서스","카시오페아","카이사","카직스","카타리나","칼리스타","케넨","케이틀린","케인","케일",
			"코그모","코르키","퀸","클레드","키아나","킨드레드",
			"타릭","탈론","탈리야","탐 켄치","트런들","트리스타나","트린다미어","트위스티드 페이트","트위치","티모",
			"파이크","판테온","피들스틱","피오라","피즈","하이머딩거","헤카림"};
	
	
	Scanner s = new Scanner(System.in);
	
	void champName(){
		
		System.out.println("챔피언 이름을 검색해주세요.");
		String cc = s.nextLine();
		
	if(cc.equals(champName[0])){
		int s=champName[0].indexOf(champName[0]);
		
		
		}
	}
	
	void champ0(int s){
		switch (s) {
		case 0:
			garen();
			break;
			}
	}

	void garen() {
		System.out.println("가렌,\t데마시아의 힘");
		System.out.println("Garne,\tThe Might of Demacia");
		System.out.println("주 역할군 : 전사\t부 역할군 : 탱커\t소속 : 데마시아 ");
		System.out.println("출시일 : 2010년 4월 27일");
		skill0();
	}	
	
	void skill0(){	
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
		} else {
			champName();
		}
	}
		
	void sp0(){	
			System.out.println("패시브 : 인내심(Perseverance)");
			System.out.println("가렌은 7초 동안 피해를 입거나 적의 스킬에 맞지 않으면 5초당 최대 체력의 일정 비율만큼 회복합니다.");
			System.out.println("미니언과 에픽 몬스터를 제외한 몬스터는 인내심에 영향을 주지 않습니다.");
			System.out.println("Cool Time : 7\t5초당 최대 체력의 1.5 ~10.8%");
			skill0();
		
		}
	
	void sq0(){	
		System.out.println("Q : 결정타(Decisive Strike");
		System.out.println("가렌에게 적용된 모든 둔화 효과가 풀리며 일정 시간 이동 속도가 30% 상승합니다.");
		System.out.println("4.5초 안에 하는 다음 기본 공격은 추가 물리 피해를 입히고 대상을 1.5초 동안 침묵시킵니다.");
		System.out.println("Cool Time : 8 / 1.5/2.0/2.5/3.0/3.5 초 동안 이동속도 증가\t30/60/90/120/150 (+1.4 총 공격력) - 총 피해량");
		skill0();
	}
	
	void sw0(){
		System.out.println("W : 용기(Courage)");
		System.out.println("기본 지속 효과 : 유닛들을 처치하면 영구적으로 0.25의 방어력과 마법 저항력이 부여되어 최대 30까지 증가합니다.");
		System.out.println("사용 시 : 가렌이 일정 시간동안 용기백배하여 받는 피해가 30% 감소합니다. 첫 0.75초 동안은 최대 체력의 10%에 해당하는 피해를 흡수하는 보호막과 60%의 강인함을 얻습니다.");
		System.out.println("Cool Time : 24/23/22/21/20\t2/2.75/3.5/4.25/5초간 유지");
		skill0();
	}
	
	void se0(){
		System.out.println("E : 심판(Judgment)");
		System.out.println("가렌이 3초 동안 검을 들고 빠르게 회전하여 지속 시간 동안 근처 적에게 물리 피해를 입힙니다. 가장 가까운 적에게는 피해량이 25% 증가합니다. (공격 횟수는 아이템과 레벨의 공격 속도에 비례합니다.)");
		System.out.println("회전에 6번 맞은 적 챔피언은 6초 동안 방어력이 25% 감소합니다. (6번 이후의 추가 공격은 적중시마다 효과 지속 시간을 초기화합니다.");
		System.out.println("스킬을 빨리 취소하면 남은 스킬 지속시간만큼 재사용 대기시간이 감소합니다.");
		System.out.println("사정거리 : 325");
		System.out.println("Cool Time : 9\t4/8/12/16/20(++레벨에 따라 0 ~ 8) (+ 0.32 / 0.34 / 0.36 / 0.38 / 0.40 총 공격력) × (기본 7회 + 아이템 및 레벨 업으로 얻는 공격 속도 20%마다 1회)");
		skill0();
	}
	void sr0(){
		System.out.println("R : 데마시아의 정의(Demacian Justice)");
		System.out.println("가렌이 적 챔피언을 처단할 데마시아의 힘을 소환하여 고정 피해를 입히고 대상이 잃은 체력에 비례한 피해를 추가로 입힙니다.");
		System.out.println("사용한 대상을 1초 동안 볼 수 있으며, 대상이 시야에서 사라져도 스킬이 취소되지 않습니다.");
		System.out.println("사정거리 : 400");
		System.out.println("Cool Time : 120/100/80\t고정 피해량: 150 / 300 / 450 (+ 잃은 체력의 20% / 25% / 30%)");
		skill0();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
public static void main(String[] args) {
		
	new LOLChamp().champName();
		
	}
}
