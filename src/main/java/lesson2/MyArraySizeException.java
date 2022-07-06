package lesson2;

public class MyArraySizeException extends MyException
{
    public MyArraySizeException() {
        super("Размер массива не корректный");
    }
}
