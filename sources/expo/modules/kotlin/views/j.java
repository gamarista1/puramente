package expo.modules.kotlin.views;

import ae.h;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import kotlin.jvm.internal.C6496s;

public final class j implements ReadableMapKeySetIterator {

    /* renamed from: a  reason: collision with root package name */
    private final ReadableMapKeySetIterator f60473a;

    /* renamed from: b  reason: collision with root package name */
    private final h f60474b;

    /* renamed from: c  reason: collision with root package name */
    private String f60475c;

    public j(ReadableMapKeySetIterator readableMapKeySetIterator, h hVar) {
        C6496s.h(readableMapKeySetIterator, "iterator");
        C6496s.h(hVar, "filter");
        this.f60473a = readableMapKeySetIterator;
        this.f60474b = hVar;
        a();
    }

    private final void a() {
        while (this.f60473a.hasNextKey()) {
            String nextKey = this.f60473a.nextKey();
            this.f60475c = nextKey;
            if (this.f60474b.apply(nextKey)) {
                return;
            }
        }
        this.f60475c = null;
    }

    public boolean hasNextKey() {
        if (this.f60475c != null) {
            return true;
        }
        return false;
    }

    public String nextKey() {
        String str = this.f60475c;
        C6496s.e(str);
        a();
        return str;
    }
}
