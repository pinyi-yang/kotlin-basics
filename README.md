# Kotlin Basics

## Get Started

**Install Kotlin**
```
brew update
brew install kotlin
```

**VS code Extension**
* Kotlin
* Code Runner

## Syntax
* Type can be inferred (variable declaration, function return...)
    * Int, Double
    * String
    * Boolean
    * Any
* Class
    * to make class inheritable: `open class Shape`
    * inheritance: `class Circle(): Shape() {}`


* for and ranges
    * `in`, `step`, `downTo`

* collections
    * `listOf(1, 2, 3)`
        * .size, .lastIndex, 
        * .filter(), .sortedBy(), .map(), .forEach(): `list.filter(it > 2)`

* Special:
    * `when`: like `switch`
    * `is`: `"a" is String`
    * nullable: `fun parseInt(str: String): Int? {}`

