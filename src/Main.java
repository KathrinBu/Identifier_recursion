
/*
Разработать рекурсивную функцию, которая реализует синтаксический анализатор для понятия идентификатор.
Строка вводится пользователем.
идентификатор подчиняется следующим правилам:
- первым символом идентификатора обязательно есть буква латинского алфавита;
- второй, третий и т.д. символ идентификатора может быть буквой или цифрой.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите идентификатор:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(identic(s,0));
    }
    public static boolean identic(String string, int position){
     char c;
     if (position==0){
         c=string.toLowerCase(Locale.ROOT).charAt(position);
         if (c>='a' && c<='z'){
             return identic(string,position+1);
         }
         else {
             return false;
         }
     }
     else {
         if (position < string.length()){
             c=string.toLowerCase(Locale.ROOT).charAt(position);
             if ((c>='a' && c<='z') || (c>='0' && c<='9')){
                 return identic(string,position+1);
             }
             else {
                 return false;
             }
         }
         else {
             return true;
         }
     }
    }
}
