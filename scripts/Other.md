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

#### 3. ciphey

>  一个使用自然语言处理和人工智能的全自动解密/解码/破解工具。 

终端使用方法

```shell
# 文件输入
ciphey -f encrypted.txt
# 或
python -m ciphey -f encrypted.txt

# 字符输入
ciphey -t "Encrypted input"
# 或
python -m ciphey -t "Encrypted input"

# 要去除进度条、概率表和所有噪音，请使用安静模式：
ciphey -t "encrypted text here" -q
```

Python中调用Ciphey

```python
from ciphey.__main__ import main, main_decrypt, make_default_config

main_decrypt(make_default_config("SGVsbG8gbXkgbmFtZSBpcyBiZWUgYW5kIEkgbGlrZSBkb2cgYW5kIGFwcGxlIGFuZCB0cmVl"))
```

![](https://mmbiz.qpic.cn/mmbiz_png/h6NqozYcCQ7jRQjTPFxic88883pibvjo0iaFuQaD49IPxqKhhiaUD4oa3fO5Nz4fpt2D095rFwVibVUVY3l1HznMzicQ/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)

如果你不想输出概率表，只想要解密内容

```python
from ciphey.__main__ import main, main_decrypt, make_default_config

config = make_default_config("SGVsbG8gbXkgbmFtZSBpcyBiZWUgYW5kIEkgbGlrZSBkb2cgYW5kIGFwcGxlIGFuZCB0cmVl")
config["grep"] = True
main_decrypt(config)
```

Ciphey支持解密的密文和编码多达51种，下面列出一些基本的选项

基本密码：

- Caesar Cipher
- ROT47 (up to ROT94 with the ROT47 alphabet)
- ASCII shift (up to ROT127 with the full ASCII alphabet)
- Vigenère Cipher
- Affine Cipher
- Binary Substitution Cipher (XY-Cipher)
- Baconian Cipher (both variants)
- Soundex
- Transposition Cipher
- Pig Latin

现代密码学：

- Repeating-key XOR
- Single XOR

编码：

- Base32
- Base64
- Z85 (release candidate stage)
- Base65536 (release candidate stage)
- ASCII
- Reversed text
- Morse Code
- DNA codons (release candidate stage)
- Atbash
- Standard Galactic Alphabet (aka Minecraft Enchanting Language)
- Leetspeak
- Baudot ITA2
- URL encoding
- SMS Multi-tap
- DMTF (release candidate stage)
- UUencode
- Braille (Grade 1)
- ......