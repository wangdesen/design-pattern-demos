# facade-pattern-demos

---

#### 外观模式
模式定义：提供了一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层接口，让子系统更容易使用

#### 模式结构
- Facade：外观角色
- Subsystem：子系统角色

#### UML类图
![facade_uml icon](https://design-patterns.readthedocs.io/zh_CN/latest/_images/Facade.jpg)

#### 时序图
![facade_time icon](https://design-patterns.readthedocs.io/zh_CN/latest/_images/seq_Facade.jpg)

#### 模式分析
> 根据“单一职责原则”，在软件系统将一个系统划分为若干个子系统有利于降低整个系统的复杂性，
设计目标就是使子系统间的通信和相互依赖关系达到最小，通过引入一个外观对象，它为子系统的访问提供一个简单而单一的入口

#### 优点
- 对客户屏蔽了系统组件，减少了客户处理的对象数目，使得系统使用起来更加容易
- 实现了子系统和客户之间的松耦合关系
- 降低了大型软件系统的编译依赖性

#### 缺点
- 不能很好的限制客户使用子系统类
- 在不引入抽象外观类的情况下，增加新的子系统可能需要修改外观类源代码，违背“开闭原则”