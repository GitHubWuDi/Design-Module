# Design-Module
1.设计模式-策略模式
--------------------------------
a.找出应用当中变化的地方，将他们独立出来（鸭子是否能飞行，叫声的类型），不要和不变化的东西混合在一起。
--------------------------------
b.针对接口（包括抽象类）进行编程，而不是针对实现编程。
--------------------------------
c.多用组合，少用继承。这样做使程序具有很高的弹性，可以动态进行改变。
--------------------------------
总结：
策略模式定义了一组算法，并分别将其封装起来，使他们之间可以独立互换，并让这些算法独立于使用这些算法的客户。

--------------------------------
2.设计模式-观察者模式
设计原则：为了交互对象之间的松耦合设计而努力，松耦合之所以能够让我们建立弹性的OO系统，能够对应变化，是因为松耦合之间的相互依赖降到了最低
--------------------------------
观察者模式：主题和观察者之间存在一对多的依赖关系，当主题改变状态，依赖他的观察者都会收到相应的通知。
--------------------------------
--------------------------------
3.设计模式-装饰者模式
--------------------------------
设计原则：类应该对扩展开放，对修改关闭
--------------------------------
装饰者模式：动态的将对象附加在对象上，若要扩展功能，装饰者比继承更具有扩展弹性。
--------------------------------
--------------------------------

4.设计模式-工厂模式
--------------------------------
设计原则：要依赖于抽象，不要依赖于具体的抽象类。（Pizza Store 和 Pizza的具体实现类都依赖于Pizza这个抽象对象）
--------------------------------
工厂模式：定义了一个创建对象的接口，但是由于子类决定要实例化的类是哪一个，工厂方法发实例化推迟到子类。
Product子类实现创建产品的具体属性，Creator子类决定创建什么样类型的Product
--------------------------------

5.设计模式-抽象工厂模式
--------------------------------
设计原则：要依赖于抽象，不要依赖于具体的抽象类。（Pizza Store 和 Pizza的具体实现类都依赖于Pizza这个抽象对象）
--------------------------------
抽象工厂模式：提供一个接口，用于创建相关或依赖对象家族，而不需要指定具体类（客户从具体的产品中被解耦）
--------------------------------
工厂模式和抽象工厂模式对比
工厂模式：只负责将客户从具体类型中解耦
抽象工厂模式：需要创建产品家族和想让制造的相关产品集合起来，可以考虑抽象工厂模式
--------------------------------

6.设计模式-单例模式
--------------------------------
设计原则：确保一个类只有一个实例，并保证安全访问
--------------------------------
四钟单例的实现方式：
--------------------------------
饿汉模式（急切创建实例）
--------------------------------
懒汉模式（懒汉模式可能会造成多线程的问题）
--------------------------------
同步单例（加重系统负担）
--------------------------------
双重检查加锁单例（完美解决）
--------------------------------

7.设计模式-命令模式
--------------------------------
设计原则：确保一个类只有一个实例，并保证安全访问
--------------------------------
命令模式原理："请求"封装成对象，以便使用不同的请求，队列或者日志参数化请求，命令模式可以实现撤回操作
--------------------------------


8.设计模式-适配器模式
--------------------------------
适配器模式过程：
1.客户通过目标接口调用适配器方法对适配器发出请求。
2.适配器使用被适配器接口把请求转换成适配者的一个或者是多个调用接口。
3.客户收到调用的结果，但并未察觉这一切是适配器在起转换作用。
--------------------------------
适配器模式原理：将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间
--------------------------------

9.设计模式-外观模式
--------------------------------
设计原则：最少知识原则
外观模式使用场景：
1.需要简化一个很大的接口或者是一群复杂的接口时，使用外观模式
--------------------------------
外观模式原理：提供统一的接口，用来访问子系统中的一群接口，外观定义了一个高层接口，让子系统更容易操作。
--------------------------------

10.设计模式-模板模式
--------------------------------
模板定义了一个算法的步骤，并允许子类为一个或者多个步骤提供实现。
--------------------------------
模板模式原理：在一个方法当中定义了一个算法的骨架，而将一些步骤延迟到子类当中，模板方法将子类可以在不改变算法接口的情况下，重新定义算法的某些步骤。
--------------------------------





