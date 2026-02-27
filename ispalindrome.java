import java.util.*;

class islapindrome {

    public static boolean isLapindrome(String s) {

        int n = s.length();
        int[] left = new int[26];
        int[] right = new int[26];

        // Fill left half
        for (int i = 0; i < n / 2; i++) {
            left[s.charAt(i) - 'a']++;
        }

        // Fill right half
        int start;
        if (n % 2 == 0) {
            start = n / 2;
        } else {
            start = n / 2 + 1; // skip middle character
        }

        for (int i = start; i < n; i++) {
            right[s.charAt(i) - 'a']++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 26; i++) {
            if (left[i] != right[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();
            if (isLapindrome(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
