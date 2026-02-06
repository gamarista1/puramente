package io.intercom.android.sdk.helpcenter.sections;

import com.amazon.a.a.o.b;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import java.util.List;
import jh.d;
import kh.C6449f;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 +2\u00020\u0001:\u0002,+B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "helpCenterArticles", "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getHelpCenterArticles", "getHelpCenterArticles$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterSection {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {new C6449f(HelpCenterArticle$$serializer.INSTANCE), null};
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<HelpCenterArticle> helpCenterArticles;
    private final String title;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final C5978b serializer() {
            return HelpCenterSection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HelpCenterSection() {
        this((List) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HelpCenterSection copy$default(HelpCenterSection helpCenterSection, List<HelpCenterArticle> list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = helpCenterSection.helpCenterArticles;
        }
        if ((i10 & 2) != 0) {
            str = helpCenterSection.title;
        }
        return helpCenterSection.copy(list, str);
    }

    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterSection helpCenterSection, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        if (dVar.q(fVar, 0) || !C6496s.c(helpCenterSection.helpCenterArticles, C6565s.n())) {
            dVar.B(fVar, 0, bVarArr[0], helpCenterSection.helpCenterArticles);
        }
        if (dVar.q(fVar, 1) || !C6496s.c(helpCenterSection.title, "")) {
            dVar.t(fVar, 1, helpCenterSection.title);
        }
    }

    public final List<HelpCenterArticle> component1() {
        return this.helpCenterArticles;
    }

    public final String component2() {
        return this.title;
    }

    public final HelpCenterSection copy(List<HelpCenterArticle> list, String str) {
        C6496s.h(list, "helpCenterArticles");
        C6496s.h(str, b.f37461S);
        return new HelpCenterSection(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterSection)) {
            return false;
        }
        HelpCenterSection helpCenterSection = (HelpCenterSection) obj;
        return C6496s.c(this.helpCenterArticles, helpCenterSection.helpCenterArticles) && C6496s.c(this.title, helpCenterSection.title);
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.helpCenterArticles.hashCode() * 31) + this.title.hashCode();
    }

    public String toString() {
        return "HelpCenterSection(helpCenterArticles=" + this.helpCenterArticles + ", title=" + this.title + ')';
    }

    public /* synthetic */ HelpCenterSection(int i10, List<HelpCenterArticle> list, String str, t0 t0Var) {
        this.helpCenterArticles = (i10 & 1) == 0 ? C6565s.n() : list;
        if ((i10 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
    }

    public HelpCenterSection(List<HelpCenterArticle> list, String str) {
        C6496s.h(list, "helpCenterArticles");
        C6496s.h(str, b.f37461S);
        this.helpCenterArticles = list;
        this.title = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelpCenterSection(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6565s.n() : list, (i10 & 2) != 0 ? "" : str);
    }
}
