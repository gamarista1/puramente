package com.google.gson.internal.sql;

import Sc.b;
import Sc.c;
import com.google.gson.e;
import com.google.gson.n;
import com.google.gson.t;
import com.google.gson.u;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

final class a extends t {

    /* renamed from: b  reason: collision with root package name */
    static final u f58338b = new C0866a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f58339a;

    /* renamed from: com.google.gson.internal.sql.a$a  reason: collision with other inner class name */
    class C0866a implements u {
        C0866a() {
        }

        public t create(e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new a((C0866a) null);
            }
            return null;
        }
    }

    /* synthetic */ a(C0866a aVar) {
        this();
    }

    /* renamed from: a */
    public Date read(Sc.a aVar) {
        Date date;
        if (aVar.I0() == b.NULL) {
            aVar.t0();
            return null;
        }
        String B02 = aVar.B0();
        synchronized (this) {
            TimeZone timeZone = this.f58339a.getTimeZone();
            try {
                date = new Date(this.f58339a.parse(B02).getTime());
                this.f58339a.setTimeZone(timeZone);
            } catch (ParseException e10) {
                throw new n("Failed parsing '" + B02 + "' as SQL Date; at path " + aVar.F(), e10);
            } catch (Throwable th2) {
                this.f58339a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return date;
    }

    /* renamed from: b */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.T();
            return;
        }
        synchronized (this) {
            format = this.f58339a.format(date);
        }
        cVar.P0(format);
    }

    private a() {
        this.f58339a = new SimpleDateFormat("MMM d, yyyy");
    }
}
