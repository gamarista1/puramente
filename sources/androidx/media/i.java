package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f17311a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17312b;

    /* renamed from: c  reason: collision with root package name */
    private final String f17313c;

    /* renamed from: d  reason: collision with root package name */
    private int f17314d;

    /* renamed from: e  reason: collision with root package name */
    private d f17315e;

    /* renamed from: f  reason: collision with root package name */
    private VolumeProvider f17316f;

    class a extends VolumeProvider {
        a(int i10, int i11, int i12, String str) {
            super(i10, i11, i12, str);
        }

        public void onAdjustVolume(int i10) {
            i.this.e(i10);
        }

        public void onSetVolumeTo(int i10) {
            i.this.f(i10);
        }
    }

    class b extends VolumeProvider {
        b(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        public void onAdjustVolume(int i10) {
            i.this.e(i10);
        }

        public void onSetVolumeTo(int i10) {
            i.this.f(i10);
        }
    }

    private static class c {
        static void a(VolumeProvider volumeProvider, int i10) {
            volumeProvider.setCurrentVolume(i10);
        }
    }

    public static abstract class d {
        public abstract void a(i iVar);
    }

    public i(int i10, int i11, int i12) {
        this(i10, i11, i12, (String) null);
    }

    public final int a() {
        return this.f17314d;
    }

    public final int b() {
        return this.f17312b;
    }

    public final int c() {
        return this.f17311a;
    }

    public Object d() {
        if (this.f17316f == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f17316f = new a(this.f17311a, this.f17312b, this.f17314d, this.f17313c);
            } else {
                this.f17316f = new b(this.f17311a, this.f17312b, this.f17314d);
            }
        }
        return this.f17316f;
    }

    public abstract void e(int i10);

    public abstract void f(int i10);

    public final void g(int i10) {
        this.f17314d = i10;
        c.a((VolumeProvider) d(), i10);
    }

    public i(int i10, int i11, int i12, String str) {
        this.f17311a = i10;
        this.f17312b = i11;
        this.f17314d = i12;
        this.f17313c = str;
    }
}
