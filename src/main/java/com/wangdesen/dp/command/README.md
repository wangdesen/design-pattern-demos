#Command-Pattern-demos

---

#### 命令模式
> 将一个请求封装成一个对象，从而使我们可以用不同的请求对客户进行参数化。
命令模式是一种对象行为型模式，其别名为动作(Action)模式或事物(Transation)模式

#### 角色定义(以键盘控制播放器为例)
- Command：抽象命令类(一般操作)
- ConcreteCommand：具体命令类(播放，倒带，暂停)
- Invoker：调用者(键盘)
- Receiver：接收者(播放器)
- Client：客户端

#### UML类图
![command_uml icon](https://design-patterns.readthedocs.io/zh_CN/latest/_images/Command.jpg)

#### 时序图
![command_uml icon](https://design-patterns.readthedocs.io/zh_CN/latest/_images/seq_Command.jpg)

#### 模式分析
- 每一个命令都是一个操作，请求的一方发出命令，要求执行一个操作；接收的一方受到请求，并执行操作
- 命令模式允许请求的一方和接收的一方独立开来，使得请求的一方不必知道接收方的接口，更不必知道请求怎么被接收
- 命令模式请求本身也是一个对象
- 关键在于引入抽象命令接口，发送者针对接口编程，只有实现了抽象命令接口的命令才能和接收者相关联

#### 优点
- 降低系统耦合度
- 新的命令很容易加入到系统中
- 可以比较容易地设置组合命令

#### 缺点
- 可能会导致某些系统有过多的具体命令类

#### 适用环境
- 系统需要调用者和请求接收者解耦
- 系统需要支持命令的撤销和恢复
- 系统需要将一组操作组合在一起，即支持宏命令

#### 总结
> Command声明了用于执行请求的execute()方法，通过这些方法可以调用接收方的相关操作；
ConcreteCommand实现了抽象命令类中声明的方法，他对应具体的接收者，将接收者对象的操作绑定其中；
Invoker通过命令对象执行请求；Receiver执行请求相关的操作，实现对业务的具体处理
