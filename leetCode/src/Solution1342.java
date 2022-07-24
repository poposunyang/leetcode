class Solution1342 {
    public static int numberOfSteps(int num) {
        int ret = 0;
        int i = num;
        while (i != 0) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i - 1;
            }
            ret++;
        }
        return ret;
    }

    public static int numberOfStepsByte(int num) {
        String bString = Integer.toBinaryString(num);
        int ret = bString.length();
        String bStringRep = bString.replaceAll("1", "");
        ret = ret + ret - bStringRep.length() - 1;
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(9));
        System.out.println(numberOfStepsByte(14));
        System.out.println(numberOfStepsByte(9));
    }
}