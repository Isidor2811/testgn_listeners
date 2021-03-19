Commit #1 (ITestListener)

Создан класс **MyITestListener** который имплементирует интерфейс **ITestListener**
В нем переопределяем методы.
Методы принимают: 

**ITestResult** - информация о текущем тестовом метода @Test.
**ITestContext** - информация о текущем тесте\сьюте в xml документе.

Листенер подключаем на уровне xml сьюта в самом файле **iTestListener_testng.xml**