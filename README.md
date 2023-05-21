<div align="center">

<a href="https://asgard.lol/escapetime">
  <img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/images/banner.png" alt="EscapeTimeAPI" draggable="false">
</a>
<br/><br/>

[![Приссоединяйтесь к дискорду](https://img.shields.io/badge/Discord-%235865F2.svg?style=for-the-badge&logo=discord&logoColor=white)](https://asgard.lol/discord)

[![](https://jitpack.io/v/VolanDeMor1/EscapeTimeApi.svg?style=flat)](https://jitpack.io/#VolanDeMor1/EscapeTimeApi)
![Kotlin](https://img.shields.io/badge/kotlin-%23f5336d.svg?style=flat&logo=kotlin&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=flat&logo=Gradle&logoColor=white)

Открытое API для разработчиков [EscapeTime](https://asgard.lol/escapetime)

</div>
<br/><br/>
<a href="#install" id="install">
  <img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/images/install.png" alt="Install" draggable="false">
</a>
<br/><br/>

Не забудьте заменить `VERSION` на необходимую вам версию! Последняя стабильная версия API: 
[![](https://jitpack.io/v/VolanDeMor1/EscapeTimeApi.svg?style=flat)](https://jitpack.io/#VolanDeMor1/EscapeTimeApi)

### Maven

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.VolanDeMor1</groupId>
    <artifactId>EscapeTimeApi</artifactId>
    <version>VERSION</version>
</dependency>
```

### Gradle

```gradle
repositories {
    maven("https://jitpack.io")
}
dependencies {
    implementation("com.github.VolanDeMor1:EscapeTimeApi:VERSION")
}
```
<br/><br/>
<a href="#usage" id="usage">
<img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/images/usage.png" alt="Usage" draggable="false">
</a>
<br/><br/>

Добавьте в `plugin.yml`:
```yml
depend: [ 'EscapeTime' ]
```

Теперь вы можете использовать API:
```java
// JAVA
Plugin plugin = Bukkit.getPluginManager().getPlugin("EscapeTime");

if (plugin == null) {
    throw new NullPointerException("Плагин EscapeTime не обнаружен");
}

EscapeTimeAPI api = ((EscapeTime) plugin).api();
api.testApi(); // вывод: EscapeTime API works correctly!
```
или
```kotlin
// KOTLIN
val api: EscapeTimeAPI? = (Bukkit.getPluginManager().getPlugin("EscapeTime") as EscapeTime?)?.api()
api?.testApi() // вывод: EscapeTime API works correctly!
```
<br/><br/>
<a href="#docs" id="docs">
<img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/images/docs.png" alt="Docs" draggable="false">
</a>
<br/><br/>

✅Javadocs(Kotlindocs): https://volandemor1.github.io/EscapeTimeApi/ <br/>
⏳Wiki: https://github.com/VolanDeMor1/EscapeTimeApi/wiki
<br/><br/>
<a href="#errors" id="errors">
<img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/images/errors.png" alt="Errors" draggable="false">
</a>
<br/><br/>

### `NullPointerException: Плагин EscapeTime не обнаружен`
Есть несколько вещей, которые могут вызвать данную ошибку:
1. Плагин EscapeTime не установлен на сервер
2. Вы используете старую версию API
