void main() {
    //noinspection unused
    int[] rnos = new int[5];

    //noinspection unused
    int[] rnos2 = {1, 2, 3, 4, 5};

    pattern1(5);
    pattern2(5);
    pattern3(5); 

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

@SuppressWarnings("SameParameterValue")
static void pattern3(int n) {
    System.out.println("Patter 3");
    for(int row = 1; row <= n; row++) {
        for (int col = 1; col <= 14-row+1; col++) { // since row starts from 1 20-1 is 19 so we compensate like we are starting from row = 0
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}
