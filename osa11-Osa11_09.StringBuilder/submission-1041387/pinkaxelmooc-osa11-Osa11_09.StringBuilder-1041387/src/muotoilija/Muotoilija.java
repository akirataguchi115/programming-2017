package muotoilija;

public class Muotoilija {

    public String muotoile(int[] t) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (int i = 0; i < t.length; i++) {
            if (i % 4 == 0) {
                builder.append("\n");
            }
            if (i == t.length - 1) {
                builder.append(" " + t[i]);
            } else {
                builder.append(" " + t[i] + ",");
            }
        }
        builder.append("\n}");
        return builder.toString();
    }

}
