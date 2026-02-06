package com.bugsnag.android;

import Sg.p;
import com.bugsnag.android.K0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class u1 implements K0.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38899b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f38900a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Boolean a(String str, Collection collection) {
            Iterable<String> iterable = collection;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return null;
            }
            for (String J10 : iterable) {
                if (p.J(str, J10, false, 2, (Object) null)) {
                    return Boolean.TRUE;
                }
            }
            return null;
        }

        public final s1 b(StackTraceElement stackTraceElement, Collection collection, S0 s02) {
            String methodName;
            try {
                String className = stackTraceElement.getClassName();
                if (className.length() > 0) {
                    methodName = className + '.' + stackTraceElement.getMethodName();
                } else {
                    methodName = stackTraceElement.getMethodName();
                }
                String str = methodName;
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "Unknown";
                }
                return new s1(str, fileName, Integer.valueOf(stackTraceElement.getLineNumber()), a(className, collection), (Map) null, (Number) null, 48, (DefaultConstructorMarker) null);
            } catch (Exception e10) {
                s02.b("Failed to serialize stacktrace", e10);
                return null;
            }
        }

        private a() {
        }
    }

    public u1(List list) {
        this.f38900a = b(list);
    }

    private final List b(List list) {
        if (list.size() >= 200) {
            return list.subList(0, 200);
        }
        return list;
    }

    public final List a() {
        return this.f38900a;
    }

    public void toStream(K0 k02) {
        k02.f();
        for (s1 E02 : this.f38900a) {
            k02.E0(E02);
        }
        k02.q();
    }

    public u1(StackTraceElement[] stackTraceElementArr, Collection collection, S0 s02) {
        int min = Math.min(200, stackTraceElementArr.length);
        this.f38900a = new ArrayList(min);
        int i10 = 0;
        while (i10 < min) {
            int i11 = i10 + 1;
            s1 b10 = f38899b.b(stackTraceElementArr[i10], collection, s02);
            if (b10 != null) {
                this.f38900a.add(b10);
            }
            i10 = i11;
        }
    }
}
