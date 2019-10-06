# Toast Notification - JavaSwing

Beautiful Floating Notification in Java Swing. Like Android.

![image](https://user-images.githubusercontent.com/40338524/66271996-8cd49500-e83a-11e9-9c7f-27d8751286e1.png)![image](https://user-images.githubusercontent.com/40338524/66272010-c4434180-e83a-11e9-940b-9ebfbc7ee476.png)![image](https://user-images.githubusercontent.com/40338524/66272019-d58c4e00-e83a-11e9-9b36-f66cd393a4a1.png)

Releases
https://github.com/kingaspx/Floating-Notifications-Java-Swing/releases

### Success Notification - LONG_DELAY

```
        new Toast.ToastSuccessful(
                "Success", //Message
                Toast.LONG_DELAY) //Duration
                .setVisible(true);
```
### Warning Notification - SHORT_DELAY

```
        new Toast.ToastWarning(
                "Warning", //Message
                Toast.SHORT_DELAY) //Duration
                .setVisible(true);
```
### Error Notification - LONG_DELAY

```
        new Toast.ToastError(
                "Error",
                Toast.LONG_DELAY)
                .setVisible(true);
```

### And coding style tests

```
        new Toast.ToastCustom(
                "Custom Notification", //message
                10000, //duraction
                new Color(33, 147, 176), // start color
                new Color(109, 213, 237), //end color
                30, 30, // margin horizontal, margin vertical
                "Comic Sans MS", Font.BOLD, 16, new Color(255, 255, 255)) //customize font
                .setVisible(true);
```

![image](https://user-images.githubusercontent.com/40338524/66272332-cb6c4e80-e83e-11e9-96ba-21d62d54c50f.png)

## Built With

* Netbeans
* Java 1.8 (Swing)

## Authors

* **Abner Rodrigues** - *Initial work* - [kingaspx](https://github.com/kingaspx)
