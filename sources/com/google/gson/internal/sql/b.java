package com.google.gson.internal.sql;

import Sc.c;
import com.google.gson.e;
import com.google.gson.n;
import com.google.gson.t;
import com.google.gson.u;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

final class b extends t {

    /* renamed from: b  reason: collision with root package name */
    static final u f58340b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f58341a;

    class a implements u {
        a() {
        }

        public t create(e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Time.class) {
                return new b((a) null);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    /* renamed from: a */
    public Time read(Sc.a aVar) {
        Time time;
        if (aVar.I0() == Sc.b.NULL) {
            aVar.t0();
            return null;
        }
        String B02 = aVar.B0();
        synchronized (this) {
            TimeZone timeZone = this.f58341a.getTimeZone();
            try {
                time = new Time(this.f58341a.parse(B02).getTime());
                this.f58341a.setTimeZone(timeZone);
            } catch (ParseException e10) {
                throw new n("Failed parsing '" + B02 + "' as SQL Time; at path " + aVar.F(), e10);
            } catch (Throwable th2) {
                this.f58341a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    /* renamed from: b */
    public void write(c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.T();
            return;
        }
        synchronized (this) {
            format = this.f58341a.format(time);
        }
        cVar.P0(format);
    }

    private b() {
        this.f58341a = new SimpleDateFormat("hh:mm:ss a");
    }
}
