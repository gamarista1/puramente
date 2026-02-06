package com.vonovak;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.provider.CalendarContract;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public abstract class a {
    static boolean a(ContentResolver contentResolver, long j10) {
        Cursor query = contentResolver.query(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, j10), new String[]{"_id"}, "((deleted != 1))", (String[]) null, (String) null);
        if (query == null || query.getCount() <= 0) {
            return false;
        }
        query.close();
        return true;
    }

    static boolean b(ContentResolver contentResolver, String str) {
        try {
            return a(contentResolver, Long.valueOf(str).longValue());
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    static Long c(Cursor cursor) {
        Long l10 = null;
        if (cursor != null) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("max_id");
            if (columnIndex != -1) {
                l10 = Long.valueOf(cursor.getLong(columnIndex));
            }
            cursor.close();
        }
        return l10;
    }

    static long d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str).getTime();
    }
}
