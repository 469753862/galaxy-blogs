@echo off
mode con cols=80 lines=25
set /p port=�����ѯ�˿�: 
netstat -ano|findstr %port%

set /p pid=������ֹPID:
taskkill /pid %pid% /f
pause
