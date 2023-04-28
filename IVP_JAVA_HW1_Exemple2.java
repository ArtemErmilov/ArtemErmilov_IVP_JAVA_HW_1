package Homework.IVP_JAVA_HW_Lessone001;

/*
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */

public class IVP_JAVA_HW1_Exemple2 {

    public int [] arrayMethod1(int [] array1,int [] array2) { // Деление чисел первого массива на числа  второго массива, и запись полученных данных в новый массив. 

        if (array1 == null || array2 == null || array1.length < 1 || array2.length < 1){

            throw new RuntimeException("Размер массива или массивов меньше минимального. ");

        }
        
        if (array1.length==array2.length){

            throw new RuntimeException("Размеры массивов не равны друг другу");
        }


        int [] newArray = new int [array1.length];

        for (int i = 0; i < array1.length; i++) {

            if (array2[i]==0){

                throw new RuntimeException(" Деление на 0");
            }

            newArray [i] = array1[i]/array2 [i];
                        
        }

        return newArray;
        
    }


    public int [] arrayMethod2(int [] array1,int [] array2) { // Сумма числа i ячейки первого массива и числа i ячейки  второго массива. Полученные данные записываются в новый массив. 

        if (array1 == null || array2 == null || array1.length < 1 || array2.length < 1){

            throw new RuntimeException("Размер массива или массивов меньше минимального. ");

        }

        if (array1.length==array2.length){

            throw new RuntimeException("Размеры массивов не равны друг другу");
        }


        int [] newArray = new int [array1.length];

        for (int i = 0; i < array1.length; i++) {

            if (array1[i]==null || array2[i]==null){

                throw new RuntimeException("В массиве присутствуют пустые ячейки");
            }
            
            newArray [i] = array1[i]+array2 [i];
                        
        }

        return newArray;
        
    }

    public int [] arrayMethod3(int [] array1,int [] array2) { // Произведение числа i ячейки первого массива и числа i ячейки  второго массива. Полученные данные записываются в новый массив. 


        if (array1 == null || array2 == null || array1.length < 1 || array2.length < 1){

            throw new RuntimeException("Размер массива или массивов меньше минимального. ");

        }

        if (array1.length==array2.length){

            throw new RuntimeException("Размеры массивов не равны друг другу");
        }
        

        int [] newArray = new int [array1.length];

        for (int i = 0; i < array1.length; i++) {

            if (array1[i]==null || array2[i]==null){

                throw new RuntimeException("В массиве присутствуют пустые ячейки");
            }
            
            (int)(array1[i]);

            newArray [i] = array1[i]*array2 [i];
                        
        }

        return newArray;
        
    }
    
}
