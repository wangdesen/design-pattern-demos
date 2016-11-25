#Observer-Pattern-demos

---

#### 观察者模式
> 定义对象之间的一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象都得到通知并自动更新。
观察者模式又叫做"发布-订阅模式(publish-subcribe)","模型-视图模式(model-view)","源监听器模式(source-listener)"

#### UML类图
![observer_uml icon](https://design-patterns.readthedocs.io/zh_CN/latest/_images/Obeserver.jpg)

#### 时序图
![observer_time icon](https://design-patterns.readthedocs.io/zh_CN/latest/_images/seq_Obeserver.jpg)

#### 角色定义
- Subject：主题(出版者)
- ConcreteSubject：具体主题
- Observer：观察者(订阅者)
- ConcreteObserver：具体观察者

#### 优点
- 观察者模式可以实现表示层和数据逻辑层的分离，并且定义了稳定的消息更新传递机制，
抽象了新接口，使得可以有各种不同的表示层作为具体观察者的对象
- 观察者模式在观察目标和观察者之间建立了一个抽象的耦合
- 观察者模式支持广播通信
- 观察者模式符合"开闭原则"

#### 缺点
- 如果一个观察目标有很多直接或间接的观察者，将所有的观察者都通知到会花费较长时间
- 如果观察者和观察目标之间有循环依赖，可能会导致系统崩溃
- 观察者模式没有相应的机制让观察者知道观察目标是怎样变化的，只是知道目标状态发生了变化

#### 总结
> 观察者模式包含四个角色，Subject是被观察的对象；ConcreteSubject是Subject的子类，它的状态发生改变时，
向它的各个观察者发出通知；Observer将对Subject的改变作出反应；在ConcreteObserver中维护一个指向ConcreteSubject对象的引用，
它存储具体观察者的有关状态，这些状态需要和ConcreteSubject保持一致
>在JDK的java.util包中，提供了Observable类以及Observer接口，它们构成了Java语言对观察者模式的支持

#### 模式扩展
> MVC模式是一种架构模式，它包括三个角色，Model(模型)，View(视图)，Controller(控制器)。
观察者模式可以用来实现MVC模式，Model是Subject，View是Observer，Controller是Mediator。
当模型层数据发生改变时，视图层将自动改变其显示内容。
