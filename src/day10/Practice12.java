package day10;

public class Practice12 {
    public static void main(String[] args) {

        // [1]
        Student s1 = new Student();
        s1.name = "메롱"; s1.studentID = 5;
        System.out.println( s1.name + ", " + s1.studentID );

        // [2]
        Cat cat = new Cat();
        cat.makeSound();

        // [3]
        Computer computer = new Computer();
        computer.Machine();

        // [4]
        /*[문제 4] 다형성: 자동 타입 변환 (Upcasting)
        1. Figure 클래스를 만드세요.
        2. Figure를 상속받는 Triangle 클래스를 만드세요.
        3. main 함수에서 Triangle 객체를 생성하여 
           Figure 타입의 변수에 저장하는 코드를 작성하고, 
           이것이 가능한 이유를 주석으로 설명하세요.*/
        // Figure f1 = new Figure();
        // Triangle t1 = new Triangle();
        Figure figure = new Triangle(); // Triangle(하위) --> figure(상위)
        Figure f2 = figure;
        // 자식인 Triangle을 부모 타입인 Figure에 저장

        // [5]
        Shape shape = new Circle();
        shape.draw();
        // => 원을 그립니다.
        // 하위 메소드가 재정의 실행

        // [6]

                
    }

}

// [1]
class Person{
    String name;
}
class Student extends Person{
    Integer studentID;
}
// [2] Overriding
class Animal{
    void makeSound(){ 
        System.out.println("동물이 소리를 냅니다.");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){ System.out.println("고양이가 야옹하고 웁니다.");}
}
// [3]
// 생성자 내부에는 super() 생략 시 자동으로 적용된다. 즉] super() 키워드는 부모 생성자 가리킴 *
class Machine{
    void Machine(){ System.out.println("부모 클래스 생성자 실행" );}
}
class Computer extends Machine{
    void Computer(){ System.out.println("자식 클래스 생성자 실행");}
    
}
// [4] 
class Figure{
    Figure(){ System.out.println("[1]Figure객체생성");}
}
class Triangle extends Figure{
    Triangle(){ System.out.println("[2]Triangle객체생성");}
} // Triangle 은 부모인 Figure에 상속
// [5] 주의할점 : 메소드 오버라이딩 할 경우 메소드 위에 @Override 생략시 자동 할당
class Shape{
    void draw(){ System.out.println("도형을 그립니다.");}
}
class Circle extends Shape{
    void draw(){ System.out.println("원을 그립니다.");}
}
// [6]



/*[문제 6] instanceof와 강제 타입 변환 (Downcasting)
1. Vehicle 클래스와 이를 상속받는 Bus 클래스를 만드세요. Bus 클래스에만 checkFare() 메소드("요금을 확인합니다.")를 추가하세요.
2. main 함수에서 Vehicle vehicle = new Bus(); 코드를 작성하세요.
3. if문과 instanceof 연산자를 사용하여 vehicle 변수가 Bus 타입인지 확인하세요.
4. 만약 Bus 타입이 맞다면, Bus 타입으로 강제 변환한 뒤 checkFare() 메소드를 호출하세요.*/

/*[문제 7] 다형성을 활용한 객체 배열
1. "음료를 마십니다."를 출력하는 drink() 메소드를 가진 Beverage 클래스를 만드세요.
2. Beverage를 상속받는 Coke와 Coffee 클래스를 만들고, 각 클래스에서 drink() 메소드를 오버라이딩하여 "콜라를 마십니다.", "커피를 마십니다."를 출력하도록 하세요.
3. main 함수에서 Beverage 타입의 배열을 생성하고, 그 안에 Coke 객체와 Coffee 객체를 저장하세요.
4. 반복문을 사용하여 배열의 모든 요소를 꺼내 drink() 메소드를 호출하고, 각기 다른 결과가 출력되는 것을 확인하세요.*/

/*[문제 8] 다형성을 활용한 매개변수
1. Weapon 클래스와 이를 상속받는 Sword, Gun 클래스를 만드세요. 각 클래스는 "무기로 공격합니다.", "검으로 공격합니다.", "총으로 공격합니다."를 출력하는 attack() 메소드를 가집니다. (오버라이딩 활용)
2. Weapon 타입의 매개변수를 받아 그 객체의 attack() 메소드를 호출하는 Character 클래스와 use(Weapon weapon) 메소드를 만드세요.
3. main 함수에서 Sword 객체와 Gun 객체를 생성한 뒤, 이 객체들을 Character의 use() 메소드에 인자로 전달하여 각기 다른 결과가 출력되는 것을 확인하세요.*/

/*[문제 9] 필드와 메소드의 오버라이딩 차이
1. String name = "상위"; 필드와 method() 메소드("상위 메소드" 출력)를 가진 SuperClass를 만드세요.
2. SuperClass를 상속받고, String name = "하위"; 필드와 method() 메소드("하위 메소드" 출력)를 가진 SubClass를 만드세요.
3. SuperClass obj = new SubClass(); 로 객체를 생성한 뒤, obj.name과 obj.method()를 각각 호출했을 때의 결과를 확인하고, 왜 다른 결과가 나오는지 주석으로 설명하세요.*/

/*[문제 10] 다중 상속 관계
1. Device 클래스를 만드세요.
2. Device를 상속받는 Electronic 클래스를 만드세요.
3. Electronic을 상속받는 Laptop 클래스를 만드세요.
4. main 함수에서 Laptop 객체를 생성한 뒤, 이 객체가 Electronic 타입과 Device 타입으로도 형 변환이 가능한지 instanceof 연산자로 확인하고 결과를 출력하세요.*/