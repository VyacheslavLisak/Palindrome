/**
 * Программа проверяет является ли строка палиндромом
 */
public class Palindrome {

    /**
     * Точка входа в программу. Для проверки строки состоящей из более чем 1 слова поместите строку в кавычки ""
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String target_string = args[i];
            if (isPalindrome(target_string)) {
                System.out.println("Строка <" + target_string + "> - палиндром");
            }
            else {
                System.out.println("Строка <" + target_string + "> не является палиндромом");
            }
        }
    }
    
    
    /**
     * Метод выставляет символы в строке в обратном порядке
     */
    public static String reverseString(String target_string) {
        String temp_string = "";
        for (int i = target_string.length() - 1; i >= 0; i--) {
            temp_string += target_string.charAt(i);
        }
        return temp_string;
    }
    
    
    /**
     * Метод проверяет является ли строка палиндромом
     */
     public static boolean isPalindrome(String target_string) {
        String temp_string = reverseString(target_string);
        return temp_string.equals(target_string);
     }
} 
