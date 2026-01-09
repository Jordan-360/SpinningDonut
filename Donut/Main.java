public class Main {
    public static void main(String[] args) throws InterruptedException {

        double A = 0, B = 0;
        int width = 80, height = 22;

        double[] z = new double[width * height];
        char[] b = new char[width * height];

        while (true) {
            java.util.Arrays.fill(b, ' ');
            java.util.Arrays.fill(z, 0);

            for (double j = 0; j < 6.28; j += 0.07) {      // theta
                for (double i = 0; i < 6.28; i += 0.02) {  // phi

                    double sinA = Math.sin(A), cosA = Math.cos(A);
                    double sinB = Math.sin(B), cosB = Math.cos(B);

                    double sini = Math.sin(i), cosi = Math.cos(i);
                    double sinj = Math.sin(j), cosj = Math.cos(j);

                    double h = cosj + 2;
                    double D = 1 / (sini * h * sinA + sinj * cosA + 5);

                    double t = sini * h * cosA - sinj * sinA;

                    int x = (int)(width / 2 + 30 * D * (cosi * h * cosB - t * sinB));
                    int y = (int)(height / 2 + 15 * D * (cosi * h * sinB + t * cosB));
                    int o = x + width * y;

                    int N = (int)(8 * (
                            (sinj * sinA - sini * cosj * cosA) * cosB
                                    - sini * cosj * sinA
                                    - sinj * cosA
                                    - cosi * cosj * sinB
                    ));

                    if (y >= 0 && y < height && x >= 0 && x < width && D > z[o]) {
                        z[o] = D;
                        b[o] = ".,-~:;=!*#$@".charAt(Math.max(0, N));
                    }
                }
            }

            System.out.print("\033[H"); // ANSI cursor home
            for (int k = 0; k < b.length; k++) {
                System.out.print(k % width == 0 ? "\n" : b[k]);
            }

            A += 0.04;
            B += 0.02;
            Thread.sleep(30);
        }
    }
}
