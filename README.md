# Java-4
# 一.实验目的
掌握Java中抽象类和抽象方法的定义
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理
# 二.基本要求
设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
# 附加要求
1.在博士研究生类中实现各个接口定义的抽象方法
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额
3.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入
4.根据输入情况，要在程序中做异常处理
# 三.实验过程
1. 首先按照要求创造两个类
2. 将两个接口命名为Xuesheng、Jiaoshi。代表了研究生学习交学费和赚得薪水两个身份。
首先以interface来声明一个接口public interface StudentM {，这样其他类就可以通过继承接口的方式，从而来继承接口的抽象方法。
学生管理接口中应有两个抽象方法，抽象方法用来描述系统具有什么功能，但不提供具体的实现。例如：public abstract void setFee(double fee);为查询学费的抽象方法。教师接口同上：
3.设计博士研究生类
  实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
首先public class Doctoral implements StudentM,TeacherM{使用implements关键字可以同时继承多个接口，实现接口中的所有方法。随后是声明几个必须的变量：姓名、性别、年龄、每学期学费、 每月薪水。
其次，要编写交互输入，要有一个方法来记录用户输入的学生信息：
4.编写测试类
  并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
首先实例化两个研究生，S1和S2，Doctoral S1 = new Doctoral();用户输入的两名研究生信息使用方法S1.St(name1, sex1, age1);进行储存。
调用S1.setPay(wmonth_1,name1,sex1,age1);方法，根据用户输入的信息进行计算并打印出研究生信息。在输入学期学费并调用方法打印后，继续调用S1.rate();计算税收。
两个研究生根据先后顺序依次执行。





   


   
  

