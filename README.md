# DPSDK Android Sample Project
DirectPay sample project for android integration. This sdk helps you to add new payment cards through your mobile application. To make payments and other card management, please use the APIs. [(Read more)](https://doc.directpay.lk/userWiseCard/)

## Download DirectPay Android SDK

[Click](https://doc.directpay.lk/sdk/dpsdk.aar) to Download SDK</a>

## Specifications

- DirectPay Mobile SDK (Android): 1.0.1

- Minimum Sdk Version: 19

### Installation (Android Studio)

1. Right click on the project and choose "Project Structure".

2. On the top of the dialog click on + icon for New Module.

3. From the New Module dialog click on Import .JAR/.AAR Package and Next.
4. Select dpsdk.aar from filename and Click Finish.

### Usage
#### Additional dependencies
```sh
implementation 'com.google.code.gson:gson:2.8.6'
```
#### 1.1 Create DPSDK instance

```js
DPSDK dpsdk = new DPSDK(
                "API_KEY",
                "YOUR_MERCHANT_ID",
                "USER_ID",
                "USER_NAME",
                "+94731234567",
                "emailifavailable@user.com"
            );
```

#### 1.2 Add Credit/Debit Card

```js
dpsdk..addNewCard(MainActivity.this, new CardAddCallback() {
        @Override
        public void onSuccess(Card card) {
            Log.d("SUCCESS", card.toString());
        }

        @Override
        public void onError(int code, String message) {
            Log.e("ERROR", code + " - " + message);
        }
});
```
### Sample Project

- Get the [sample project](https://github.com/directpaylk/dpsdk-android-sample-project) from github.
---

### Error Codes

Error callback - error(code, message)

| Code | Message                   |
| ---- | :------------------------ |
| 567  | CANNOT_VERIFY_THE_REQUEST |
| 568  | CANNOT_PROCESS            |
| 569  | INVALID_SERVER_RESPONSE   |
| 570  | SERVICE_UNAVAILABLE       |
| 571  | INTERNAL_ERROR            |
| 600  | USER_ACTION_CLOSE         |
| 601  | TOO_LARGE_RETRY_ATTEMPTS  |

 
