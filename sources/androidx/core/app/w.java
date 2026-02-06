package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final String f15947a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f15948b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f15949c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15950d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15951e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f15952f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f15953g;

    static class a {
        public static RemoteInput a(w wVar) {
            Set<String> d10;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(wVar.i()).setLabel(wVar.h()).setChoices(wVar.e()).setAllowFreeFormInput(wVar.c()).addExtras(wVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (d10 = wVar.d()) != null) {
                for (String a10 : d10) {
                    b.a(addExtras, a10, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(addExtras, wVar.f());
            }
            return addExtras.build();
        }

        static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f15954a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f15955b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f15956c = new Bundle();

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f15957d;

        /* renamed from: e  reason: collision with root package name */
        private CharSequence[] f15958e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15959f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f15960g = 0;

        public d(String str) {
            if (str != null) {
                this.f15954a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public w a() {
            return new w(this.f15954a, this.f15957d, this.f15958e, this.f15959f, this.f15960g, this.f15956c, this.f15955b);
        }

        public d b(CharSequence charSequence) {
            this.f15957d = charSequence;
            return this;
        }
    }

    w(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set set) {
        this.f15947a = str;
        this.f15948b = charSequence;
        this.f15949c = charSequenceArr;
        this.f15950d = z10;
        this.f15951e = i10;
        this.f15952f = bundle;
        this.f15953g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(w wVar) {
        return a.a(wVar);
    }

    static RemoteInput[] b(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            remoteInputArr[i10] = a(wVarArr[i10]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.b(intent);
    }

    public boolean c() {
        return this.f15950d;
    }

    public Set d() {
        return this.f15953g;
    }

    public CharSequence[] e() {
        return this.f15949c;
    }

    public int f() {
        return this.f15951e;
    }

    public Bundle g() {
        return this.f15952f;
    }

    public CharSequence h() {
        return this.f15948b;
    }

    public String i() {
        return this.f15947a;
    }

    public boolean k() {
        if (c() || ((e() != null && e().length != 0) || d() == null || d().isEmpty())) {
            return false;
        }
        return true;
    }
}
