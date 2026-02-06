package com.horcrux.svg;

import C7.d;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import e8.C3500a;
import java.util.HashMap;
import java.util.Map;
import m8.A0;
import m8.B0;
import m8.C0;
import m8.C3794a0;
import m8.C3796b0;
import m8.C3798c0;
import m8.C3800d0;
import m8.C3802e0;
import m8.C3804f0;
import m8.C3806g0;
import m8.C3808h0;
import m8.C3810i0;
import m8.C3812j0;
import m8.C3814k0;
import m8.C3816l0;
import m8.C3818m0;
import m8.C3820n0;
import m8.C3822o0;
import m8.C3824p0;
import m8.C3826q0;
import m8.C3827r0;
import m8.C3829s0;
import m8.C3831t0;
import m8.C3833u0;
import m8.C3835v0;
import m8.D0;
import m8.E0;
import m8.F0;
import m8.G0;
import m8.J0;
import m8.K0;
import m8.L0;
import m8.M0;
import m8.N0;
import m8.O;
import m8.O0;
import m8.P;
import m8.P0;
import m8.Q;
import m8.Q0;
import m8.R0;
import m8.S;
import m8.S0;
import m8.T;
import m8.U;
import m8.V;
import m8.W;
import m8.X;
import m8.Y;
import m8.Z;
import m8.w0;
import m8.x0;
import m8.y0;
import m8.z0;

class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    static class CircleViewManager extends RenderableViewManager<C4892b> implements P {
        public static final String REACT_CLASS = "RNSVGCircle";

        CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            this.mDelegate = new O(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "cx")
        public void setCx(C4892b bVar, Dynamic dynamic) {
            bVar.l(dynamic);
        }

        @C3500a(name = "cy")
        public void setCy(C4892b bVar, Dynamic dynamic) {
            bVar.m(dynamic);
        }

