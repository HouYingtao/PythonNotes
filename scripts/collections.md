####  defaultdict 

> defaultdict 是一个字典。我们在使用dict字典时，如果引用的Key不存在，就会抛出KeyError。如果希望key不存在时，返回一个默认值，就可以用defaultdict。
>
> defaultdict属于内建函数dict的一个子类，调用工厂函数提供缺失的值。

```python
from collections  import defaultdict
 
d = defaultdict(lambda:'Default')
d.update({'a':1,'b':2})
print(d['a']) # 输出 1
print(d['d']) # 输出 Default

di = defaultdict(int)
print(di['a'])	# 未找到输出0

s = 'mississippi'
d = defaultdict(int)
for k in s:
     d[k] += 1
print(d)

s = [('red', 1), ('blue', 2), ('red', 3), ('blue', 4), ('red', 1), ('blue', 4)]
d = defaultdict(set)
for k, v in s:
     d[k].add(v)
print(d)
```

