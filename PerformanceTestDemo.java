package String_Functions;


public class PerformanceTestDemo {

    public static void main(String[] args) {

        int n = 10000;

        // StringBuffer Performance Test
        System.out.println("=== StringBuffer Performance Test ===");
        long startBuffer = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("AIET");
        }

        long endBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endBuffer - startBuffer) + " ms");


        // StringBuilder Performance Test
        System.out.println("\n=== StringBuilder Performance Test ===");
        long startBuilder = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("AIET");
        }

        long endBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endBuilder - startBuilder) + " ms");
    }
}