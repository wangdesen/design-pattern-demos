# proxy-pattern-demos

---

#### 代理模式
> 给某一个对象提供一个代理，并由代理对象控制对原对象的引用

#### 模式结构
- Subject:抽象主题角色
- Proxy:代理主题角色
- RealSubject:真实主题角色

#### UML类图
![proxy_uml icon](https://design-patterns.readthedocs.io/zh_CN/latest/_images/Proxy.jpg)

#### 时序图
![proxy_time icon](https://design-patterns.readthedocs.io/zh_CN/latest/_images/seq_Proxy.jpg)

#### 优点
- 代理模式可以协调调用者和被调用者，在一定程序上降低系统耦合度
- 远程代理可以是客户端访问远程机器的对象，更快处理客户请求
- 虚拟代理可以通过小对象代表大对象，减少资源消耗
- 保护代理可以控制对真实对象的使用权限

#### 缺点
- 由于在客户端和真实主题之间增加了代理对象，可能会减慢请求处理速度
- 实现代理模式需要额外的工作

#### 总结
> 代理模式包含了三个角色：抽象主题声明了真实主题和代理主题的共同接口；
代理主题内部包含对真实主题的引用，从而可以在任何时候操作真实主题对象；
真实主题定义的真实对象，并实现了真正的业务操作，客户端可以通过代理主题直接调用真实主题定义的方法

#### 动态代理
- 典型应用：SpringAOP