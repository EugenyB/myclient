package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        try (Socket socket = new Socket("10.0.0.159", 1234)) {
            Scanner scanner = new Scanner(socket.getInputStream());
            String s = scanner.nextLine();
            System.out.println(s);
            System.out.println(scanner.nextLine());
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            Scanner in = new Scanner(System.in);
            out.println(in.nextLine());
            System.out.println(scanner.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
