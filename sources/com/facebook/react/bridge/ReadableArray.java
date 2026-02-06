package com.facebook.react.bridge;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&J\u0010\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReadableArray;", "", "getArray", "index", "", "getBoolean", "", "getDouble", "", "getDynamic", "Lcom/facebook/react/bridge/Dynamic;", "getInt", "getLong", "", "getMap", "Lcom/facebook/react/bridge/ReadableMap;", "getString", "", "getType", "Lcom/facebook/react/bridge/ReadableType;", "isNull", "size", "toArrayList", "Ljava/util/ArrayList;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ReadableArray {
    ReadableArray getArray(int i10);

    boolean getBoolean(int i10);

    double getDouble(int i10);

    Dynamic getDynamic(int i10);

    int getInt(int i10);

    long getLong(int i10);

    ReadableMap getMap(int i10);

    String getString(int i10);

    ReadableType getType(int i10);

    boolean isNull(int i10);

    int size();

    ArrayList<Object> toArrayList();
}
