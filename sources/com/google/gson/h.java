package com.google.gson;

import Pc.G;
import Sc.c;
import java.io.IOException;
import java.io.StringWriter;

public abstract class h {
    public g a() {
        if (h()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public k b() {
        if (m()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public m d() {
        if (n()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h() {
        return this instanceof g;
    }

    public boolean k() {
        return this instanceof j;
    }

    public boolean m() {
        return this instanceof k;
    }

    public boolean n() {
        return this instanceof m;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.t0(q.LENIENT);
            G.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
