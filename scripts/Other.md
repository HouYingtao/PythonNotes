1. #### pyinstall转exe，获取exe所在路径

   ```python
   import os
   import sys
   
   if getattr(sys, 'frozen', False):
   	application_path = os.path.dirname(sys.executable)
   elif __file__:
   	application_path = os.path.dirname(__file__)
   ```

   

