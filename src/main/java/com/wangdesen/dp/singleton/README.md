# singleton-pattern-demos

---

#### 单例模式

- 单例模式一般有五种构建方法：懒汉，饿汉，双重检验锁，静态内部类，枚举；

- 一般情况下，直接使用饿汉式即可

- 要求懒加载的情况下，建议使用静态内部类

- 涉及反序列化情况，使用枚举方法