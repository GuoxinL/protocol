## 开发计划
> 优先级由上至下
```
+---+
|   |   +-----+------+   +-----+------+   +-----+------+
| 0 +-->+ 12  | next +-->+ 256 | next +-->+ 346 | next +-->
|   |   +-----+------+   +-----+------+   +-----+------+
+---+
|   |   +-----+------+
| 1 +-->+ 487 | next +-->
|   |   +-----+------+
+---+
|   |
| 2 +-->
|   |
+---+
|   |   +-----+------+   +-----+------+
| 3 +-->+ 521 | next +-->+ 520 | next +-->
|   |   +-----+------+   +-----+------+
+---+
|   |   +-----+------+
| 4 +-->+ 101 | next +-->
|   |   +-----+------+
+---+
|   |
| 5 +-->
|   |
+---+
```
 - [ ] 重写`DataProtocolPacketList`类
 > Tips:
 >> `DataProtocolPacketList`这个类的主要功能是装载协议的字段，这个类的主要特性有：元素有序；元素根据hash后hash code不重复；自动排序，本想使用`TreeSet`但是`TreeSet`内部`TreeMap`中`value`默认填入使用了`Object().hashCode()`这样直接导致了hash不稳定，不利于多端开发
 
 - [ ] 上传中央仓库
 - [ ] 因为在Coding的过程中发现每一层之间对于类型需求的耦合度，需求最大的ElementList，将Packet中的类型改存放在ElementList中
 - [ ] 优化类型解析
 - [ ] 在协议头中添加固定开头
 - [ ] 添加协议尾概念，用于存放压缩后数据和校验和
 - [ ] 校验和或者CRC校验
 - [ ] 压缩数据，以解决过多的描述信息导致协议利用率过低的问题
 - [ ] 关于配置层的缓存组件的代码还有待考究
 - [ ] 在关于简化代码侵入性，需要下很大的功夫因为每一步的简化意味着要有很多的代码为了自动化铺路
  
## 以完成任务
### 2018年08月15日23:39:13
> 完善了`README.md`细节描述
### 2018年08月13日01:38:15
 - 优化了协议适配对象中ElementList转换为协议对象中的类型所触发的问题
### 2018年08月10日00:51:34
 - 协议流程图
 
### 2018年08月02日22:47:37
 - 添加默认类型概念（默认全部使用Signed类型），不需要每个字段都添加注解
 - 字段索引使用hash code排序后的下标
 
### 2018年07月29日22:19:03
 - 画了一张架构图和一张流程图，也是为了更好的缕清思路和为开源讲解做准备
 
### 2018年07月25日00:55:09
 - UnsignedLongLong2longTypeConvert 编写完成
 
### 2018年07月23日23:35:16
 - Run！！！！！！！！！
 - 编写`README.md`
 
### 2018年07月22日22:19:57
 - 由于协议序列化和反序列化的过程中大小端转换不一致，将使用`netty`˙中`ByteBuf`对协议中的'协议对象'进行协议序列化和反序列化
 - 缓存层完全开发完毕，并替换原有类型，以达到符合开闭原则
 
### 2018年07月22日
 - 在解析字节流时，没有找到对应的协议对象，这里涉及到协议对象初始化的问题
 > Tip:
 >> 该问题已经找到解决办法，由于协议序列化和反序列化的过程中大小端转换不一致出现协议找不到的现象
 
### 2018年07月18日
 - 使`TypeConvert`在程序中流转
 - 修改了部分bug
### 2018年07月12日
 - 实现并兼容C的所有基本类型，编写了基本类型的`TypeConvert`
 
### 2018年07月09日
 - 流转的数据替换`byte[]`为`ByteBuffer`
 - 支持现有类型的数组
 - 现有在解析中流转的数据是`String`类型的16进制字符串，在执行效率有限，应换成byte类型有助于提高效率
 - 现有类型是写死在一个类中，不符合设计模式开闭原则，待重新设计暂时想到在模型和处理中间添加一个Convert层，用于灵活的转换数据对扩展开放
  
### 2018年06月26日
 - 对于Callback应从`@Protocol`注解中拆解出来，因为协议对象中只有在需要相应数据时才需要有Callback的存在，所以Callback是非必要的
 
### 2018年06月17日
 - 优化类型索引列表，固定类型索引按需开发
 - 全面测试