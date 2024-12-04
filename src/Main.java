import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        LinkedHashSet<String> colorsOne = new LinkedHashSet<>();
        LinkedHashSet<String> colorsTwo = new LinkedHashSet<>();


        colorsOne.add("Red");
        colorsOne.add("Blue");
        colorsOne.add("Green");
        colorsOne.add("White");

        colorsTwo.add("White");
        colorsTwo.add("Violet");
        colorsTwo.add("Green");
        colorsTwo.add("Grey");


        System.out.println(unitedColors(colorsOne, colorsTwo));


    }

    public static LinkedHashSet<String> unitedColors(LinkedHashSet<String> colorsOne, LinkedHashSet<String> colorsTwo){
        LinkedHashSet<String> unitedColorsSet;
        colorsOne.retainAll(colorsTwo);
        unitedColorsSet = colorsOne;
        return unitedColorsSet;
    }
}