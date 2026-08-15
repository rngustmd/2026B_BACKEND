package day11;

public class Practice13 {
    public static void main(String[] args) {
        // 다형성 : 하나의 변수가 여러 타입들의 하나의 자료 저장 * 변수는 하나의 자료 저장 *
        // 3(int)   byte a = 3 , short b = a , long = a < 다형성: 업캐스팅 >
        // 자동타입변환) IbaseDao ib = productDao , IbaseDao ib = boardDao , Object obj = productDto 
        // 강제타입변환) long = a 3L , int b (int)a , short c = (short)b < 다형성: 다운캐스팅 >
        // (ProductDto)obj
        Cat cat;
        Dog dog;
        cat = new Cat();
        dog = new Dog();
        cat.makeSound();
        dog.makeSound();
    
        // [2] 상수는 인스턴스가 필요없다. 상수(static)이며 static은 프로그램 시작 시 메모리 할당 프로그램 종료시킨다.
        // 클래스명.상수명 , 인터페이스명.상수명
        // 1. 첫글자가 대문자이면 인터페이스/클래스명 , 2. 첫글자 소문자이면 변수/멤버변수
        // MyCar -> 클래스/인터페이스                     myCar -> 변수/멤버변수(관례)
        // 3. 전체가 대문자이면 상수                 , 4. 첫글자 소문자이면 ( ) 함수
        // MYCAR -> 상수                                myCar( ) -> 함수
        System.out.println( RemoteControl.MAX_VOLUME );   
        System.out.println( RemoteControl.MIN_VOLUME );   

        // [3]
        Sword sword = new Sword();
        Gun gun = new Gun();

        Character character = new Character();

        character.useWeapon(sword);
        character.useWeapon(gun);

        /*[문제 4] 다중 인터페이스 구현
        1. "하늘을 납니다."를 출력하는 fly() 추상 메소드를 가진 Flyable 인터페이스를 만드세요.
        2. "물에서 헤엄칩니다."를 출력하는 swim() 추상 메소드를 가진 Swimmable 인터페이스를 만드세요.
        3. Duck 클래스가 Flyable과 Swimmable 두 인터페이스를 모두 구현하도록 작성하세요.
        4. main 함수에서 Duck 객체를 생성하고, fly()와 swim() 메소드를 모두 호출하여 결과를 확인하세요.*/
        Duck duck = new Duck();

        duck.fly();
        duck.swim();;
        // [5] 
        // 2. main 함수에서 Duck 객체를 생성하고, Object 타입의 변수에 저장하세요.
        // 3. if문과 instanceof 연산자를 사용하여, 해당 객체가 Flyable 타입인지, Swimmable 타입인지 각각 확인하고, 
        //    맞다면 해당 인터페이스 타입으로 강제 형변환하여 메소드를 호출하세요.*/
        Object obj = new Duck();
        if (obj instanceof Flyable){
            Flyable fa = (Flyable) obj;
            fa.fly();
        }
        if(obj instanceof Swimmable){
            Swimmable sa = (Swimmable) obj;
            sa.swim();
        }
        // [6]
        /*[문제 6] 인터페이스를 이용한 객체 교체
        1. "데이터를 저장합니다."라는 추상 메소드 save()를 가진 DataAccessObject 인터페이스를 만드세요.
        2. DataAccessObject를 구현하여 각각 "Oracle DB에 저장", "MySQL DB에 저장"을 출력하는 OracleDao, 
           MySqlDao 클래스를 만드세요.
        3. main 함수에서 DataAccessObject 타입의 변수 dao를 선언하세요.
        4. dao에 new OracleDao()를 대입하여 save()를 호출하고, 그 다음 new MySqlDao()를 대입하여 
           save()를 호출하여 DB가 쉽게 교체되는 것을 확인하세요.*/
        DataAccessObject dao;
        dao = new OracleDao();
        dao.save();
        dao = new MySqlDao();
        dao.save();

        // [7] 익명 구현 객체 : 클래스 없이 일회성 구현체 만들기
        Greeting greeting = new Greeting() {
            public void welcome(){ System.out.println("구현");}
        }; greeting.welcome();

        // [8]
        /*[문제 8] 디폴트 메소드 (Default Method)
        1.Device 인터페이스에, turnOn(), turnOff() 추상 메소드와 함께, public default void setMute(boolean mute) 
        디폴트 메소드를 추가하세요. 디폴트 메소드는 "무음 처리합니다."를 출력하도록 구현합니다.
        2.Television 클래스가 Device를 구현하도록 하되, turnOn(), turnOff()만 오버라이딩하세요.
        3.main 함수에서 Television 객체를 생성하고, turnOn(), turnOff()와 함께 디폴트 메소드인 
        setMute()도 호출되는 것을 확인하세요 */
        Television television = new Television();

        television.turnOn();
        television.turnOff();
        television.setMute(true);
        // [9] 
        int result = Calculator.plus(10, 20);
        System.out.println(result);



    }
}
// [1]
interface Soundable{
    public abstract void makeSound();
}
class Cat implements Soundable{
    @Override public void makeSound(){ System.out.println("야옹" );}
}
class Dog implements Soundable{
    @Override public void makeSound(){ System.out.println( "멍멍" ); }
}
// [2]
interface RemoteControl{
    int MAX_VOLUME = 10;    int MIN_VOLUME = 0;
}
// [3]
interface Attackable{
    public abstract void attack();
}class Sword implements Attackable{
    public void attack(){ System.out.println("칼 공격!");}
}
class Gun implements Attackable{
    public void attack(){ System.out.println("총 공격!");}
}
class Character {
    public void useWeapon(Attackable weapon) {
        weapon.attack();
    }
}
// [4]
interface Flyable{
    public abstract void fly();
}
interface Swimmable {
    public abstract void swim();
}
class Duck implements Flyable , Swimmable{
    public void fly(){ System.out.println("하늘을 납니다.");}
    public void swim(){ System.out.println("물에서 헤엄칩니다.");}
}
// [5]
// [6]
interface DataAccessObject{
    public abstract void save();
}
class OracleDao implements DataAccessObject {
    public void save(){ System.out.println("Oracle DB에 저장");}
}
class MySqlDao implements DataAccessObject {
    public void save(){ System.out.println("MySQL DB에 저장");}
}

// [7]
interface Greeting{ void welcome(); }

// [8]
interface Device{
    void turnOn();
    void turnOff();
    public default void setMute(boolean mute){ System.out.println("무음 처리합니다.");}
}
class Television implements Device {
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}
// [9]
interface Calculator{
    static int plus( int x , int y ){
        return x + y;
    }
}




/*[문제 9] 정적 메소드 (Static Method)
1. Calculator 인터페이스를 만들고, 두 정수의 합을 반환하는 plus(int x, int y) 정적 메소드를 정의하세요.
2. main 함수에서 Calculator 인터페이스를 구현하는 클래스나 객체를 만들지 않고, 
   Calculator.plus(10, 20)과 같이 인터페이스 이름으로 직접 정적 메소드를 호출하여 결과를 출력하세요. */

