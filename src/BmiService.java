public class BmiService {
    public int calculate(int weight, int height) {
        int index = weight / (height * height);
        return (int) index;
    }
}

