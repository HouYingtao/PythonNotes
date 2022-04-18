# PythonNotes
[Python 入门指南](https://www.runoob.com/manual/pythontutorial3/docs/html/)



#### 查看python版本

> python -V



#### 在 Windows 设置环境变量

在环境变量中添加Python目录：在命令提示框中(cmd) : 输入
`path=%path%;C:\Python`

#### 文件头 

` #!/usr/bin/python3 `

文件头设置编码

`# -*- coding: cp-1252 -*-`



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

