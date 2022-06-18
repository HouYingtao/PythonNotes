#### 1. pyinstall转exe，获取exe所在路径

```python
import os
import sys

if getattr(sys, 'frozen', False):
	application_path = os.path.dirname(sys.executable)
elif __file__:
	application_path = os.path.dirname(__file__)
```

#### 2. pyautogui

```python
pip3 install pyautogui

# 鼠标移动
# 将鼠标移动到指定的像素(200,400)位置
pyautogui.moveTo(200,400,duration=2)
# 将鼠标按照当前点向右移动200px，向下移动500px这个方向移动
pyautogui.moveRel(200,500,duration=2)


# 获取鼠标位置
print(pyautogui.position()) 

# 鼠标点击
# 鼠标点击，默认左键
pyautogui.click(100,100)   
# 单击左键
pyautogui.click(100,100,button='left')  
# 单击右键
pyautogui.click(100,300,button='right') 
# 单击中键 
pyautogui.click(100,300,button='middle') 
# 双击左键
pyautogui.doubleClick(10,10)  
# 双击右键
pyautogui.rightClick(10,10)   
# 双击中键
pyautogui.middleClick(10,10)

# 鼠标按下
pyautogui.mouseDown()   
# 鼠标释放
pyautogui.mouseUp()  

# 鼠标拖动
# 控制鼠标拖动到指定坐标位置，并且设置操作时间
pyautogui.dragTo(100,300,duration=1) 
# 相对位置
pyautogui.dragRel(100,300,duration=4)

# 鼠标滚动
pyautogui.scroll(30000)

# 获取屏幕截图
im = pyautogui.screenshot()
im.save('screenshot.png')

# 获取像素点颜色
rgb = im.getpixel((100, 500))
print(rgb)

# 图像识别
# 图像识别（一个）
oneLocation = pyautogui.locateOnScreen('1.png')
print(oneLocation) 
-- Box(left=20, top=89, width=33, height=34) 

# 图像识别（多个）
allLocation = pyautogui.locateAllOnScreen('1.png')
print(list(allLocation))
-- [Box(left=20, top=89, width=33, height=34)]


# 键盘输入
- keyDown()：模拟按键按下
- keyUP()：模拟按键松开
- press()：模拟一次按键过程，即 keyDown 和 keyUP 的组合
- typewrite()：模拟键盘输出内容

# 按住 shift 按键，然后再按住 1 按键
pyautogui.keyDown('shift')    
pyautogui.press('1')    
pyautogui.keyUp('shift')

# 输入内容
pyautogui.typewrite('python', 1)
# 特殊符号按键，输出 python 之后换行
pyautogui.typewrite(['p','y','t','h','o','n','enter'])

# 快键键 ctrl + c
pyautogui.keyDown('ctrl')
pyautogui.keyDown('c')
pyautogui.keyUp('c')
pyautogui.keyUp('ctrl')
# 或者
pyautogui.hotkey('ctrl','c')


# 选择框
way = pyautogui.confirm('领导，该走哪条路？', buttons=['农村路', '水路', '陆路'])
print(way)
# 警告框
alert = pyautogui.alert(text='警告！敌军来袭！', title='警告框')
print(alert)
# 密码框
password = pyautogui.password('请输入密码')
print(password)
# 普通输入框
input = pyautogui.prompt('请输入指令：')
print(input)
```



