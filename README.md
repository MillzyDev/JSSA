[version]: https://img.shields.io/badge/Download-v0.4.4-blue
[download]: #download
[license]: https://github.com/MillzyDev/JSSA/blob/main/LICENSE
[licenseShield]: https://img.shields.io/badge/License-GNU%20GPLv3-lightgrey

[ ![version][] ][download]
[ ![licenseShield][] ][license]

# JSSA (Java Score Saber API)
JSSA aims to provide a clean and full wrapping of the Score Saber API.

## Summary
There is no documentation for ScoreSaber's API as of yet, but i have covered most of it in this library and in the provided examples.

1. [Prequisites](#prequisites)
2. [Download](#download)
3. [Documentation](#documentation)
4. [Support](#support)

## Prequisites
JSSA requires Gson to function properly; It is used to handle JSON objects that are directly fetched from Score Saber's API.

It can be Installed as shown below.

### Gradle
```gradle
dependencies {
  implementation 'com.google.code.gson:gson:2.8.7'
}
```
### Maven
```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.8.7</version>
</dependency>
```

## Download
Latest Stable Version: [GitHub Release](https://github.com/MillzyDev/JSSA/releases/latest)
Latest Version: [ ![version][] ][download]

Make sure to replace the `VERSION` value below with the one shown above

### Maven
```xml
<dependency>
    <groupId>dev.MillzyG</groupId>
    <artifactId>jssa</artifactId>
    <version>VERSION</version>
</dependency>
```
```xml
<repository>
    <id>github</id>
    <name>MillzyDev</name>
    <url>https://maven.pkg.github.com/MillzyDev</url>
</repository>
```
### Gradle
```gradle
dependencies {
    //Change 'implementation' to 'compile' in old Gradle versions
    implementation("dev.MillzyG:jssa:VERSION")
}

repositories {
  mavenCentral() // for transitive dependencies
  maven {
    name 'MillzyDev'
    url 'https://maven.pkg.github.com/MillzyDev'
  }
}
```
# Documentation
A full documentation can be found [Here](https://docs.jssa.millzyg.dev). If you are just starting, I suggest you look at the example below
## Example
```java
          JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String id = "76561198075009026"; // Tempex's ID

        String playerJson = converter.toJson(
                jssa.Players.GetPlayer(id)
        );

        System.out.println(playerJson);
```
You can expect an output in the console like this: 
```
{
  "playerInfo": {
    "playerId": "76561198075009026",
    "playerName": "Tempex",
    "avatar": "/api/static/avatars/76561198075009026.jpg",
    ...
  },
  "scoreStats": {
    "totalScore": 1518466825,
    "totalRankedScore": 144705269,
    "averageRankedAccuracy": 85.9466,
    ...
  }
}
```
I will update documentation in more detail as I maintain this library. Most of it is self explanitory.

## Support
Leave bug reports and other questions in the [Issues Page](https://github.com/MillzyG/JSSA/issues)
