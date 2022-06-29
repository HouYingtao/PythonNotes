# PythonNotes
[Python 入门指南](https://www.runoob.com/manual/pythontutorial3/docs/html/)



#### 查看python版本

> python -V
>
> python --version



#### 在 Windows 设置环境变量

在环境变量中添加Python目录：在命令提示框中(cmd) : 输入
`path=%path%;C:\Python`

#### 文件头 

` #!/usr/bin/python3 `

文件头设置编码，python2默认使用ASCII，使用中文时需要指定文件头

`# -*- coding: utf-8 -*-`



#### python保留字

>  保留字即关键字，我们不能把它们用作任何标识符名称。Python 的标准库提供了一个 keyword 模块，可以输出当前版本的所有关键字：
```python
>>> import keyword
>>> keyword.kwlist

>>> ['False', 'None', 'True', 'and', 'as', 'assert', 'break', 'class', 'continue', 'def', 'del', 'elif', 'else', 'except', 'finally', 'for', 'from', 'global', 'if', 'import', 'in', 'is', 'lambda', 'nonlocal', 'not', 'or', 'pass', 'raise', 'return', 'try', 'while', 'with', 'yield']
```

#### 查看信息

```python
import pandas as pd

# 查看组件详情
help(pd)

# 查看组件版本(双下划线)
pd.__version__

# 查看可安装版本集合
pip install pandas==

# 更新组件版本
pip install -U pandas==1.4.2
```

#### mian函数入口

```python
if __name__ == "__main__":
```

#### Shell调python

```
result = `python -c "import pandas as pd; pd......"`
```

#### 打印异常

```python
import sys
import traceback

# 写法一：
try:
    func()
except (XXXError, XXXXError):
    dosometing1
except Exception as e:
    # 返回字符串类型，只给出异常信息，不包括异常信息的类型，如1/0的异常信息 
    print(str(e)) # 'integer division or modulo by zero'   同：e.message
    
    # 给出较全的异常信息，包括异常信息的类型，如1/0的异常信息
    print(repr(e)) # "ZeroDivisionError('integer division or modulo by zero',)"
    
    # 打印详细堆栈异常
    print(traceback.format_exc())  # 同 traceback.print_exc()
    
    # 异常写⼊到 tb.txt ⽂件中
	traceback.print_exc(file=open('tb.txt','w+')
    
    print('文件', e.__traceback__.tb_frame.f_globals['__file__'])
    print('行号', e.__traceback__.tb_lineno)
                        
    # 打印异常类
    a,b,c = sys.exc_info()
    print(a)		# <class 'ModuleNotFoundError'>
    print(b)		# No module named 'aaa'
    print(c)		# <traceback object at 0x7ff9cccc8088>
    print('-----------')
    for i in traceback.extract_tb(c):
        print(i)	# <FrameSummary file /home/cyl/PycharmProjects/untitled/test/test.py, line 9 in test>

    # 抛异常
    raise MyException('xxx')
else:
    do...
finally:
    do finalthing
# 自定义异常
class MyException(Exception):
    def __init__(self, msg):
        self.msg = msg

# 写法二
with open('xxx.txt') as f:
    f.read()
    f.closed
```

#### 格式化

```python
# 百分号格式化
print(变量名称)
print('字符串%格式' % (变量名称))
print('字符串%格式 %格式 %格式' % (变量名称1, 变量名称2, 变量名称3))

print("姓名%s，学号%06d" % (name, id))
print("今天蔬菜特价了，%s只要%.2f元/斤。" % (title, price))

# format方法格式化
print('字符串{}'.format(变量名称1))
print('{}字符串{}'.format(变量名称1, 变量名称2))
print('{1}字符串{0}字符串{1}'.format(变量名称0, 变量名称1))

# format方法简写形式(Python3.6+)
name = '孙悟空'
mobile = '18878569090'
print(f'姓名：{name}，联系方式：{mobile}')
```

%格式常见形式如下：

| **格式符号** | **转换**               |
| ------------ | ---------------------- |
| %s           | 字符串                 |
| %d           | 有符号的十进制整数     |
| %f           | 浮点数                 |
| %c           | 字符                   |
| %u           | 无符号十进制整数       |
| %o           | 八进制整数             |
| %x           | 十六进制整数（小写ox） |
| %X           | 十六进制整数（大写OX） |
| %e           | 科学计数法（小写'e'）  |
| %E           | 科学计数法（大写'E'）  |
| %g           | %f和%e的简写           |
| %G           | %f和%E的简写           |

