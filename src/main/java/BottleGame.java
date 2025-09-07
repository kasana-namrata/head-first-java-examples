public class BottleGame {
    public static void main(String[] args) {
        int bottleCount = 10;
        while (bottleCount > 0) {
            String unit = (bottleCount == 1) ? "bottle" : "bottles";
            String verb = (bottleCount == 1) ? "is" : "are";
            System.out.printf("%d green %s %s hanging on the wall %n", bottleCount, unit, verb);
            System.out.printf("1 green %s has accidentally fall %n",  unit, verb);
            bottleCount-=1;
        }
        System.out.print("0 green bottle is hanging on the wall");
    }
}
