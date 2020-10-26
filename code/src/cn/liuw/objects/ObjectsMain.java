package cn.liuw.objects;

/**
 * @author liuw
 * @date 2020/9/24
 */
public class ObjectsMain {

    public static void main(String[] args) {
        testCarInteger();
    }
    
    private static void testCar() {
        Car car = new Car();
        System.out.println(car);

        try {
            Car car1 = Car.class.newInstance();
            System.out.println(car1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
    private static void testCarInteger() {
        Car car = new Car();
        int ci = car.getNumber() == null ? 0 : car.getNumber();
        System.out.println(ci);
    }
 }
