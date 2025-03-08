# 📖 BookNest - Android App
**BookNest** is a simple book listing app that allows users to add, search, and view books using Firebase Firestore.

---

## 🚀 Features
- 📚 **Book Listing:** View a list of books stored in Firestore.
- 🔍 **Search Books:** Easily find books using the search bar.
- ➕ **Add New Books:** Users can add books with a title, author, and price.
- 🏠 **Login/Signup:** Users must authenticate before accessing the app.
- 🔥 **Firebase Integration:** Data is stored in Firebase Firestore.

---

## 🛠 Project Setup
Follow these steps to **download, set up, and run** the project in **Android Studio**.

### ✅ Step 1: Clone the Repository
Open a terminal and run:

```sh
git clone https://github.com/dkinguag/BookNest.git
cd BookNest

### ✅ Step 2: Open in Android Studio
1. Open Android Studio.
2. Click "Open" and select the BookNest folder.
3. Wait for Gradle Sync to complete.

### ✅  Step 3: Add Firebase Configuration
1. Go to Firebase Console: Firebase Console
2. Download google-services.json:
 - Open your Firebase project.
 - Go to Project settings → General → Your apps.
 - Click Download google-services.json.
 - Place it inside the app/ folder.

### ✅  Step 4: Build & Run the App
1. Select an emulator or connect a real device.
2. Click Run (▶️) in Android Studio.
3. The app should launch and be fully functional.

## 🛠 Troubleshooting 
If you encounter issues:

Gradle Sync Fails? → Click File > Invalidate Caches & Restart in Android Studio.
Firebase Issues? → Make sure google-services.json is correctly placed.
App Crashes on Launch? → Check Logcat for errors and ensure Firebase setup is complete.

