package com.google.gson.internal.bind;

import Sc.c;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class h extends c {

    /* renamed from: r  reason: collision with root package name */
    private static final Writer f58227r = new a();

    /* renamed from: s  reason: collision with root package name */
    private static final m f58228s = new m(MetricTracker.Action.CLOSED);

    /* renamed from: o  reason: collision with root package name */
    private final List f58229o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private String f58230p;

    /* renamed from: q  reason: collision with root package name */
    private com.google.gson.h f58231q = j.f58350a;

    class a extends Writer {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public h() {
        super(f58227r);
    }

    private void A1(com.google.gson.h hVar) {
        if (this.f58230p != null) {
            if (!hVar.k() || y()) {
                ((k) z1()).r(this.f58230p, hVar);
            }
            this.f58230p = null;
        } else if (this.f58229o.isEmpty()) {
            this.f58231q = hVar;
        } else {
            com.google.gson.h z12 = z1();
            if (z12 instanceof g) {
                ((g) z12).r(hVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private com.google.gson.h z1() {
        List list = this.f58229o;
        return (com.google.gson.h) list.get(list.size() - 1);
    }

    public c B0(double d10) {
        if (I() || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            A1(new m((Number) Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    public c E0(long j10) {
        A1(new m((Number) Long.valueOf(j10)));
        return this;
    }

    public c I0(Boolean bool) {
        if (bool == null) {
            return T();
        }
        A1(new m(bool));
        return this;
    }

    public c L0(Number number) {
        if (number == null) {
            return T();
        }
        if (!I()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        A1(new m(number));
        return this;
    }

    public c M(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f58229o.isEmpty() || this.f58230p != null) {
            throw new IllegalStateException("Did not expect a name");
        } else if (z1() instanceof k) {
            this.f58230p = str;
            return this;
        } else {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
    }

    public c P0(String str) {
        if (str == null) {
            return T();
        }
        A1(new m(str));
        return this;
    }

    public c R0(boolean z10) {
        A1(new m(Boolean.valueOf(z10)));
        return this;
    }

    public c T() {
        A1(j.f58350a);
        return this;
    }

    public void close() {
        if (this.f58229o.isEmpty()) {
            this.f58229o.add(f58228s);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
    }

    public c n() {
        g gVar = new g();
        A1(gVar);
        this.f58229o.add(gVar);
        return this;
    }

    public com.google.gson.h n1() {
        if (this.f58229o.isEmpty()) {
            return this.f58231q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f58229o);
    }

    public c o() {
        k kVar = new k();
        A1(kVar);
        this.f58229o.add(kVar);
        return this;
    }

    public c t() {
        if (this.f58229o.isEmpty() || this.f58230p != null) {
            throw new IllegalStateException();
        } else if (z1() instanceof g) {
            List list = this.f58229o;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c v() {
        if (this.f58229o.isEmpty() || this.f58230p != null) {
            throw new IllegalStateException();
        } else if (z1() instanceof k) {
            List list = this.f58229o;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
