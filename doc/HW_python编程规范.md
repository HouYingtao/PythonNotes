Modules/Packages/Functions/Variables/Method Names Parameters       -- 小写下划线
Classes/Exceptions  	-- 大写驼峰
Global Class Constants/		-- 大写下划线

import导入多个对象可以在一行加载，太长时可以放到元组中换行
import顺序，标准库/第三方库/应用程序自定义模块 顺序导入

花括号中括号换行，左括号后面换行，内容单独行，右括号单独行，右括号和左括号开头对齐

字符串转数字时，使用Decimal
from decimal import Decimal
Decimal('12.3')

判断序列为空  if [not] seq:

字典get设置默认值，避免异常		dict.get(key, 'default')

判断类型使用isinstance代替type
isinstance(obj, (int, float))

捕获ZeroDivisionError异常或分母判0

is判断是否指向同一个对象（判断两个对象的id是否相等）
==会调用__eq__方法判断是否等价（判断两个对象的值是否相等）

内置类型之间做比较，使用== 或 != 运算符，对象比较使用is/is not
内置类型有：int/float/complex/list/tuple/set/frozenset/dict/str/bytes

不推荐使用海象运算符

推荐 x is not None 不推荐 not x is None
推荐 if item is in items 不推荐 if not item in items

尽可能使用隐式布尔值
以下对象会被看做False
1. 常量None和False
2. 值为0的数值类型
3. 空的序列或容器类型，''  () [] {} set() range(0)
4. 该对象的类定义了__bool__方法，且该方法返回False
5. 否则该对象定义了__len__方法，且返回0

for index, item in enumerate(items)

使用单下划线代替循环体中未使用的循环变量，或返回值中未使用的结果值

使用None作为参数默认值
def func(arg_a, list_arg=None):
	list_arg = list_arg or []
	list_arg.append(arg_a)

具名元祖进行数据封装：
import collections
Student = collections.namedtuple('Student', ['name', 'age', 'gender'])



引号使用的一般性原则：
1、自然语言使用双引号
2、机器标识使用单引号
3、正则表达式使用双引号
4、文档字符串 (docstring) 使用三个双引号