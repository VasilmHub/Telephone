package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.urls.size(); i++) {
            boolean temp = true;
            for (int j = 0; j < this.urls.get(i).length(); j++) {
                if (Character.isDigit(urls.get(i).charAt(j))) {
                    temp = false;
                }
                if (!temp) {
                    break;
                }
            }
            if (temp) {
                sb.append("Browsing: ").append(urls.get(i)).append("!");
            } else {
                sb.append("Invalid URL!");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();

    }

    @Override
    public String call() {
        return getCallings();
    }

    private String getCallings() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.numbers.size(); i++) {
            boolean temp = true;
            for (int j = 0; j < this.numbers.get(i).length(); j++) {
                if (!Character.isDigit(numbers.get(i).charAt(j))) {
                    temp = false;
                }
                if (!temp) {
                    break;
                }
            }
            if (temp) {
                sb.append("Calling... ").append(numbers.get(i));
            } else {
                sb.append("Invalid number!");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
