import java.util.ArrayList;
import java.util.Collections;

public class DecToBinaryConverter extends Converter {

    ArrayList<Integer> bits = new ArrayList<>();

    int index = 0;

    public void convert(int quotient) {
        do {
            if (quotient % 2 == 0) {
                this.bits.add(index, 0);
            } else {
                this.bits.add(index, 1);
            }
            index++;
            quotient /= 2;
        } while (quotient > 0);

        Collections.reverse(this.bits);

        for (Integer bit : this.bits) {
            System.out.print(bit + " ");
        }
    }
}