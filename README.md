Every Locale
------------

Copyright (C) 2012 Sweetie Piggy Apps <sweetiepiggyapps@gmail.com>

This file is part of Every Locale.

Every Locale is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

Every Locale is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Every Locale; if not, see <http://www.gnu.org/licenses/>.

DESCRIPTION
===========

Change the locale (language/country/variant) of your phone. That's all.
This app does one thing and does it well.

Take note that if a locale is not supported by your phone or your app
then you may not notice any change.

The only permission required by this app is CHANGE_CONFIGURATION, which is
needed to change the locale. There are no ads.

Feedback and suggestions for improvement are most welcome.
Note on Android 4.2 or newer
============

Due to security considerations CHANGE_CONFIGURATION is not granted for
installed applications so you need to grant it manually.
Fitst, enable USB debugging on your device as described
[here](http://developer.android.com/tools/device.html#setting-up).
[adb](http://developer.android.com/tools/help/adb.html) is also needed.
In your terminal or command prompt change the directory to where `adb` is located and enter these commands:

`adb shell`

`pm grant com.sweetiepiggy.everylocale android.permission.CHANGE_CONFIGURATION`

After that you can disable USB debugging.

INSTALLATION
============

* F-Droid and APK download
https://f-droid.org/repository/browse/?fdid=com.sweetiepiggy.everylocale

* Google Play
https://play.google.com/store/apps/details?id=com.sweetiepiggy.everylocale

BUILD
=====

See developer.android.com for tutorials on how to build Android apps
using Eclipse w/ the Android SDK.

http://developer.android.com/resources/tutorials/hello-world.html

LINKS
=====

* Twitter
  http://twitter.com/sweetiepiggyapp

* Source - GitHub
  https://github.com/sweetiepiggy/Every-Locale