        @C3500a(name = "r")
        public void setR(C4892b bVar, Dynamic dynamic) {
            bVar.n(dynamic);
        }
    }

    static class ClipPathViewManager extends GroupViewManagerAbstract<C4893c> implements S {
        public static final String REACT_CLASS = "RNSVGClipPath";

        ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            this.mDelegate = new Q(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C4916z) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }
    }

    static class DefsViewManager extends VirtualViewManager<C4896f> implements U {
        public static final String REACT_CLASS = "RNSVGDefs";

        DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            this.mDelegate = new T(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }
    }

    static class EllipseViewManager extends RenderableViewManager<C4898h> implements W {
        public static final String REACT_CLASS = "RNSVGEllipse";

        EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            this.mDelegate = new V(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "cx")
        public void setCx(C4898h hVar, Dynamic dynamic) {
            hVar.l(dynamic);
        }

        @C3500a(name = "cy")
        public void setCy(C4898h hVar, Dynamic dynamic) {
            hVar.m(dynamic);
        }

        @C3500a(name = "rx")
        public void setRx(C4898h hVar, Dynamic dynamic) {
            hVar.n(dynamic);
        }

        @C3500a(name = "ry")
        public void setRy(C4898h hVar, Dynamic dynamic) {
            hVar.o(dynamic);
        }
    }

    static class FeBlendManager extends FilterPrimitiveManager<C4900j> implements Y {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            this.mDelegate = new X(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((C4906p) view, dynamic);
        }

        @C3500a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((C4906p) view, str);
        }

        @C3500a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((C4906p) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((C4906p) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((C4906p) view, dynamic);
        }

        @C3500a(name = "in1")
        public void setIn1(C4900j jVar, String str) {
            jVar.v(str);
        }

        @C3500a(name = "in2")
        public void setIn2(C4900j jVar, String str) {
            jVar.w(str);
        }

        @C3500a(name = "mode")
        public void setMode(C4900j jVar, String str) {
            jVar.x(str);
        }
    }

    static class FeColorMatrixManager extends FilterPrimitiveManager<C4901k> implements C3794a0 {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            this.mDelegate = new Z(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((C4906p) view, dynamic);
        }

        @C3500a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((C4906p) view, str);
        }

        @C3500a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((C4906p) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((C4906p) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((C4906p) view, dynamic);
        }

        @C3500a(name = "in1")
        public void setIn1(C4901k kVar, String str) {
            kVar.t(str);
        }

        @C3500a(name = "type")
        public void setType(C4901k kVar, String str) {
            kVar.u(str);
        }

        @C3500a(name = "values")
        public void setValues(C4901k kVar, ReadableArray readableArray) {
            kVar.v(readableArray);
        }
    }

    static class FeFloodManager extends FilterPrimitiveManager<C4902l> implements C3798c0 {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            this.mDelegate = new C3796b0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((C4906p) view, dynamic);
        }

        @C3500a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((C4906p) view, str);
        }

        @C3500a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((C4906p) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((C4906p) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((C4906p) view, dynamic);
        }

        @C3500a(name = "floodColor")
        public void setFloodColor(C4902l lVar, Dynamic dynamic) {
            lVar.t(dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "floodOpacity")
        public void setFloodOpacity(C4902l lVar, float f10) {
            lVar.v(f10);
        }

        public void setFloodColor(C4902l lVar, ReadableMap readableMap) {
            lVar.u(readableMap);
        }
    }

    static class FeGaussianBlurManager extends FilterPrimitiveManager<C4903m> implements C3802e0 {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            this.mDelegate = new C3800d0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((C4906p) view, dynamic);
        }

        @C3500a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((C4906p) view, str);
        }

        @C3500a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((C4906p) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((C4906p) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((C4906p) view, dynamic);
        }

        @C3500a(name = "values")
        public void setEdgeMode(C4903m mVar, String str) {
            mVar.u(str);
        }

        @C3500a(name = "in1")
        public void setIn1(C4903m mVar, String str) {
            mVar.v(str);
        }

        @C3500a(name = "stdDeviationX")
        public void setStdDeviationX(C4903m mVar, float f10) {
            mVar.w(f10);
        }

        @C3500a(name = "stdDeviationY")
        public void setStdDeviationY(C4903m mVar, float f10) {
            mVar.x(f10);
        }
    }

    static class FeMergeManager extends FilterPrimitiveManager<C4904n> implements C3806g0 {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            this.mDelegate = new C3804f0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((C4906p) view, dynamic);
        }

        @C3500a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((C4906p) view, str);
        }

        @C3500a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((C4906p) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((C4906p) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((C4906p) view, dynamic);
        }

        @C3500a(name = "nodes")
        public void setNodes(C4904n nVar, ReadableArray readableArray) {
            nVar.t(readableArray);
        }
    }

    static class FeOffsetManager extends FilterPrimitiveManager<C4905o> implements C3810i0 {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            this.mDelegate = new C3808h0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((C4906p) view, dynamic);
        }

        @C3500a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((C4906p) view, str);
        }

        @C3500a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((C4906p) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((C4906p) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((C4906p) view, dynamic);
        }

        @C3500a(name = "dx")
        public void setDx(C4905o oVar, Dynamic dynamic) {
            oVar.t(dynamic);
        }

        @C3500a(name = "dy")
        public void setDy(C4905o oVar, Dynamic dynamic) {
            oVar.u(dynamic);
        }

        @C3500a(name = "in1")
        public void setIn1(C4905o oVar, String str) {
            oVar.v(str);
        }
    }

    static class FilterManager extends VirtualViewManager<C4911u> implements C3814k0 {
        public static final String REACT_CLASS = "RNSVGFilter";

        FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            this.mDelegate = new C3812j0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(name = "filterUnits")
        public void setFilterUnits(C4911u uVar, String str) {
            uVar.m(str);
        }

        @C3500a(name = "height")
        public void setHeight(C4911u uVar, Dynamic dynamic) {
            uVar.n(dynamic);
        }

        @C3500a(name = "primitiveUnits")
        public void setPrimitiveUnits(C4911u uVar, String str) {
            uVar.o(str);
        }

        @C3500a(name = "width")
        public void setWidth(C4911u uVar, Dynamic dynamic) {
            uVar.p(dynamic);
        }

        @C3500a(name = "x")
        public void setX(C4911u uVar, Dynamic dynamic) {
            uVar.q(dynamic);
        }

        @C3500a(name = "y")
        public void setY(C4911u uVar, Dynamic dynamic) {
            uVar.r(dynamic);
        }
    }

    static class FilterPrimitiveManager<T extends C4906p> extends VirtualViewManager<T> {
        protected FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "height")
        public void setHeight(T t10, Dynamic dynamic) {
            t10.o(dynamic);
        }

        @C3500a(name = "result")
        public void setResult(T t10, String str) {
            t10.p(str);
        }

        @C3500a(name = "width")
        public void setWidth(T t10, Dynamic dynamic) {
            t10.q(dynamic);
        }

        @C3500a(name = "x")
        public void setX(T t10, Dynamic dynamic) {
            t10.r(dynamic);
        }

        @C3500a(name = "y")
        public void setY(T t10, Dynamic dynamic) {
            t10.s(dynamic);
        }
    }

    static class ForeignObjectManager extends GroupViewManagerAbstract<C4913w> implements C3818m0 {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            this.mDelegate = new C3816l0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C4916z) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "height")
        public void setHeight(C4913w wVar, Dynamic dynamic) {
            wVar.w(dynamic);
        }

        @C3500a(name = "width")
        public void setWidth(C4913w wVar, Dynamic dynamic) {
            wVar.x(dynamic);
        }

        @C3500a(name = "x")
        public void setX(C4913w wVar, Dynamic dynamic) {
            wVar.y(dynamic);
        }

        @C3500a(name = "y")
        public void setY(C4913w wVar, Dynamic dynamic) {
            wVar.z(dynamic);
        }
    }

    static class GroupViewManager extends GroupViewManagerAbstract<C4916z> implements C3822o0 {
        public static final String REACT_CLASS = "RNSVGGroup";

        GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            this.mDelegate = new C3820n0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C4916z) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }
    }

    static class GroupViewManagerAbstract<U extends C4916z> extends RenderableViewManager<U> {
        GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "font")
        public void setFont(U u10, Dynamic dynamic) {
            u10.t(dynamic);
        }

        @C3500a(name = "fontSize")
        public void setFontSize(U u10, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i10 = a.f58807a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i10 == 2) {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            } else {
                return;
            }
            u10.u(javaOnlyMap);
        }

        @C3500a(name = "fontWeight")
        public void setFontWeight(U u10, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i10 = a.f58807a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i10 == 2) {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            } else {
                return;
            }
            u10.u(javaOnlyMap);
        }
    }

    static class ImageViewManager extends RenderableViewManager<A> implements C3826q0 {
        public static final String REACT_CLASS = "RNSVGImage";

        ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            this.mDelegate = new C3824p0(this);
        }

        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap hashMap = new HashMap();
            hashMap.put(SvgLoadEvent.EVENT_NAME, d.d("registrationName", "onLoad"));
            return hashMap;
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "align")
        public void setAlign(A a10, String str) {
            a10.setAlign(str);
        }

        @C3500a(name = "height")
        public void setHeight(A a10, Dynamic dynamic) {
            a10.q(dynamic);
        }

        @C3500a(name = "meetOrSlice")
        public void setMeetOrSlice(A a10, int i10) {
            a10.setMeetOrSlice(i10);
        }

        @C3500a(customType = "ImageSource", name = "src")
        public void setSrc(A a10, ReadableMap readableMap) {
            a10.r(readableMap);
        }

        @C3500a(name = "width")
        public void setWidth(A a10, Dynamic dynamic) {
            a10.s(dynamic);
        }

        @C3500a(name = "x")
        public void setX(A a10, Dynamic dynamic) {
            a10.t(dynamic);
        }

        @C3500a(name = "y")
        public void setY(A a10, Dynamic dynamic) {
            a10.u(dynamic);
        }
    }

    static class LineViewManager extends RenderableViewManager<B> implements C3829s0 {
        public static final String REACT_CLASS = "RNSVGLine";

        LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            this.mDelegate = new C3827r0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "x1")
        public void setX1(B b10, Dynamic dynamic) {
            b10.l(dynamic);
        }

        @C3500a(name = "x2")
        public void setX2(B b10, Dynamic dynamic) {
            b10.m(dynamic);
        }

        @C3500a(name = "y1")
        public void setY1(B b10, Dynamic dynamic) {
            b10.n(dynamic);
        }

        @C3500a(name = "y2")
        public void setY2(B b10, Dynamic dynamic) {
            b10.o(dynamic);
        }
    }

    static class LinearGradientManager extends VirtualViewManager<C> implements C3833u0 {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            this.mDelegate = new C3831t0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "gradient")
        public void setGradient(C c10, ReadableArray readableArray) {
            c10.l(readableArray);
        }

        @C3500a(name = "gradientTransform")
        public void setGradientTransform(C c10, ReadableArray readableArray) {
            c10.m(readableArray);
        }

        @C3500a(name = "gradientUnits")
        public void setGradientUnits(C c10, int i10) {
            c10.n(i10);
        }

        @C3500a(name = "x1")
        public void setX1(C c10, Dynamic dynamic) {
            c10.o(dynamic);
        }

        @C3500a(name = "x2")
        public void setX2(C c10, Dynamic dynamic) {
            c10.p(dynamic);
        }

        @C3500a(name = "y1")
        public void setY1(C c10, Dynamic dynamic) {
            c10.q(dynamic);
        }

        @C3500a(name = "y2")
        public void setY2(C c10, Dynamic dynamic) {
            c10.r(dynamic);
        }
    }

    static class MarkerManager extends GroupViewManagerAbstract<D> implements w0 {
        public static final String REACT_CLASS = "RNSVGMarker";

        MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            this.mDelegate = new C3835v0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C4916z) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "align")
        public void setAlign(D d10, String str) {
            d10.setAlign(str);
        }

        @C3500a(name = "markerHeight")
        public void setMarkerHeight(D d10, Dynamic dynamic) {
            d10.x(dynamic);
        }

        @C3500a(name = "markerUnits")
        public void setMarkerUnits(D d10, String str) {
            d10.y(str);
        }

        @C3500a(name = "markerWidth")
        public void setMarkerWidth(D d10, Dynamic dynamic) {
            d10.z(dynamic);
        }

        @C3500a(name = "meetOrSlice")
        public void setMeetOrSlice(D d10, int i10) {
            d10.setMeetOrSlice(i10);
        }

        @C3500a(name = "minX")
        public void setMinX(D d10, float f10) {
            d10.setMinX(f10);
        }

        @C3500a(name = "minY")
        public void setMinY(D d10, float f10) {
            d10.setMinY(f10);
        }

        @C3500a(name = "orient")
        public void setOrient(D d10, String str) {
            d10.A(str);
        }

        @C3500a(name = "refX")
        public void setRefX(D d10, Dynamic dynamic) {
            d10.B(dynamic);
        }

        @C3500a(name = "refY")
        public void setRefY(D d10, Dynamic dynamic) {
            d10.C(dynamic);
        }

        @C3500a(name = "vbHeight")
        public void setVbHeight(D d10, float f10) {
            d10.setVbHeight(f10);
        }

        @C3500a(name = "vbWidth")
        public void setVbWidth(D d10, float f10) {
            d10.setVbWidth(f10);
        }
    }

    static class MaskManager extends GroupViewManagerAbstract<E> implements y0 {
        public static final String REACT_CLASS = "RNSVGMask";

        MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            this.mDelegate = new x0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C4916z) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "height")
        public void setHeight(E e10, Dynamic dynamic) {
            e10.y(dynamic);
        }

        @C3500a(name = "maskContentUnits")
        public void setMaskContentUnits(E e10, int i10) {
            e10.z(i10);
        }

        @C3500a(name = "maskType")
        public void setMaskType(E e10, int i10) {
            e10.A(i10);
        }

        @C3500a(name = "maskUnits")
        public void setMaskUnits(E e10, int i10) {
            e10.B(i10);
        }

        @C3500a(name = "width")
        public void setWidth(E e10, Dynamic dynamic) {
            e10.C(dynamic);
        }

        @C3500a(name = "x")
        public void setX(E e10, Dynamic dynamic) {
            e10.D(dynamic);
        }

        @C3500a(name = "y")
        public void setY(E e10, Dynamic dynamic) {
            e10.E(dynamic);
        }
    }

    static class PathViewManager extends RenderableViewManager<H> implements A0 {
        public static final String REACT_CLASS = "RNSVGPath";

        PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            this.mDelegate = new z0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "d")
        public void setD(H h10, String str) {
            h10.l(str);
        }
    }

    static class PatternManager extends GroupViewManagerAbstract<I> implements C0 {
        public static final String REACT_CLASS = "RNSVGPattern";

        PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            this.mDelegate = new B0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C4916z) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "align")
        public void setAlign(I i10, String str) {
            i10.setAlign(str);
        }

        @C3500a(name = "height")
        public void setHeight(I i10, Dynamic dynamic) {
            i10.w(dynamic);
        }

        @C3500a(name = "meetOrSlice")
        public void setMeetOrSlice(I i10, int i11) {
            i10.setMeetOrSlice(i11);
        }

        @C3500a(name = "minX")
        public void setMinX(I i10, float f10) {
            i10.setMinX(f10);
        }

        @C3500a(name = "minY")
        public void setMinY(I i10, float f10) {
            i10.setMinY(f10);
        }

        @C3500a(name = "patternContentUnits")
        public void setPatternContentUnits(I i10, int i11) {
            i10.x(i11);
        }

        @C3500a(name = "patternTransform")
        public void setPatternTransform(I i10, ReadableArray readableArray) {
            i10.y(readableArray);
        }

        @C3500a(name = "patternUnits")
        public void setPatternUnits(I i10, int i11) {
            i10.z(i11);
        }

        @C3500a(name = "vbHeight")
        public void setVbHeight(I i10, float f10) {
            i10.setVbHeight(f10);
        }

        @C3500a(name = "vbWidth")
        public void setVbWidth(I i10, float f10) {
            i10.setVbWidth(f10);
        }

        @C3500a(name = "width")
        public void setWidth(I i10, Dynamic dynamic) {
            i10.A(dynamic);
        }

        @C3500a(name = "x")
        public void setX(I i10, Dynamic dynamic) {
            i10.B(dynamic);
        }

        @C3500a(name = "y")
        public void setY(I i10, Dynamic dynamic) {
            i10.C(dynamic);
        }
    }

    static class RadialGradientManager extends VirtualViewManager<N> implements E0 {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            this.mDelegate = new D0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "cx")
        public void setCx(N n10, Dynamic dynamic) {
            n10.l(dynamic);
        }

        @C3500a(name = "cy")
        public void setCy(N n10, Dynamic dynamic) {
            n10.m(dynamic);
        }

        @C3500a(name = "fx")
        public void setFx(N n10, Dynamic dynamic) {
            n10.n(dynamic);
        }

        @C3500a(name = "fy")
        public void setFy(N n10, Dynamic dynamic) {
            n10.o(dynamic);
        }

        @C3500a(name = "gradient")
        public void setGradient(N n10, ReadableArray readableArray) {
            n10.p(readableArray);
        }

        @C3500a(name = "gradientTransform")
        public void setGradientTransform(N n10, ReadableArray readableArray) {
            n10.q(readableArray);
        }

        @C3500a(name = "gradientUnits")
        public void setGradientUnits(N n10, int i10) {
            n10.r(i10);
        }

        @C3500a(name = "rx")
        public void setRx(N n10, Dynamic dynamic) {
            n10.s(dynamic);
        }

        @C3500a(name = "ry")
        public void setRy(N n10, Dynamic dynamic) {
            n10.t(dynamic);
        }
    }

    static class RectViewManager extends RenderableViewManager<O> implements G0 {
        public static final String REACT_CLASS = "RNSVGRect";

        RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            this.mDelegate = new F0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "height")
        public void setHeight(O o10, Dynamic dynamic) {
            o10.l(dynamic);
        }

        @C3500a(name = "rx")
        public void setRx(O o10, Dynamic dynamic) {
            o10.m(dynamic);
        }

        @C3500a(name = "ry")
        public void setRy(O o10, Dynamic dynamic) {
            o10.n(dynamic);
        }

        @C3500a(name = "width")
        public void setWidth(O o10, Dynamic dynamic) {
            o10.o(dynamic);
        }

        @C3500a(name = "x")
        public void setX(O o10, Dynamic dynamic) {
            o10.p(dynamic);
        }

        @C3500a(name = "y")
        public void setY(O o10, Dynamic dynamic) {
            o10.q(dynamic);
        }
    }

    static class SymbolManager extends GroupViewManagerAbstract<Q> implements K0 {
        public static final String REACT_CLASS = "RNSVGSymbol";

        SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            this.mDelegate = new J0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C4916z) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "align")
        public void setAlign(Q q10, String str) {
            q10.setAlign(str);
        }

        @C3500a(name = "meetOrSlice")
        public void setMeetOrSlice(Q q10, int i10) {
            q10.setMeetOrSlice(i10);
        }

        @C3500a(name = "minX")
        public void setMinX(Q q10, float f10) {
            q10.setMinX(f10);
        }

        @C3500a(name = "minY")
        public void setMinY(Q q10, float f10) {
            q10.setMinY(f10);
        }

        @C3500a(name = "vbHeight")
        public void setVbHeight(Q q10, float f10) {
            q10.setVbHeight(f10);
        }

        @C3500a(name = "vbWidth")
        public void setVbWidth(Q q10, float f10) {
            q10.setVbWidth(f10);
        }
    }

    static class TSpanViewManager extends TextViewManagerAbstract<Z> implements M0 {
        public static final String REACT_CLASS = "RNSVGTSpan";

        TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            this.mDelegate = new L0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((m0) view, str);
        }

        @C3500a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((m0) view, dynamic);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((m0) view, dynamic);
        }

        @C3500a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((m0) view, dynamic);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((m0) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((m0) view, dynamic);
        }

        @C3500a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((m0) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((m0) view, dynamic);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((m0) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((m0) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((m0) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((m0) view, dynamic);
        }

        @C3500a(name = "content")
        public void setContent(Z z10, String str) {
            z10.U(str);
        }

        TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new L0(this);
        }
    }

    static class TextPathViewManager extends TextViewManagerAbstract<a0> implements Q0 {
        public static final String REACT_CLASS = "RNSVGTextPath";

        TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            this.mDelegate = new P0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((m0) view, str);
        }

        @C3500a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((m0) view, dynamic);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((m0) view, dynamic);
        }

        @C3500a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((m0) view, dynamic);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((m0) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((m0) view, dynamic);
        }

        @C3500a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((m0) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((m0) view, dynamic);
        }

        @C3500a(name = "midLine")
        public void setSharp(a0 a0Var, String str) {
            a0Var.S(str);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((m0) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((m0) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((m0) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((m0) view, dynamic);
        }

        @C3500a(name = "href")
        public void setHref(a0 a0Var, String str) {
            a0Var.R(str);
        }

        public void setMidLine(a0 a0Var, String str) {
            a0Var.S(str);
        }

        @C3500a(name = "side")
        public void setSide(a0 a0Var, String str) {
            a0Var.T(str);
        }

        @C3500a(name = "spacing")
        public void setSpacing(a0 a0Var, String str) {
            a0Var.U(str);
        }

        @C3500a(name = "startOffset")
        public void setStartOffset(a0 a0Var, Dynamic dynamic) {
            a0Var.V(dynamic);
        }

        TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new P0(this);
        }

        @C3500a(name = "method")
        public void setMethod(a0 a0Var, String str) {
            a0Var.H(str);
        }
    }

    static class TextViewManagerAbstract<K extends m0> extends GroupViewManagerAbstract<K> {
        TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public void setAlignmentBaseline(K k10, String str) {
            k10.H(str);
        }

        @C3500a(name = "baselineShift")
        public void setBaselineShift(K k10, Dynamic dynamic) {
            k10.C(dynamic);
        }

        @C3500a(name = "dx")
        public void setDx(K k10, Dynamic dynamic) {
            k10.D(dynamic);
        }

        @C3500a(name = "dy")
        public void setDy(K k10, Dynamic dynamic) {
            k10.E(dynamic);
        }

        @C3500a(name = "inlineSize")
        public void setInlineSize(K k10, Dynamic dynamic) {
            k10.F(dynamic);
        }

        @C3500a(name = "lengthAdjust")
        public void setLengthAdjust(K k10, String str) {
            k10.G(str);
        }

        @C3500a(name = "alignmentBaseline")
        public void setMethod(K k10, String str) {
            k10.H(str);
        }

        @C3500a(name = "rotate")
        public void setRotate(K k10, Dynamic dynamic) {
            k10.K(dynamic);
        }

        @C3500a(name = "textLength")
        public void setTextLength(K k10, Dynamic dynamic) {
            k10.L(dynamic);
        }

        @C3500a(name = "verticalAlign")
        public void setVerticalAlign(K k10, Dynamic dynamic) {
            k10.M(dynamic);
        }

        @C3500a(name = "x")
        public void setX(K k10, Dynamic dynamic) {
            k10.I(dynamic);
        }

        @C3500a(name = "y")
        public void setY(K k10, Dynamic dynamic) {
            k10.J(dynamic);
        }

        @C3500a(name = "font")
        public void setFont(K k10, Dynamic dynamic) {
            k10.t(dynamic);
        }
    }

    static class UseViewManager extends RenderableViewManager<n0> implements S0 {
        public static final String REACT_CLASS = "RNSVGUse";

        UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            this.mDelegate = new R0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "height")
        public void setHeight(n0 n0Var, Dynamic dynamic) {
            n0Var.l(dynamic);
        }

        @C3500a(name = "href")
        public void setHref(n0 n0Var, String str) {
            n0Var.m(str);
        }

        @C3500a(name = "width")
        public void setWidth(n0 n0Var, Dynamic dynamic) {
            n0Var.n(dynamic);
        }

        @C3500a(name = "x")
        public void setX(n0 n0Var, Dynamic dynamic) {
            n0Var.o(dynamic);
        }

        @C3500a(name = "y")
        public void setY(n0 n0Var, Dynamic dynamic) {
            n0Var.p(dynamic);
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58807a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58807a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58807a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.RenderableViewManager.a.<clinit>():void");
        }
    }

    RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @C3500a(customType = "Color", name = "color")
    public void setColor(T t10, Integer num) {
        t10.setCurrentColor(num);
    }

    @C3500a(name = "fill")
    public void setFill(T t10, Dynamic dynamic) {
        t10.setFill(dynamic);
    }

    @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t10, float f10) {
        t10.setFillOpacity(f10);
    }

    @C3500a(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t10, int i10) {
        t10.setFillRule(i10);
    }

    @C3500a(name = "filter")
    public void setFilter(T t10, String str) {
        t10.setFilter(str);
    }

    @C3500a(name = "propList")
    public void setPropList(T t10, ReadableArray readableArray) {
        t10.setPropList(readableArray);
    }

    @C3500a(name = "stroke")
    public void setStroke(T t10, Dynamic dynamic) {
        t10.setStroke(dynamic);
    }

    @C3500a(name = "strokeDasharray")
    public void setStrokeDasharray(T t10, Dynamic dynamic) {
        t10.setStrokeDasharray(dynamic);
    }

    @C3500a(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t10, float f10) {
        t10.setStrokeDashoffset(f10);
    }

    @C3500a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t10, int i10) {
        t10.setStrokeLinecap(i10);
    }

    @C3500a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t10, int i10) {
        t10.setStrokeLinejoin(i10);
    }

    @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t10, float f10) {
        t10.setStrokeMiterlimit(f10);
    }

    @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t10, float f10) {
        t10.setStrokeOpacity(f10);
    }

    @C3500a(name = "strokeWidth")
    public void setStrokeWidth(T t10, Dynamic dynamic) {
        t10.setStrokeWidth(dynamic);
    }

    @C3500a(name = "vectorEffect")
    public void setVectorEffect(T t10, int i10) {
        t10.setVectorEffect(i10);
    }

    static class TextViewManager extends TextViewManagerAbstract<m0> implements O0 {
        public static final String REACT_CLASS = "RNSVGText";

        TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            this.mDelegate = new N0(this);
        }

        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((m0) view, str);
        }

        @C3500a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((m0) view, dynamic);
        }

        @C3500a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @C3500a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @C3500a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            RenderableViewManager.super.setColor((RenderableView) view, num);
        }

        @C3500a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @C3500a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((m0) view, dynamic);
        }

        @C3500a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((m0) view, dynamic);
        }

        @C3500a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            RenderableViewManager.super.setFill((RenderableView) view, dynamic);
        }

        @C3500a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            RenderableViewManager.super.setFillOpacity((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            RenderableViewManager.super.setFillRule((RenderableView) view, i10);
        }

        @C3500a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            RenderableViewManager.super.setFilter((RenderableView) view, str);
        }

        @C3500a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((m0) view, dynamic);
        }

        @C3500a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C4916z) view, dynamic);
        }

        @C3500a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C4916z) view, dynamic);
        }

        @C3500a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((m0) view, dynamic);
        }

        @C3500a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((m0) view, str);
        }

        @C3500a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @C3500a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @C3500a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @C3500a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @C3500a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @C3500a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @C3500a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @C3500a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            RenderableViewManager.super.setPropList((RenderableView) view, readableArray);
        }

        @C3500a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @C3500a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((m0) view, dynamic);
        }

        @C3500a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStroke((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        @C3500a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            RenderableViewManager.super.setStrokeDashoffset((RenderableView) view, f10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            RenderableViewManager.super.setStrokeLinecap((RenderableView) view, i10);
        }

        @C3500a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            RenderableViewManager.super.setStrokeLinejoin((RenderableView) view, i10);
        }

        @C3500a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            RenderableViewManager.super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        @C3500a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            RenderableViewManager.super.setStrokeOpacity((RenderableView) view, f10);
        }

        @C3500a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            RenderableViewManager.super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @C3500a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((m0) view, dynamic);
        }

        @C3500a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            RenderableViewManager.super.setVectorEffect((RenderableView) view, i10);
        }

        @C3500a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((m0) view, dynamic);
        }

        @C3500a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((m0) view, dynamic);
        }

        @C3500a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((m0) view, dynamic);
        }

        TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new N0(this);
        }
    }

    public void setFill(T t10, ReadableMap readableMap) {
        t10.setFill(readableMap);
    }

    public void setStroke(T t10, ReadableMap readableMap) {
        t10.setStroke(readableMap);
    }
}
