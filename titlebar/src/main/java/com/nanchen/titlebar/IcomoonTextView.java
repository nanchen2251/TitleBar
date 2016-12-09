package com.nanchen.titlebar;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 引用特殊字体的 TextView
 *
 * @author nanchen
 * @fileName TitleBar
 * @packageName com.nanchen.titlebar
 * @date 2016/12/09  09:26
 */

public class IcomoonTextView extends TextView {

    public IcomoonTextView(Context context) {
        super(context);
    }

    public IcomoonTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IcomoonTextView(Context context, AttributeSet attrs, int defSyle) {
        super(context, attrs, defSyle);
    }


    @Override
    public Typeface getTypeface() {
        return FontCustomHelper.getInstance().getTypeface(getContext());
    }

    @Override
    public void setTypeface(Typeface tf) {
        super.setTypeface(FontCustomHelper.getInstance().getTypeface(getContext()));
    }

}
