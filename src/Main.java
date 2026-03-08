void main() {
    int[] rnos = new int[5];

    int[] rnos2 = {1, 2, 3, 4, 5};

    pattern1(5);
}

static void pattern1(int n) {
    for(int row = 1; row <= n; ++row) {
        for (int col = 1; col <= row; ++col) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
