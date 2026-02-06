package io.intercom.android.sdk.helpcenter.sections;

import com.amazon.a.a.o.b;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$$serializer;
import java.util.List;
import jh.d;
import kh.C6449f;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 G2\u00020\u0001:\u0002HGBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b\u0011\u0010\u0012B\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0003¢\u0006\u0004\b*\u0010%Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÇ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\rH×\u0001¢\u0006\u0004\b.\u0010)J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010!R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010!R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010%R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010%R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010%R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010)R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010;\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010%¨\u0006I"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "", "", "collectionId", "title", "summary", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "helpCenterArticles", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "helpCenterSections", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "subCollections", "", "articlesCount", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "authors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;)V", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()I", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;)Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCollectionId", "getCollectionId$annotations", "()V", "getTitle", "getTitle$annotations", "getSummary", "getSummary$annotations", "Ljava/util/List;", "getHelpCenterArticles", "getHelpCenterArticles$annotations", "getHelpCenterSections", "getHelpCenterSections$annotations", "getSubCollections", "getSubCollections$annotations", "I", "getArticlesCount", "getArticlesCount$annotations", "getAuthors", "getAuthors$annotations", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterCollectionContent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, new C6449f(HelpCenterArticle$$serializer.INSTANCE), new C6449f(HelpCenterSection$$serializer.INSTANCE), new C6449f(HelpCenterCollection$$serializer.INSTANCE), null, new C6449f(Author$$serializer.INSTANCE)};
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int articlesCount;
    private final List<Author> authors;
    private final String collectionId;
    private final List<HelpCenterArticle> helpCenterArticles;
    private final List<HelpCenterSection> helpCenterSections;
    private final List<HelpCenterCollection> subCollections;
    private final String summary;
    private final String title;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final C5978b serializer() {
            return HelpCenterCollectionContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HelpCenterCollectionContent(int i10, String str, String str2, String str3, List list, List list2, List list3, int i11, List list4, t0 t0Var) {
        if (65 != (i10 & 65)) {
            C6456i0.a(i10, 65, HelpCenterCollectionContent$$serializer.INSTANCE.getDescriptor());
        }
        this.collectionId = str;
        if ((i10 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i10 & 4) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
        if ((i10 & 8) == 0) {
            this.helpCenterArticles = C6565s.n();
        } else {
            this.helpCenterArticles = list;
        }
        if ((i10 & 16) == 0) {
            this.helpCenterSections = C6565s.n();
        } else {
            this.helpCenterSections = list2;
        }
        if ((i10 & 32) == 0) {
            this.subCollections = C6565s.n();
        } else {
            this.subCollections = list3;
        }
        this.articlesCount = i11;
        if ((i10 & 128) == 0) {
            this.authors = C6565s.n();
        } else {
            this.authors = list4;
        }
    }

    public static /* synthetic */ HelpCenterCollectionContent copy$default(HelpCenterCollectionContent helpCenterCollectionContent, String str, String str2, String str3, List list, List list2, List list3, int i10, List list4, int i11, Object obj) {
        HelpCenterCollectionContent helpCenterCollectionContent2 = helpCenterCollectionContent;
        int i12 = i11;
        return helpCenterCollectionContent.copy((i12 & 1) != 0 ? helpCenterCollectionContent2.collectionId : str, (i12 & 2) != 0 ? helpCenterCollectionContent2.title : str2, (i12 & 4) != 0 ? helpCenterCollectionContent2.summary : str3, (i12 & 8) != 0 ? helpCenterCollectionContent2.helpCenterArticles : list, (i12 & 16) != 0 ? helpCenterCollectionContent2.helpCenterSections : list2, (i12 & 32) != 0 ? helpCenterCollectionContent2.subCollections : list3, (i12 & 64) != 0 ? helpCenterCollectionContent2.articlesCount : i10, (i12 & 128) != 0 ? helpCenterCollectionContent2.authors : list4);
    }

    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    public static /* synthetic */ void getAuthors$annotations() {
    }

    public static /* synthetic */ void getCollectionId$annotations() {
    }

    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @C6521e
    public static /* synthetic */ void getHelpCenterSections$annotations() {
    }

    public static /* synthetic */ void getSubCollections$annotations() {
    }

    public static /* synthetic */ void getSummary$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollectionContent helpCenterCollectionContent, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.t(fVar, 0, helpCenterCollectionContent.collectionId);
        if (dVar.q(fVar, 1) || !C6496s.c(helpCenterCollectionContent.title, "")) {
            dVar.t(fVar, 1, helpCenterCollectionContent.title);
        }
        if (dVar.q(fVar, 2) || !C6496s.c(helpCenterCollectionContent.summary, "")) {
            dVar.t(fVar, 2, helpCenterCollectionContent.summary);
        }
        if (dVar.q(fVar, 3) || !C6496s.c(helpCenterCollectionContent.helpCenterArticles, C6565s.n())) {
            dVar.B(fVar, 3, bVarArr[3], helpCenterCollectionContent.helpCenterArticles);
        }
        if (dVar.q(fVar, 4) || !C6496s.c(helpCenterCollectionContent.helpCenterSections, C6565s.n())) {
            dVar.B(fVar, 4, bVarArr[4], helpCenterCollectionContent.helpCenterSections);
        }
        if (dVar.q(fVar, 5) || !C6496s.c(helpCenterCollectionContent.subCollections, C6565s.n())) {
            dVar.B(fVar, 5, bVarArr[5], helpCenterCollectionContent.subCollections);
        }
        dVar.i(fVar, 6, helpCenterCollectionContent.articlesCount);
        if (dVar.q(fVar, 7) || !C6496s.c(helpCenterCollectionContent.authors, C6565s.n())) {
            dVar.B(fVar, 7, bVarArr[7], helpCenterCollectionContent.authors);
        }
    }

    public final String component1() {
        return this.collectionId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final List<HelpCenterArticle> component4() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> component5() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> component6() {
        return this.subCollections;
    }

    public final int component7() {
        return this.articlesCount;
    }

    public final List<Author> component8() {
        return this.authors;
    }

    public final HelpCenterCollectionContent copy(String str, String str2, String str3, List<HelpCenterArticle> list, List<HelpCenterSection> list2, List<HelpCenterCollection> list3, int i10, List<Author> list4) {
        C6496s.h(str, "collectionId");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, "summary");
        C6496s.h(list, "helpCenterArticles");
        C6496s.h(list2, "helpCenterSections");
        List<HelpCenterCollection> list5 = list3;
        C6496s.h(list5, "subCollections");
        List<Author> list6 = list4;
        C6496s.h(list6, "authors");
        return new HelpCenterCollectionContent(str, str2, str3, list, list2, list5, i10, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterCollectionContent)) {
            return false;
        }
        HelpCenterCollectionContent helpCenterCollectionContent = (HelpCenterCollectionContent) obj;
        return C6496s.c(this.collectionId, helpCenterCollectionContent.collectionId) && C6496s.c(this.title, helpCenterCollectionContent.title) && C6496s.c(this.summary, helpCenterCollectionContent.summary) && C6496s.c(this.helpCenterArticles, helpCenterCollectionContent.helpCenterArticles) && C6496s.c(this.helpCenterSections, helpCenterCollectionContent.helpCenterSections) && C6496s.c(this.subCollections, helpCenterCollectionContent.subCollections) && this.articlesCount == helpCenterCollectionContent.articlesCount && C6496s.c(this.authors, helpCenterCollectionContent.authors);
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final List<Author> getAuthors() {
        return this.authors;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> getHelpCenterSections() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> getSubCollections() {
        return this.subCollections;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((this.collectionId.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.helpCenterArticles.hashCode()) * 31) + this.helpCenterSections.hashCode()) * 31) + this.subCollections.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + this.authors.hashCode();
    }

    public String toString() {
        return "HelpCenterCollectionContent(collectionId=" + this.collectionId + ", title=" + this.title + ", summary=" + this.summary + ", helpCenterArticles=" + this.helpCenterArticles + ", helpCenterSections=" + this.helpCenterSections + ", subCollections=" + this.subCollections + ", articlesCount=" + this.articlesCount + ", authors=" + this.authors + ')';
    }

    public HelpCenterCollectionContent(String str, String str2, String str3, List<HelpCenterArticle> list, List<HelpCenterSection> list2, List<HelpCenterCollection> list3, int i10, List<Author> list4) {
        C6496s.h(str, "collectionId");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, "summary");
        C6496s.h(list, "helpCenterArticles");
        C6496s.h(list2, "helpCenterSections");
        C6496s.h(list3, "subCollections");
        C6496s.h(list4, "authors");
        this.collectionId = str;
        this.title = str2;
        this.summary = str3;
        this.helpCenterArticles = list;
        this.helpCenterSections = list2;
        this.subCollections = list3;
        this.articlesCount = i10;
        this.authors = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HelpCenterCollectionContent(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List r16, java.util.List r17, java.util.List r18, int r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r5 = r2
            goto L_0x000b
        L_0x000a:
            r5 = r14
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0012
        L_0x0011:
            r6 = r15
        L_0x0012:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001c
            java.util.List r1 = mf.C6565s.n()
            r7 = r1
            goto L_0x001e
        L_0x001c:
            r7 = r16
        L_0x001e:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0028
            java.util.List r1 = mf.C6565s.n()
            r8 = r1
            goto L_0x002a
        L_0x0028:
            r8 = r17
        L_0x002a:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0034
            java.util.List r1 = mf.C6565s.n()
            r9 = r1
            goto L_0x0036
        L_0x0034:
            r9 = r18
        L_0x0036:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0040
            java.util.List r0 = mf.C6565s.n()
            r11 = r0
            goto L_0x0042
        L_0x0040:
            r11 = r20
        L_0x0042:
            r3 = r12
            r4 = r13
            r10 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
