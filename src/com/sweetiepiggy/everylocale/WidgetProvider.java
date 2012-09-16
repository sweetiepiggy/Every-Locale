/*
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
*/

package com.sweetiepiggy.everylocale;

import java.util.Locale;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class WidgetProvider extends AppWidgetProvider
{
	@Override
	public void onUpdate(Context context, AppWidgetManager app_widget_mgr, int[] app_widget_ids)
	{
		final int N = app_widget_ids.length;

		// Perform this loop procedure for each App Widget that belongs to this provider
		for (int i=0; i < N; i++) {
			int app_widget_id = app_widget_ids[i];

			// Create an Intent to launch ExampleActivity
			Intent intent = new Intent(context, EveryLocaleActivity.class);
			PendingIntent pending_intent = PendingIntent.getActivity(context, 0, intent, 0);

			// Get the layout for the App Widget and attach an on-click listener
			// to the button
			RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
			views.setOnClickPendingIntent(R.id.layout, pending_intent);

			Locale default_locale = Locale.getDefault();
			String language_name = default_locale.getDisplayLanguage();
			String country_name = default_locale.getDisplayCountry();
			String variant_code = default_locale.getVariant();

			views.setTextViewText(R.id.language, language_name);
			views.setTextViewText(R.id.country, country_name);
			views.setTextViewText(R.id.variant, variant_code);

			// Tell the AppWidgetManager to perform an update on the current app widget
			app_widget_mgr.updateAppWidget(app_widget_id, views);
		}
		super.onUpdate(context, app_widget_mgr, app_widget_ids);
	}
}

