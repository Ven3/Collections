package com.test;
//chown -R root: /usr/local/mysql
//        chown -R mysql: /usr/local/mysql/data/
/**
 * Created by Han on 2017/09/22.
 */
public class B {
//# ./bin/mysqld --user=mysql --basedir=/usr/local/mysql --datadir=/usr/local/mysql/data --initialize
///usr/local/mysql
//    qsrMl-f&1%F&
    public static void main(String[] args) {
        System.out.println(F(64));
    }
    public static int F(int i){
        byte[] bytes=new byte[4];
        bytes[0]=(byte)(i);
        bytes[1]= (byte) (i>>8);
        bytes[2]= (byte) (i>>16);
        bytes[3]= (byte) (i>>24);
        int mask=0xFF;
        i=bytes[3]&mask;
        i+=((bytes[2]&mask)<<8);
        i+=((bytes[1]&mask)<<16);
        i+=((bytes[0]&mask)<<24);

        return i;
    }
}
