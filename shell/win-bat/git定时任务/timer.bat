REM ����GBK
@echo off
set scriptPath=%~dp0
%1 mshta vbscript:CreateObject("Shell.Application").ShellExecute("cmd.exe","/c %~s0 ::","","runas",1)(window.close)&&exit
REM cd %~d0
REM cd %~dp0
set   /p  name="������Ŀ����: "
echo .
echo    ��Ӷ�ʱ�ű�
echo .
SCHTASKS /Create /SC DAILY /TN "%name%pull.bat" /TR "%scriptPath%pull.bat" /ST 09:30
SCHTASKS /Create /SC DAILY /TN "%name%push.bat" /TR "%scriptPath%push.bat" /ST 18:30
echo .
echo     ��Ӷ�ʱ�ű���� 
echo .
pause