package cn.lonecloud.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author lonecloud
 * @version v1.0
 * @date 下午11:27 2018/5/3
 */
public class MainTest {
    public static void main(String[] args) throws FileNotFoundException {
        tellerLogin();
    }

    //Method for teller/shop assistant login
    public static void tellerLogin() throws FileNotFoundException {
        //loading and reading the text file containing the login credentials
        //may be you can't catch file path
        //using a absolutePath to a file
        String path = "1.txt";
        URL resource = MainTest.class.getClassLoader().getResource(path);
        if (resource == null) {
            throw new NullPointerException("not found a resource file");
        }
        File file = new File(resource.getFile());
        Scanner scan = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine();
        //String variables to hold the data retrieved from the text file
        String inpUser = keyboard.nextLine();
        String inPass = keyboard.nextLine();

        //Verifying the user input against the text file contents for verification
        if (inpUser.equals(user) && inPass.equals(pass)) {
            System.out.println(" Logged in as Admin");
            tellerMenu();

        } else {
            System.out.println("Incorrect credentials");
        }
    }

    private static void tellerMenu() {
        System.out.println("you menu");
    }
}
