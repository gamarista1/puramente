package S9;

import android.net.Uri;
import ja.C3645a;
import java.util.LinkedHashMap;
import java.util.Map;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap f33971a;

    class a extends LinkedHashMap {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f33972a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f33972a = i11;
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry entry) {
            if (size() > this.f33972a) {
                return true;
            }
            return false;
        }
    }

    public e(int i10) {
        this.f33971a = new a(this, i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f33971a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f33971a.put((Uri) C3645a.e(uri), (byte[]) C3645a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f33971a.remove(C3645a.e(uri));
    }
}
