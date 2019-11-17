package Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numbers,which you want to call:");
        List<String> nums=new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        System.out.println("Enter sites, which you want to browse:");
        List<String> sites=new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        Smartphone smartphone=new Smartphone(nums,sites);
        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());
    }
}
