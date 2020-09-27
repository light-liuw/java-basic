package cn.liuw.objects;

/**
 * @author liuw
 * @date 2020/9/24
 */
public class ObjectsMain {

    public static void main(String[] args) {
        
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
}
