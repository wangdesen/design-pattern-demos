# template-pattern-demos

---

#### 模板模式

- 带钩子的模板类；不带钩子的模板类

- 模板模式用于对象排序

---
Dumb Question：

#### 问：当我创建一个模板方法是，怎么才能知道什么时候使用抽象方法，什么时候使用钩子呢？

答：当你的子类“必须”提供算法中某个方法或步骤的实现时，就使用抽象方法。如果算法中的这个部分是可选的，就用钩子。如果是钩子的话，子类可以选择实现这个钩子，但并不强制这么做。（话又说回来，有钩子不去实现它，钩子也就没意义了）