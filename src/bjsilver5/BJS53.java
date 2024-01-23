package bjsilver5;
import java.util.*;

public class BJS53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        String[] TextA = new String[T];
            for (int i = 0; i < T; i++) {
                TextA[i] = scanner.next();
            }
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(TextA));
        String[] noDupTextA = hashSet.toArray(new String[0]);

        Arrays.sort(noDupTextA, Comparator.comparingInt(String :: length));
        for(int i = 0;i< noDupTextA.length - 1;i++){
            int len = noDupTextA[i].length();
            int nextLen = noDupTextA[i + 1].length();
        }
        for(int i = 0;i< noDupTextA.length;i++){
            System.out.println(noDupTextA[i]);
        }
    }
}

