@echo off
SET R2RROOT=..
if NOT EXIST .\run.bat (
  echo Please start this script from the examples_data directory
  exit /B
)
if "%1"=="" (
  echo No Class to run specified
  exit /B
)
SET CP=%R2RROOT%
for %%j in (%R2RROOT%\lib\*.jar) do call :addjar %%j
java -cp %CP% -Xmx256M %*

:addjar
set CP=%CP%;%1