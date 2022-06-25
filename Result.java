class Result {
    public static void decentNumber(int n) {
        String number = String.valueOf(n);
        if (!isLargestNumberOfItsLength(number)) System.out.println("-1");
    }

    private static boolean isProperty1Working(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '3' && n.charAt(i) != '5') return false;
        }
        return true;
    }

    private static boolean isProperty2Working(String number) {
        long sumOf3 = 0;
        for (int i = 0; i < number.length(); i++) if (number.charAt(i) == '3') sumOf3++;
        if (sumOf3 % 5 == 0) return true;
        else return false;
    }

    private static boolean isProperty3Working(String number) {
        long sumOf5 = 0;
        for (int i = 0; i < number.length(); i++) if (number.charAt(i) == '5') sumOf5++;
        if (sumOf5 % 3 == 0) return true;
        else return false;
    }

    private static boolean isLargestNumberOfItsLength(String number) {
        if (number.equals("1")) return false;
        int nums = Integer.parseInt(number);
        for (int i = 0; i <= nums; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < nums - i; j++) sb.append("5");
            for (int j = 0; j < i; j++) sb.append("3");
            String str = sb.toString();
            if (good35Number(str)) {
                System.out.println(str);
                return true;
            }
        }
        return false;
    }

    private static boolean good35Number(String number) {
        if (isProperty1Working(number) && isProperty2Working(number) && isProperty3Working(number)) return true;
        else return false;
    }
}

