package com.google.gson;

import Sc.c;
import com.google.gson.internal.bind.g;
import com.google.gson.internal.bind.h;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class t {

    private final class b extends t {
        private b() {
        }

        public Object read(Sc.a aVar) {
            if (aVar.I0() != Sc.b.NULL) {
                return t.this.read(aVar);
            }
            aVar.t0();
            return null;
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + t.this + "]";
        }

        public void write(c cVar, Object obj) {
            if (obj == null) {
                cVar.T();
            } else {
                t.this.write(cVar, obj);
            }
        }
    }

    public final Object fromJson(Reader reader) {
        return read(new Sc.a(reader));
    }

    public final Object fromJsonTree(h hVar) {
        try {
            return read(new g(hVar));
        } catch (IOException e10) {
            throw new i((Throwable) e10);
        }
    }

    public final t nullSafe() {
        if (!(this instanceof b)) {
            return new b();
        }
        return this;
    }

    public abstract Object read(Sc.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new c(writer), obj);
    }

    public final h toJsonTree(Object obj) {
        try {
            h hVar = new h();
            write(hVar, obj);
            return hVar.n1();
        } catch (IOException e10) {
            throw new i((Throwable) e10);
        }
    }

    public abstract void write(c cVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson((Reader) new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new i((Throwable) e10);
        }
    }
}
