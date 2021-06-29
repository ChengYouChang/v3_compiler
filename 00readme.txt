
袁世一，2020/02/29

0. 設定捷徑：
	1. 若是windows:   setMacros.bat
	2. 若是Linux/Mac: source setMacros.sh

1. 以java進行解析(gui)，執行：t11 -> t22 -> t33

2. 以python進行解析，執行：   t55 -> t66

3. 清除產生檔案、僅留下自己的檔案：clean

4. 了解t11~t55等的內容：alias

其中: 
	1. t11, t55: v3_compiler.g4 compile
	2. t22: java compile
	3. t33, t66: 解析 test.c 檔案
