#Bridge-Pattern-demos

---

#### 桥接模式
将抽象部分与他的实现部分分离，使他们都可以独立的变化。

#### UML类图
![UML ICON](https://design-patterns.readthedocs.io/zh_CN/latest/_images/Bridge.jpg)

#### 时序图
![TIME ICON](https://design-patterns.readthedocs.io/zh_CN/latest/_images/seq_Bridge.jpg)

#### 角色定义
- Abstraction：抽象类——汽车
- RefinedAbstraction：扩充抽象类——大巴&吉普
- Implementor：实现类接口——引擎
- ConcreteImplementor：具体实现类——200型引擎&300型引擎

#### 优点
- 分离抽象接口及实现部分
- 桥接模式提高了系统的可扩充性
- 实现细节对客户透明

#### 缺点
- 增加了系统的理解与设计难度，由于聚合关系建立在抽象层，要求针对抽象进行设计和编程
- 桥接模式要求正确识别两个独立变化的维度，使用范围具有局限性


#### 总结
- 桥接模式将抽象部分与实现部分分离，使他们可以独立的变化，又称为接口模式

- 桥接模式包含四个角色：

> 抽象类定义一个实现类接口的对象并维护该对象（汽车类中定义引擎接口）

> 扩充抽象类扩充由抽象类定义的接口（继承抽象类），他实现了抽象类中定义的抽象业务方法（Jeep实现自身的引擎安装方法），在扩充抽象类中可以调用在实现类接口定义的业务方法（Jeep安装方法实际为调用Engine的安装方法）

> 实现类接口仅提供基本操作（Engine的安装方法[接口]）

> 具体实现类实现了实现类接口，并在不同的具体实现类提供基本操作的不同实现（Engine300提供Engine300的安装方式）

> 程序运行过程中，具体实现类对象替代其父类对象，提供给客户端业务操作方式（Car jeep = new Jeep()）

- 在桥接模式中，抽象化与实现化脱耦，沿着各自的维度独自变化

- 桥接模式使用的情况还包括：需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次见建立静态的继承关系