import java.util.ArrayList;
import java.util.Collections;

public class DecToBinaryConverter extends Converter {

    ArrayList<Integer> bits = new ArrayList<>();

    int index = 0;

    public void convert(int quotient) {
        do {
            switch (quotient % 2) {
                case 0 -> {
                    bits.add(index, 0);
                    index++;
                }
                case 1 -> {
                    bits.add(index, 1);
                    index++;
                }
                default -> throw new IllegalStateException("Unexpected value: " + quotient % 2);
            }
            quotient /= 2;
        } while (quotient > 0);

        Collections.reverse(bits);

        for (Integer bit : bits) {
            System.out.print(bit + " ");
        }
    }
}
