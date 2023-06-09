# ТЗ computer-shop-api

## Руководство по запуску приложения

1. Убедитесь, что у вас установлена Java Development Kit (JDK) версии 8 или выше.
2. Скопируйте исходный код приложения в удобное место на вашем компьютере.
3. Откройте проект в командной строке или IDE и перейдите в корневую директорию приложения
4. Проверьте, что файл application.yml с указанными настройками находится в директории src/main/resources вашего проекта. Убедитесь, что путь к файлу `jdbc:h2:C:\code\computer-shop-api\db\computer-shop-api` соответствует фактическому расположению вашей базы данных H2. Если база данных H2 ещё не создана, она будет автоматически создана в указанном пути.
5. Выполните следующую команду для сборки исходного кода и создания исполняемого JAR-файла:
 ``` mvn clean package ```
6. Запустите приложение через IDE или с помощью команды  ```java -jar target/computer-shop-api-<version>.jar```.
7. После успешного запуска приложение будет доступно по адресу http://localhost:8075.
  
## Описание приложения
 
#### Магазин, торгующий компьютерами и комплектующими со следующим типом товаров:
 1. Настольные компьютеры
 2. Ноутбуки
 3. Мониторы
 4. Жесткие диски
#### Каждый товар имеет следующие свойства:
 1. Номер серии
 2. Производитель
 3. Цена
 4. Количество единиц продукции на складе
#### Дополнительные свойства:
 1. Настольные компьютеры имеют форм-фактор: десктопы, неттопы, моноблоки
 2. Ноутбуки подразделяются по размеру: 13, 14, 15, 17 дюймовые
 3. Мониторы имеют диагональ
 4. Жесткие диски имеют объем
 
## API предоставляет следующие возможности
 
1. Добавление товара
2. Редактирование товара
3. Просмотр всех существующих товаров по типу
4. Просмотр товара по идентификатору

