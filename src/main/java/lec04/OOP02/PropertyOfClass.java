package lec04.OOP02;

public class PropertyOfClass {

    public static int entityCount; // 정적 전역 변수 (클래스 생성 시 메모리에 할당, 같은 클래스면 똑같은 값 공유)

    public String goodsNo; // 전역 변수, 인스턴스 변수 (객체마다 고유한 값)
    public String goodsName;
    public String goodsPrice;

    private String goodsNoVariable;

    public enum EnumDataType {
        INSERT, UPDATE, DELETE, NORMAL
    }

    public EnumDataType enumDataType = EnumDataType.NORMAL;

    static {
        System.out.println("Goods :: 정적 초기화 실행");
        System.out.println("Goods entity count: " + entityCount);
        System.out.println("정적 초기화가 여러번 실행될까요?");
    }

    {
        System.out.println("초기화 블럭을 실행합니다.");
        entityCount++;

        goodsNo = "goods"  + entityCount;

        System.out.println("상품번호 : " + goodsNo);
    }

    public PropertyOfClass() {
        System.out.println("기본 생성자 함수를 실행합니다.");
    }

    public PropertyOfClass(String goodsName) {
        this.goodsName = goodsName;
    }

    public PropertyOfClass(String goodsName, String goodsPrice) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }

    @Override
    public String toString() {
        return "PropertyOfClass [goodsNo = " + goodsNo + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
    }

    public static class InnerClassInfo {
        public static String[] innerClassPropertiesName = new String[] {"상품번호", "상품명", "단가"};
        public static int[] innerClassPropertiesPrice = new int[] {100, 1000, 2500, 3500};
    }


}
