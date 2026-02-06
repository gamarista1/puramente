package io.intercom.android.sdk.utilities;

import android.content.Context;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeFormatter {
    private SimpleDateFormat absoluteDateFormatter;
    private SimpleDateFormat absoluteTimeFormatter;
    private final Context context;
    private final TimeProvider timeProvider;

    public TimeFormatter(Context context2, TimeProvider timeProvider2) {
        this.context = context2;
        this.timeProvider = timeProvider2;
    }

    public static String formatFromUtcTime(int i10, int i11) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        instance.set(11, i10);
        instance.set(12, i11);
        Date time = instance.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(time);
    }

    public static String formatTimeForTickets(long j10, Context context2) {
        Phrase phrase;
        Date date = new Date(j10 * 1000);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(System.currentTimeMillis() - date.getTime());
        long hours = timeUnit.toHours(System.currentTimeMillis() - date.getTime());
        long days = timeUnit.toDays(System.currentTimeMillis() - date.getTime());
        long j11 = days / 7;
        if (j11 > 0) {
            phrase = Phrase.from(context2, R.string.intercom_time_week_ago).put("delta", (CharSequence) Long.toString(j11));
        } else if (days > 0) {
            phrase = Phrase.from(context2, R.string.intercom_time_day_ago).put("delta", (CharSequence) Long.toString(days));
        } else if (hours > 0) {
            phrase = Phrase.from(context2, R.string.intercom_time_hour_ago).put("delta", (CharSequence) Long.toString(hours));
        } else if (minutes < 1) {
            return context2.getString(R.string.intercom_time_just_now);
        } else {
            phrase = Phrase.from(context2, R.string.intercom_time_minute_ago).put("delta", (CharSequence) Long.toString(minutes));
        }
        return phrase.format().toString();
    }

    public static String formatTimeInMillisAsDate(long j10, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j10));
    }

    public static String formatToUtcTime(int i10, int i11) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, i10);
        instance.set(12, i11);
        Date time = instance.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(time);
    }

    private Date getDateFromTimeStamp(long j10) {
        return new Date(j10 * 1000);
    }

    private long getDifferenceInMinutes(Date date) {
        return TimeUnit.MILLISECONDS.toMinutes(this.timeProvider.currentTimeMillis() - date.getTime());
    }

    public static int getHour(long j10) {
        return new Date(j10).getHours();
    }

    public static int getMinute(long j10) {
        return new Date(j10).getMinutes();
    }

    public CharSequence getAdminActiveStatus(LastParticipatingAdmin lastParticipatingAdmin, Provider<AppConfig> provider) {
        if (shouldShowActiveOrAwayState(provider.get().getLocale())) {
            if (lastParticipatingAdmin.isActive()) {
                return this.context.getString(R.string.intercom_active_state);
            }
            return this.context.getString(R.string.intercom_away_state);
        } else if (lastParticipatingAdmin.getLastActiveAt() <= 0) {
            return "";
        } else {
            return getAdminActiveStatus(getDateFromTimeStamp(lastParticipatingAdmin.getLastActiveAt()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldShowActiveOrAwayState(String str) {
        return str.equals("en");
    }

    private CharSequence getAdminActiveStatus(Date date) {
        Phrase phrase;
        long differenceInMinutes = getDifferenceInMinutes(date);
        if (differenceInMinutes > TimeUnit.DAYS.toMinutes(6)) {
            return this.context.getText(R.string.intercom_active_week_ago);
        }
        if (differenceInMinutes >= TimeUnit.HOURS.toMinutes(23) + 31) {
            phrase = Phrase.from(this.context, R.string.intercom_active_day_ago).put("days", (CharSequence) Long.toString((((differenceInMinutes / 60) - 13) / 24) + 1));
        } else if (differenceInMinutes >= 53) {
            phrase = Phrase.from(this.context, R.string.intercom_active_hour_ago).put("hours", (CharSequence) Long.toString(((differenceInMinutes - 31) / 60) + 1));
        } else if (differenceInMinutes >= 38) {
            phrase = Phrase.from(this.context, R.string.intercom_active_minute_ago).put("minutes", (CharSequence) Long.toString(45));
        } else if (differenceInMinutes >= 16) {
            phrase = Phrase.from(this.context, R.string.intercom_active_minute_ago).put("minutes", (CharSequence) Long.toString(30));
        } else {
            phrase = Phrase.from(this.context, R.string.intercom_active_15m_ago).put("minutes", (CharSequence) Long.toString(15));
        }
        return phrase.format();
    }
}
