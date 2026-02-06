package expo.modules.kotlin.views;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public final class i implements ReadableMap {

    /* renamed from: a  reason: collision with root package name */
    private final ReadableMap f60470a;

    /* renamed from: b  reason: collision with root package name */
    private final List f60471b;

    /* renamed from: c  reason: collision with root package name */
    private final ae.i f60472c;

    public i(ReadableMap readableMap, List list) {
        C6496s.h(readableMap, "backingMap");
        C6496s.h(list, "filteredKeys");
        this.f60470a = readableMap;
        this.f60471b = list;
        this.f60472c = new ae.i(readableMap.getEntryIterator(), new h(this));
    }

    /* access modifiers changed from: private */
    public static final boolean c(i iVar, Map.Entry entry) {
        C6496s.h(entry, "it");
        return !iVar.f60471b.contains(entry.getKey());
    }

    /* access modifiers changed from: private */
    public static final boolean e(i iVar, String str) {
        C6496s.h(str, "it");
        return !iVar.f60471b.contains(str);
    }

    /* renamed from: d */
    public ae.i getEntryIterator() {
        return this.f60472c;
    }

    public ReadableArray getArray(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getArray(str);
    }

    public boolean getBoolean(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getBoolean(str);
    }

    public double getDouble(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getDouble(str);
    }

    public Dynamic getDynamic(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getDynamic(str);
    }

    public int getInt(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getInt(str);
    }

    public long getLong(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getLong(str);
    }

    public ReadableMap getMap(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getMap(str);
    }

    public String getString(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getString(str);
    }

    public ReadableType getType(String str) {
        C6496s.h(str, "name");
        return this.f60470a.getType(str);
    }

    public boolean hasKey(String str) {
        C6496s.h(str, "name");
        return this.f60470a.hasKey(str);
    }

    public boolean isNull(String str) {
        C6496s.h(str, "name");
        return this.f60470a.isNull(str);
    }

    public ReadableMapKeySetIterator keySetIterator() {
        return new j(this.f60470a.keySetIterator(), new g(this));
    }

    public HashMap toHashMap() {
        return this.f60470a.toHashMap();
    }
}
