package main.Exeptions;

// �����, ���������� �����, ������� ����������� ����������
public class ExceptionExample {

    //1 ������ � gpt
    // �����, ������� ����� ����������� CustomException
    public void riskyMethod() throws CustomException {
        // ������ ������
        boolean someErrorCondition = true; // ������ �������, ������� ����� ������� ����������

        if (someErrorCondition) {
            throw new CustomException("��������� ������ � riskyMethod!");
        }
    }

    // �����, ������� �������� riskyMethod � ������������ ����������
    public void execute() {
        //������� 1 - ���������� ���������� �� ������ deepMethod() � ����� try catch
        try {
            riskyMethod();
        } catch (CustomException e) {
            System.out.println("���������� ����������: " + e.getMessage());
        }
    }


    //2 ������ � ������
    public void deepMethod() throws Exception{
        throw new Exception("deepMethod");
    }

    public void exMethod() throws Exception {
        //������� 2 - ���������� ���������� �� ������ deepMethod() � ���������
        deepMethod();
    }

}
