<div align="center">

<a href="https://asgard.lol/escapetime">
  <img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/images/banner.png" alt="EscapeTimeAPI" draggable="false">
</a>
<br/><br/>

[![Приссоединяйтесь к дискорду](https://img.shields.io/badge/Discord-%235865F2.svg?style=for-the-badge&logo=discord&logoColor=white)](https://asgard.lol/discord)
![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)

[![](https://jitpack.io/v/VolanDeMor1/EscapeTimeApi.svg?style=flat)](https://jitpack.io/#VolanDeMor1/EscapeTimeApi)
![Kotlin](https://img.shields.io/badge/kotlin-%23f5336d.svg?style=flat&logo=kotlin&logoColor=white)
![Markdown](https://img.shields.io/badge/markdown-%23000000.svg?style=flat&logo=markdown&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=flat&logo=Gradle&logoColor=white)

Открытое API для разработчиков [EscapeTime](https://asgard.lol/escapetime)

</div>
<br/><br/>
<a href="#install" id="install">
  <img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/images/install.png" alt="Install" draggable="false">
</a>
<br/><br/>

Не забудьте заменить `VERSION` на необходимую вам версию! Последняя стабильная версия API: 
[![](https://jitpack.io/v/VolanDeMor1/EscapeTimeApi.svg?style=flat-square)](https://jitpack.io/#VolanDeMor1/EscapeTimeApi)

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

```java
EscapeTime escapeTime = (EscapeTime) getServer().getPluginManager().getPlugin("EscapeTime");
EscapeTimeAPI api = escapeTime.api();
api.testApi(); // вывод: EscapeTime API works correctly!
```
<br/><br/>
<a href="#docs" id="docs">
<img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/images/docs.png" alt="Docs" draggable="false">
</a>
<br/><br/>

✅Javadocs(Kotlindocs): https://volandemor1.github.io/EscapeTimeApi/ <br/>
⏳Wiki: https://github.com/VolanDeMor1/EscapeTimeApi/wiki
