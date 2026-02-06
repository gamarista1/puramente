package com.facebook.react.bridge;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"com/facebook/react/bridge/ReadableNativeMap$keySetIterator$1", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "currentIndex", "", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "hasNextKey", "", "nextKey", "", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReadableNativeMap$keySetIterator$1 implements ReadableMapKeySetIterator {
    final /* synthetic */ String[] $iteratorKeys;
    private int currentIndex;

    ReadableNativeMap$keySetIterator$1(String[] strArr) {
        this.$iteratorKeys = strArr;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public boolean hasNextKey() {
        if (this.currentIndex < this.$iteratorKeys.length) {
            return true;
        }
        return false;
    }

    public String nextKey() {
        String[] strArr = this.$iteratorKeys;
        int i10 = this.currentIndex;
        this.currentIndex = i10 + 1;
        return strArr[i10];
    }

    public final void setCurrentIndex(int i10) {
        this.currentIndex = i10;
    }
}
