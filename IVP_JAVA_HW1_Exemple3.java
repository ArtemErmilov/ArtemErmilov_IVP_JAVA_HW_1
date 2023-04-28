package Homework.IVP_JAVA_HW_Lessone001;

/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива, и возвращающий новый массив, каждый элемент которого равен
разности элементов двух входящих массивов в той же ячейке. Если длины
массивов не равны, необходимо как-то оповестить пользователя.
 */

public class IVP_JAVA_HW1_Exemple3 {

    public static int [] diffArray(int[] array1, int [] array2) {

        if (array1 == null || array2 == null || array1.length < 1 || array2.length < 1){

            throw new RuntimeException("Размер массива или массивов меньше минимального. ");

        }
        
        if (array1.length != array2.length){

            throw new RuntimeException("Размеры массивов не равны друг другу");
        }

        int [] newArray = new int [array1.length];

        for (int i = 0; i < array1.length; i++) {

            newArray[i] = array1[i] - array2[i];
            
        }

        return newArray;
        
    }

    
    
}
