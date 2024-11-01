package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
    public static void main(String[] args) {
        //java.net.*  InetAddress 도메인 <->아이피
        try {
            InetAddress inetAddress = InetAddress.getByName("www.daum.net");
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());

            System.out.println();

            InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
            for(InetAddress inetAddress1 : inetAddresses){
                System.out.println(inetAddress1.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }

    }
}
