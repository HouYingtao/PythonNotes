#### 获取当前时间

```python
import datetime
now_time = datetime.datetime.now()
```

#### 时间格式化

```python
import datetime
now_time = datetime.datetime.now()
cru_day = now_time.strftime('%Y%m%d')
```

#### 时间移动

```python
import datetime
now_time = datetime.datetime.now()
pre1_day = (now_time + datetime.timedelta(days=-1)).strftime('%Y%m%d')
```

