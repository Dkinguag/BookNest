# BookNest

📖 BookNest - Android App
BookNest is a simple book listing app that allows users to add, search, and view books using Firebase Firestore.

Follow these steps to download, set up, and run the project in Android Studio.

✅ Step 1: Clone the Repository
Open a terminal and run:

sh
Copy
Edit
git clone https://github.com/dkinguag/BookNest.git
cd BookNest
✅ Step 2: Open in Android Studio
Open Android Studio.
Click "Open" and select the BookNest folder.
Wait for Gradle Sync to complete.
✅ Step 3: Add Firebase Configuration
Go to Firebase Console: Firebase Console
Download google-services.json:
Open your Firebase project.
Go to Project settings → General → Your apps.
Click Download google-services.json.
Place it inside app/ folder.
✅ Step 4: Build & Run the App
Select an emulator or connect a real device.
Click Run (▶️) in Android Studio.
The app should launch and be fully functional.
📂 Project Structure

pgsql
Copy
Edit
BookNest/
│-- app/
│   │-- src/
│   │   │-- main/
│   │   │   │-- java/com/booknest/app/
│   │   │   │   ├── activities/
│   │   │   │   │   ├── HomeActivity.java
│   │   │   │   │   ├── LoginActivity.java
│   │   │   │   │   ├── SignUpActivity.java
│   │   │   │   │   ├── AddBookActivity.java
│   │   │   │   ├── adapters/
│   │   │   │   │   ├── BookAdapter.java
│   │   │   │   ├── models/
│   │   │   │   │   ├── Book.java
│   │   │   │   ├── utils/
│   │   │   │   │   ├── FirebaseUtils.java
│   │   │-- res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_home.xml
│   │   │   │   ├── activity_login.xml
│   │   │   │   ├── activity_signup.xml
│   │   │   │   ├── activity_add_book.xml
│   │   │   ├── drawable/
│   │   │   ├── values/
│   │   │   │   ├── colors.xml
│   │   │   │   ├── strings.xml
│   │   │   ├── AndroidManifest.xml
│   │   │-- google-services.json (not included, must be added manually)
│-- build.gradle
│-- settings.gradle
│-- README.md
│-- .gitignore
🛠 Tech Stack

Language: Java ☕
IDE: Android Studio 🏗
Database: Firebase Firestore 🔥
Authentication: Firebase Auth 🔑
UI Framework: Material Design 🎨
💡 Troubleshooting

If you encounter issues:

Gradle Sync Fails? → Click File > Invalidate Caches & Restart in Android Studio.
Firebase Issues? → Make sure google-services.json is correctly placed.
App Crashes on Launch? → Check Logcat for errors and ensure Firebase setup is complete.
🤝 Contributing

Fork the repo.
Create a new branch (feature-new-feature).
Commit changes (git commit -m "Added new feature").
Push to your branch (git push origin feature-new-feature).
Open a Pull Request 🚀.
