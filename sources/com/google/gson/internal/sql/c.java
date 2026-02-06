package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.t;
import com.google.gson.u;
import java.sql.Timestamp;
import java.util.Date;

class c extends t {

    /* renamed from: b  reason: collision with root package name */
    static final u f58342b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final t f58343a;

    class a implements u {
        a() {
        }

        public t create(e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new c(eVar.p(Date.class), (a) null);
            }
            return null;
        }
    }

    /* synthetic */ c(t tVar, a aVar) {
        this(tVar);
    }

    /* renamed from: a */
    public Timestamp read(Sc.a aVar) {
        Date date = (Date) this.f58343a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* renamed from: b */
    public void write(Sc.c cVar, Timestamp timestamp) {
        this.f58343a.write(cVar, timestamp);
    }

    private c(t tVar) {
        this.f58343a = tVar;
    }
}
