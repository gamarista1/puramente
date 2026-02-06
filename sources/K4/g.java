package K4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f32344a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final a f32345b = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    private g() {
    }

    public static final Date a(String str) {
        try {
            Date parse = f32344a.b().parse(str);
            if (parse != null) {
                return parse;
            }
            throw new ParseException("DateFormat.parse returned null", 0);
        } catch (ParseException e10) {
            throw new IllegalArgumentException("Failed to parse timestamp", e10);
        }
    }

    private final DateFormat b() {
        Object obj = f32345b.get();
        if (obj != null) {
            return (DateFormat) obj;
        }
        throw new IllegalArgumentException("Unable to find valid dateformatter");
    }

    public static final String c(Date date) {
        return f32344a.b().format(date);
    }
}
