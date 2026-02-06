package com.facebook.react.bridge;

import U5.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public final class FallbackJSBundleLoader extends JSBundleLoader {
    static final String RECOVERABLE = "facebook::react::Recoverable";
    static final String TAG = "FallbackJSBundleLoader";
    private final Stack<JSBundleLoader> mLoaders = new Stack<>();
    private final ArrayList<Exception> mRecoveredErrors = new ArrayList<>();

    public FallbackJSBundleLoader(List<JSBundleLoader> list) {
        ListIterator<JSBundleLoader> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            this.mLoaders.push(listIterator.previous());
        }
    }

    private JSBundleLoader getDelegateLoader() {
        if (!this.mLoaders.empty()) {
            return this.mLoaders.peek();
        }
        Throwable runtimeException = new RuntimeException("No fallback options available");
        Iterator<Exception> it = this.mRecoveredErrors.iterator();
        Throwable th2 = runtimeException;
        while (it.hasNext()) {
            th2.initCause(it.next());
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
        }
        throw runtimeException;
    }

    public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
        while (true) {
            try {
                return getDelegateLoader().loadScript(jSBundleLoaderDelegate);
            } catch (Exception e10) {
                if (e10.getMessage() == null || !e10.getMessage().startsWith(RECOVERABLE)) {
                    throw e10;
                }
                this.mLoaders.pop();
                this.mRecoveredErrors.add(e10);
                a.N(TAG, "Falling back from recoverable error", e10);
            }
        }
        throw e10;
    }
}
