/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
package Convert;
 
public class Converter
{
   
   static String asciiToHex(String InputString)
   {
      char[] chars = InputString.toCharArray();
      StringBuffer hex = new StringBuffer();
      for (int i = 0; i < chars.length; i++)
      {
         hex.append(Integer.toHexString((int) chars[i]));
      }
      return hex.toString();
   }
 
   static String hexToASCII(String HEXString)
   {
      StringBuilder output = new StringBuilder("");
      for (int i = 0; i < HEXString.length(); i += 2)
      {
         String str = HEXString.substring(i, i + 2);
         output.append((char) Integer.parseInt(str, 16));
      }
      return output.toString();
   }
}
