<div align="center">

<a href="https://asgard.lol/escapetime">
  <img src="https://raw.githubusercontent.com/VolanDeMor1/EscapeTimeApi/master/banner.png" alt="EscapeTimeAPI">
</a>
<br/><br/>

[![](https://jitpack.io/v/VolanDeMor1/EscapeTimeApi.svg?style=flat-square)](https://jitpack.io/#VolanDeMor1/EscapeTimeApi)
[![CodeFactor](https://www.codefactor.io/repository/github/volandemor1/escapetimeapi/badge/master?style=flat-square)](https://www.codefactor.io/repository/github/volandemor1/escapetimeapi/overview/master)
[![Приссоединяйтесь к дискорду](https://discord.com/api/guilds/685683385313919172/widget.png?style=shield)](https://asgard.lol/discord)

</div>

## Использование

```java
EscapeTime escapeTime = (EscapeTime) getServer().getPluginManager().getPlugin("EscapeTime");
EscapeTimeAPI api = escapeTime.api();
api.testApi(); // вывод: EscapeTime API works correctly!
```

## Установка

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
