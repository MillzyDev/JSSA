# JSSA (Java Score Saber API)
JSSA aims to provide a clean and full wrapping of the Score Saber API. At the moment this Library only supports the Player section of the API as the API currently lacks documentation, but it will update in the future.

## Summary
There is no documentation for ScoreSaber's API as of yet, but i have covered most of it in this library and in the provided examples.

1. [Prequisites](#prequisites)
2. [Download](#download)
3. [Documentation](#docmentation)
4. [Support](#support)

## Prequisites
JSSA required Gson to function properly; It is used to handle JSON objects that are directly fetched from Score Saber's API.

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
At the moment JSSA must be added to your project manually with a compiled JAR file. It can be downloaded here:

[JSSA DOWNLOAD]()

## Documentation
### getPlayer() - Gets full player data using provided ID
`getPlayer()` takes 1 `String` argument which is the player's ID. For the example below we will be using Tempex's ID.
```java
        JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String id = "76561198075009026";

        String playerJson = converter.toJson(
                jssa.Players.GetPlayer(id)
        );

        System.out.println(playerJson);
```
You can expect an output in the console like this: ```
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

## Support
