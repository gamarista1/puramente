package com.google.gson.internal.bind;

import Pc.D;
import Pc.x;
import com.google.gson.e;
import com.google.gson.n;
import com.google.gson.t;
import com.google.gson.u;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

public final class c extends t {

    /* renamed from: c  reason: collision with root package name */
    public static final u f58205c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b f58206a;

    /* renamed from: b  reason: collision with root package name */
    private final List f58207b;

    class a implements u {
        a() {
        }

        public t create(e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new c(b.f58208b, 2, 2, (a) null);
            }
            return null;
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f58208b = new a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        private final Class f58209a;

        class a extends b {
            a(Class cls) {
                super(cls);
            }

            /* access modifiers changed from: protected */
            public Date d(Date date) {
                return date;
            }
        }

        protected b(Class cls) {
            this.f58209a = cls;
        }

        private u c(c cVar) {
            return o.a(this.f58209a, cVar);
        }

        public final u a(int i10, int i11) {
            return c(new c(this, i10, i11, (a) null));
        }

        public final u b(String str) {
            return c(new c(this, str, (a) null));
        }

        /* access modifiers changed from: protected */
        public abstract Date d(Date date);
    }

    /* synthetic */ c(b bVar, int i10, int i11, a aVar) {
        this(bVar, i10, i11);
    }

    private Date a(Sc.a aVar) {
        TimeZone timeZone;
        String B02 = aVar.B0();
        synchronized (this.f58207b) {
            try {
                for (DateFormat dateFormat : this.f58207b) {
                    timeZone = dateFormat.getTimeZone();
                    Date parse = dateFormat.parse(B02);
                    dateFormat.setTimeZone(timeZone);
                    return parse;
                }
                try {
                    return Qc.a.f(B02, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new n("Failed parsing '" + B02 + "' as Date; at path " + aVar.F(), e10);
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: b */
    public Date read(Sc.a aVar) {
        if (aVar.I0() == Sc.b.NULL) {
            aVar.t0();
            return null;
        }
        return this.f58206a.d(a(aVar));
    }

    /* renamed from: c */
    public void write(Sc.c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.T();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f58207b.get(0);
        synchronized (this.f58207b) {
            format = dateFormat.format(date);
        }
        cVar.P0(format);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f58207b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* synthetic */ c(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    private c(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f58207b = arrayList;
        Objects.requireNonNull(bVar);
        this.f58206a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private c(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f58207b = arrayList;
        Objects.requireNonNull(bVar);
        this.f58206a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (x.c()) {
            arrayList.add(D.c(i10, i11));
        }
    }
}
