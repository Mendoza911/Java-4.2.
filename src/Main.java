public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет индекса массы тела");
        BmiService service = new BmiService();
        int weight = 90;
        int height = (int) 1.83;
        int index = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен:" + " " + index);
    }
}