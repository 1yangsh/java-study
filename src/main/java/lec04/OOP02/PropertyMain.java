package lec04.OOP02;

public class PropertyMain {
    public static void main(String[] args) {

        PropertyOfClass propertyOfClass = new PropertyOfClass();
        PropertyOfClass propertyOfClassName = new PropertyOfClass("커피");
        PropertyOfClass propertyOfClassNamePrice = new PropertyOfClass("바나나", "1500");
        propertyOfClassNamePrice.enumDataType = PropertyOfClass.EnumDataType.INSERT;

        System.out.println();
        System.out.println(propertyOfClass.toString());
        System.out.println(propertyOfClassNamePrice.toString());
        System.out.println(propertyOfClassNamePrice.toString());

        System.out.println();

        String[] innerClassPropertiesName = PropertyOfClass.InnerClassInfo.innerClassPropertiesName;
        for (String strVar : innerClassPropertiesName) {
            System.out.println("strVar : " + strVar);
        }
        System.out.println();

        int[] innerClassPropertiesPrice = PropertyOfClass.InnerClassInfo.innerClassPropertiesPrice;
        for (int intVar : innerClassPropertiesPrice) {
            System.out.println("intVar : " + intVar);
        }
    }
}
