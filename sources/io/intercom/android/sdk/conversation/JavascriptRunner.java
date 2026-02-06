package io.intercom.android.sdk.conversation;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;

public class JavascriptRunner {
    private final Collection<Runnable> actionsAfterLoad;
    private boolean hasLoaded;
    /* access modifiers changed from: private */
    public final WebView webView;

    public JavascriptRunner(WebView webView2) {
        this(webView2, new ArrayList());
    }

    public synchronized void clearPendingScripts() {
        this.actionsAfterLoad.clear();
    }

    public synchronized void reset() {
        this.hasLoaded = false;
        clearPendingScripts();
    }

    public synchronized void run(final String str) {
        try {
            AnonymousClass1 r02 = new Runnable() {
                public void run() {
                    WebView access$000 = JavascriptRunner.this.webView;
                    access$000.loadUrl("javascript:" + str);
                }
            };
            if (this.hasLoaded) {
                this.webView.post(r02);
            } else {
                this.actionsAfterLoad.add(r02);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void runPendingScripts() {
        try {
            this.hasLoaded = true;
            for (Runnable run : this.actionsAfterLoad) {
                run.run();
            }
            clearPendingScripts();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    JavascriptRunner(WebView webView2, Collection<Runnable> collection) {
        this.hasLoaded = false;
        this.webView = webView2;
        this.actionsAfterLoad = collection;
    }
}
