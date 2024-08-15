@echo off
setlocal

set DIRNAME=%~dp0
set APP_BASE_NAME=%~n0%
set APP_HOME=%DIRNAME%

if exist "%APP_HOME%\src\main\java\com\example\shoppingcart\ShoppingCartApplication.java" (
  set SCRIPT="%APP_HOME%\src\main\java\com\example\shoppingcart\ShoppingCartApplication.java"
) else (
  echo Cannot find main class: com.example.shoppingcart.ShoppingCartApplication
  exit /B 1
)

set JAVA_EXE=java
if defined JAVA_HOME (
  set JAVA_EXE="%JAVA_HOME%\bin\java"
)

"%JAVA_EXE%" -cp "%APP_HOME%\target\classes" %APP_BASE_NAME% %*