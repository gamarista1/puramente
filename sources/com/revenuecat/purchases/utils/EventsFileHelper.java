package com.revenuecat.purchases.utils;

import Rg.k;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.utils.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\u00112\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0014\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/utils/Event;", "T", "", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "", "filePath", "Lkotlin/Function1;", "eventSerializer", "eventDeserializer", "<init>", "(Lcom/revenuecat/purchases/common/FileHelper;Ljava/lang/String;Lyf/l;Lyf/l;)V", "string", "mapToEvent", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;", "event", "Llf/M;", "appendEvent", "(Lcom/revenuecat/purchases/utils/Event;)V", "LRg/h;", "block", "readFile", "(Lyf/l;)V", "Lorg/json/JSONObject;", "readFileAsJson", "", "eventsToDeleteCount", "clear", "(I)V", "deleteFile", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "Ljava/lang/String;", "Lyf/l;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class EventsFileHelper<T extends Event> {
    private final C6798l eventDeserializer;
    private final C6798l eventSerializer;
    private final FileHelper fileHelper;
    private final String filePath;

    public EventsFileHelper(FileHelper fileHelper2, String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(fileHelper2, "fileHelper");
        C6496s.h(str, "filePath");
        this.fileHelper = fileHelper2;
        this.filePath = str;
        this.eventSerializer = lVar;
        this.eventDeserializer = lVar2;
    }

    /* access modifiers changed from: private */
    public final T mapToEvent(String str) {
        C6798l lVar = this.eventDeserializer;
        if (lVar == null) {
            return null;
        }
        try {
            return (Event) lVar.invoke(str);
        } catch (SerializationException e10) {
            LogUtilsKt.errorLog("Error parsing event from file: " + str, e10);
            return null;
        } catch (IllegalArgumentException e11) {
            LogUtilsKt.errorLog("Error parsing event from file: " + str, e11);
            return null;
        }
    }

    public final synchronized void appendEvent(T t10) {
        String str;
        try {
            C6496s.h(t10, "event");
            FileHelper fileHelper2 = this.fileHelper;
            String str2 = this.filePath;
            StringBuilder sb2 = new StringBuilder();
            C6798l lVar = this.eventSerializer;
            if (lVar != null) {
                str = (String) lVar.invoke(t10);
                if (str == null) {
                }
                sb2.append(str);
                sb2.append(10);
                fileHelper2.appendToFile(str2, sb2.toString());
            }
            str = t10.toString();
            sb2.append(str);
            sb2.append(10);
            fileHelper2.appendToFile(str2, sb2.toString());
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void clear(int i10) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, i10);
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogUtilsKt.verboseLog("Failed to delete events file in " + this.filePath + '.');
        }
    }

    public final synchronized void readFile(C6798l lVar) {
        try {
            C6496s.h(lVar, "block");
            if (this.eventDeserializer != null) {
                if (!this.fileHelper.fileIsEmpty(this.filePath)) {
                    this.fileHelper.readFilePerLines(this.filePath, new EventsFileHelper$readFile$1(lVar, this));
                }
            }
            lVar.invoke(k.e());
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void readFileAsJson(C6798l lVar) {
        try {
            C6496s.h(lVar, "block");
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                lVar.invoke(k.e());
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new EventsFileHelper$readFileAsJson$1(lVar));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventsFileHelper(FileHelper fileHelper2, String str, C6798l lVar, C6798l lVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileHelper2, str, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : lVar2);
    }
}
