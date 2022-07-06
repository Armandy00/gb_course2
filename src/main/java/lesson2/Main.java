package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] myArr = {
                {"1", "2", "3", "7"},
                {"4", "2", "3", "6"},
                {"5", "1", "8", "6"},
                {"3", "4", "1", "1"}
        };
        try {
            System.out.println(calculate(myArr));
        } catch (MyException e) {
            System.out.println("Ошибка");
        }
    }

    public static int calculate(String[][] data) {
        if (data.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (data[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(data[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyDataException();
                }
            }
        }
        return sum;
    }
}
