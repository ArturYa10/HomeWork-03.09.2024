import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isEdekaOpen = true; // Здесь можно изменить значение на false, если магазин закрыт
        boolean isReweOpen = false; // Здесь можно изменить значение на false, если магазин закрыт

        boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);
    }

    public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen; // Возвращает true, если хотя бы один магазин открыт
    }
}
