# Toast Notification - JavaSwing

Beautiful Floating Notification in Java Swing. Like Android.

![image](https://user-images.githubusercontent.com/40338524/71606623-32a15280-2b51-11ea-9e7e-7e962f79beb4.png)

Releases
https://github.com/kingaspx/Floating-Notifications-Java-Swing/releases

### Success Notification - LONG_DELAY

```
        new Toast.ToastSuccessful(
                "I'm title Jframe",  //Title JFrame
                "i'm title notification",  //Title Notification
                "i'm msg", //Message
                Toast.LONG_DELAY); //Duration
```
### Warning Notification - SHORT_DELAY

```
        new Toast.ToastWarning(
                "Message", 
                Toast.SHORT_DELAY);
```
### Error Notification - LONG_DELAY

```
        new Toast.ToastError(
                "MA FRIEND",  //Message
                Toast.LONG_DELAY); //Delay
```

### Custom Notification

```
        new Toast.ToastSteam( //Custom Notification
                "MA FRIEND", //Title
                "ANY GAME", //Message
                CUSTOM_DELAY); //Duration
```

![image](https://user-images.githubusercontent.com/40338524/71606629-3d5be780-2b51-11ea-9c69-379690dfb03b.png)

## Built With

* Netbeans
* Java 1.8 (Swing)

## Authors

* **Abner Rodrigues** - *Initial work* - [kingaspx](https://github.com/kingaspx)
