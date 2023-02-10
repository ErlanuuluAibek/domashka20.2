import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String week= scanner.nextLine();
        switch (week){
            case "Дуйшомбу"-> System.out.println(Week.MONDAY);
            case "Шейшемби"-> System.out.println(Week.TUESDAY);
            case "Шаршемби"-> System.out.println(Week.WEDNESDAY);
            case "Бейшемби"-> System.out.println(Week.THURSDAY);
            case "Жума"-> System.out.println(Week.FRIDAY);
            case "Ишемби "-> System.out.println(Week.SATURDAY);
            case "Жекшемби "-> System.out.println(Week.SUNDAY);
        }
    }
}