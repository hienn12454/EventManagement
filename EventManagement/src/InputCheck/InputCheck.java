/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputCheck;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author TUF
 */
public class InputCheck {

    Scanner sc = new Scanner(System.in);
    public int nextId=1;
//    int a = Integer.parseInt(checkAttendes1());
//    int b = Integer.parseInt(checkAttendes2());

    public String checkName() {
        boolean key = true;
        String name = "unknow";
        Pattern pattern = Pattern.compile("^(?=.*\\S\\S\\S\\S\\S)[\\S ]+$");
        do {
            try {
                System.out.println("Nhập tên event");
                name = sc.nextLine();
                if (pattern.matcher(name).matches()) {
                    key = false;
                } else {
                    System.out.println("Không hợp lệ. Vui lòng nhập lại !");
                }

            } catch (Exception e) {

            }
        } while (key);
        return name;
    }

    public String checkDate() {
        String date = "unknow";
        boolean key = true;
        Pattern pattern = Pattern.compile("\\d{1,2}[-|\\/]\\d{1,2}[-|\\/]\\d{4}");
        do {
            try {
                System.out.println("Nhập ngày tổ chức event");
                date = sc.nextLine();
                if (pattern.matcher(date).matches()) {
                    key = false;
                } else {
                    System.out.println("không hợp lệ. Vui lòng nhập lại. ");
                }

            } catch (Exception e) {

            }
        } while (key);

        return date;
    }

    public String checkLocation() {
        String location = "unknow";
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9À-ỹ\\s]{5,}$");
        boolean key = true;
        do {
            try {
                System.out.println("Nhập địa chỉ event");
                location = sc.nextLine();
                if (pattern.matcher(location).matches()) {
                    key = false;
                } else {
                    System.out.println("Không hợp lệ. Vui lòng nhập lại !");
                }
            } catch (Exception e) {
            }
        } while (key);

        return location;
    }

    public String checkAttendes1() {
        boolean key = true;
        String atten1 = "unknow";
        Pattern pattern = Pattern.compile("^[1-9]\\d*$");
        do {
            try {
                System.out.println("Nhập số người đang có mặt tại event");
                atten1 = sc.nextLine();
                if (pattern.matcher(atten1).matches()) {
                    key = false;
                } else {
                    System.out.println("Không hợp lệ. Vui lòng nhập lại !");
                }
            } catch (Exception e) {
            }
        } while (key);
        return atten1;
    }

//    public String checkAttendes2() {
//        String atten2 = "unknow";
//        boolean key = true;
//        Pattern pattern = Pattern.compile("^[1-9]\\d*$");
//        do {
//            try {
//                System.out.println("Nhập số người đã đăng kí nhưng chưa có mặt");
//                atten2 = sc.nextLine();
//                if (pattern.matcher(atten2).matches()) {
//                    key = false;
//                } else {
//                    System.out.println("Không hợp lệ. Vui lòng nhập lại !");
//                }
//            } catch (Exception e) {
//            }
//        } while (key);
//        return atten2;
//    }
//
//    public void Attendes() {
//        System.out.println("Số người tham dự là: " + (a + b));
//    }

    public String checkStatus() {
        boolean key = true;
        String status = "unknow";
        Pattern pattern = Pattern.compile("^[yYnNtTfF]$");
        do {
            try {
                System.out.println("Nhập trạng thái của event (Available = Y; Unavailable = N )");
                status = sc.nextLine();
                if (pattern.matcher(status).matches()) {
                    key = false;
                } else {
                    System.out.println("Không hợp lệ. Vui lòng nhập lại !");
                } 
            } catch (Exception e) {
            }
        } while (key);
        return status;
    }
    public String uniqueId(){
        return "Event"+(nextId++);
    }
}
