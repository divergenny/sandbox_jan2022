#### sandbox_jan2022


# Проект - Приложение для бронирования отелей ✨

* [Описание](#-описание)
* [Команда и роли](#-команда-и-роли)
* [Функционал](#-функционал)
* [Микросервисная архитектура](#-микросервисная-архитектура)
* [Сборка и запуск](#-сборка-и-запуск)
* [Технологический стек](#-технологический-стек)
* [Контакты](#-контакты)


## 📝 Описание
**sandbox_jan2022** — микросервисное приложение на Spring Boot, которое позволяет бронировать номера в отеле для персонала компании Exadel. 
Коммерческое приложение созданное командой из 6 человек. 

## 🌟 Команда и роли
Владимир Жук (Vladimir Zhuk) [[VladimirZhuk07]](https://github.com/VladimirZhuk07) - **Ментор** <br>
Алёна Галыга (Alena Halyha) [[ahalyha]](https://github.com/ahalyha) - **Ментор** <br>
Нурмухаммад Суннатуллаев (Nurmukhammad Sunnatullayev) [[nurmukhammadsunatullaev]](https://github.com/nurmukhammadsunatullaev) - **Руководитель команды** (Team Leader) <br>
Азизбек М. (Azizbek M.) [[Tuyoo89]](https://github.com/Tuyoo89) - **Java разработчик** <br>
Владислав П. (Vladislav P.) [[divergenny]](https://github.com/divergenny) - **Java разработчик** <br>
Илья (Ilya) [[Vieletiger]](https://github.com/Vieletiger)- **Java разработчик** <br>

## 🔬 Функционал
1. Поиск отелей – пользователь может искать отели по различным критериям (местоположение, дата заезда/выезда, количество гостей);
2. Просмотр доступных номеров – отображение списка доступных номеров с подробной информацией (цена, удобства);
3. Бронирование – возможность забронировать номер, выбрав предпочтительные даты;
4. Подтверждение бронирования – отправка подтверждения с деталями брони;
5. Оплата – интеграция с платежными системами для оплаты бронирования;
6. Поддержка – возможность связаться с поддержкой для уточнения вопросов.

## 🔍 Микросервисная архитектура
* sandbox-backend - сервис отвечающий за Backend
* sandbox-db - сервис отвечающий за БД
* sandbox-web - сервис отвечающий за отображение Web части
* sandbox-telegram - сервис взаимодействующий с Telegram API
* sandbox-security - сервис отвечающий за регистрацию и аутентификацию
* sandbox-email - сервис отвечающий за отправку email 
* sandbox-scheduler - сервис отвечающий за напоминание пользователям о регистрации

## ⚙️ Сборка и запуск
Swagger можно использовать по следующему адресу: http://localhost:8080/api/swagger-ui/index.html <br>
Документация Telegram-бота: https://core.telegram.org/bots <br>
Информация о webhook: https://api.telegram.org/bot{BOT_TOKEN}/getWebhookinfo <br>
Установка URL для webhook: https://api.telegram.org/bot{BOT_TOKEN}/setWebhook?url={WEBHOOK_PATH} <br>

```
Необходимо добавить несколько значений в системные переменные среды, чтобы Telegram бот работал корректно. 
Переменные среды:
1. TG_BOT_USERNAME
2. TG_BOT_TOKEN
3. TG_BOT_PATH

Для этого выполните следующие шаги:
Откройте поиск в Windows, введите «env» и выберите «Изменить системные переменные среды».
Нажмите кнопку «Переменные среды…».
Установите переменные среды с необходимыми значениями, которые были описаны выше. Кнопка «Создать» добавит новую переменную.
Закройте все диалоговые окна выбрав «ОК». Изменения будут сохранены!
```


## 💻 Технологический стек
* Java 17
* Spring (Core, Boot, Security, Data)
* Hibernate, MySQL
* Maven (с профилями test и prod)
* JUnit 4, Mockito
* Docker
* FlyWay
* Log4j
* Apache Tomcat
* MapStruct
* Lombok
* GitHub Actions
* JasperReports
* Heroku
* ngrok
* Trello

## 🌐 Контакты
Владимир Жук (Vladimir Zhuk) - [LinkedIn](https://www.linkedin.com/in/vladimir-zhuk-0127a498/) <br>
Алёна Галыга (Alena Halyha)  - [LinkedIn](https://www.linkedin.com/in/alena-halyha-763625206/) <br>
Нурмухаммад Суннатуллаев (Nurmukhammad Sunnatullayev) - [LinkedIn](https://www.linkedin.com/in/nurmukhammadsunatullaev/) <br>
Азизбек М. (Azizbek M.)  - [LinkedIn](https://www.linkedin.com/in/azizbek-mirzakolonov-3861b8236/) <br>
Владислав П. (Vladislav P.) - [divergenny@gmail.com](mailto:divergenny@gmail.com) <br>
Илья (Ilya) - No contacts <br>
