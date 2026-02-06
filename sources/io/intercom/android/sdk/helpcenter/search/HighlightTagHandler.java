package io.intercom.android.sdk.helpcenter.search;

import Sg.p;
import android.text.Editable;
import android.text.Html;
import android.text.style.StyleSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xml.sax.XMLReader;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HighlightTagHandler;", "Landroid/text/Html$TagHandler;", "<init>", "()V", "Landroid/text/Editable;", "text", "Llf/M;", "applyColorSpan", "(Landroid/text/Editable;)V", "", "opening", "", "tag", "output", "Lorg/xml/sax/XMLReader;", "xmlReader", "handleTag", "(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V", "", "startIndex", "I", "endIndex", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HighlightTagHandler implements Html.TagHandler {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int SPAN_FLAG = 33;
    private int endIndex;
    private int startIndex;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HighlightTagHandler$Companion;", "", "<init>", "()V", "SPAN_FLAG", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void applyColorSpan(Editable editable) {
        editable.setSpan(new StyleSpan(1), this.startIndex, this.endIndex, 33);
    }

    public void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        C6496s.h(str, "tag");
        C6496s.h(editable, "output");
        C6496s.h(xMLReader, "xmlReader");
        if (!p.v(str, "highlight", true)) {
            return;
        }
        if (z10) {
            this.startIndex = editable.length();
            return;
        }
        this.endIndex = editable.length();
        applyColorSpan(editable);
    }
}
