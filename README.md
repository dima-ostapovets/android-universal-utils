# Android Universal Utils
This project for every developer for simplify daily work.

The main ideas:
* Nice code
* Less words
* Fast development
* Fan

## LOG
Simple add as many parameters as you need, any type. "|" - delimiter for see white spaces in the end
```java

LOG.TAG = "DEBUG"; //Default
LOG.DELIMITER = "|"; //Default
LOG.isEnable = true; //Default, can be easy disable in config

LOG.d("Hello", "Log ", 5, Long.valueOf(99l), new Date());
```
```
Hello|Log |5|99|Thu Jun 12 12:39:50 EET 2014|
```
