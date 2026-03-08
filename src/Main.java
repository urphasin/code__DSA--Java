void main() {
    //noinspection unused
    int[] rnos = new int[5];

    //noinspection unused
    int[] rnos2 = {1, 2, 3, 4, 5};

    pattern1(6);
    pattern2(5);

}

static void pattern1(@SuppressWarnings("SameParameterValue") int n) {
    System.out.println("pattern 1");
    for(int row = 1; row <= n; ++row) {
        for (int col = 1; col <= row; ++col) {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

@SuppressWarnings("SameParameterValue")
static void pattern2(int n) {
    System.out.println("pattern 2");
    for(int row = 1; row <= n; ++row) {
        for(int col = 1; col <= 5; ++col) {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}
