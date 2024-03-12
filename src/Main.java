public class Main {
    public static void main(String[] args) {
       int[] a = new int[3];
       a[0] = 1;
       a[1] = 2;
       a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
        System.out.println();
       float[] b = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.print(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
            }
        System.out.println();
       float[] c = {2.875f, 4, 5.658f, 2.3f, 9};
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.print(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }
        System.out.println();
        int i = a.length - 1;
        for (; i >= 0; i--) {
            if (i == 0) {
                System.out.print(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        i = b.length - 1;
        for (; i >= 0; i--) {
            if (i == 0) {
                System.out.print(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }
        System.out.println();
        i = c.length - 1;
        for (; i >= 0; i--) {
            if (i == 0) {
                System.out.print(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }
        System.out.println();

        for (int i1 = 0; i1 < a.length; i1++) {
          if (a[i1] % 2 != 0) {
              a[i1] = a[i1] + 1;
          }
            System.out.print(a[i1] + " ");
        }
    }
}