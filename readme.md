# 创建型设计模式

## 一、单例
 1. 饿汉式
 2. 懒汉式+线程不安全
 3. 懒汉式+双重判断+线程安全
 4. 懒汉式+静态内部类
 

## 二、工厂方法
工厂不可扩展，只能生产某一类产品，但是最常用

## 三、抽象工厂
工厂可以扩展，可以生产多种类别的产品

## 四、建造者模式
1. 抽象建造规则（FruitBuilder）
2. 根据抽象建造规则，具体出一个实例（GrapeBuilder）
3. 指导建造规则实例去创建产品（FruitDirector）
4. 产品(Fruit)

## 五、原型模式
1. 抽象原型接口，需要有克隆（clone）方法
2. 创建需要克隆的类，实现原型接口
3. 访问类，进行克隆复制对象
> 浅克隆和深克隆，Object.clone()和对象流

# 结构型设计模式

## 一、装饰者模式
- **抽象组件(Component)** ：定义装饰方法的规范
- **被装饰者(ConcreteComponent)** ：Component的具体实现，也就是我们要装饰的具体对象。
- **装饰者组件(Decorator)** ：持有组件(Component)对象的实例引用，该类的职责就是为了装饰具体组件对象，定义的规范。
- **具体装饰(ConcreteDecorator)** ：负责给构件对象装饰附加的功能。
> 1. 抽象组件(InputStream) ：装饰者模式中的超类，它只有一个抽象方法read()，子类都需要对该方法进行处理
> 2. 被装饰者(FileInputStream , ByteArrayInputStream , StringBufferInputStream) ：拥有通用实现read()基本方法
> 3. 装饰者组件(FilterInputStream) ：定义具体装饰者的行为规范，可以做统一基础处理。
> 4. 具体装饰(BufferedInputStream , DataInputStream , Base64InputStream) ：具体的装饰类，
拥有对流的读操作做完成具体拓展能力。

## 二、代理模式
## 一、适配器模式



