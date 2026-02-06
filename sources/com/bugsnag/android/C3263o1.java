package com.bugsnag.android;

import com.bugsnag.android.C3257m1;
import com.bugsnag.android.D0;
import java.io.File;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.bugsnag.android.o1  reason: case insensitive filesystem */
public final class C3263o1 extends D0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f38795h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator f38796i = new C3260n1();

    /* renamed from: g  reason: collision with root package name */
    private final String f38797g;

    /* renamed from: com.bugsnag.android.o1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3263o1(File file, int i10, String str, S0 s02, D0.a aVar) {
        super(new File(file, "sessions"), i10, s02, aVar);
        this.f38797g = str;
    }

    /* access modifiers changed from: private */
    public static final int m(File file, File file2) {
        if (file == null && file2 == null) {
            return 0;
        }
        if (file == null) {
            return 1;
        }
        if (file2 == null) {
            return -1;
        }
        return file.getName().compareTo(file2.getName());
    }

    public String f(Object obj) {
        return C3257m1.f38778d.a(obj, this.f38797g).a();
    }

    public final Date n(File file) {
        C3257m1.a aVar = C3257m1.f38778d;
        C6496s.e(file);
        return new Date(aVar.c(file));
    }

    public final boolean o(File file) {
        Calendar instance = Calendar.getInstance();
        instance.add(5, -60);
        C3257m1.a aVar = C3257m1.f38778d;
        C6496s.e(file);
        if (aVar.c(file) < instance.getTimeInMillis()) {
            return true;
        }
        return false;
    }
}
