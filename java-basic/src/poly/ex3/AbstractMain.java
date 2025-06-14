package poly.ex3;

import poly.ex2.Animal;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상클래스 생성 불가
//        AbstractAnimal animal = new AbstractAnimal();
        AbstractAnimal arr[] = {new Dog(), new Cat(), new Caw(), new Duck()};

        arr[1].sound();
        arr[1].move();

        for (int i = 0; i < arr.length; i++) {
            soundAnimal(arr[i]);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
