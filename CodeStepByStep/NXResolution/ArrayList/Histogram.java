public class Histogram {
    public static void main(String[] args) {
        try {
            Scanner nin = new Scanner(System.in);
            System.out.print("File: ");
            String f = nin.nextLine();
            File file = new File(f);
            Scanner in = new Scanner(file);
            int[] ret = new int[11];
            while (in.hasNextInt()) {
                ret[in.nextInt()/10]++;
            }
            for (int i = 0; i < 11; i++) {
                if (i == 0) {
                    System.out.print("00-09: ");
                } else if (i == 10) {
                    System.out.print("  100: ");
                } else {
                    System.out.print(10*i + "-" + (10*(i+1)-1) + ": ");
                }
                for (int q = 0; q < ret[i]; q++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {

        }
    }
}
