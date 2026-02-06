package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import io.intercom.android.sdk.R;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0016"}, d2 = {"formattedDateFromLong", "", "", "context", "Landroid/content/Context;", "formattedDateForDayDivider", "toISOFormat", "toISOFormatApi26", "toISOFormatPreApi26", "toHourOfDay", "toHourOfDayApi26", "zoneId", "Ljava/time/ZoneId;", "toHourOfDayPreApi26", "timeZone", "Ljava/util/TimeZone;", "getFormattedTime", "date", "Ljava/util/Date;", "getDifferenceInMinutes", "getDifferenceInHours", "getDifferenceInDays", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TimeFormatterExtKt {
    public static final String formattedDateForDayDivider(long j10, Context context) {
        C6496s.h(context, "context");
        if (j10 <= 0) {
            return "";
        }
        Date date = new Date(j10 * ((long) 1000));
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        String format = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeCompat, "MMMM d"), localeCompat).format(date);
        C6496s.g(format, "format(...)");
        return format;
    }

    public static final String formattedDateFromLong(long j10, Context context) {
        C6496s.h(context, "context");
        if (j10 <= 0) {
            return "";
        }
        return getFormattedTime(context, new Date(j10 * ((long) 1000)));
    }

    private static final long getDifferenceInDays(Date date) {
        return TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInHours(Date date) {
        return TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInMinutes(Date date) {
        return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - date.getTime());
    }

    private static final String getFormattedTime(Context context, Date date) {
        long differenceInMinutes = getDifferenceInMinutes(date);
        long differenceInHours = getDifferenceInHours(date);
        long differenceInDays = getDifferenceInDays(date);
        long j10 = differenceInDays / ((long) 7);
        if (j10 > 0) {
            return Phrase.from(context, R.string.intercom_time_week_ago).put("delta", (CharSequence) String.valueOf(j10)).format().toString();
        }
        if (differenceInDays > 0) {
            return Phrase.from(context, R.string.intercom_time_day_ago).put("delta", (CharSequence) String.valueOf(differenceInDays)).format().toString();
        }
        if (differenceInHours > 0) {
            return Phrase.from(context, R.string.intercom_time_hour_ago).put("delta", (CharSequence) String.valueOf(differenceInHours)).format().toString();
        }
        if (differenceInMinutes >= 1) {
            return Phrase.from(context, R.string.intercom_time_minute_ago).put("delta", (CharSequence) String.valueOf(differenceInMinutes)).format().toString();
        }
        return context.getText(R.string.intercom_time_just_now).toString();
    }

    public static final String toHourOfDay(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return toHourOfDayApi26$default(j10, (ZoneId) null, 1, (Object) null);
        }
        return toHourOfDayPreApi26$default(j10, (TimeZone) null, 1, (Object) null);
    }

    public static final String toHourOfDayApi26(long j10, ZoneId zoneId) {
        C6496s.h(zoneId, "zoneId");
        String a10 = DateTimeFormatter.ofPattern("HH:mm a", Locale.getDefault()).format(d.a(ZonedDateTime.ofInstant(Instant.ofEpochMilli(j10 * ((long) 1000)), zoneId)));
        C6496s.g(a10, "format(...)");
        return a10;
    }

    public static /* synthetic */ String toHourOfDayApi26$default(long j10, ZoneId zoneId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toHourOfDayApi26(j10, zoneId);
    }

    public static final String toHourOfDayPreApi26(long j10, TimeZone timeZone) {
        C6496s.h(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm a", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(Long.valueOf(j10 * ((long) 1000)));
        C6496s.g(format, "format(...)");
        return format;
    }

    public static /* synthetic */ String toHourOfDayPreApi26$default(long j10, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toHourOfDayPreApi26(j10, timeZone);
    }

    public static final String toISOFormat(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return toISOFormatApi26(j10);
        }
        return toISOFormatPreApi26(j10);
    }

    public static final String toISOFormatApi26(long j10) {
        String a10 = DateTimeFormatter.ISO_INSTANT.format(d.a(Instant.ofEpochMilli(j10 * ((long) 1000))));
        C6496s.g(a10, "format(...)");
        return a10;
    }

    public static final String toISOFormatPreApi26(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(Long.valueOf(j10 * ((long) 1000)));
        C6496s.g(format, "format(...)");
        return format;
    }
}
