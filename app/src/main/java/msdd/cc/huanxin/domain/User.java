package msdd.cc.huanxin.domain;

/**
 * @author pangcq    jpcq_00x@sina.com
 * @Description: (这里用一句话描述这个类的作用)
 * @date 2015/5/6 12:56eeeeee
 */
public class User {
    private String userId;
    private String name;
    private int age;

    public User() {
    }

    public User(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
