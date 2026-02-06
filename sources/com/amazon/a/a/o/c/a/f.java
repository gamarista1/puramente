package com.amazon.a.a.o.c.a;

import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class f extends ObjectInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f37557a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f37558b = new ArrayList();

    public f(InputStream inputStream) {
        super(inputStream);
    }

    private void b(String str) {
        for (a a10 : this.f37558b) {
            if (a10.a(str)) {
                a(str);
            }
        }
        for (a a11 : this.f37557a) {
            if (a11.a(str)) {
                return;
            }
        }
        a(str);
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    /* access modifiers changed from: protected */
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        b(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }

    public f a(Class<?>... clsArr) {
        for (Class<?> name : clsArr) {
            this.f37557a.add(new c(name.getName()));
        }
        return this;
    }

    public f a(String... strArr) {
        for (String gVar : strArr) {
            this.f37557a.add(new g(gVar));
        }
        return this;
    }

    public f a(Pattern pattern) {
        this.f37557a.add(new e(pattern));
        return this;
    }

    public f a(a aVar) {
        this.f37557a.add(aVar);
        return this;
    }

    public f b(Class<?>... clsArr) {
        for (Class<?> name : clsArr) {
            this.f37558b.add(new c(name.getName()));
        }
        return this;
    }

    public f b(String... strArr) {
        for (String gVar : strArr) {
            this.f37558b.add(new g(gVar));
        }
        return this;
    }

    public f b(Pattern pattern) {
        this.f37558b.add(new e(pattern));
        return this;
    }

    public f b(a aVar) {
        this.f37558b.add(aVar);
        return this;
    }
}
