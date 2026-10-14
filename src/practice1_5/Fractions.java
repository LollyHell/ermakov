package practice1_5;
//1.5.5. Дроби. Создайте сущность Дробь со следующими особенностями:
//•	Имеет числитель: целое число
//•	Имеет знаменатель: целое число
//•	Дробь может быть создана с указанием числителя и знаменателя
//•	Может вернуть строковое представление вида “числитель/знаменатель”
//•	Может выполнять операции сложения, вычитания, умножения и деления с другой Дробью или целым числом. Результатом операции должна быть новая Дробь (таким образом, обе исходные дроби не изменяются)
//Затем необходимо выполнить следующие задачи:
//1.	Создать несколько экземпляров дробей.
//2.	Написать по одному примеру использования каждого метода.
//3.	Вывести на экран примеры и результаты их выполнения в формате «1/3 * 2/3 = 2/9»
//4.	Посчитать f1.sum(f2).div(f3).minus(5)
public final class Fractions {
    private  final int numerator;
    private  final int denominator;

    public Fractions(int numerator, int denominator) {
        if (denominator == 0){
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }
        if (denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fractions sum(Fractions otherFrac){
        int newNum = (this.numerator * otherFrac.getDenominator()) + (otherFrac.getNumerator() * this.denominator);
        int newDen = this.denominator * otherFrac.getDenominator();
        return new Fractions(newNum, newDen);
    }
    public Fractions sum(int num){
        return this.sum(new Fractions(num, 1));
    }
    public Fractions minus(Fractions otherFrac){
        int newNum = (this.numerator * otherFrac.getDenominator()) - (this.denominator * otherFrac.getNumerator());
        int newDen = this.denominator * otherFrac.getDenominator();
        return new Fractions(newNum, newDen);
    }
    public Fractions minus(int num){
        return this.minus(new Fractions(num, 1));
    }
    public Fractions multiplication(Fractions otherFrac){
        int newNum = this.numerator * otherFrac.getNumerator();
        int newDen = this.denominator * otherFrac.getDenominator();
        return new Fractions(newNum, newDen);
    }
    public Fractions multiplication(int num){
        return this.multiplication(new Fractions(num, 1));
    }
    public Fractions division(Fractions otherFrac){
        int newNum = this.numerator * otherFrac.getDenominator();
        int newDen = this.denominator * otherFrac.getNumerator();
        return new Fractions(newNum, newDen);
    }
    public Fractions division(int num){
        return this.division(new Fractions(num, 1));
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
//1.6.4 Дроби. Измените сущность Дробь из задачи 1.5.5. Реализуйте следующие требования:
//•	Дробь не может быть изменена после создания
//•	Необходимо корректно обрабатывать отрицательные значения. Учтите, что знаменатель не может быть отрицательным.
//Продемонстрируйте работоспособность решения на примерах.
//2.1.1 Запретная Дробь. Измените сущность Дробь, полученную в задаче 1.6.4.
// Гарантируйте, что невозможно создать такой подвид дроби, который позволял бы создавать Дроби с изменяемым состоянием.

//
//ПОЧЕМУ ФРАКШЕН НЕ НАМБЕР????
//ЗАПРЕТИТЬ ПОТОМКОВ КОТОРЫЕ ЧТО ТО МЕНЯЮТ
//
//
//        EXTANDS NUMBER базовый класс