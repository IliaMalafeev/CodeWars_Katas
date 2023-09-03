package CodeWarsKatas5KYU;

public class K07_WeightForWeight {
    public static void main(String[] args) {
        System.out.println(order("56  65 74 100 99 68 86  180 90")); // "100 180 90 56 65 74 68 86 99"
        System.out.println(order("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

    public static String order(String str) {
        str = str.replaceAll(" +", " ");
        String[] arr = str.split(" ");
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int sumJ = 0, sumNextJ = 0;
                for (char y : arr[j].toCharArray()) sumJ += Integer.parseInt(String.valueOf(y));
                for (char z : arr[j + 1].toCharArray()) sumNextJ += Integer.parseInt(String.valueOf(z));
                if (sumJ > sumNextJ) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else if (sumJ == sumNextJ) {
                    for (int c = 0; c < Math.min(arr[j].length(), arr[j + 1].length()); c++) {
                        if (Math.min(arr[j].length(), arr[j + 1].length()) == 1 && Integer.parseInt(String.valueOf(arr[j].charAt(0))) == Integer.parseInt(String.valueOf(arr[j + 1].charAt(0)))){
                            if (arr[j].length() > arr[j + 1].length()) {
                                temp = arr[j + 1];
                                arr[j + 1] = arr[j];
                                arr[j] = temp;
                                break;
                            }
                        }
                        if (Integer.parseInt(String.valueOf(arr[j].charAt(c))) < Integer.parseInt(String.valueOf(arr[j + 1].charAt(c)))) {
                            break;
                        }
                        else if (Integer.parseInt(String.valueOf(arr[j].charAt(c))) > Integer.parseInt(String.valueOf(arr[j + 1].charAt(c)))){
                            temp = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                        else continue;
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (String a : arr) result.append(a + " ");
        return result.toString().trim();
    }
}
