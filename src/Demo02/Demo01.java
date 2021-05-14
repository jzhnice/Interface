package Demo02;

;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-13 10:31
 */
public class Demo01 {
    public String name;

    public Demo01(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo01{" +
                "name='" + name + '\'' +
                '}';
    }
}

