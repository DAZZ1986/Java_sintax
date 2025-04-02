package main.Exeptions;

// Класс, содержащий метод, который выбрасывает исключение
public class ExceptionExample {

    //1 пример с gpt
    // Метод, который может выбрасывать CustomException
    public void riskyMethod() throws CustomException {
        // Логика метода
        boolean someErrorCondition = true; // Пример условия, которое может вызвать исключение

        if (someErrorCondition) {
            throw new CustomException("Произошла ошибка в riskyMethod!");
        }
    }

    // Метод, который вызывает riskyMethod и обрабатывает исключение
    public void execute() {
        //вариант 1 - обработать исключение из метода deepMethod() в блоке try catch
        try {
            riskyMethod();
        } catch (CustomException e) {
            System.out.println("Обработано исключение: " + e.getMessage());
        }
    }


    //2 пример с собеса
    public void deepMethod() throws Exception{
        throw new Exception("deepMethod");
    }

    public void exMethod() throws Exception {
        //вариант 2 - обработать исключение из метода deepMethod() в сигнатуре
        deepMethod();
    }

}
