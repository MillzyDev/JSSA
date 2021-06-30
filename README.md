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

# Documentation
A more in depth documentation can be found on [My Website]().
## Example
The Example below shold help you get started with using JSSA.
```java
  JSSA jssa = new JSSA(); // This is the main Object containing 2 Objects, Players and Requests.

  Players players = jssa.Players; // The Players Object contains methods to find players. getPlayer() and searchPlayers()
  Requests requests = jssa.Requests; // The Requests Object contains methods to find Songs.
```
  
## Methods
---
### getPlayer() - Returns full player data using provided ID
`getPlayer()` takes 1 `String` argument which is the player's ID. For the example below we will be using Tempex's ID.
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
---
### searchPlayers() - Returns an ArrayList of SimplePlayer objects
`searchPlayers()` takes 1 `String` argument which is the name you are searching for. It MUST be between 3 and 18 characters. For the example below, we will use "Tempex" as the search query.
```java
        JSSA jssa = new JSSA();
        Gson converter = new GsonBuilder().setPrettyPrinting().create();

        String search = "Tempex";

        String playersJson = converter.toJson(
                jssa.Players.SearchPlayers(search)
        );

        System.out.println(playersJson);
```
You should expect an output like this:
```
[
  {
    "playerId": "76561198075009026",
    "playerName": "Tempex",
    "rank": 3315,
    "pp": 7830.24,
    "avatar": "/api/static/avatars/76561198075009026.jpg",
    "country": "NO",
    ...
  }
]
```
## Support
