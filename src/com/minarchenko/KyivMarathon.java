package com.minarchenko;

/**
 * Created by Nataliia on 08.10.2017.
 */

import java.io.*;
public class KyivMarathon {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("C:\\NATA\\Бег\\2017\\10\\Kyiv_half_marathon_08_10.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
      //  while((i=br.read())!=-1){
        for (int j = 0; j <10 ;j++)
        {
            String n=br.readLine();
            System.out.println(n);
        }
        br.close();
        fr.close();
    }
}
  /*  public static void main(String[] args) {
        String thisLine = null;
       // try(FileReader reader = new FileReader("C:\\NATA\\Бег\\2017\\10\\Kyiv_half_marathon_08_10.txt"))
        //{
            try {
                // open input stream test.txt for reading purpose.
                FileReader fr=new FileReader("D:\\testout.txt");
                BufferedReader br =
                        new BufferedReader(fr);
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
            // читаем посимвольно
           /* int c;
            while((c=reader.read())!=-1)
            for (int i = 0; i <100 ; i++)
            {
               c=reader.read();
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage()); */


