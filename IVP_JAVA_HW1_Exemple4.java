package Homework.IVP_JAVA_HW_Lessone001;

public class IVP_JAVA_HW1_Exemple4 {
    
    public static int [] divArray(int[] array1, int [] array2) {

        if (array1 == null || array2 == null || array1.length < 1 || array2.length < 1){

            throw new RuntimeException("Размер массива или массивов меньше минимального. ");

        }

        if (array1.length != array2.length){

            throw new RuntimeException("Размеры массивов не равны друг другу");
        }

        int [] newArray = new int [array1.length];

        for (int i = 0; i < array1.length; i++) {

            if (array2[i]==0){

                throw new RuntimeException(" Деление на 0");

            }

            newArray[i] = array1[i] / array2[i];
            
        }

        return newArray;
        
    } 

}
